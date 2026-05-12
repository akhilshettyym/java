package akhilshettyym.JAVA.core.JDBC;

// import java.security.Key;
// import java.sql.CallableStatement;
// import java.sql.PreparedStatement;
// import java.util.Set;

// import javax.xml.catalog.CatalogFeatures.Feature;

public class E_Statements {

    /*
     * Types of Statements in JDBC
     * JDBC (Java Database Connectivity) allows Java applications to interact with
     * databases. When working with JDBC, you can use three types of statements to
     * execute SQL queries:
     * 
     * 1. Statement
     * A Statement is used for simple, static SQL queries (like SELECT, INSERT,
     * UPDATE, DELETE).
     * Best for cases where the query doesn’t change dynamically.
     * 
     * How it works:
     * Create a Statement object.
     * Execute the query using execute(), executeUpdate(), or executeQuery()
     * methods.
     * Process the results.
     * Close the connection.
     * 
     * 💡 Example:
     * // Load driver
     * Class.forName("com.mysql.cj.jdbc.Driver");
     * 
     * // Establish connection
     * Connection con =
     * DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root",
     * "12345");
     * 
     * // Create statement
     * Statement st = con.createStatement();
     * 
     * // Execute query
     * ResultSet rs = st.executeQuery("SELECT * FROM people");
     * 
     * while (rs.next()) {
     * System.out.println("Name: " + rs.getString("name") + ", Age: " +
     * rs.getInt("age"));
     * }
     * 
     * // Close resources
     * rs.close();
     * st.close();
     * con.close();
     * Methods:
     * Method Purpose
     * execute(String sql) Executes any SQL statement. Returns true if the result is
     * a ResultSet, otherwise false.
     * executeUpdate(String sql) Executes INSERT/UPDATE/DELETE. Returns the number
     * of rows affected.
     * executeQuery(String sql) Executes SELECT queries and returns a ResultSet
     * object.
     * 
     * 2. PreparedStatement
     * A PreparedStatement is used for parameterized queries (dynamic queries).
     * More efficient for repeated execution of the same query with different
     * values.
     * Protects against SQL Injection since inputs are treated as data, not part of
     * the query.
     * 
     * How it works:
     * Create a PreparedStatement with a query containing placeholders (?).
     * Set values for the placeholders using setXXX() methods.
     * Execute the query.
     * Process the results.
     * Close the connection.
     * 
     * Example:
     * // Load driver
     * Class.forName("com.mysql.cj.jdbc.Driver");
     * 
     * // Establish connection
     * Connection con =
     * DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root",
     * "12345");
     * 
     * // Create PreparedStatement
     * String query = "SELECT name FROM people WHERE age = ?";
     * PreparedStatement ps = con.prepareStatement(query);
     * ps.setInt(1, 25); // Set parameter
     * 
     * // Execute query
     * ResultSet rs = ps.executeQuery();
     * 
     * while (rs.next()) {
     * System.out.println("Name: " + rs.getString("name"));
     * }
     * 
     * // Close resources
     * rs.close();
     * ps.close();
     * con.close();
     * 
     * Methods:
     * Method Purpose
     * execute() Executes the query. Returns true if a ResultSet is returned.
     * executeUpdate() Executes INSERT/UPDATE/DELETE. Returns number of rows
     * affected.
     * executeQuery() Executes SELECT queries and returns a ResultSet.
     * 
     * 3. CallableStatement
     * A CallableStatement is used to call stored procedures (predefined SQL code)
     * in the database.
     * Useful for executing complex operations with multiple SQL statements.
     * Stored procedures can take input parameters and return output values.
     * 
     * How it works:
     * Create a CallableStatement with a query calling the stored procedure ({call
     * ProcedureName(?, ?)}).
     * Set input parameters using setXXX() methods.
     * Execute the procedure.
     * Process the results.
     * Close the connection.
     * 
     * Example:
     * // Load driver
     * Class.forName("com.mysql.cj.jdbc.Driver");
     * 
     * // Establish connection
     * Connection con =
     * DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root",
     * "12345");
     * 
     * // Create CallableStatement
     * CallableStatement cs = con.prepareCall("{call GetPeopleInfo()}");
     * 
     * // Execute procedure
     * ResultSet rs = cs.executeQuery();
     * 
     * while (rs.next()) {
     * System.out.println("Name: " + rs.getString("name") + ", Age: " +
     * rs.getInt("age"));
     * }
     * 
     * // Close resources
     * rs.close();
     * cs.close();
     * con.close();
     * 
     * Methods:
     * Method Purpose
     * execute() Executes the procedure and returns true if a ResultSet is
     * generated.
     * executeUpdate() Executes the procedure and returns the number of rows
     * affected.
     * executeQuery() Executes the procedure and returns a ResultSet.
     * 
     * When to Use Which Statement?
     * Type When to Use Best For
     * Statement Simple static queries One-time queries
     * PreparedStatement Dynamic or repeated queries with different parameters More
     * secure and faster
     * CallableStatement Complex operations using stored procedures Efficient and
     * reusable logic.
     * 
     * Key Differences:
     * Feature Statement PreparedStatement CallableStatement
     * SQL Injection Prone to injection Prevents injection Prevents injection
     * Performance Slower for repeated execution Faster for repeated execution
     * Faster for complex queries
     * Flexibility No parameters Allows parameters Allows stored procedure calls
     * Usage Simple queries Repeated dynamic queries Complex operations.
     * 
     * In Simple Words:
     * Statement → For simple queries.
     * PreparedStatement → For dynamic queries with parameters (faster and safer).
     * CallableStatement → For calling stored procedures (predefined complex logic).
     * 
     */
}