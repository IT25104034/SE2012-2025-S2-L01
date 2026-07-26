import util.java.Scanner;

    public class MarksList{

    public static void main(String [] args){

 	Scanner input = new Scanner(System.in);

   System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int marks[][] = new int[n][3];

         while (true) {
            System.out.println("\n1. Add marks");
            System.out.println("2. Update marks");
            System.out.println("3. Average of subject");
            System.out.println("4. Average of student");
            System.out.println("5. Total of student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

