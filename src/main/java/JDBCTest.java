
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
//        try {
//            DriverManager.registerDriver(new Driver());
//            Connection connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false", //where
//                    "employee_test_user", //which user
//                    "employee1" //what password
//            );
//
//            Statement stmt = connection.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * from employees;");
//            while(rs.next()){ //looping through results
//                System.out.println("first name " + rs.getString("first_name"));
//                System.out.println("last name " + rs.getString("last_name"));
//                System.out.println("Employee ID " + rs.getInt("emp_no"));
////                System.out.println(rs.getString(1));
//            }
//
//        }catch(SQLException e){
//            e.printStackTrace();
//        }


        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false", //where
                    "codeup_test_user", //which user
                    "codeup1" //what password
            );

            Statement stmt = connection.createStatement();
            String artist = "I am new";
            String album_name = "Test Album";
            String year = "2006";

//            stmt.executeUpdate("INSERT INTO albums (artist, album_name, release_date, sales, genre) values('"+artist+"','"+album_name+"','"+year+"', 90, 'pop')");
            stmt.executeUpdate(String.format("INSERT INTO albums (artist, album_name, release_date, sales, genre) values('%s','%s', '%s', 90, 'pop')", artist, album_name, year));
            ResultSet rs = stmt.executeQuery("select * from albums");
            while(rs.next()){ //looping through results
                System.out.println("id  " + rs.getString("id"));
                System.out.println("artist name " + rs.getString("artist"));
                System.out.println("album name " + rs.getString("album_name"));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }



    }


}
