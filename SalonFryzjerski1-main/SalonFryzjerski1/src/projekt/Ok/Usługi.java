package projekt.Ok;

public abstract class Usługi {
  public static final double cost = 1.5;
    public static final double color = 100;
    public static final double cut  = 80;
    public static final double perm  = 120;
    public static final double washing = 20;
    public static final double styling = 60;


  public abstract String Talk();


    public static void countCostColor(double cost, double color) {
        double finalCost =cost*color;
        System.out.println("Cena za tąusługę wynosi: "+ finalCost);
    }
    public static void countCostCut(double cost, double cut) {
        double finalCost =cost*cut;
        System.out.println("Cena za tąusługę wynosi: "+ finalCost);
    }
    public static void countCostPerm(double cost, double perm) {
        double finalCost =cost*perm;
        System.out.println("Cena za tąusługę wynosi: "+ finalCost);
    }
    public static void countCostWash(double cost, double washing) {
        double finalCost =cost*washing;
        System.out.println("Cena za tąusługę wynosi: "+ finalCost);
    }
    public static void countCostStyling(double cost, double styling) {
        double finalCost =cost*styling;
        System.out.println("Cena za tąusługę wynosi: "+ finalCost);
    }

}


