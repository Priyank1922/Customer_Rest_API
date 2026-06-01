# Customer Management REST API

A RESTful API built using Spring Boot for managing customer orders. The application provides complete CRUD (Create, Read, Update, Delete) functionality for customer records and demonstrates the implementation of Spring Boot, Spring Data JPA, and MySQL integration.

## Features

* Create a new customer order
* Retrieve all customer records
* Retrieve customer details by ID
* Update existing customer information
* Delete customer orders
* RESTful API architecture
* Database integration using Spring Data JPA and Hibernate

## Tech Stack

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL
* Maven

## Project Structure

```text
src/main/java/com/work/customers
│
├── controller
│   └── CustomerController.java
│
├── model
│   └── Customer.java
│
├── repository
│   └── CustomerRepository.java
│
├── service
│   └── CustomerService.java
│
└── CustomerManagementApplication.java
```

## Customer Entity

| Field     | Type   | Description            |
| --------- | ------ | ---------------------- |
| id        | Long   | Unique customer ID     |
| name      | String | Customer name          |
| email     | String | Customer email address |
| orderDish | String | Ordered dish name      |

## API Endpoints

### Create Customer

**POST** `/customer`

Request Body:

```json
{
  "name": "Harsh",
  "email": "r@gmail.com",
  "orderDish": "Pizza"
}
```

### Get All Customers

**GET** `/customer`

### Get Customer By ID

**GET** `/customer/{id}`

Example:

```http
GET /customer/1
```

### Update Customer

**PUT** `/customer/{id}`

Request Body:

```json
{
  "name": "Harsh Sharma",
  "email": "harsh123@gmail.com",
  "orderDish": "Burger"
}
```

### Delete Customer

**DELETE** `/customer/{id}`

## Getting Started

### Prerequisites

* Java 17 or above
* Maven
* MySQL Server

### Clone Repository

```bash
git clone https://github.com/your-username/customer-management-rest-api.git
cd customer-management-rest-api
```



### Run the Application

```bash
mvn spring-boot:run
```

Application will start on:

```text
http://localhost:8080
```

## API Testing

You can test the endpoints using:

* Postman
* Thunder Client
* Insomnia
* Browser (GET requests)

## Future Enhancements

* Input validation using Bean Validation
* Global exception handling
* Swagger/OpenAPI documentation
* Spring Security authentication and authorization
* Pagination and sorting support

## Learning Outcomes

This project helped in understanding:

* REST API development with Spring Boot
* Layered architecture (Controller-Service-Repository)
* Database operations using Spring Data JPA
* Hibernate ORM concepts
* CRUD operations implementation
* MySQL integration with Spring Boot

## Author

**Priyank Mehta**

Java Developer | Spring Boot Enthusiast | Full Stack Learner

Feel free to contribute, raise issues, or provide suggestions for improvement.
