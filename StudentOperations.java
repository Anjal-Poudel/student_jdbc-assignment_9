import java.sql.*;
import java.util.*;

public class StudentOperations {

  // Database connection details – update as needed
  private static final String URL = "jdbc:mysql://localhost:3306/your_database";
  private static final String USER = "your_username";
  private static final String PASSWORD = "your_password";

  public static void insertStudent() {
    try {
      Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
      PreparedStatement stmt = conn.prepareStatement(
          "INSERT INTO student (PRN, name, branch, batch, cgpa) VALUES (?, ?, ?, ?, ?)");

      Scanner scan = new Scanner(System.in);

      System.out.println("Enter PRN: ");
      int prn = scan.nextInt();
      scan.nextLine(); // consume newline

      System.out.println("Enter name: ");
      String name = scan.nextLine();

      System.out.println("Enter branch: ");
      String branch = scan.nextLine();

      System.out.println("Enter batch: ");
      String batch = scan.nextLine();

      System.out.println("Enter CGPA: ");
      float cgpa = scan.nextFloat();

      stmt.setInt(1, prn);
      stmt.setString(2, name);
      stmt.setString(3, branch);
      stmt.setString(4, batch);
      stmt.setFloat(5, cgpa);

      int rowsInserted = stmt.executeUpdate();
      if (rowsInserted > 0) {
        System.out.println("Student added successfully.");
      }

      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static void displayStudent() {
    try {
      Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM student");

      System.out.println("\nAll Students:");
      while (rs.next()) {
        System.out.println("PRN: " + rs.getInt("PRN"));
        System.out.println("Name: " + rs.getString("name"));
        System.out.println("Branch: " + rs.getString("branch"));
        System.out.println("Batch: " + rs.getString("batch"));
        System.out.println("CGPA: " + rs.getFloat("cgpa"));
        System.out.println("----------------------------");
      }

      conn.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }


}
