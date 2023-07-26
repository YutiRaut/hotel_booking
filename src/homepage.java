import java.sql.*;
import java.util.Scanner;

public class homepage {
    public static void main(String[] args) throws SQLException {
        try {


            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_booking", "root", "0000");
            // System.out.println(con);

            int select;
            signupm up = new signupm();
            loginm upl = new loginm();
           Hoteldetails hadd= new Hoteldetails();

            System.out.println("----Welcome to Traveller----");
            System.out.println("1.Sign up");
            System.out.println("2.login");
            System.out.println("3.Add Details");
            System.out.println("Please Enter a number:- ");
            Scanner scanner = new Scanner(System.in);
            select = scanner.nextInt();


            switch (select) {
                case 1:
                    up.signupf();
                    try {
                        //inserting data query (parameterized query)
                        String user = "INSERT INTO user" + "(user_name,email,contact_no,password)" + " values(?,?,?,?)";

                        //getting prepared statement to fire an query
                        PreparedStatement pstmt = con.prepareStatement(user);

                        //connecting input to the database

                        pstmt.setString(1, up.getName());
                        pstmt.setString(2, up.getEmail());
                        pstmt.setDouble(3, up.getcontact());
                        pstmt.setString(4, up.getPassword());

                        //execute query
                        pstmt.executeUpdate();
                        System.out.println("Account Created Successfully");
                        con.close();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    upl.loginf();


                    PreparedStatement statement = con.prepareStatement("select email,password from user where email=? AND password=?");
                    statement.setString(1, upl.getEmail());
                    statement.setString(2, upl.getPassword());
                    ResultSet resultSet = statement.executeQuery();

                    if (resultSet.next()) {
                        System.out.println("Login Successful!!!");
                        hadd.Hoteldetails();
                    } else {
                        System.out.println("Invalid Email and login");
                    }

                    break;

                case 3:

                   // hadd.hoteladd();
                    break;

                default:
                    System.out.println("Please Enter Valid NO!!!");


            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}

