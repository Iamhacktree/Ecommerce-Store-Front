# Product Catalog

## Overview
This is a simple product catalog application built using React for the frontend and Spring Boot for the backend. The application allows users to view a list of products, filter them by category, search by name, and sort them by price.

## Features
- Display a list of products
- Filter products by category
- Search for products by name
- Sort products by price (ascending or descending)
- Fetch data from a Spring Boot backend API

## Screenshot
![Screenshot 2025-02-21 150438](https://github.com/user-attachments/assets/c5c8378c-7084-42d3-a7c1-e1282e70b227)

## Technologies Used
### Frontend:
- React
- Vite
- Bootstrap (for styling)

### Backend:
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (or any relational database)

## Installation

### Prerequisites
- Node.js & npm installed
- Java (JDK 11 or later) installed
- A database (MySQL/PostgreSQL) configured

### Backend Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/your-repo-url.git
   cd backend
   ```
2. Configure the database in `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/product_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```

### Frontend Setup
1. Navigate to the frontend directory:
   ```sh
   cd frontend
   ```
2. Install dependencies:
   ```sh
   npm install
   ```
3. Start the React application:
   ```sh
   npm run dev
   ```

## API Endpoints
### Products
- `GET /api/products/all` → Fetch all products
- `GET /api/products/category/{categoryId}` → Fetch products by category

### Categories
- `GET /api/categories` → Fetch all categories

## Usage
1. Select a category from the dropdown to filter products.
2. Use the search bar to find specific products by name.
3. Change the sorting option to sort by price.

## Troubleshooting
### If `http://localhost:8080/api/products/category/1` is not working:
- Ensure the backend is running.
- Check if there are products linked to category ID `1` in the database.
- Open browser console (F12) and check for API errors.
- Run `npm run dev` in the frontend directory to restart the development server.


