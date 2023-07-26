import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class signup {
    public static void main(String[] args) {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_booking", "root", "0000");
            System.out.println(con);

            //taking input from users
            System.out.println("To Create Your Account!!!");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your Name:- ");
            String name = sc.nextLine();
            System.out.println("Enter your email:- ");
            String email = sc.nextLine();
           System.out.println("Enter your Contact Number:- ");
           int contact = Integer.parseInt(sc.nextLine());
            System.out.println("Enter your Password:- ");
            String password = sc.nextLine();
            sc.close();


            //inserting data query (parameterized query)
            String user="INSERT INTO user"+"(user_name,email,contact_no,password)"+" values(?,?,?,?)";

            //getting prepared statement to fire an query
            PreparedStatement pstmt=con.prepareStatement(user);

            //connecting input to the database

            pstmt.setString(1,name);
            pstmt.setString(2,email);
            pstmt.setInt(3,contact);
            pstmt.setString(4,password);

            //execute query
            pstmt.executeUpdate();
            System.out.println("Account Created Successfully");

                con.close();


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
