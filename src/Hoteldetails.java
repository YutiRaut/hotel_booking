import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class  Hoteldetails {
    static hd1 hdc1 = new hd1();
    public static void Hoteldetails() throws IOException
    {
        System.out.println("1.Add Details");
        System.out.println("2.Update Details");
        System.out.println("3.View Details");
        System.out.println("Please Enter A No:- ");
        Scanner psc= new Scanner(System.in);
        int no =psc.nextInt();

        switch (no){
            case 1:
                hdc1.hdc();
                /*try {
                    //inserting data query (parameterized query)
                    String user = "INSERT INTO hotel" + "(hotel_name,email,contact_no,password)" + " values(?,?,?,?)";

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
                }*/

                break;



        }



    }
}
