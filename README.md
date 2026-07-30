# 📚 Library Management REST API

A robust RESTful API built with **Java** and **Spring Boot** to manage library books. Supports full **CRUD operations** (Create, Read, Update, Delete) with a clean layered architecture.

## 🚀 Tech Stack
- **Java 17**
- **Spring Boot 4.x**
- **Spring Data JPA (Hibernate)**
- **H2 Database** (in-memory)
- **Maven** (Build Tool)

## 📦 Features
- ✅ Add a new book (POST `/api/books`)
- ✅ View all books (GET `/api/books`)
- ✅ Search a book by ID (GET `/api/books/{id}`)
- ✅ Update a book (PUT `/api/books/{id}`)
- ✅ Delete a book (DELETE `/api/books/{id}`)

## 🛠️ How to Run Locally
1. **Clone the repository:**
   ```bash
   git clone https://github.com/Mohammad-rafi95/library-management-api.git
   cd library-management-api

2.Build the project:
bash
mvnw clean package

3.Run the application:
bash
mvnw spring-boot:run

4.Access the API:
Open your browser and go to:
text
http://localhost:8080/api/books

📝 Sample API Test (Using Browser Console)
javascript
fetch('http://localhost:8080/api/books', {
    method: 'POST',
    headers: {'Content-Type': 'application/json'},
    body: JSON.stringify({
        title: 'The Great Gatsby',
        author: 'F. Scott Fitzgerald',
        isbn: '9780743273565',
        publishedYear: 1925,
        genre: 'Fiction',
        summary: 'A story of the mysterious Jay Gatsby'
    })
})
.then(r => r.json())
.then(d => console.log('Book added:', d));

👨‍💻 Author
Shaik Mohammad Rafi
LinkedIn | GitHub

📄 License
This project is open source and available under the MIT License.

