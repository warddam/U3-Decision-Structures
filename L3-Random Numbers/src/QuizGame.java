package src;

import javax.swing.*;
import java.util.Random;

public class QuizGame {

    static int usersAnswers, correctAnswer;
     static String displayProblem = "";
    public static void main(String[] args) {
              addProblem();
        System.out.println(displayProblem);
        System.out.println(correctAnswer);
    }

    public static void addProblem() {
          int choice = input("Choose addition(1), subtraction(2), addition(3), multiplication(4)")
             addProblem();
           if (choice == 1){
    }

    public static int random(){

        Random random = new Random();

        return random.nextInt(20) + 1;


    }
         public static int input(String messaqe){
        return Integer.parseInt(JOptionPane.showInputDialog(messaqe));
         }

}
