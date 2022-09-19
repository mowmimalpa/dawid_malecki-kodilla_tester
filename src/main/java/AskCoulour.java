import java.util.Scanner;

public class AskCoulour {

    public static String getColour(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Select colour - type first letter of colour");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour){
                case "B":
                    return "BLUE";
                case "R":
                    return "RED";
                case "P":
                    return "PURPLE";
                case "O":
                    return "ORANGE";
                default:
                    System.out.println("Wrong colour.Please try again");
            }
        }
    }
}
