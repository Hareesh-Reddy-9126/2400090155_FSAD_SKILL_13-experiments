<h1 align="center">🚀 FSAD Lab Experiments</h1>
<p align="center">
	<img src="https://img.shields.io/badge/Java-17-orange" />
	<img src="https://img.shields.io/badge/Maven-Build-red" />
	<img src="https://img.shields.io/badge/Hibernate-ORM-yellow" />
	<img src="https://img.shields.io/badge/Spring-Core-green" />
	<img src="https://img.shields.io/badge/Spring-Boot-brightgreen" />
	<img src="https://img.shields.io/badge/React-18-blue" />
</p>

<p align="center"><b>Repository containing laboratory experiments for the Full Stack Application Development (FSAD) course.</b></p>

---

## 📘 About This Repository

This repository contains **11 skill-based experiments** implemented using modern Java backend and React frontend technologies.

Each experiment demonstrates key concepts in full stack development:
- Version Control (Git)
- ORM (Hibernate)
- Querying (HQL)
- Spring Dependency Injection & Autowiring
- Spring Boot REST APIs
- MVC Web Request Handling
- React Frontend (CRUD, API integration)
- API integration (Fetch, Axios, Local JSON)

All projects are built using Maven (Java) or npm (React) and organized in a modular structure.

---

## 🛠 Technology Stack

| Technology      | Purpose                          |
|-----------------|-----------------------------------|
| Java 17         | Core programming language         |
| Maven           | Build & dependency management     |
| Hibernate ORM   | Object Relational Mapping         |
| Spring Framework| Dependency Injection & Autowiring |
| Spring Boot     | REST API development              |
| MySQL           | Database for Hibernate experiments |
| React 18        | Frontend SPA development          |
| Axios           | API integration                   |
| VS Code / STS   | Development environments          |

---

## 📂 Repository Structure

| Folder     | Experiment Title                      |
|------------|--------------------------------------|
| skill-1    | Git Version Control Demo              |
| skill-2    | Hibernate CRUD Operations             |
| skill-3    | Hibernate HQL Queries                 |
| skill-4    | Spring Dependency Injection           |
| skill-5    | Spring Autowiring (@Autowired)        |
| skill-6    | Spring Boot MVC Web Request Handling  |
| skill-7    | Spring Boot REST API (Course CRUD)    |
| skill-8    | Spring Boot REST API (Product CRUD)   |
| skill-9    | Spring Boot REST API (Student CRUD)   |
| skill-10   | React Student Manager (CRUD Demo)     |
| skill-11   | React API Integration (Fetch/Axios/JSON)|

---

## 🧪 Experiment Overview

| Skill    | Experiment                        | Key Concepts                       |
|----------|-----------------------------------|-------------------------------------|
| Skill-1  | Git Version Control                | Git workflow, commits, branching    |
| Skill-2  | Hibernate CRUD                     | ORM mapping, insert/update/delete   |
| Skill-3  | Hibernate HQL                      | Sorting, pagination, aggregate      |
| Skill-4  | Spring Dependency Injection        | Constructor & Setter Injection      |
| Skill-5  | Spring Autowiring                  | @Component, @Autowired              |
| Skill-6  | Spring Boot MVC                    | REST APIs, request handling         |
| Skill-7  | Spring Boot REST API (Course CRUD) | REST endpoints, CRUD, validation    |
| Skill-8  | Spring Boot REST API (Product CRUD)| REST endpoints, CRUD, validation    |
| Skill-9  | Spring Boot REST API (Student CRUD)| REST endpoints, CRUD, validation    |
| Skill-10 | React Student Manager              | React CRUD, useState, components    |
| Skill-11 | React API Integration              | Fetch, Axios, Local JSON, hooks     |

---

## ⚙️ Running the Projects

### Java/Maven Projects (Skill-1 to Skill-9)
1. Open the skill folder (e.g., skill-3)
2. Run: `mvn clean install` or `mvn spring-boot:run` (for Spring Boot)
3. Update DB credentials in `hibernate.cfg.xml` if needed
4. Access REST endpoints via browser/Postman

### React Projects (Skill-10, Skill-11)
1. Open the skill folder (e.g., skill-11)
2. Run: `npm install` then `npm start`
3. Open [http://localhost:3000](http://localhost:3000) in browser

---

## 🌟 Example Outputs

- Java: Console logs, REST API responses, DB tables
- React: Browser screenshots, CRUD UI, API data tables

---

## 🎯 Learning Outcomes

By completing these experiments, you will practice:
- Git repository management
- Hibernate ORM and CRUD operations
- Advanced queries using HQL
- Spring Dependency Injection & Autowiring
- REST API development with Spring Boot
- Web request handling (MVC)
- React SPA development (CRUD, API integration)
- API integration using Fetch, Axios, and Local JSON

---

## 👨‍💻 Author & Course Info

**Name:** GURRALA HAREESH REDDY  
**ID:** 2400090155  
**Section:** 06  
**Course:** Full Stack Application Development (FSAD)

---

## ⭐ Purpose

This repository was created for academic laboratory submission and demonstrates practical implementation of Java enterprise and React frontend development frameworks.

---

---

## 🏅 Repository Highlights

- Modular structure: Each experiment is organized in its own folder for clarity and maintainability.
- Comprehensive documentation: Every skill is described with its purpose, tech stack, and key concepts.
- Modern technologies: Java 17, Spring Boot, Hibernate, React 18, Axios, and more.
- Version control: All code is tracked in Git for transparency and reproducibility.
- Easy setup: Clear instructions for building and running each project.
- Output samples: Example outputs and screenshots included for reference.
- Full stack coverage: Demonstrates both backend and frontend development skills.

---

> For best results, open each skill folder, follow the setup instructions, and review the outputs. All code is ready for exploration, learning, and practical use.

Each folder contains an independent Maven project.

🧪 Experiment Overview
Skill	Experiment	Key Concepts
Skill-1	Git Version Control	Git workflow, commits, branching
Skill-2	Hibernate CRUD	ORM mapping, insert/update/delete
Skill-3	Hibernate HQL	Sorting, pagination, aggregate queries
Skill-4	Spring Dependency Injection	Constructor & Setter Injection
Skill-5	Spring Autowiring	@Component and @Autowired
Skill-6	Spring Boot MVC	REST APIs, request handling
⚙️ Running the Projects
🧩 Skill-1 – Basic Maven Project
mvn -f skill-1/pom.xml clean package
java -cp skill-1/target/classes Main
🧩 Skill-2 – Hibernate CRUD

Before running, update database credentials in:

skill-2/src/main/resources/hibernate.cfg.xml

Run:

mvn -f skill-2/pom.xml clean test
🧩 Skill-3 – Hibernate HQL
mvn -f skill-3/pom.xml clean test
🧩 Skill-4 – Spring Dependency Injection

Run XML configuration demo:

mvn -f skill-4/pom.xml org.codehaus.mojo:exec-maven-plugin:3.1.0:java "-Dexec.mainClass=com.example.XmlConfigMain"

Run annotation configuration demo:

mvn -f skill-4/pom.xml org.codehaus.mojo:exec-maven-plugin:3.1.0:java "-Dexec.mainClass=com.example.AnnotationConfigMain"
🧩 Skill-5 – Spring Autowiring
mvn -f skill-5/pom.xml org.codehaus.mojo:exec-maven-plugin:3.1.0:java "-Dexec.mainClass=com.example.MainApp"

Example Output:

Student{id=101, name='Hareesh', gender='Male', certification=Certification{...}}
🧩 Skill-6 – Spring Boot MVC

Start the Spring Boot application:

mvn -f skill-6/pom.xml spring-boot:run

Application runs at:

http://localhost:8081

Example endpoints:

/welcome
/books
/books/{id}
/search?title=Java
/author/{name}
/addbook
/viewbooks
🌐 Example API Endpoints
Endpoint	Method	Description
/welcome	GET	Welcome message
/count	GET	Returns book count
/price	GET	Returns book price
/books	GET	List of book titles
/books/{id}	GET	Book details
/search?title=	GET	Search books
/author/{name}	GET	Author information
/addbook	POST	Add a new book
/viewbooks	GET	View all books
🎯 Learning Outcomes

By completing these experiments, the following concepts were practiced:

Git repository management

Hibernate ORM and CRUD operations

Advanced queries using HQL

Spring Dependency Injection

Spring Autowiring

REST API development using Spring Boot

Web request handling using MVC architecture

👨‍💻 Author

GURRALA HAREESH REDDY
ID: 2400090155
Course: Full Stack Application Development (FSAD)

⭐ Purpose

This repository was created for academic laboratory submission and demonstrates practical implementation of Java enterprise development frameworks.
