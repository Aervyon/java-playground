package Review_APCS;
/*
 * Array_Assn_4 - A small project to initialize an array
 * Date created: Dec/21/2021
 * Author: Aervyon
 */

public class Assn_4_Arrays {
    public static void main(String[] args) {
        String[] firstNames = new String[10];
        String[] lastNames = new String[10];

        for(int i = 0; i < 10; i++) {
            firstNames[i] = "John";
            lastNames[i] = "Jameson";
        }

        System.out.println(String.join(", ", firstNames));
        System.out.println(String.join(", ", lastNames));
    }
}
