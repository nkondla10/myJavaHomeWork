   import javax.swing.JOptionPane;
class QuartsToGallons {
    private static final int QUARTS_IN_GALLON = 0;

	public static void main(String[] args) {
        //one quart is four cups
        final int ONE_QUARTS_IN_GALLON = 4;
        //Set number of quarts 
        int quartsNeeded = 18;
        int gallonsNeeded = 4;
        int extraQuartsNeeded = 2;
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs" +  quartsNeeded + "quart requires" +  gallonsNeeded + "gallonsplus" + extraQuartsNeeded + "quarts");
        
    }
}
