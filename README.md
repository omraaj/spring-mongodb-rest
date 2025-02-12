# spring-mongodb-rest
This is a CRUD operation performed using mongodb as database

## Technologies Used
- Spring Boot
- MongoDB
- Java 17
- Lombok
- Maven

## How to Run the Project
1. Clone the repository:git clone https://github.com/omraaj/spring-mongodb-rest.git
2. Navigate to the project directory:cd spring-mongodb-rest
3. Run the application:./mvnw spring-boot:run

## API Endpoints
- `GET /api/books` - Retrieve all books
- `POST /api/books` - Add a new book
- `GET /api/books/{id}` - Get a book by ID
- `PUT /api/books/{id}` - Update a book
- `DELETE /api/books/{id}` - Delete a book
- `GET /api/books/cost/{cost}`- Retrieve books greater than the cost