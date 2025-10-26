package ie.atu.week1;
import java.util.Scanner;

public class Calc {
public static void main(String[] args){

    //Prompt the user for second number
    // Display it to the screen
    Scanner scan1=new Scanner(System.in);
    //Please enter first number
    System.out.println("Please enter a number: ");
    double firstNum= scan1. nextDouble();
    System.out.println("You entered "+ firstNum);

    //Please enter second number
    System.out.println("Please enter second number: ");
    double secondNum=scan1.nextDouble();
    System.out.println("You entered: " + secondNum);

    double sum= firstNum + secondNum;
    System.out.println("The sum is "+ sum);
 }
}
