import java.util.Scanner;

public class MarksList{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int marks[][] = new int[n][3];

         while (true) {
            System.out.println("\n1. Add marks");
            System.out.println("2. Update marks");
            System.out.println("3. Average of subject");
            System.out.println("4. Average of student");
            System.out.println("5. Total of student");
            System.out.println("6. Grades");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

             if (ch == 1) {
                System.out.print("Enter student ID (1 to " + n + "): ");
                int id = sc.nextInt();
                System.out.println("Enter 3 marks (Maths Chem Phy): ");
                for (int j = 0; j < 3; j++) {
                    marks[id-1][j] = sc.nextInt();
                }
            }
            else if (ch == 2) {
                System.out.print("Enter student ID: ");
                int id = sc.nextInt();
                System.out.print("Enter subject ID (1-Maths 2-Chem 3-Phy): ");
                int sub = sc.nextInt();
                System.out.print("Enter new mark: ");
                marks[id-1][sub-1] = sc.nextInt();
            }
            else if (ch == 3) {
                System.out.print("Enter subject ID (1 to 3): ");
                int sub = sc.nextInt();
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    sum = sum + marks[i][sub-1];
                }
                System.out.println("Average = " + sum / n);
            }
            else if (ch == 4) {
                System.out.print("Enter student ID: ");
                int id = sc.nextInt();
                int sum = marks[id-1][0] + marks[id-1][1] + marks[id-1][2];
                System.out.println("Average = " + sum / 3);
            }
            else if (ch == 5) {
                System.out.print("Enter student ID: ");
                int id = sc.nextInt();
                int sum = marks[id-1][0] + marks[id-1][1] + marks[id-1][2];
                System.out.println("Total = " + sum);
            }
            else if (ch == 6) {
                System.out.println("\nID\tMaths\tGrade\tChem\tGrade\tPhy\tGrade");
                for(int i=0; i<n; i++){
                    System.out.print((i+1) + "\t");
                    for(int j=0; j<3; j++){
                        int m = marks[i][j];
                        String g;
                        if(m >= 90) g = "Grade A";
                        else if(m >= 80) g = "Grade B";
                        else if(m >= 70) g = "Grade C";
                        else if(m >= 60) g = "Grade D";
                        else g = "Fail";
                        System.out.print(m + "\t" + g + "\t");
                    }
                    System.out.println();
                }
            }
            else if (ch == 7) {
                break;
            }
        }
    }
}