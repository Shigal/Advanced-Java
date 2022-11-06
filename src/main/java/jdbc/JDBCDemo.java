package jdbc;/*
 *
 * @author Lawshiga
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws SQLException {

        // creating connection
        String url = "jdbc:postgresql://localhost:5432/test";
        Connection conn = null;

        // already created the schema for table student in pgAdmin

        // insert a record into a table
        int rollno = 4;
        String name = "Kane";
        int age = 14;
        String sql = "insert into student(rollno, name, age)" + "values(" + rollno + ", '" + name + "', " + age + ")";

        // no matter what database you use, you always uses DriverManager.getConnection(url, usename, password)
        // to make connection to a db

        try {

            // make connection
            conn = DriverManager.getConnection(url, "postgres", "test@123");

            // create statement object on the connection
            // statement can be a insert, select or update or anything
            Statement st = conn.createStatement();

            // now we execute the sql
            // executeUpdate() is used for any insertion, deletion or update operation
            // executeUpdate() returns the number of rows affected once this statement got executed on db server

            int m = st.executeUpdate(sql);

            if(m == 1) {
                System.out.println("insertion successful : " + sql);
            } else {
                System.out.println("insertion failed");
            }

        } catch (SQLException  ex) {
            System.err.println(ex);
        } finally {
            if(conn != null) {
                conn.close();
            }
        }

    }
}
