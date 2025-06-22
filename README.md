# Spring Security CSRF Demo

This project is a simple Spring Boot application demonstrating how CSRF (Cross-Site Request Forgery) protection works using Spring Security. It includes basic REST APIs to manage student data and exposes the CSRF token via an endpoint for learning purposes.

---

## 🧰 Tech Stack

- Java 21
- Spring Boot 3.5.3
- Spring Security
- Maven
- Lombok

---

## 🚀 Features

- 🔐 CSRF protection enabled using Spring Security
- 📦 RESTful APIs for `Student` resource
- 🪪 `/getToken` endpoint to expose CSRF token for front-end use
- Simple `GET` and `POST` methods with JSON payloads

---

## 📁 API Endpoints

| Method | Endpoint       | Description               |
|--------|----------------|---------------------------|
| GET    | `/students`    | Fetch all students        |
| POST   | `/students`    | Add a new student         |
| GET    | `/home`        | Returns "Hello" response  |
| GET    | `/getToken`    | Returns CSRF token        |

---

## 🧪 Sample `curl` Requests

### 🔸 Get CSRF Token
```bash
curl -c cookies.txt http://localhost:8080/getToken
