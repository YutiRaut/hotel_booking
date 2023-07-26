import java.util.Scanner;

public class signupm {
    static String name;
    static String email;
    static double contact;
    static String password;
    public static void signupf(){

        System.out.println("To Create Your Account!!!");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name:- ");
        name = sc.nextLine();
        System.out.println("Enter your email:- ");
         email = sc.nextLine();
        System.out.println("Enter your Contact Number:- ");
         contact = Double.parseDouble(sc.nextLine());
        System.out.println("Enter your Password:- ");
        password = sc.nextLine();
        sc.close();
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public double getcontact() {
        return contact;
    }
    public void setContact(double contact){
        this.contact=contact;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

}

