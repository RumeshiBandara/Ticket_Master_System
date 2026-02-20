🎟️ Ticket Master System 
📖 Overview
The Ticket Master System Backend is a RESTful web service developed to manage event creation, ticket booking, seat allocation, and user management efficiently.
This backend application is built using Spring Boot and follows a layered architecture (Controller, Service, Repository) to ensure maintainability, scalability, and clean code structure. Database operations are handled using Spring Data JPA, enabling seamless interaction with a relational database.
🚀 Features
User registration and authentication


Event creation and management


Ticket booking functionality


Seat availability management


Booking history tracking


Role-based access control (Admin / User)


Global exception handling


RESTful API design


🏗️ Architecture
The backend follows a Layered Architecture:
Controller Layer – Handles HTTP requests and responses


Service Layer – Contains business logic


Repository Layer – Manages database interactions using JPA


Entity Layer – Represents database tables as Java classes


This structure ensures separation of concerns and improves maintainability.
🛠️ Technologies Used
Spring Boot


Spring Data JPA


REST API


Hibernate


MySQL (or your database)


Maven


🗄️ Database
The system uses a relational database to store:
Users


Events


Tickets


Bookings


Seat detail

