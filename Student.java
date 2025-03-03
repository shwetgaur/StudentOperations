package StudentOperations;

public class Student {
    private String name;
    private long prn;
    private String department;
    private String batch;
    private double cgpa;

    public Student(String name, long prn, String department, String batch, double cgpa) {
        if (name == null || department == null || batch == null) {
            throw new NullPointerException("Name, department, and batch cannot be null.");
        }
        if (prn <= 0) {
            throw new IllegalArgumentException("PRN must be a positive number.");
        }
        
        if (cgpa < 0.0 || cgpa > 10.0) {
            throw new IllegalArgumentException("CGPA must be between 0.0 and 10.0.");
        }

        this.name = name;
        this.prn = prn;
        this.department = department;
        this.batch = batch;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("PRN: " + prn);
        System.out.println("Department: " + department);
        System.out.println("Batch: " + batch);
        System.out.println("CGPA: " + cgpa);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new NullPointerException("Name cannot be null.");
        }
        this.name = name;
    }

    public long getPrn() {
        return prn;
    }

    public void setPrn(long prn) {
        if (prn <= 0) {
            throw new IllegalArgumentException("PRN must be a positive number.");
        }
        this.prn = prn;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null) {
            throw new NullPointerException("Department cannot be null.");
        }
        this.department = department;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        if (batch == null) {
            throw new NullPointerException("Batch cannot be null.");
        }
        this.batch = batch;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa < 0.0 || cgpa > 10.0) {
            throw new IllegalArgumentException("CGPA must be between 0.0 and 10.0.");
        }
        this.cgpa = cgpa;
    }
}