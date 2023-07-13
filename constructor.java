public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showDetails();
    }
}
class Student {

    private int id;
    private String name;
    private int admissionYear;
    private double GPA;


    Student(int id, String name, int admissionYear, double GPA) {
        this.id = id;
        this.name = name;
        this.admissionYear = admissionYear;
        this.GPA = GPA;
    }

    public void showDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Admission Year: " + admissionYear);
        System.out.println("GPA: " + GPA);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}


