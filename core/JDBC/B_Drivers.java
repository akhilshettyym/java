package akhilshettyym.JAVA.core.JDBC;

public class B_Drivers {
}

/*
 * ----------------
 * | JDBC Drivers |
 * ----------------
 * What is JDBC?
 * JDBC (Java Database Connectivity) is a way for Java applications to talk to a
 * database. It allows Java programs to:
 * 
 * Connect to a database
 * Send and execute SQL queries
 * Get back and process the results
 * 
 * How JDBC Works
 * - The Java application talks to the JDBC API (set of rules for talking to
 * databases).
 * - The JDBC API sends the request to the JDBC Driver Manager.
 * - The JDBC Driver Manager picks the right JDBC Driver to connect to the
 * database.
 * - The JDBC Driver converts the request into a format the database understands
 * and sends it.
 * - The database responds, and the driver sends the result back to the Java
 * application.
 * 
 * What is a JDBC Driver?
 * A JDBC Driver is like a translator.
 * It converts Java requests into commands the database understands.
 * It also converts the database response back into Java format.
 * 
 * Types of JDBC Drivers
 * There are 4 types of JDBC drivers based on how they interact with the
 * database:
 * 
 * 
 * 1. Type-1 Driver: JDBC-ODBC Bridge Driver
 * This driver works as a bridge between Java and ODBC (Open Database
 * Connectivity).
 * It converts Java calls into ODBC calls.
 * Example:
 * Think of it like using Google Translate to talk to someone who speaks a
 * different language.
 * 
 * Advantages:
 * Built into JDK (no need to install separately).
 * Can connect to any database using ODBC.
 * 
 * Disadvantages:
 * Slow because it’s indirect communication.
 * ODBC driver needs to be installed on every machine.
 * Not written in Java → Not portable (can’t run on every system).
 * 
 * 2. Type-2 Driver: Native-API Driver
 * This driver uses the database's native library to connect directly to the
 * database.
 * Converts Java calls into native calls of the database.
 * Example:
 * It’s like using a local language expert to translate for you.
 * 
 * Advantages:
 * Faster than Type-1 since it's more direct.
 * More secure because it uses the database’s native library.
 * 
 * Disadvantages:
 * You need to install the native library on every client machine.
 * Not written in Java → Not portable.
 * Works only with one specific database.
 * 
 * 3. Type-3 Driver: Network Protocol Driver
 * Uses a middle server to handle communication between Java and the database.
 * The middle server translates Java calls into database-specific protocol.
 * Example:
 * It’s like using a customer service hotline to connect you to the right
 * person.
 * 
 * Advantages:
 * Fully written in Java → Portable.
 * No need to install anything on the client machine.
 * You can switch databases easily since the middle server handles it.
 * 
 * Disadvantages:
 * Needs a network connection.
 * More expensive to maintain because you need to handle the middle server.
 * 
 * 4. Thin Driver – Type-4 Driver
 * Directly connects to the database using the database's network protocol.
 * No middle server or extra libraries needed.
 * Example:
 * It’s like directly calling someone on their mobile number.
 * 
 * Advantages:
 * Fastest and simplest.
 * No need to install anything.
 * Fully written in Java → Portable.
 * 
 * Disadvantages:
 * If you switch databases, you need a different driver.
 * 
 * Which Driver to Use?
 * Scenario Best Driver
 * Single database (e.g., Oracle, MySQL) Type-4 (Thin Driver)
 * Multiple databases Type-3 (Network Protocol Driver)
 * When no Type-3 or Type-4 is available Type-2 (Native-API Driver)
 * Testing and Development Type-1 (JDBC-ODBC Bridge)
 * 
 * Summary
 * Type-1 → Slow, not secure, for testing only
 * Type-2 → Faster, secure, but platform-dependent
 * Type-3 → Flexible, portable, but needs a network
 * Type-4 → Fastest, direct, most commonly used
 * 
 */
