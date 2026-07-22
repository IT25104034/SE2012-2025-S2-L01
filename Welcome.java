 import java.util.Scanner;

 public class Welcome{

public static void main(Strings[] args){
 Scanner input= new Scanner(System.in);


System.out.print("Enter your First name: ");
   String name1 = input.nextLine();

System.out.print("Enter your Last name: ");  
   String name2 = input.nextLine(); 

System.out.println("Welcome to Second year " + name1 + name2);

input.close();

}
}
