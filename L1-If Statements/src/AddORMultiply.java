import javax.swing.*;
import java.util.Scanner;

public class AddORMultiply {

    /*
    Write two methods, one that adds two numbers and second that multiplies them.
    Then, write a main method that prompts the user to enter 2 numbers.

    If the first one is larger than the second, mutiply and display the result
    If not, add them and display the results.l
     */


    public static void main(String[] args) {
        double numInput1 = Double.parseDouble(JOptionPane.showInputDialog("Please Enter A number:"));
        double numInput2 = Double.parseDouble(JOptionPane.showInputDialog("Pleas enter a number:"));
        double result = 0;

        if(numInput1 > numInput2){

            result = multiply(numInput1, numInput2);



        }

    if (numInput1 > numInput2){
        result = add(numInput1, numInput2);
    }
    JOptionPane.showMessageDialog(null, "The result is " + result);

    }

    public static double add(double num1, double num2){

    return num1 + num2;

    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }


}







