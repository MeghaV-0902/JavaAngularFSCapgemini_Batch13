import java.sql.*;
import java.util.Scanner;

public class LibrabryDemo
{
    final static Scanner scanner = new Scanner(System.in);
    static Connection con = null;
    static Statement st = null;
    public static void main(String[] args)throws ClassNotFoundException
    {
        displayOptions();
        System.out.println("Enter your choice: ");
        int option = scanner.nextInt();


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BookDB", "root", "root");
            System.out.println("connected..");
            st = con.createStatement();
            while (true)
            {

                switch(option)
                {
                    case 1: //addBooks
                        addbooks();
                        break;
                    case 2: // display
                        displayBooks();
                        break;
                    case 3: //update
                        updateRecord();
                        break;
                    case 4: //delete
                        deletebooks();
                        break;
                    case 5: // exit
                        con.close();
                        System.exit(0);
                }
                displayOptions();
                System.out.println("Enter your choice: ");
                option = scanner.nextInt();
            }



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

    private static void displayOptions()
    {
        System.out.println("Welcome to library");
        System.out.println("1 add books");
        System.out.println("2 List Books");
        System.out.println("3 Update Books");
        System.out.println("4 Delete Books");
        System.out.println("5 Exit");
    }

    private static void addbooks()
    {
        try {
            System.out.println("Enter book id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter book name: ");
            String BookName = scanner.nextLine();
            System.out.println("Enter Author name: ");
            String AuthorName = scanner.nextLine();
            System.out.println(id+" "+BookName+" "+AuthorName);
            st = con.createStatement();
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO books VALUES (?, ?, ?)");
            pstmt.setInt(1,id);
            pstmt.setString(2,BookName);
            pstmt.setString(3,AuthorName);
            pstmt.executeUpdate();
            //st.execute("insert into books values (3,'Book3','Author 3')");
           //st.execute("insert into books(bookid, bookname, author) values ('"+id+","+BookName+","+AuthorName+"');");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try{
                st.close();

            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

    private static void displayBooks()
    {
        try {
            st = con.createStatement();
            String query = "select * from books;";
            ResultSet rs = st.executeQuery(query);
            while (rs.next())
            {
                int id = rs.getInt("bookid");
                String bookName = rs.getString("bookname");
                String AuthorName = rs.getString("author");

                // print the results
                System.out.format("ID: "+id+"\nBook Name: "+bookName+"\nAuthor Name: "+AuthorName);
                System.out.println("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void updateRecord()
    {
        try {
            System.out.println("Enter Book ID for updating author name: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter new author name: ");
            String name = scanner.nextLine();
            st = con.createStatement();
            String query = "update books set author = ? where bookid = ?;";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,name);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                st.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void deletebooks()
    {
        try {
            System.out.println("Enter Book ID for deleting record: ");
            int id = scanner.nextInt();
            st = con.createStatement();
            String query = "delete from books where bookid = ?;";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                st.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
