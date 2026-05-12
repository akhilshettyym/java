package akhilshettyym.JAVA.core.C_Classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class P_DateTime {
  public static void main(String[] args) {
    // 1. Display current date
    LocalDate currentDate = LocalDate.now();
    System.out.println("Current Date: " + currentDate); // e.g., 2025-06-05

    // 2. Display current time
    LocalTime currentTime = LocalTime.now();
    System.out.println("Current Time: " + currentTime); // e.g., 16:21:44.273121

    // 3. Display current date and time
    LocalDateTime currentDateTime = LocalDateTime.now();
    System.out.println("Current DateTime: " + currentDateTime); // e.g., 2025-06-05T16:21:44.273200

    // 4. Format date and time
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDateTime = currentDateTime.format(formatter);
    System.out.println("Formatted DateTime: " + formattedDateTime); // e.g., 05-06-2025 16:21:44

    // 5. Try other format styles
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

    System.out.println("Date Format dd/MM/yyyy: " + currentDate.format(formatter2));
    System.out.println("Date Format dd-MMM-yyyy: " + currentDate.format(formatter3));
    System.out.println("Date Format E, MMM dd yyyy: " + currentDate.format(formatter4));
  }
}