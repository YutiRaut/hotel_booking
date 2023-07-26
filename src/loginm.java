import java.util.Scanner;

public class  loginm {

    static String email;
    static String password;
public void loginf() {
    System.out.println("----Welcome to Login----");
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Enter your email:- ");
     email = sc1.nextLine();
    System.out.println("Enter your password:- ");
     password = sc1.nextLine();
    sc1.close();
}
    public String getEmail()
    {
    return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }




}

