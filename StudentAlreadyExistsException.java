package StudentOperations;

public class StudentAlreadyExistsException extends Exception {
    public StudentAlreadyExistsException(String message) {
        super(message);
    }
}