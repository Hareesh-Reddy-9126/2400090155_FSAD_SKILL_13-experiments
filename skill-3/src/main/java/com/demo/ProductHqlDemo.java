package com.demo;

import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Formats the HQL demo output to match the workbook sample layout.
 */
public class ProductHqlDemo {

    private static final SessionFactory SESSION_FACTORY = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Product.class)
            .buildSessionFactory();

    private static final List<Product> SAMPLE_PRODUCTS = List.of(
            new Product("Laptop", "Electronics", new BigDecimal("55000.0"), 10),
            new Product("Mouse", "Electronics", new BigDecimal("500.0"), 50),
            new Product("Keyboard", "Electronics", new BigDecimal("1200.0"), 30),
            new Product("Chair", "Furniture", new BigDecimal("3500.0"), 15),
            new Product("Table", "Furniture", new BigDecimal("8000.0"), 5),
            new Product("Pen", "Stationery", new BigDecimal("20.0"), 100)
    );

    public static void main(String[] args) {
        try (SessionFactory ignored = SESSION_FACTORY) {
            seedSampleData();
            runQueries();
        }
    }

    private static void seedSampleData() {
        try (Session session = SESSION_FACTORY.openSession()) {
            Transaction tx = session.beginTransaction();
            try {
                session.createMutationQuery("delete from Product").executeUpdate();
                SAMPLE_PRODUCTS.forEach(session::persist);
                tx.commit();
            } catch (Exception ex) {
                tx.rollback();
                throw ex;
            }
        }
    }

    private static void runQueries() {
        try (Session session = SESSION_FACTORY.openSession()) {
            printHeader("--- First 3 Products ---");
            printRows(session.createQuery("from Product p order by p.id", Product.class)
                    .setFirstResult(0).setMaxResults(3).list());

            printHeader("--- Next 3 Products ---");
            printRows(session.createQuery("from Product p order by p.id", Product.class)
                    .setFirstResult(3).setMaxResults(3).list());

            Long totalCount = session.createQuery("select count(p) from Product p", Long.class).uniqueResult();
            Long availableCount = session.createQuery("select count(p) from Product p where p.quantity > 0", Long.class).uniqueResult();

            printHeader("Total Products: " + totalCount);
            System.out.println("Available Products: " + availableCount + System.lineSeparator());

            printHeader("--- Group By Description ---");
            session.createQuery("select p.description, count(p) from Product p group by p.description", Object[].class)
                    .list()
                    .forEach(t -> System.out.println(t[0] + " -> " + t[1]));
            System.out.println();

            Object[] minMax = session.createQuery("select min(p.price), max(p.price) from Product p", Object[].class)
                    .uniqueResult();
            if (minMax != null) {
                System.out.println("Min Price: " + minMax[0]);
                System.out.println("Max Price: " + minMax[1] + System.lineSeparator());
            }

            printHeader("--- Price Between 1000 and 10000 ---");
            printRows(session.createQuery(
                            "from Product p where p.price between :min and :max order by p.id",
                            Product.class)
                    .setParameter("min", new BigDecimal("1000"))
                    .setParameter("max", new BigDecimal("10000"))
                    .list());
        }
    }

    private static void printHeader(String header) {
        System.out.println(header);
    }

    private static void printRows(List<Product> products) {
        products.forEach(p -> System.out.println(p.toString()));
    }
}
