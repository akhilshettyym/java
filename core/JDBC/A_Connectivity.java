package akhilshettyym.JAVA.core.JDBC;

// Importing required JDBC classes
import java.sql.*;

public class A_Connectivity {

    public static void main(String[] args) {

        // Step 1: Define the Database URL, username, and password
        // Replace "your_database" with the actual database name
        String url = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username"; // Replace with your MySQL username
        String password = "your_password"; // Replace with your MySQL password

        // Step 2: Define the SQL query
        // Example query to insert data into the 'students' table
        String query = "INSERT INTO students (id, name) VALUES (109, 'Bhatt')";

        try {
            // Step 3: Load the MySQL Type-4 driver
            // Class.forName() loads the driver at runtime
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 4: Establish the database connection
            // DriverManager.getConnection() creates a connection with the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Step 5: Create a Statement object to execute the query
            Statement statement = connection.createStatement();

            // Step 6: Execute the query using executeUpdate()
            // executeUpdate() is used for INSERT, UPDATE, DELETE operations
            int rowsAffected = statement.executeUpdate(query);

            // Display the number of rows affected
            System.out.println("Rows affected: " + rowsAffected);

            // Step 7: Close the statement and connection to avoid memory leaks
            statement.close();
            connection.close();
            System.out.println("Connection closed.");

        } catch (ClassNotFoundException e) {
            // Handles exception if the driver is not found
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            // Handles SQL-related exceptions (like syntax errors, connection issues)
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
}

/*
 * 
 * JDBC (Java Database Connectivity)
 * JDBC (Java Database Connectivity) is an API (Application Programming
 * Interface) in Java that allows Java applications to interact with databases.
 * It enables a Java program to:
 * ✅ Connect to a database
 * ✅ Execute SQL queries
 * ✅ Retrieve and manipulate data
 * 
 * 💡 Why Use JDBC?
 * It allows Java applications to work with different databases (like MySQL,
 * Oracle, PostgreSQL) without needing to change the code.
 * It provides a standard interface, so the same code can work with different
 * databases.
 * JDBC Architecture
 * JDBC architecture allows two main ways to connect to a database:
 * 
 * 1. Two-Tier Architecture
 * The Java application directly communicates with the database using a JDBC
 * driver.
 * The client (Java application) sends SQL queries to the database and gets the
 * result directly.
 * Structure:
 * 👉 Client Application → JDBC Driver → Database
 * 
 * Example:
 * 
 * A desktop Java app that connects directly to a MySQL database.
 * 2. Three-Tier Architecture
 * The client communicates with an application server (middle layer).
 * The application server processes the request and communicates with the
 * database.
 * Structure:
 * 👉 Client Application → Application Server → JDBC Driver → Database
 * 
 * Example:
 * 
 * A web-based Java app where the client sends requests to a server, which then
 * fetches data from the database.
 * Main Components of JDBC
 * JDBC has 4 key components that handle database interactions:
 * 
 * 1. JDBC API
 * Provides methods and interfaces to communicate with the database.
 * Two key packages:
 * 
 * java.sql – For standard operations (creating connections, executing queries).
 * javax.sql – For advanced features (connection pooling, data source
 * management).
 * 
 * 2. JDBC Driver Manager
 * Manages database drivers.
 * Ensures that the correct driver is used to connect to the database.
 * 
 * 3. JDBC Test Suite
 * Tests if the driver and operations (insertion, deletion, updating) are
 * working properly.
 * 
 * 4. JDBC Drivers
 * JDBC uses drivers to connect to different databases:
 * 
 * Driver Type Description Status
 * Type-1 (JDBC-ODBC Bridge) Converts JDBC calls to ODBC calls Deprecated
 * Type-2 (Native-API Driver) Uses native code (partially Java) Less used
 * Type-3 (Network Protocol Driver) Converts JDBC calls to a network protocol
 * Rarely used
 * Type-4 (Thin Driver) Pure Java driver, directly connects to the database ✅
 * Most commonly used
 * 
 * 
 * Important JDBC Classes and Interfaces
 * Class/Interface Description
 * DriverManager Manages drivers and creates connections
 * Connection Represents a session with the database
 * Statement Executes static SQL queries
 * PreparedStatement Executes precompiled SQL queries with parameters
 * CallableStatement Executes stored procedures
 * ResultSet Stores the results of a query
 * SQLException Handles SQL-related errors
 * Steps to Connect to MySQL Using JDBC
 * 
 * ✅ Step 1: Load the JDBC Driver
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * Loads the MySQL Type-4 driver.
 * 
 * ✅ Step 2: Establish a Connection
 * Connection connection = DriverManager.getConnection(
 * "jdbc:mysql://localhost:3306/your_database",
 * "your_username",
 * "your_password"
 * );
 * Connects to the MySQL database using the correct URL, username, and password.
 * 
 * ✅ Step 3: Create a Statement
 * Statement statement = connection.createStatement();
 * Creates a Statement object to execute SQL queries.
 * 
 * ✅ Step 4: Execute a Query
 * String query = "INSERT INTO students (id, name) VALUES (101, 'John Doe')";
 * int rowsAffected = statement.executeUpdate(query);
 * System.out.println("Rows affected: " + rowsAffected);
 * Executes an INSERT statement and returns the number of rows affected.
 * 
 * ✅ Step 5: Close the Connection
 * statement.close();
 * connection.close();
 * Closes the database connection to avoid memory leaks.
 * 
 * Complete Example
 * The following Java program shows how to connect to a MySQL database and
 * insert data using JDBC:
 * 
 * 
 * import java.sql.*;
 * 
 * public class JDBCExample {
 * public static void main(String[] args) {
 * String url = "jdbc:mysql://localhost:3306/your_database";
 * String username = "your_username";
 * String password = "your_password";
 * 
 * String query = "INSERT INTO students (id, name) VALUES (109, 'Bhatt')";
 * 
 * try {
 * // Load the MySQL driver
 * Class.forName("com.mysql.cj.jdbc.Driver");
 * 
 * // Establish connection
 * Connection connection = DriverManager.getConnection(url, username, password);
 * 
 * // Create a statement
 * Statement statement = connection.createStatement();
 * 
 * // Execute query
 * int rowsAffected = statement.executeUpdate(query);
 * System.out.println("Rows affected: " + rowsAffected);
 * 
 * // Close the connection
 * statement.close();
 * connection.close();
 * System.out.println("Connection closed.");
 * 
 * } catch (ClassNotFoundException e) {
 * System.err.println("JDBC Driver not found: " + e.getMessage());
 * } catch (SQLException e) {
 * System.err.println("SQL Error: " + e.getMessage());
 * }
 * }
 * }
 * 
 * 
 * Output:
 * Rows affected: 1
 * Connection closed.
 * 
 * ✅ Explanation of Code
 * Class.forName() – Loads the MySQL driver.
 * DriverManager.getConnection() – Connects to the database.
 * createStatement() – Creates an SQL statement.
 * executeUpdate() – Executes an INSERT statement.
 * close() – Closes the connection and statement.
 * Key Features of JDBC
 * ✅ Platform Independence – Works across different platforms.
 * ✅ Standard API – Same code for different databases.
 * ✅ Multiple Database Support – Works with MySQL, PostgreSQL, Oracle, etc.
 * ✅ Extensibility – Supports batch processing, connection pooling, and
 * transactions.
 * 
 * 
 * 🚀 Summary
 * JDBC is a powerful way to connect Java applications to relational databases.
 * By using standard drivers and the JDBC API, you can easily connect to MySQL
 * or other databases, execute queries, and handle data in a structured way.
 * 
 * 
 */