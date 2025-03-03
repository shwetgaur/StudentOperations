package StudentOperations;

import java.util.ArrayList;
import java.util.List;

public class StudentOperation {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) throws StudentAlreadyExistsException {
        for (Student s : students) {
            if (s.getPrn() == student.getPrn()) {
                throw new StudentAlreadyExistsException("Student with PRN " + student.getPrn() + " already exists.");
            }
        }
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void deleteStudent(long prn) throws StudentNotFoundException {
        boolean found = false;
        for (Student s : students) {
            if (s.getPrn() == prn) {
                students.remove(s);
                found = true;
                System.out.println("Student deleted successfully.");
                break;
            }
        }
        if (!found) {
            throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
        }
    }
}