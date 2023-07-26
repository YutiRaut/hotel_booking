import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class hd1 {

    static String Hname;
    static String Address;
    static String city;
    public void hdc() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Hotel name:- ");
        Hname = sc.nextLine();
        System.out.println("Enter your hotel Address:- ");
        Address = sc.nextLine();
        System.out.println("Enter city:- ");
        city = sc.nextLine();
        sc.close();
    }
    public String getHname() {
        return Hname;
    }
    public void setHname(String Hname){
        this.Hname=Hname;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String password) {
        this.Address = Address;
    }

        public String getCity() {
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
}
