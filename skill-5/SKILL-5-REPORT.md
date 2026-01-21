# Skill-5: Spring Autowiring (Annotation-Based)

## Title
Spring Core – Autowiring using annotations (`@Component`, `@Autowired`) with XML-based component scanning.

## Objective / Aim
To demonstrate Spring dependency injection (DI) using **annotation-based configuration**, where:
- Beans are discovered using **component scanning**
- Dependencies are injected automatically using **`@Autowired`**

## Software / Requirements
- OS: Windows
- JDK: 17 (configured in Maven via `maven.compiler.release`)
- Maven: 3.x
- IDE: VS Code / Eclipse (optional)

## Project Information
- Maven coordinates:
  - GroupId: `com.example`
  - ArtifactId: `skill-5-spring-autowire`
  - Version: `1.0-SNAPSHOT`
- Spring dependency:
  - `org.springframework:spring-context:6.1.5`

## Files Used
- `pom.xml`
- `src/main/java/com/example/MainApp.java`
- `src/main/java/com/example/Student.java`
- `src/main/java/com/example/Certification.java`
- `src/main/resources/applicationContext.xml`

## Theory (Short)
- **`@Component`**: Marks a class as a Spring-managed bean.
- **`@Autowired`**: Tells Spring to inject the required dependency automatically.
- **`<context:component-scan>`**: Enables scanning of packages to find `@Component` beans.

## Implementation Details

### 1) XML Configuration (Component Scan)
In `applicationContext.xml`, component scanning is enabled:
- base package: `com.example`

This allows Spring to detect and create beans for:
- `Student` (`@Component`)
- `Certification` (`@Component`)

### 2) Bean Classes
- `Certification` is a component bean with fixed demo values:
  - id = 501
  - name = Spring Professional
  - dateOfCompletion = 10-01-2026

- `Student` is also a component bean and has a dependency:
  - `@Autowired private Certification certification;`

So, Spring automatically injects the `Certification` bean into `Student`.

### 3) Main Class Execution
In `MainApp.java`:
- Loads Spring container via `ClassPathXmlApplicationContext("applicationContext.xml")`
- Fetches bean using `context.getBean(Student.class)`
- Prints the object (calls `toString()`)

## Steps to Run (Maven)
Open terminal in the `skill-5` folder and run:

### Build
```bash
mvn -DskipTests package
```

### Run
PowerShell-friendly command:
```bash
mvn --% exec:java -Dexec.mainClass=com.example.MainApp -Dstyle.color=always
```

> Note: `--%` is PowerShell “stop parsing” so `-Dexec.mainClass=...` passes correctly to Maven.

## Output
Expected console output:

```text
Student{id=101, name='Hareesh', gender='Male', certification=Certification{id=501, name='Spring Professional', dateOfCompletion='10-01-2026'}}
```

Maven should show:
- `[INFO] BUILD SUCCESS`

## Result / Conclusion
Successfully implemented Spring annotation-based dependency injection:
- Beans were detected using component scanning
- `Certification` was autowired into `Student`
- Application ran successfully and printed the injected dependency output

## Screenshots
(Add screenshots here)
- Maven build output (`BUILD SUCCESS`)
- Program execution output
