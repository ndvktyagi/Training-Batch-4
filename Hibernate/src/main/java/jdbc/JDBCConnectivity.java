package jdbc;

import java.sql.*;

public class JDBCConnectivity {
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/emp",
                    "postgres", "postgres");
            stmt = c.createStatement();

            String sql = "insert into employee values(102,'Keshav Kumar',9988776655,'Keshav@gmail.com',1,177000)";
            stmt.executeUpdate(sql);
//            stmt = c.createStatement();
//            ResultSet rs = stmt.executeQuery( "SELECT * FROM employee;" );
//            while ( rs.next() ) {
//                int id = rs.getInt("EMP_ID");
//                String  name = rs.getString("EMP_NAME");
//                String emailId= rs.getString("EMP_EMAIL");
//                System.out.println( "ID = " + id );
//                System.out.println( "NAME = " + name );
//                System.out.println( "Email = " + emailId );
//                System.out.println();
//            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        } finally {
            try {
                if (rs != null)
                    rs.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se) {
            }// do nothing
            try {
                if (c != null)
                    c.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Opened database successfully");
    }
}
