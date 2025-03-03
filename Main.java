package StudentOperations;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentOperation studentOperation_obj = new StudentOperation();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter the name of the student: ");
                        String name = sc.nextLine();

                        System.out.println("Enter the PRN of the student: ");
                        long prn = sc.nextLong();
                        sc.nextLine();  

                        System.out.println("Enter the department of the student: ");
                        String department = sc.nextLine();

                        System.out.println("Enter the batch of the student: ");
                        String batch = sc.nextLine();

                        System.out.println("Enter the CGPA of the student: ");
                        double cgpa = Double.parseDouble(sc.nextLine());

                        try {
                            Student student_obj = new Student(name, prn, department, batch, cgpa);
                            studentOperation_obj.addStudent(student_obj);
                        } catch (NullPointerException | IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 2:
                        studentOperation_obj.displayAllStudents();
                        break;

                    case 3:
                        System.out.println("Enter the PRN of the student to delete: ");
                        long deletePrn = Long.parseLong(sc.nextLine());
                
                        try {
                            studentOperation_obj.deleteStudent(deletePrn);
                        } catch (StudentNotFoundException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 4:
                        sc.close();
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter the correct data type.");
                sc.nextLine(); // Clear the invalid input
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter a valid number.");
            } catch (StudentAlreadyExistsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}