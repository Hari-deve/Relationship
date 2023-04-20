public class Soil {
    String soilType;
    String waterLevel;
    String soilColor;
    MangoTree treeDetails;

    public Soil(String soilType, String waterLevel, String soilColor, MangoTree treeDetails) {
        this.soilType = soilType;
        this.waterLevel = waterLevel;
        this.soilColor = soilColor;
        this.treeDetails = treeDetails;
    }
    public void detailsOfFarm(){
        System.out.println("The Soil Type is: "+soilType);
        System.out.println("The Water Level is: "+soilType);
        System.out.println("The Soil Color is: "+soilType);
        System.out.println("Name of Tree Planted is: "+treeDetails.treeName);
        System.out.println("Name of fruit Yielded is : "+treeDetails.fruitYield);
        System.out.println("The Number of trees in the Farm: "+treeDetails.treesCount);
        System.out.println("The Age of tree is: "+treeDetails.lifeSpan);

    }
}
