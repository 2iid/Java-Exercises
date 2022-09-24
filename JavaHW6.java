package com.company;

import java.time.DayOfWeek;
import java.util.Objects;

public class JavaHW6 {

    public static void main(String... arg){
        //new StringBuilder("Bonjour").reverse();
        //System.out.println(new StringBuilder("Bonjour").reverse());

        System.out.println("\nExercise 1 : ");
        reverseString("Java is so exiting :)");
        System.out.println("Method 2");
        reverseString2("Java is so exiting :)");
        System.out.println("Method 3");
        reverseString3("Java is so exiting :)");

        System.out.println("\nExercice 2");
        counter("zekbi ohçj 3 é' // 111");

        System.out.println("\nExercice 3");
        concat_nn(5);

        System.out.println("\nExercice 4");
        divisible_3_5();

        System.out.println("\nExercice 5");
        capitalize("the quick brown fox jumps over the lazy dog.");

        System.out.println("\nExercice 6");
        lowercase("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.");

        System.out.println("\nExercice 7");
        nextToLast("The quick brown fox jumps over the lazy dog.");

        System.out.println("\nExercice 8");
        string_first_last("","Python");

        System.out.println("\nExercice 9");
        addThreeChar("Python");

        System.out.println("\nExercice 10");
        num_Even_Odd(new int[]{2,1,5,9,4,1,14,6,7});

        System.out.println("\nExercice 11");
        power_4(64);

        System.out.println("\nExercice 12");
        uniqueChar("xyyz");

        System.out.println("\nExercice 13");
        anagram("wxyz","zyxw");

        System.out.println("\nExercice 14");
        System.out.println(permutation("xxyz","yxzx"));

        System.out.println("\nExercice 15");
        weekday(6);
        weekday2(6);


    }

    /*
    1. Write a Java program to reverse a string.
     */

    public static void reverseString(String phrase){
        StringBuilder str = new StringBuilder(phrase);
        str.reverse();

        System.out.println("Input : "+phrase);
        System.out.println("Output : "+ str);
    }

    public static void reverseString2(String phrase){
        StringBuilder reverse = new StringBuilder();
        for(int i = phrase.length()-1;i>=0;i--)
            reverse.append(phrase.charAt(i));
        System.out.println("Input String : "+phrase);
        System.out.println("Output String : "+reverse);
    }

    public static void reverseString3(String phrase){

        StringBuilder str = new StringBuilder();

        for (int i = phrase.length()-1; i >= 0 ; i--)
            str.append(phrase.charAt(i));

        System.out.println("Input String : "+phrase);
        System.out.println("Output String : "+ str);
    }

    /*
    2.Write a Java program to count the letters, spaces, numbers
    and other characters of an input string.
     */

    public static void counter(String phrase){
        int letter = 0, space = 0, number = 0, other = 0;

        for (int i = 0; i < phrase.length(); i++) {

            if(Character.isLetter(phrase.charAt(i)))
                letter++;
            else if(Character.isSpaceChar(phrase.charAt(i)))
                space++;
            else if(Character.isDigit(phrase.charAt(i)))
                number++;
            else
                other++;
        }

        System.out.println("Letter : "+letter);
        System.out.println("Space  : "+space);
        System.out.println("Number : "+number);
        System.out.println("Other  : "+other);

    }

    /*
    3. Write a Java program that accepts an integer (n) and computes
    the value of n+nn+nnn.
     */

    public static void concat_nn(int n){
        System.out.println("Input number : "+n);

    String n0 = String.valueOf(n), n2, n3;

    n2 = n0.concat(n0);
    n3 = n2.concat(n0);

        System.out.println(n0 + " + " + n2 + " + " +n3 + " = " +
                (n+Integer.parseInt(n2)+Integer.parseInt(n3)));
    }

    /*
    4. Write a Java program to print numbers between 1 to 100 which
    are divisible by 3, 5 and by both.
     */

    public static void divisible_3_5(){
        for(int i=1; i<=100; i++){
            if(i % 3==0 && i % 5 == 0)
                System.out.println(i+" is divisible by 3 and 5 both");
            else if(i % 3 ==0)
                System.out.println(i+" is divisible by 3");
            else if(i % 5 == 0)
                System.out.println(i + " is divisible by 5");
        }
    }

    /*
    5. Write a Java program to capitalize the first le"er of each
    word in a sentence.
     */

    public static void capitalize(String phrase){

        String[] capi = phrase.split(" ");
        for (String s : capi)
            System.out.print(Character.toUpperCase(s.charAt(0)) +
                    s.substring(1)+" ");

    }

    /*
    6. Write a Java program to convert a given string into lowercase.
     */

    public static void lowercase(String phrase){
        System.out.println("Lowercase : "+ phrase.toLowerCase());
    }

    /*
    7. Write a Java program to find the penul!mate (next to last)
       word of a sentence.
     */

    public static void nextToLast(String phrase){
        String[] str = phrase.split(" ");

        if (str.length <=1)
            System.out.println("One word in your sentence: "+str[0]);
        else
            System.out.println("Next last : "+str[str.length-2]);
    }

    /*
    8.Write a Java program to create a new string taking first and
    last characters from two given strings. If the length of either
    string is 0 use "#" for missing character
     */

    public static void string_first_last(String str1, String str2){
        if(str1.length() == 0 && str2.length() !=0){
            System.out.println("#"+str2.charAt(0));
        }
        else if(str1.length() !=0 && str2.length() == 0)
            System.out.println(str1.charAt(0)+"#");
        else
            System.out.println(str1.charAt(0) + "" +str2.charAt(0));

    }

    /*

    9. Write a Java program to take the last three characters from a
    given string and add the three characters at both the front and
    back of the string. String length must be greater than three and more.
     */

    public static void addThreeChar(String str){
        String last;
        if(str.length() <3)
            System.out.println("String length must be greater than three and more");
        else
        {
            last = str.substring(str.length()-3);
            System.out.println(last+str+last);
        }


    }

    /*
    10. Write a Java program to count the number of even and odd elements
    in a given array of integers
     */

    public static void num_Even_Odd(int[] numbers){
        int even = 0, odd = 0;

        for(int i:numbers){
            if(i % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of even : "+even+"\nNumber of odd : "+odd);

    }

    /*
    11. Write a Java program to check whether a given integer is a power
     of 4 or not. Given num = 64, return true. Given num = 6, return false.
     */

    public static void power_4(int pow){
        int ref = pow;

        int result = 0, rest = 0;

        if(pow == 4)
            System.out.println(pow + " is a power of 4");
        else {

            while (pow / 4 > 1) {
                pow = pow / 4;
                result = pow / 4;
                rest = pow % 4;
            }
            if (rest == 0 && result == 1)
                System.out.println(ref + " is a power of 4 (TRUE)");
            else
                System.out.println(ref + " is not a power of 4 (FALSE)");
        }
    }

    /*
    12. Write a Java program to check if a given string has all unique characters.
     */

    public static void uniqueChar(String str){
        if(str.length() == 0)
            System.out.println("Empty String");
        else if(str.length() == 1)
            System.out.println("String has all unique characters : true");
        else{
            char oneByone = str.charAt(0);
            boolean check = false;
            for(int i = 1;i < str.length(); i++){
                if(oneByone == str.charAt(i)){
                    check = oneByone == str.charAt(i);
                }
                else{
                    check = oneByone == str.charAt(i);
                    break;
                }
            }
            System.out.println("String has all unique characters : "+check);
        }
    }

    /*
    13. Write a Java program to check if two given strings are anagrams or not.
     According to Wikipedia "An anagram is a word or phrase formed by rearranging
     the letters of a different word or phrase, typically using all the original
     letters exactly once. For example, the word anagram can be rearranged into
     nag a ram, or the word binary into brainy."
     */


    public static void anagram(String str1,String str2){
        if(str1.length()!=str2.length())
            System.out.println("Anagram or not : false");
        else{
            int size = 0;

            String[] list1 = str1.split("");
            String[] list2 = str2.split("");

            for(String s:list1){

                for(int i = 0; i < list2.length; i++){

                    if(Objects.equals(s, list2[i])){
                        list2[i] ="";
                        size++;
                        break;
                    }
                }

            }
            if (size == list1.length)
                System.out.println(list2[0]+"Anagram or not : True ");
            else
                System.out.println(list2[0]+"Anagram or not : False ");

        }

    }

    /*
    14. Write a Java program to check if a given string is a permuta!on of another
    given string.
     */

    public static boolean permutation(String str1, String str2){
        int[] tab = new int[300];
        for (int i = 0; i < str1.length(); i++) {
            tab[str1.charAt(i)] += 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            tab[str2.charAt(i)] -= 1;

        }
        for (int j : tab) {
            if (j != 0) return false;
        }
        return true;

    }

    /*
    15. Write a Java program that keeps a number from the user and generates
    an integer between 1 and 7 and displays the name of the weekday.
     */

    public static void weekday(int day){
        if(day < 1 || day >7)
            System.out.println("The gien number most be beetwen 1 and 7");
        else{
            String[] week = {"Monday","Tuesday","Wednesday","Thrusday","Friday","Saterday","Sunday"};
            System.out.println(week[day-1]);
        }
    }

    public static void weekday2(int day){
        System.out.println("Another method : "+DayOfWeek.of(day));
    }

}
