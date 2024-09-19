import java.util.Scanner;

public class ChooseBoat {
    static int chooseBoat;

    public static void chooseBoat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your boat model:  (1, 2 or 3): ");
            System.out.println(BoatsInfo.boats[0].getModel());
            System.out.println(BoatsInfo.boats[1].getModel());
            System.out.println(BoatsInfo.boats[2].getModel());
        chooseBoat = scanner.nextInt();


            if (chooseBoat >= 1 && chooseBoat <= 3) {
                System.out.println("Your choose :");
                BoatsInfo.boats[chooseBoat - 1].printDetails();
            } else {
                System.out.println("Bad choice.");
            }
        }
        public static void chooseBoatName(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What will your boat’s name : ");
            String boat = scanner.nextLine();
            BoatsInfo.boats[chooseBoat-1].setBoatName(boat);
            BoatsInfo.boats[chooseBoat-1].printDetails();
    }
    }

