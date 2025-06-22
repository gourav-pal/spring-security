# 🛡️ Spring Security Demo

This is a minimal Spring Boot application demonstrating how CSRF (Cross-Site Request Forgery) protection works using Spring Security.

## 🌐 API Endpoints

| Method | Endpoint     | Description              |
|--------|--------------|--------------------------|
| GET    | /students    | Get all students         |
| POST   | /students    | Add a new student (CSRF secured) |
| GET    | /home        | Basic greeting           |
| GET    | /getToken    | Get CSRF token           |

## 🔸 Add a New Student (with CSRF Token)

### 🏷️ Get CSRF Token

Call the following endpoint:

```
GET /getToken
```

Example response:

```json
{
  "token": "abcd1234...",
  "headerName": "X-CSRF-TOKEN",
  "parameterName": "_csrf"
}
```

### 📤 POST a Student with the Token

```
POST /students
```

Headers:

```
Content-Type: application/json
X-CSRF-TOKEN: abcd1234...
```

Body:

```json
{
  "id": 3,
  "name": "Alice",
  "course": "Spring Security"
}
```

## 📁 Folder Structure

```
spring_security/
├── src/
│   └── main/
│       ├── java/com/example/spring_security/
│       │   ├── SpringSecurityApplication.java
│       │   ├── StudentController.java
│       │   └── model/Students.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── README.md
```

## 🔧 Tech Stack

- Java 21  
- Spring Boot 3.5.3  
- Spring Security  
- Maven  

## 📫 How to Contribute

Feel free to fork this repo, raise issues or send pull requests!

```bash
# Fork and clone the repo
git clone https://github.com/gourav-pal/spring-security.git
cd spring-security

# Create a new branch
git checkout -b feature-name

# Commit and push your changes
git add .
git commit -m "Add your message"
git push origin feature-name
```

## 🧪 Testing in Postman

1. Call `GET /getToken`
2. Copy the CSRF token
3. Make a `POST /students` request using the token in the `X-CSRF-TOKEN` header

✅ **Tip**: Postman handles cookies automatically, so your session ID is preserved.

## 📜 License

MIT License

```
MIT License

Copyright (c) 2025 Gourav Pal

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
