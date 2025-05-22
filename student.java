import java.util.ArrayList;
import java.util.Scanner;

public class project {
    int Id;
    String Name;
    int Age;
    String Course;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<project> students = new ArrayList<>();

        System.out.print("How many students do you want to add: ");
        int n = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < n; i++) {
            project obj = new project();
            System.out.println("\nEnter the Details for Student " + (i + 1));

            System.out.print("Enter the Id: ");
            obj.Id = input.nextInt();
            input.nextLine();  

            System.out.print("Enter the Name: ");
            obj.Name = input.nextLine();

            System.out.print("Enter the Age: ");
            obj.Age = input.nextInt();
            input.nextLine();  

            System.out.print("Enter the Course: ");
            obj.Course = input.nextLine();

            students.add(obj);
        }


        System.out.print("\nEnter the ID to search: ");
        int searchId = input.nextInt();
        input.nextLine();
        boolean found = false;

        for (project student : students) {
            if (student.Id == searchId) {
                found = true;
                System.out.println("\nStudent Found:");
                System.out.println("Id: " + student.Id);
                System.out.println("Name: " + student.Name);
                System.out.println("Age: " + student.Age);
                System.out.println("Course: " + student.Course);
            }
        }

        if (!found) {
            System.out.println("No student found with that name.");
        }


        System.out.print("\nEnter the ID to update: ");
        int updateId = input.nextInt();
        input.nextLine();
        boolean updated = false;

        for (project student : students) {
            if (student.Id == updateId) {
                updated = true;
                System.out.println("\nCurrent Details:");
                System.out.println("Id: " + student.Id);
                System.out.println("Name: " + student.Name);
                System.out.println("Age: " + student.Age);
                System.out.println("Course: " + student.Course);

                System.out.println("\nEnter new details:");
                System.out.print("Enter new Id: ");
                student.Id = input.nextInt();
                input.nextLine();

                System.out.print("Enter new Name: ");
                student.Name = input.nextLine();

                System.out.print("Enter new Age: ");
                student.Age = input.nextInt();
                input.nextLine();

                System.out.print("Enter new Course: ");
                student.Course = input.nextLine();

                System.out.println("\nUpdated Student Details:");
                System.out.println("Id: " + student.Id);
                System.out.println("Name: " + student.Name);
                System.out.println("Age: " + student.Age);
                System.out.println("Course: " + student.Course);
                break;
            }
        }

        if (!updated) {
            System.out.println("No student found with that ID.");
        }

        System.out.print("\nEnter ID to delete: ");
        int deleteId = input.nextInt();

        if (deleteStudentById(students, deleteId)) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }

        input.close();
    }

    
    public static boolean deleteStudentById(ArrayList<project> students, int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).Id == id) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
}
