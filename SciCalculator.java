import java.util.Scanner;
public class SciCalculator
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        double result = 0.0;
        int menuSelection = 0;
        double firstOperand;
        double secondOperand;
        int numCalc = 0;
        double sumCalc = 0;
        double averageCalc = 0;
        boolean loop = true;



        while (loop == true)  //loop will always be true so the menu will continue to print until user clicks 0
        {
            if (menuSelection != 7) //so it will not print menu again after average or error.
            {
            System.out.println("\nCurrent Result: " + result);
            System.out.println("\nCalculator Menu");
            System.out.println("---------------");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            }


                System.out.print("\nEnter Menu Selection: ");
                menuSelection = myScanner.nextInt();


                if (menuSelection == 0)
                {
                    System.out.println("\nThanks for using this calculator. Goodbye!");
                    break;
                } else if (menuSelection == 1)                //Addition
                {
                    System.out.print("Enter first operand: ");
                    firstOperand = myScanner.nextDouble();

                    System.out.print("Enter second operand: ");
                    secondOperand = myScanner.nextDouble();

                    result = firstOperand + secondOperand;
                    sumCalc = sumCalc + result;    //adds the new result to the sum
                    numCalc++;  //increments the number of calculations
                    //both needed after every operation

                } else if (menuSelection == 2)               //Subtraction
                {
                    System.out.print("Enter first operand: ");
                    firstOperand = myScanner.nextDouble();

                    System.out.print("Enter second operand: ");
                    secondOperand = myScanner.nextDouble();

                    result = firstOperand - secondOperand;
                    sumCalc = sumCalc + result;
                    numCalc++;
                } else if (menuSelection == 3)            //Multiplication
                {
                    System.out.print("Enter first operand: ");
                    firstOperand = myScanner.nextDouble();

                    System.out.print("Enter second operand: ");
                    secondOperand = myScanner.nextDouble();

                    result = firstOperand * secondOperand;
                    sumCalc = sumCalc + result;
                    numCalc++;
                } else if (menuSelection == 4)             // Division
                {
                    System.out.print("Enter first operand: ");
                    firstOperand = myScanner.nextDouble();

                    System.out.print("Enter second operand: ");
                    secondOperand = myScanner.nextDouble();

                    result = firstOperand / secondOperand;
                    sumCalc = sumCalc + result;
                    numCalc++;
                } else if (menuSelection == 5)             //Exponent
                {
                    System.out.print("Enter first operand: ");
                    firstOperand = myScanner.nextDouble();

                    System.out.print("Enter second operand: ");
                    secondOperand = myScanner.nextDouble();

                    result = Math.pow(firstOperand, secondOperand);
                    sumCalc = sumCalc + result;
                    numCalc++;

                } else if (menuSelection == 6)              //Logarithm
                {
                    System.out.print("Enter first operand: ");
                    firstOperand = myScanner.nextDouble();

                    System.out.print("Enter second operand: ");
                    secondOperand = myScanner.nextDouble();

                    result = (Math.log10(secondOperand)) / (Math.log10(firstOperand));
                                //log(b) with base a = log(a)/log(b) with base 10
                    sumCalc = sumCalc + result;
                    numCalc++;
                } else if (menuSelection == 7)              //Average
                {
                    if (numCalc == 0)
                    {
                        System.out.println("\nError: No calculations yet to average!");

                    } else
                    {
                        averageCalc = sumCalc / numCalc;
                        averageCalc = Math.round(averageCalc * 100.0) / 100.0;  //needed in order to round to two decimal places
                        System.out.println("\nSum of calculations: " + sumCalc);
                        System.out.println("Number of calculations: " + numCalc);
                        System.out.println("Average of calculations: " + averageCalc);
                    }

                } else
                {
                    System.out.println("\nError: Invalid selection!");
                    menuSelection = 7;  //needed so the menu will not print again
                }


        }
    }

    }
