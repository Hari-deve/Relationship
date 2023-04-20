import java.util.Scanner;

public class StudentRecordAnalysis {
    static Scanner userinput=new Scanner(System.in);
    public static void main(String[] args) {
        StudentDetails studentDetails=new StudentDetails("Abhi",111,10,9034156709l);
        AcadamicPerformance acadamicPerformance=new AcadamicPerformance("Abhi",111,10,9034156709l,410,12);
        SportsRecords sportsRecords=new SportsRecords("Abhi",111,10,9034156709l,"Kabaddi","Silver");

        System.out.println("Please the option given below\n1.Academic Performance\n2.Sports Performance\n3.To view both");
        int choose=userinput.nextInt();
        if (choose==1){
            studentDetails.studentDetails();
            acadamicPerformance.academicPerformance();
        } else if (choose==2) {
            studentDetails.studentDetails();
            sportsRecords.sportsRecords();
        } else if (choose==3) {
            studentDetails.studentDetails();
            acadamicPerformance.academicPerformance();
            sportsRecords.sportsRecords();
        }
    }
}
