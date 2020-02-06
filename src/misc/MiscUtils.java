package misc;
/*
 * MiscUtils - Just some misc utilities.
 * Date created: Jan/23/2020
 * Author: Null
 */

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
import java.util.ArrayList;

public class MiscUtils {

    /**
     * Get the current time
     */
    public static String time() {

        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("E, MMMM dd yyyy");

        return time.format(timeFormatter);

    }

    public static ArrayList<String> arrToListLinked(String[] arr) {
        ArrayList<String> list = new ArrayList<String>();
        for (String val : arr) {
            if (!val.isBlank() && !val.isEmpty() ) {
                list.add(val);
            }
        }
        return list;
    }

    public static ArrayList<Integer> arrToListLinked(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int val : arr) {
            if (val != 0) {
                list.add(val);
            }
        }
        return list;
    }

    public static ArrayList<Double> arrToListLinked(double[] arr) {
        ArrayList<Double> list = new ArrayList<Double>();
        for (double val : arr) {
            if (val != 0) {
                list.add(val);
            }
        }
        return list;
    }

    public static ArrayList<Boolean> arrToListLinked(boolean[] arr) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        for (boolean val : arr) {
            list.add(val);
        }
        return list;
    }
}
