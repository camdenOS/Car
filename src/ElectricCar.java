

public class ElectricCar extends Car{
    //var
    private static double chargeTime;
    private static double capacity;

    public static void setChargeLimit(int limit){
        System.out.println("charge limit set to: " + limit);
    }

    public static void activateEnergySaverMode(){
        System.out.println("energy savering mode on");
    }
}
