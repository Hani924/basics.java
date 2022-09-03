//Basics of taking inputs from users
import java.util.*;
public class Main{
    public static void main(String args[]){
        String name;
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=sc.nextLine();
        System.out.print("Enter your age: ");
        age=sc.nextInt();
    }
}