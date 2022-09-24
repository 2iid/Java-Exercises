package com.company;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class JavaHW5 {
    public static void main(String... args){
        int c;
        c = (int) Math.pow(4,6);


        System.out.println("Exercise 1 :");

            // Quand la methode n'est pas static
        JavaHW5 check = new JavaHW5();
        check.CheckPassFail(50);
            // quand la methode est static
        //CheckPassFail(5);

        System.out.println("\nExercise 2 :");
        Product1toN(100);
        //JavaHW5 facto = new JavaHW5();

        System.out.println("\nExercise 3 :");
        Swap2Integers(3,9);

        System.out.println("\nExercise 4 :");
        SumDigits(1235);

        System.out.println("\nExercise 5 :");
        LoapYear(2010);

        System.out.println("\nExercise 6 :");
        Area_Circle(5);

        System.out.println("\nExercise 7 :");
        Month1(12);
        Month2(12);
        System.out.println("Other wise  : "+ Month.of(12));

        System.out.println("\nExercise 8 :");
        Perfect(28);
        System.out.println("\nPerfect number between 1 to 1000");
        for(int i = 1; i <= 1000; i++){
            Perfect(i);
        }

        System.out.println("\nExercise 9 :");
        Power(4,3);

        System.out.println("\nExercise 10 :");
        Grade(19);

        System.out.println("\nExercise 11 :");
        DisplayPattern(5);

        System.out.println("\nExercise 12 :");
        SumDouble(2,3);

    }
    /*
    1. Write a program called CheckPassFail which prints " PASS " if
    the int variable " mark " is more than or equal to 50 ;
    or prints " FAIL " otherwise. The program shall always print “ DONE ”
    before exiting.
     */

    public void CheckPassFail(int mark){
        if(mark >=50)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        System.out.println("DONE !");
    }

    /*
    2. Write a program called Product1ToN to compute the product
    of integers from 1 to 10 (i.e., 1×2×3×...×10 ), as an int .
    Take note that It is the same as factorial of N .
     */

    public static void Product1toN(int N){
        double fact = 1;
        for(int i=2;i<=N;i++)
            fact *= i;
        System.out.println("The factorial of "+ N + " is : "+fact);
    }

    /*
    3. Write a program called Swap2Integers that swap the contents of
    the two variables; and print the results.
     */
    public static void Swap2Integers(int a, int b){
        int c = a, a0 = a,b0 = b;
        a = b;
        b = c;
        System.out.println("Before the swap : a = "+a0+" b = "+b0+ " \nAfter the swap : a = "+a+" b = "+b);
    }

    /*
     4. Write a Java method to compute the sum of the digits in an integer.
     */
    public static void SumDigits(int x){
        int sum = 0;int a = x;
        while (x > 0){
            sum += x % 10;
            x = x/10;
        }
        System.out.println("The sum of the digits in "+a+" is : "+sum);

    }

    /*
    5. Write a Java method to check whether a year (integer) entered
    by the user is a leap year or not.
     */


    public static void LoapYear(int year){
        //int year;
        boolean loap = false;
        //System.out.println("Enter a year :");
        //Scanner scan = new Scanner(System.in);
        //year = scan.nextInt();
        //scan.close();

        if(year % 4 ==0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                    loap = true;
                else
                    loap = false;
            }
            else
                loap = true;
        }
        else{
            loap = false;
        }
        if(loap)
            System.out.println(year +" is a loap year");
        else
            System.out.println(year +" is not a loap year");

    }

    public static void LeapYear2(int year){
        boolean Leap = false;
        if (year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0)
                    Leap = true;
                else
                    Leap = false;
            }
            else
                Leap = true;
        }
        else
            Leap = false;
    }

    /*
    6. Write Java methods to calculate the area of a circle.
     */

    public static void Area_Circle(int radius){
        double area = radius*radius*Math.PI;
        System.out.println("The area of the circle of radius "+radius+" is :"+area);
    }

    /*
    7. Given a number from 1-12, return the name of the appropriate month
     */

    public static void Month1(int a){
        if(a <= 0 || a > 12){
            System.out.println("Error !");
        }else {
        String[] mois = {"January", "February","MArch","April","May","June","July","August","September","october","November","December"};
        System.out.println(mois[a-1]);
        }
    }
                // otherwise
    public static void Month2(int a){
        if(a <= 0 || a > 12){
            System.out.println("Error !");
        }else {
            Month mois = Month.of(a);
            String MonthName = mois.getDisplayName(TextStyle.FULL, Locale.US);
            System.out.println(MonthName + " is the appropriate month of " + a);
        }
    }

    /*
    8. Define a method named 'perfect' that determines if parameter
    number is a perfect number. Use this function in a program that
    determines and prints all the perfect numbers between 1 and 1000.
     */

    public static void Perfect(int a){
        int sum = 0;
        for(int i=1;i<=a/2;i++){
            if(a % i == 0)
                sum += i;
        }
        if(sum == a)
            System.out.println(a + " is a perfect neumber");
    }

    /*
    9. Define a method to calculate power of a number raised to other
    i.e. ab using recursion where the numbers 'a' and 'b' are to be
    entered by the user
     */

    public static void Power(int a, int b){
        int pow = a;
        for (int i = 2; i <= b; i++) {
             pow *= a;
        }
        System.out.println("The power of "+a+" raised to "+b+" is : "+pow);
    }

    /*
    10. Create a method that will give you the grade according to his notes
     */

    public static void Grade(int a){
        if(a <10)
            System.out.println("BAD");
        else if(a <=15)
            System.out.println("GOOD");
        else if(a <= 20)
            System.out.println("VERY GOOD");
    }

    /*
    11. Implement a program that display the below pattern
        *****
        ****
        ***
        **
        *
     */
    public static void DisplayPattern(int n){
        for(int i = n; i>=1;i--){
            System.out.println("");
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
    }

    /*
    12. Implement a program to display the sum of two numbers if
    they are the same or the double of the sum if they are different
     */

    public static void SumDouble(int a , int b){
        int c = a+b;
        if(a == b)
            System.out.println("THe gven numbers are the same then them sum s : "+ c);
        else
            System.out.println("The given numbers are diffent, then the double of them sum is : "+2*c);

    }

}
