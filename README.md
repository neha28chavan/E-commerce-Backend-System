# E-commerce Backend System (Microservices Architecture)

This is a backend project for an E-commerce system built using Spring Boot and Microservices architecture. It includes service discovery via Eureka Server and communication between different microservices.

## 🚀 Services Included

1. *Eureka Server (flipeserver)*: Acts as the service registry where all microservices register themselves and discover each other.
2. *Product Service (productservice)*: Manages product-related data and operations.
3. *Inventory Service (inventoryservice)*: Manages product stock and inventory levels.
4. *Order Service (orderservice)*: Handles customer orders and communicates with the Inventory Service.

## 🔄 Architecture & Flow

- *Service Discovery*: All services (Product, Inventory, Order) register with the Eureka Server (flipeserver).
- *Inter-Service Communication*: 
  - The *Order Service* connects with the *Inventory Service* to check stock availability before placing an order.

## 🛠️ Tech Stack

- *Java* / *Spring Boot*
- *Spring Cloud Netflix Eureka*
- *Maven* (Build Tool)
- *Git & GitHub*

## 📦 Project Structure

```text
IntershipProject/
│
├── flipeserver/          # Eureka Server for Service Discovery
├── productservice/       # Product Microservice
├── inventoryservice/     # Inventory Microservice
└── orderservice/         # Order Microservice
