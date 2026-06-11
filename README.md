# 📌 Bookmark API

A simple and beginner-friendly REST API built using Spring Boot to store, manage, and organize learning resources such as videos, articles, and repositories.

---

## 🚀 Features

* ✅ Create bookmarks
* ✅ View all bookmarks
* ✅ Update bookmarks
* ✅ Delete bookmarks
* ✅ Categorize bookmarks (Video, Article, Repository)
* ✅ Simple frontend using HTML, CSS, and JavaScript
* ✅ In-memory H2 database for easy development

---

## 🛠️ Tech Stack

* Backend: Java, Spring Boot
* Database: H2 (in-memory)
* ORM: Spring Data JPA
* Frontend: HTML, CSS, JavaScript
* Build Tool: Maven

---

## 📁 Project Structure

```
com.project.bookmarkapi
 ├── controller
 ├── service
 ├── repository
 ├── model
 └── BookmarkapiApplication
```

---

## ⚙️ Setup & Run

### 1. Clone the repository

```
git clone https://github.com/sabarirajan83/Bookmark-API.git
cd Bookmark-API
```

---

### 2. Run the application

```
mvn spring-boot:run
```

---

### 3. Open in browser

```
http://localhost:8080/
```

---

## 🧪 API Endpoints

### ➕ Create Bookmark

```
POST /api/bookmarks
```

**Request Body:**

```json
{
  "title": "Spring Boot Tutorial",
  "url": "https://youtube.com",
  "category": "Video"
}
```

---

### 📥 Get All Bookmarks

```
GET /api/bookmarks
```

---

### ✏️ Update Bookmark

```
PUT /api/bookmarks/{id}
```

---

### ❌ Delete Bookmark

```
DELETE /api/bookmarks/{id}
```

---

## 🗄️ H2 Database Console

Access the database:

```
http://localhost:8080/h2-console
```

**JDBC URL:**

```
jdbc:h2:mem:bookmarkdb
```

**Username:** `sa`
**Password:** `password123`

---

## 🎨 Frontend

* Located in:

```
src/main/resources/static/index.html
```

* Features:

  * Add bookmarks
  * View all bookmarks
  * Edit and delete
  * Filter by category

---

## 💡 Future Improvements

* 🔐 Add authentication (JWT)
* 🗄️ Switch to MySQL/PostgreSQL
* 🎨 Build React frontend
* 🔍 Add search & pagination
* ☁️ Deploy to cloud (Render / Railway)

---

## 👨‍💻 Author

Your Name
GitHub: https://github.com/sabarirajan83

---

## ⭐ Acknowledgements

This project is built for learning and practicing Spring Boot fundamentals.
