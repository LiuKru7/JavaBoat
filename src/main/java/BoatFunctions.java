import java.util.Scanner;

public class BoatFunctions {
    static int boatSpeed = 0;
    static int boat = ChooseBoat.chooseBoat - 1;

    public static void boatEngineOnOff() {
        System.out.println(boat);
        if (BoatsInfo.boats[boat].getEngineOn()) {
            BoatsInfo.boats[boat].setEngineOn(false);
            System.out.println("Engine OFF");
        } else {
            BoatsInfo.boats[boat].setEngineOn(true);
            System.out.println("Engine On");
        }
    }

    public static void boatSail() {
        if (BoatsInfo.boats[boat].getEngineOn()) {
            System.out.println("“The engine is started; you can sail (W to move forward, S to move backward).”");
        } else {
            System.out.println("Engine is off, first start engine");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;
        while (stop) {
            String accelerator = scanner.nextLine();
            if (accelerator.equalsIgnoreCase("W") && BoatsInfo.boats[boat].getMaxSpeed() > 10 + boatSpeed) {
                boatSpeed += 10;
                System.out.println("SPEED: " + boatSpeed + "km/h");
            }
            if (accelerator.equalsIgnoreCase("s") && BoatsInfo.boats[boat].getReverseSpeed() <= boatSpeed - 5) {
                boatSpeed -= 10;
                System.out.println("SPEED: " + boatSpeed + "km/h");
            }
            if (accelerator.equalsIgnoreCase("OFF")) {
                stop = false;
            }
            scanner.close();
        }
    }

}


