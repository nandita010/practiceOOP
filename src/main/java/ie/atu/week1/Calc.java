package ie.atu.week1;
import java.util.Scanner;

public class Calc
{
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

    System.out.println("Choose operator: ");
    String operation= scan1.next();

    double result= switch (operation){
        case"add"->{
            yield firstNum + secondNum;
        }
        case"sub"-> {
            yield firstNum - secondNum;
        }
        case "mult"->{
            yield firstNum * secondNum;
        }
        case "div"-> {
            if(secondNum==0){
                System.out.println("Cannot divide by zero.");
                yield 0;
            }
            else{
                yield firstNum / secondNum;
            }
        }
        default->{
            System.out.println("Invalid Input. Please try again");
            yield 0;
        }
    };
    System.out.println("Result is: "+ result);
  }
}
