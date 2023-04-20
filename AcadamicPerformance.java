public class AcadamicPerformance extends StudentDetails{
    private int totalMarks;
    private int rank;

    public AcadamicPerformance(String name, int id, int standard, long parentsNumber, int totalMarks, int rank) {
        super(name, id, standard, parentsNumber);
        this.totalMarks = totalMarks;
        this.rank = rank;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public void academicPerformance(){
        System.out.println("Marks obtained by the Student: "+getTotalMarks());
        System.out.println("Rank of the Student: "+getRank());
    }
}
