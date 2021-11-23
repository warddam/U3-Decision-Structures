import javax.swing.*;
import java.awt.*;

public class QuizGame {
  static double userAnswer, correctAnswer;
  static String displayProblem;
  JPanel panel;
  JButton createProblem, checkAnswer;
  JLabel showProblem;
  JTextField answerInput;
  JRadioButton addition, subtraction, multiplication, division;
  ButtonGroup radios = new ButtonGroup();





    public static void main(String[] args) {

        int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose Addition(1), subtraction(2), multiplication(3) division(4)"));

        createProblem(choice);
        getUserAnswer();
        checkanswer();
    }

    public QuizGame(){

        JFrame frame = new JFrame("Quiz Game");
        frame.setSize(300,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        addition = new  JRadioButton("Additon");
        subtraction = new JRadioButton("Subtraction");
        multiplication = new JRadioButton("multiplication");
        division = new JRadioButton("division");

        createProblem = new JButton("make a problem");
        showProblem = new JLabel("place holder");
        answerInput = new JTextField(10);
        checkAnswer = new JButton("check answer");
        resultLabel = new JLabel("answer results");


        radios.add(addition);
        radios.add(subtraction);
        radios.add(multiplication);
        radios.add(division);






        panel.setLayout(null);
        panel.add(addition);
        panel.add(subtraction);
        panel.add(multiplication);
        panel.add(division);

    }









    public static void checkanswer(){}
   public static void  getUserAnswer(){}
     public static void  createProblem(int choice){}
     public static void add(){}


