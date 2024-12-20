# Movie Review Platform

A backend project built using the Spring Boot framework to provide REST API endpoints for a movie review platform. This application allows users to perform CRUD operations for movies and reviews, rate movies, fetch top-rated movies by genre, and generate ranking reports. The project includes an HTML interface for listing movies and their reviews, along with detailed JSON responses for API endpoints.

---

## Project Overview

### Features
1. **CRUD Operations**: Perform Create, Read, Update, and Delete operations for movies and reviews.
2. **User Reviews**: Users can rate movies and leave comments.
3. **Genre-Specific Queries**: Fetch top-rated movies filtered by genre.
4. **Reports**: Aggregate ratings and generate ranking reports.
5. **HTML Interface**: Display movies and reviews in a user-friendly format.

---

## Prerequisites

Before setting up the project, ensure you have the following installed:

1. **Java**:
   - Version: OpenJDK 17 or higher (tested with OpenJDK 23.0.1).

2. **Maven**:
   - Version: 3.6 or higher.

3. **MySQL**:
   - Version: 8.0 or higher.
   - Create a database named `movie_review_platform`.

4. **Docker (Optional)**:
   - For containerizing and running the application.

---
## Setup Instructions

### 1. Clone the Repository
Clone the project repository to your local system:

git clone https://github.com/your-username/movie-review-platform.git
cd movie-review-platform
---
## 2. Database Setup
1. Start your MySQL server.
2. Create a database named movie_review_platform
CREATE DATABASE movie_review_platform;
3. Create a MySQL user with the following credentials:
CREATE USER 'movie_user'@'localhost' IDENTIFIED BY 'Quebecat47@';
GRANT ALL PRIVILEGES ON movie_review_platform.* TO 'movie_user'
## 3. Configure the Application
The database connection is pre-configured in src/main/resources/application.properties. Ensure the following values match your setup:
## 4. Build and RUN the Project
1. Build the project using Maven:
mvn clean install
2. Run the project:
mvn spring-boot:run
3. The application will start at http://localhost:8080.
   
## API ENDPOINTS
1. Movies
a. Get All Movies
Endpoint: GET /api/movies
Response:
[
  { "id": 1, "title": "The Matrix", "genre": "Sci-Fi", "rating": 9 },
  { "id": 2, "title": "Interstellar", "genre": "Sci-Fi", "rating": 9 }
]
b. Add a Movie
Endpoint: POST /api/movies
Request Body:
{ "title": "Inception", "genre": "Sci-Fi", "rating": 8.8 }
Response:
{ "id": 3, "title": "Inception", "genre": "Sci-Fi", "rating": 8.8 }

2. Reviews
a. Get All Reviews
Endpoint: GET /api/reviews
Response:
[
  {
    "id": 1,
    "comment": "Amazing movie!",
    "rating": 10,
    "movie": { "id": 1, "title": "The Matrix" }
  }
]
b. Add a Review
Endpoint: POST /api/reviews
Request Body:
{ "comment": "Fantastic movie!", "rating": 9, "movie": { "id": 1 } }
Response:
{
  "id": 2,
  "comment": "Fantastic movie!",
  "rating": 9,
  "movie": { "id": 1, "title": "The Matrix" }
}
3. Top-Rated Movies by Genre
Endpoint: GET /api/movies/top-rated?genre=Sci-Fi
Response:
[
  { "id": 1, "title": "The Matrix", "genre": "Sci-Fi", "rating": 9 },
  { "id": 2, "title": "Interstellar", "genre": "Sci-Fi", "rating": 9 }
]

Results
HTML View
Movies and reviews are displayed in an HTML format:


API Responses
Movies API (/api/movies):
![image](https://github.com/user-attachments/assets/6ae49442-a198-411e-8d61-4bdc8834376a)

Reviews API (/api/reviews):
![image](https://github.com/user-attachments/assets/6383ace4-5396-4aba-87e5-5152a6811ca4)

Result from [loc](http://localhost:8080/):
![image](https://github.com/user-attachments/assets/a22847af-4735-44c0-831f-30d01d3383b4)

Thank you!
