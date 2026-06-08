# 🎓 StudentSphare Application (Core java, Spring Boot)

## 📌 Overview
This is a backend project built using Spring Boot to manage student records through REST APIs.  
The main goal of this project was to understand how real-world backend applications are structured and how CRUD operations work with a database.

---

## 🚀 Features
- Add new student  
- Update student details  
- Delete student  
- Fetch student by ID  
- Fetch all students  
- Global exception handling  
- Layered architecture implementation  

---

## 🛠️ Tech Stack

**Backend:**  
Java, Spring Boot, Spring Data JPA  

**Database:**  
MySQL  

**ORM Tool:**  
Hibernate  

**Build Tool:**  
Maven  

---

## 🧠 What I Learned

- How to build REST APIs using Spring Boot  
- Understanding of layered architecture (Controller → Service → Repository)  
- Database integration using JPA & Hibernate  
- Handling exceptions using @ControllerAdvice  
- Writing clean and structured backend code  

---

## 📂 Project Structure

- `controller` → Handles API requests  
- `service` → Contains business logic  
- `repository` → Handles database operations  
- `entity` → Represents database tables  
- `exception` → Custom exceptions & global handler  

---

## ▶️ How to Run

1. Clone the repository  
2. Open in Eclipse / IntelliJ  
3. Configure MySQL in `application.properties`  
4. Run the Spring Boot application  
5. Test APIs using Postman  

---

## 🔗 API Endpoints

- `POST /students` → Add student  
- `GET /students/{id}` → Get student by ID  
- `GET /students` → Get all students  
- `PUT /students/{id}` → Update student  
- `DELETE /students/{id}` → Delete student  

---

## 👨‍💻 Author

Kshitij Madpuwar
