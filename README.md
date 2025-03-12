
# Invoice Processing System

The Invoice Processing Management System is a full-stack web application designed to manage inventory efficiently. The system enables users to add, delete, and view inventory items using a user-friendly interface.
## Tech Stack

- Frontend: React.js

- Backend: Java Spring Boot

- Database: MySQL
## Features

- Add new inventory items
- Delete existing inventory items
- View all inventory items
- REST API integration for seamless   data management


## API Reference

### Get all invoice

#### Endpoint

```
https://localhost/8080/invoice
```


### Add invoice

#### Endpoint

```http
  Post /localhost:8080/invoice
```

### Payroll
```
{
  "vendor": "Vinzo",
  "product": "ram",
  "amount": 50000
}
```


#### Delete Invoice

```http
  GET /localhost:8080/invoice/${id}
```
## Setup Instructions

### Backend (Spring Boot)

#### 1. Clone the repository:
```
https://github.com/ShubhamBorkute/Invoice-Proccessing-System.git
```

#### 2. Navigate to the backend directory:
```
cd server
```

#### 3. Configure application.properties with MySQL database details.

#### 4. Build and run the application:
```
mvn spring-boot:run
```

### Frontend (React.js)

#### 1. Navigate to the frontend directory:
```
cd client
```

#### 2. Install dependencies:
```
npm Install
```

#### 3. Start the application:
```
npm Start
```
## Contributing

Contributions are always welcome!

## License

[This project is licensed under the MIT License.](https://choosealicense.com/licenses/mit/)


