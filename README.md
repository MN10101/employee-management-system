# Employee Management System

This is a simple Employee Management System built using Spring Boot.

## Features

- Allows users to register new employees.
- Stores employee information in a MySQL database.
- Provides basic CRUD operations for managing employee data.
- Uses Spring MVC for handling web requests.


## Prerequisites

Before running this application, make sure you have the following installed:

- Java Development Kit (JDK) version 8 or later
- Maven
- MySQL Server

## Setup

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/your-username/employee-management-system.git
    ```

2. Navigate to the project directory:

    ```bash
    cd employee-management-system
    ```

3. Configure the MySQL database:
   
   - Create a MySQL database named `employee_management`.
   - Update the `spring.datasource.username` and `spring.datasource.password` properties in the `application.properties` file with your MySQL username and password.

4. Run the application using Maven:

    ```bash
    mvn spring-boot:run
    ```

5. Access the application in your web browser at [http://localhost:8080](http://localhost:8080).

## Usage

1. Access the employee registration form by navigating to [http://localhost:8080/form](http://localhost:8080/form) in your web browser.

2. Fill out the form with the employee's details and click "Employee Register" to submit the form.

3. Upon successful registration, you will be redirected to a confirmation page.

4. To view all registered employees, you can access the list at [http://localhost:8080/employees](http://localhost:8080/employees).

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.


![3](https://github.com/MN10101/employee-management-system/assets/78208459/a47048bb-ef1c-4b45-a9b8-0e5367c1adbb)

![4](https://github.com/MN10101/employee-management-system/assets/78208459/4417a33a-ee32-4bfc-a176-6725c9932339)
