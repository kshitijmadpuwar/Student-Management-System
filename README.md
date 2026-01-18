# 🎓 Student Management System (Spring Boot)

## 📌 Description
Student Management System is a Spring Boot based RESTful web application used to manage student records. It provides APIs to perform CRUD operations like creating, updating, deleting, and fetching student details.

This project follows a layered architecture and demonstrates best practices in Spring Boot application development.

---

## 🚀 Features
- ➕ Add new student
- ✏️ Update student details
- ❌ Delete student
- 🔍 Get student by ID
- 📋 Get all students
- ⚠️ Global exception handling
- 🏗️ Layered architecture (Controller, Service, Repository)

---

## 🛠️ Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

## 📂 Project Structure
- `controller` - Handles REST APIs
- `service` - Business logic
- `repository` - Database access
- `entity` - JPA entities
- `exception` - Custom exceptions and global exception handler

---

## ▶️ How to Run the Project

1. Clone the repository
2. Import the project in Eclipse / IntelliJ
3. Update `application.properties` with your MySQL username & password
4. Run the main Spring Boot application
5. Test APIs using Postman

---

## 📬 API Endpoints (Sample)

- `POST /students` → Add student  
- `GET /students/{id}` → Get student by ID  
- `GET /students` → Get all students  
- `PUT /students/{id}` → Update student  
- `DELETE /students/{id}` → Delete student  

---

## 👨‍💻 Author
**Kshitij Madpuwar**
