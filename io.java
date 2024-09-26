
import java.util.*;
public class  io{
    public static void main(String[] args) {
        //int yob,age;
       
        System.out.print("Hi ");
    
        System.out.println("ENTER YOUR YEAR OF BIRTH");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int a = 2024 - p ; 
        System.out.print("your age is ");
        System.out.print(a);
    }    
}