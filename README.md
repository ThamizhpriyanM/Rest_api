# Contact Management System

This is a Spring Boot application for managing contacts. The application allows users to create, update, delete, and view contacts. It uses an in-memory data store to manage contacts.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Endpoints](#endpoints)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview

The Contact Management System allows users to add, update, delete, and view contacts. Each contact has a unique ID, name, and phone number.

## Features

- Add new contacts
- Update existing contacts
- Delete contacts
- View a list of all contacts
- View contact details by ID

## Prerequisites

- Java 8 or higher
- Maven

## Setup

1. **Clone the repository:**

    ```sh
    git clone https://github.com/ThamizhpriyanM/Rest_api.git
    ```

2. **Build the project:**

    ```sh
    mvn clean install
    ```

## Running the Application

1. **Run the application:**

    ```sh
    mvn spring-boot:run
    ```

2. **Access the application:**

    The application runs on `http://localhost:8080`.

## Endpoints

- **GET /contact/all** - Retrieve all contacts.
- **GET /contact/{id}** - Retrieve contact by ID.
- **POST /contact** - Create a new contact.
- **PUT /contact/{id}** - Update an existing contact.
- **DELETE /contact/{id}** - Delete a contact by ID.

## Usage

1. **Create a new contact:**

    ```sh
    POST /contact
    ```

    Example request body:
    ```json
    {
        "name": "John Doe",
        "phoneNumber": "123-456-7890"
    }
    ```

2. **View all contacts:**

    ```sh
    GET /contact/all
    ```

3. **View a contact by ID:**

    ```sh
    GET /contact/{id}
    ```

4. **Update a contact:**

    ```sh
    PUT /contact/{id}
    ```

    Example request body:
    ```json
    {
        "name": "Jane Doe",
        "phoneNumber": "098-765-4321"
    }
    ```

5. **Delete a contact:**

    ```sh
    DELETE /contact/{id}
    ```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License.

