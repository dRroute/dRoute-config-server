# dRoute-config-server

## Overview
The `dRoute-config-server` is a configuration server for the dRoute project. It centralizes configuration management, enabling dynamic updates and consistent configuration across distributed services.

## Features
- Centralized configuration management.
- Dynamic configuration updates without service restarts.
- Secure storage and retrieval of sensitive configuration data.
- Support for multiple environments (e.g., development, staging, production).

## Prerequisites
- Java 17 or higher
- Spring Boot 3.x
- Maven 3.8+ or Gradle 7.x+
- A running instance of a configuration repository (e.g., Git, database).

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/dRoute-config-server.git
   cd dRoute-config-server
   ```

2. **Create and configure the `.env` file**:  
   Before running the project, you must create a `.env` file in the root directory. Without the `.env` file, the project will not run. Below is an example of the `.env` file:
   ```properties
   # Enable Config Server
   GITHUB_CONFIG_REPO_URL=https://github.com/dRroute/dRoute-config-repo.git

   # Enable Eureka Client
   EUREKA_SERVER_URL=http://localhost:8761/eureka/
   ```

   Ensure the `.env` file is added to `.gitignore` to prevent sensitive information from being committed to the repository.

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the server:
   ```bash
   java -jar target/dRoute-config-server.jar
   ```

5. Access the server at `http://localhost:8888`.

## Using the `.env` File
- The `.env` file is used to store environment-specific variables securely.
- The application will automatically load variables from the `.env` file if properly configured.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request.

## License
This project is licensed under the dRoute License. See the `LICENSE` file for details.