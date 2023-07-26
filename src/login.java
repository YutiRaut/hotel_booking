import java.sql.*;
import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_booking", "root", "0000");
            System.out.println(con);

            System.out.println("----Welcome to Login----");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your email:- ");
            String email = sc.nextLine();
            System.out.println("Enter your password:- ");
            String password = sc.nextLine();
            sc.close();
           PreparedStatement statement=con.prepareStatement("select email from user where email=?");
           statement.setString(1,email);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                System.out.println("Email is Valid");
            }else{
                System.out.println("email is invalid");
                System.out.println("login unsuccessfull");
            }
            PreparedStatement statement2=con.prepareStatement("select password from user where password=?");
            statement2.setString(1,password);
            ResultSet resultSet1 = statement2.executeQuery();
            if (resultSet1.next()){
                System.out.println("Password is Valid");
            }else{
                System.out.println("Password is invalid");
                System.out.println("login unsuccesfull");
            }

        }

        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
