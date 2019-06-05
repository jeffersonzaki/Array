import javax.swing.*;

public class LinearArray {

    //declare output
    public static String output = " ";

    /*
    //pass w to a. they are now the same
    public static void printArrayElements(double[] a) {
        for(int index = 0; index < a.length; index++) {
            output += " " + a[index];
        }

    }

     */

    ////------------------------------------------------------------------recursively
    public static void printArrayElements(double[] a, int index) {
        if(index < a.length) {
            output += " " + a[index];
            printArrayElements(a, index + 1);
        }
    }


    public static double computeLargestElement(double[] a, double largest, int index) {
        if(index >= a.length) {
            return largest;
        }
        if(a[index] > largest) {
            return computeLargestElement(a, a[index], index+1);
        }
        else {
            return computeLargestElement(a, largest, index+1);

        }

    }

    public static double computeSumOfElements(double[] a, int index) {
        if(index >= a.length) {
            return 0;
        }
        else {
            return a[index] + computeSumOfElements(a, index+1);
        }
    }





    // * Main Method * //
    public static void main(String[] args) {

        double[] w = {12.5, 33.4, 88.9, 56.2, 89.8, 12.5, 81.9, 78.9, 45.7, 55.1, 23.7, 90.7, 18.3};

        output += "\nThe array elements are ";
        //pass array
        printArrayElements(w, 0);

        //put in order from largest to smallest. define largest and the index
        output += "\nThe largest array elements are " + computeLargestElement(w, 0, 1);
        //find the sum of the elements. pass w to a and 0 to index
        output += "\nThe sum of the array elements are " + computeSumOfElements(w, 0);


        JOptionPane.showMessageDialog(null, output);
    }
}
