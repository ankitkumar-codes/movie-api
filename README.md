# Movie REST API

A simple Java Spring Boot backend application that provides RESTful APIs
to manage movies using in-memory storage.

This project is created as part of a Java sample task.

---

## Tech Stack
- Java
- Spring Boot
- Maven
- In-memory storage (ArrayList)

---

## How to Run the Application

1. Clone the repository
2. Open the project in IntelliJ
3. Run the main class: `MovieapiApplication`
4. Application starts on:
   http://localhost:8080

---

## API Endpoints

### 1. Add a New Movie

Endpoint:
POST /api/movies

Request Body (JSON):
{
  "id": 1,
  "title": "Inception",
  "description": "Sci-fi thriller",
  "genre": "Sci-Fi",
  "rating": 8.8
}

Responses:
- 201 Created – Movie added successfully
- 400 Bad Request – Validation error

---

### 2. Get Movie by ID

Endpoint:
GET /api/movies/{id}

Example:
GET /api/movies/1

Responses:
- 200 OK – Movie found
- 404 Not Found – Movie not found

---

## Notes
- Data is stored in memory using ArrayList.
- No database is used.
- Data will reset when the application restarts.
