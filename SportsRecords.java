public class SportsRecords extends StudentDetails{
    private String sportsName;
    private String achievement;

    public SportsRecords(String name, int id, int standard, long parentsNumber, String sportsName, String achievement) {
        super(name, id, standard, parentsNumber);
        this.sportsName = sportsName;
        this.achievement = achievement;
    }

    public String getSportsName() {
        return sportsName;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }
    public void sportsRecords(){
        System.out.println("Name of the Sport: "+getSportsName());
        System.out.println("Achievement int that Sport: "+getAchievement());
    }
}
