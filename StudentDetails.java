public class StudentDetails {
    String name;
    int id;
    int standard;
    long parentsNumber;

    public StudentDetails(String name, int id, int standard, long parentsNumber) {
        this.name = name;
        this.id = id;
        this.standard = standard;
        this.parentsNumber = parentsNumber;
    }

    public void studentDetails(){
        System.out.println("Name of the Student: "+name);
        System.out.println("Student ID: "+id);
        System.out.println("Class of the Student Studying: "+standard);
        System.out.println("Parents Mobile NUmber: "+parentsNumber);

    }
}
