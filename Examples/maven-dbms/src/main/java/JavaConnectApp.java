import java.sql.*;
public class JavaConnectApp {
    public static void main(String[] args) throws ClassNotFoundException {
        Connection con = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
            System.out.println("connected..");
            st = con.createStatement();
            st.execute("insert into stud values (2,'Java','megha')");

        } catch (SQLException sq) {
            sq.printStackTrace();
        }finally {
            try{
                st.close();
                con.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}
