package akhilshettyym.JAVA.core.JDBC;

public class C_Connections {
    /*
     * Establishing JDBC Connection in Java (Simplified)
     * What is JDBC?
     * JDBC stands for Java Database Connectivity. It’s an API (set of rules) that
     * allows Java programs (frontend) to communicate with databases (backend) like
     * MySQL, PostgreSQL, Oracle, etc.
     * 
     * JDBC acts as a bridge between your Java program and the database, allowing
     * you to:
     * 
     * Send data to the database
     * Retrieve data from the database
     * Steps to Connect Java Application with a Database
     * Here’s a simple step-by-step process to connect a Java program with a
     * database:
     * 
     * 1. Import the Packages
     * You need to import the necessary JDBC packages at the beginning of your
     * program:
     * import java.sql.*;
     * 
     * 2. Load the Driver
     * You have two ways to load the driver:
     * Using Class.forName() – Loads the driver at runtime:
     * Class.forName("com.mysql.cj.jdbc.Driver");
     * Using DriverManager.registerDriver() – Registers the driver at compile time:
     * DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
     * 
     * 3. Establish the Connection
     * To connect to the database, use the getConnection() method:
     * String url = "jdbc:mysql://localhost:3306/database_name";
     * String user = "root";
     * String password = "password";
     * Connection con = DriverManager.getConnection(url, user, password);
     * url → Address of the database
     * user → Database username
     * password → Database password
     * 
     * 4. Create a Statement
     * You need to create a Statement object to execute SQL commands:
     * Statement st = con.createStatement();
     * 5. Execute the Query
     * Use the executeQuery() method to retrieve data:
     * ResultSet rs = st.executeQuery("SELECT * FROM students");
     * while (rs.next()) {
     * System.out.println(rs.getString("name"));
     * }
     * Use the executeUpdate() method to insert or update data:
     * 
     * int result =
     * st.executeUpdate("INSERT INTO students VALUES ('John', 101, 'CSE')");
     * if (result == 1) {
     * System.out.println("Inserted successfully");
     * } else {
     * System.out.println("Insertion failed");
     * }
     * 
     * 6. Close the Connection
     * Always close the connection after use to free up resources:
     * con.close();
     * Complete Example (MySQL Connection)
     * Here’s a full example of connecting to a MySQL database and retrieving data:
     * 
     * import java.sql.*;
     * 
     * class Demo {
     * public static void main(String[] args) {
     * String url = "jdbc:mysql://localhost:3306/mydatabase";
     * String user = "root";
     * String password = "password";
     * 
     * try {
     * // Step 2: Load the driver
     * Class.forName("com.mysql.cj.jdbc.Driver");
     * 
     * // Step 3: Establish the connection
     * Connection con = DriverManager.getConnection(url, user, password);
     * System.out.println("Connection Established");
     * 
     * // Step 4: Create a statement
     * Statement st = con.createStatement();
     * 
     * // Step 5: Execute the query
     * ResultSet rs = st.executeQuery("SELECT * FROM students");
     * 
     * // Step 6: Process the results
     * while (rs.next()) {
     * System.out.println(rs.getString("name") + " - " + rs.getInt("roll_no"));
     * }
     * 
     * // Step 7: Close the connection
     * con.close();
     * System.out.println("Connection Closed");
     * } catch (Exception e) {
     * System.out.println(e);
     * }
     * }
     * }
     * 
     * Example for Inserting Data (Oracle Database)
     * Here’s how to insert data into an Oracle database:
     * 
     * import java.sql.*;
     * import java.util.Scanner;
     * 
     * class Demo {
     * public static void main(String[] args) {
     * String url = "jdbc:oracle:thin:@localhost:1521:xe";
     * String user = "system";
     * String pass = "12345";
     * 
     * Scanner input = new Scanner(System.in);
     * 
     * System.out.println("Enter Name: ");
     * String name = input.nextLine();
     * 
     * System.out.println("Enter Roll No: ");
     * int roll = input.nextInt();
     * 
     * System.out.println("Enter Class: ");
     * String cls = input.next();
     * 
     * String query = "INSERT INTO students VALUES('" + name + "', " + roll + ", '"
     * + cls + "')";
     * 
     * try {
     * // Load and register the driver
     * DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
     * 
     * // Establish the connection
     * Connection con = DriverManager.getConnection(url, user, pass);
     * 
     * // Create statement
     * Statement st = con.createStatement();
     * 
     * // Execute query
     * int result = st.executeUpdate(query);
     * 
     * if (result == 1) {
     * System.out.println("Inserted successfully");
     * } else {
     * System.out.println("Insertion failed");
     * }
     * 
     * // Close connection
     * con.close();
     * } catch (Exception e) {
     * System.out.println(e);
     * }
     * }
     * }
     * 
     * 
     * Summary
     * Step Description
     * 1. Import Import java.sql.* package
     * 2. Load Driver Class.forName() or DriverManager.registerDriver()
     * 3. Connect DriverManager.getConnection()
     * 4. Create Statement con.createStatement()
     * 5. Execute Query executeQuery() for SELECT, executeUpdate() for INSERT/UPDATE
     * 6. Process Results Use ResultSet to read data
     * 7. Close con.close()
     * 
     * Best Practices
     * ✔️ Always close the connection
     * ✔️ Use PreparedStatement to avoid SQL injection
     * ✔️ Use try-catch to handle exceptions
     * ✔️ Test connection before executing queries
     * 
     */
}