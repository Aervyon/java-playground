package Review_APCS;

import java.util.Scanner;

/*
 * Arrays_With_Full_Names - ...file description
 * Date created: Dec/21/2021
 * Author: Aervyon
 */

public class Assn_5_2D_Arrays {
    public static void main(String[] args) {
        String[][] names = new String[5][3];

        Scanner nameCatcher = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.println("Whats user " + i + "s first name?");
            names[i][0] = getName(nameCatcher);
            System.out.println("Whats user " + i + "s middle name?");
            names[i][1] = getName(nameCatcher);
            System.out.println("Whats user " + i + "s last name?");
            names[i][2] = getName(nameCatcher);
            if (i < 4) {
                System.out.println("Next!");
            }
        }

        for(int i = 0; i < 5; i++) {
            System.out.println("User " + (i + 1) + "'s name is: " + String.join(" ", names[i]));
        }
    }

    public static String getName(Scanner nameCatcher) {
        if (nameCatcher.hasNextLine()) {
            return nameCatcher.nextLine();
        } else {
            System.out.println("\nI need a name. Give me one.\n");
            return getName(nameCatcher);
        }
    }
}
