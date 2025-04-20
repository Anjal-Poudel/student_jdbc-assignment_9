# Student JDBC - Assignment 9

This repository contains the implementation for **Assignment 9** in Java, focusing on managing and processing student data using JDBC (Java Database Connectivity). The project demonstrates how to connect to a database, perform CRUD (Create, Read, Update, Delete) operations, and handle student records efficiently.

## 📁 Project Structure

```
student_jdbc-assignment_9/
├── Main.java
├── StudentOperations.java
└── README.md
```

- `Main.java`: The entry point of the application, handling user interactions and invoking operations.
- `StudentOperations.java`: Contains methods to perform various database operations on student data.

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE or command-line tools
- A relational database (e.g., MySQL, PostgreSQL)
- JDBC driver for your chosen database

### Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Anjal-Poudel/student_jdbc-assignment_9.git
   cd student_jdbc-assignment_9
   ```

2. **Set up the Database:**

   - Create a database named `student_db`.
   - Create a table named `students` with appropriate columns (e.g., id, name, age, grade).
   - Update the database connection details in `StudentOperations.java` (URL, username, password).

3. **Compile the Java files:**

   ```bash
   javac Main.java StudentOperations.java
   ```

4. **Run the application:**

   ```bash
   java Main
   ```

## 🧪 Features

- Connect to a relational database using JDBC
- Add new student records to the database
- Retrieve and display existing student information
- Update student details
- Delete student records
- Handle SQL exceptions and ensure resource management

## 📚 License

This project is intended for educational purposes as part of Assignment 9 in a Java programming course.

---

Feel free to explore and modify the code to enhance functionality or integrate additional features.
