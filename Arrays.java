import java.util.Scanner;

public class Arrays {
    public static void main(String[] agrs) {

        int tab1[] = {1,2,3,4,5,6,4,3};
        //average(tab1);

        int tab2[] = {1,24,5,2,5,7};
        //doubleVal(tab2);

        int tab3[] = {2,5,0,9,3,1,4,6,11};
        //primeNum(tab3);

        int tab4[] = {23,5,3,1,3,0,5};
        //containVal(tab4,300);

        int tab5[] = {3,9,44,6,2,5,6,1,4};
        //findIndex(tab5,44);
        int tab6[] = {5,3,0,9,2,1,4,6};
        //editElement(tab6,0,100);

        int[] tab7_1 = {3,2,67,4,3,23,1,13,0};
        //insertVal(tab7_1,0,100);

        int tab8[] = {4,6,2,6,8,3,5,2,1,6,44,99};
        //reverveArray(tab8);

        int[] tab9 = {5,2,34,0,98,3,1,4,55};
        //sortDesc(tab9);

        int[] tab10 = {2,9,4,3,5,2,9,0,5,7};
        //duplicateVal(tab10);

        String[] tab11 = {"senegal","saraya","issa","tech","saraya","issa","senegal"};
        //duplicateString(tab11);

        int[] tab12_1 = {2,4,7,1,5,9,5};
        int[] tab12_2 = {2,0,3,5,66,5};
        //commonElement(tab12_1,tab12_2);

        int tab13[] = {1,3,8,3,0,4,3,2,1};
        //leaders(tab13);

        int A[] = {1,5,6,7,8,10};
        int B[] = {2,4,9};
        //mergeAB(A, B);

        int tab15[] = {1,2,4,5,6};
        int target = 6;

        //sumElementsEqual(tab15,6);

        int[] tab16 = {3, 4, 0, 1, 5, 6, 5};
        //rotation(tab16);

        int tab17[] = {1,4,-3,5,0,2,-32,-54,0,-1};
        //numbersSign(tab17);

        int tab18[] = {4,2,9,1,4,5,8,7,6,0,10};
        //minMaxAverage(tab18);

        char[] tab19 = {'z','y','f','l','c','a'};
        //sortCharacterOfArray(tab19);

        String[] tab20 = {"Senegal","Gambie","Algerie","Rwanda","Benin"};
        //reverseArrayOfString(tab20);

        multidimExo10();


    }
    // Exercise 1 :
    public static void average(int[] tab1){
             /*
        1. Write a Java program to calculate the average value of an array of integers.
        */
        System.out.println("Exercise 1 : ");

        float avg = 0;
        for (float x:tab1) {
            avg += x / tab1.length;
        }
        System.out.println("The avarage is : "+avg);
    }

    // Exercise 2
    public static void doubleVal(int[] tab2){
          /*
        2. Write a Java program to double the values of an array of integers
         */
        System.out.println("\nExercise 2 : ");
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = 2*tab2[i];
            System.out.println(tab2[i]);
        }
    }

    // Exercise 3
    public static void primeNum(int[] tab3){
        /*
        3. Write a Java program to copy only the prime numbers of an array of integers.
         */

        System.out.println("\nExercise 3 : ");
        for (int i = 0; i < tab3.length ; i++) {
            int sum = 0;
            for (int j = 1; j <= tab3[i]; j++) {
                if (tab3[i] % j == 0){
                    sum+=1;
                }
            }
            if(sum == 2)
                System.out.println(tab3[i]+ " is a prime number.");

        }
    }

    // Exercise 4

    public static void containVal(int[] tab4, int check){
        /*
        4. Write a Java program to test if an array contains a specific value.
         */
        System.out.println("\nExercise 4 : ");
        for (int x:tab4) {
            if(x == check){
                System.out.println(check + " is in the array.");
                break;
            }
        }
    }

    // Exercise 5
    public static void findIndex(int[] tab5, int value){
        /*
        5. Write a Java program to find the index of an array element.
         */
        System.out.println("\nExercise 5 : ");
       // int index;
        for (int i = 0; i < tab5.length; i++) {
            if(value == tab5[i]){
                System.out.println(value + " is at the index "+i);
            }

        }
    }


    // Exercise 6
    public static void editElement(int[] tab6, int index2, int val){
        /*
        6. Write a Java program to modify a specific element from an array.
         */

        System.out.println("\nExercise 6 : ");
        if(index2 >= 0 && index2 < tab6.length){
            tab6[index2] = val;
        }
        else
            System.out.println("Incorrect index");

        for (int x:tab6) {
            System.out.print(x+"\t");
        }
    }

    // Exercise 7
    public static void insertVal(int[] tab7_1,int index7,int value7){

         /*
        7. Write a Java program to insert an element (specific position) into an array.
         */
        System.out.println("\nExercise 7 : ");
        int[] tab7_2 = new int[tab7_1.length+1];

        System.out.println("Before");
        for (int x:tab7_1) {
            System.out.print(x+"\t");
        }

        for (int i = 0; i < tab7_2.length; i++) {
            if(i < index7)
                tab7_2[i] = tab7_1[i];
            else if(i == index7)
                tab7_2[i] = value7;
            else
                tab7_2[i] = tab7_1[i-1];
        }

        System.out.println("\nAfter");
        for (int x:tab7_2) {
            System.out.print(x+"\t");
        }
    }

    // Exercise 8
    public static void reverveArray(int[] tab8){
        /*
        8. Write a Java program to reverse an array of integer values.
         */
        System.out.println("\nExercise 8 : ");
        System.out.println("Before : ");
        for (int x:tab8) {
            System.out.print(x +"\t");
        }
        int k = tab8.length-1;
        for (int j = 0; j < tab8.length/2; j++) {
            int temp = tab8[k];
            tab8[k] = tab8[j];
            tab8[j] = temp;
            k--;
        }
        System.out.println("\nAfter : ");
        for (int x:tab8) {
            System.out.print(x+"\t");
        }
    }

    // Exercise 9 :

    public static void sortDesc(int[] tab9){
         /*
        9. Write a Java program to sort an array of integers values descending,
         */
        System.out.println("\nExercise 9 :");

        System.out.println("Before : ");
        for (int x:tab9) {
            System.out.print(x+"\t");
        }

        for (int i = 0; i < tab9.length; i++) {
            for (int j = i+1; j < tab9.length; j++) {
                if(tab9[i] < tab9[j]){
                    int temp = tab9[i];
                    tab9[i] = tab9[j];
                    tab9[j] = temp;
                }
            }
        }
        System.out.println("\nAfter : ");
        for (int x:tab9) {
            System.out.print(x+"\t");
        }
    }

    // Exercise 10 :

    public static void duplicateVal(int[] tab10){
        /*
        10.Write a Java program to print the duplicate values of an array of integer values.
         */

        for (int i = 0; i < tab10.length; i++) {
            int sum = 1;
            for (int j = i+1; j < tab10.length; j++) {
                if (tab10[i] == tab10[j])
                    sum++;
            }
            if (sum > 1)
                System.out.println(tab10[i] + " appear in the array "+sum+" times");

        }
    }

    // Exercise 11

    public static void duplicateString(String[] tab11){
          /*
        11.Write a Java program to print the duplicate values of an array of string values.
         */
        System.out.println("\nExercise 11");

        for (int i = 0; i < tab11.length; i++) {
            int sum = 1;
            for (int j = i+1; j < tab11.length; j++) {
                if (tab11[i].compareTo(tab11[j]) == 0)
                    sum++;
            }
            if (sum > 1)
                System.out.println(tab11[i] + " appear in the array "+sum+" times");

        }
    }

    // Exercise 12

    public static void commonElement(int[] tab12_1,int[] tab12_2){
        /*
        12.Write a Java program to find the common elements between two arrays,
         */
        System.out.println("\nExercise 12");

        for (int i = 0; i < tab12_1.length; i++) {
            int sum = 0;
            for (int j = i; j < tab12_2.length; j++) {
                if (tab12_1[i] == tab12_2[j])
                    sum++;
            }
            if (sum >= 1)
                System.out.println(tab12_1[i] +" is a common value of the arrays");
        }
    }

    // Exercise 13

    public static void leaders(int[] tab13){
        /*
        13.Write a Java program to print all the LEADERS in the array.
         */
        System.out.println("\nExercise 13");

        for (int i = 0; i < tab13.length; i++) {
            int sum = 0;
            for (int j = i+1; j < tab13.length; j++) {
                if (tab13[i] > tab13[j])
                    sum++;
            }
            if (sum == (tab13.length - i - 1))
                System.out.println(tab13[i]+" is a LEADERS.");
        }
    }

    // Exercise 14

    public static void mergeAB(int[] A, int[] B){
        /*
        14.Given two sorted arrays A and B of size p and q, write a Java program to merge
            elements of A with B by maintaining the sorted order i.e. fill A with first p
            smallest elements and fill B with remaining elements.
         */
        System.out.println("\nExercise 14");
        int C[] = new int[A.length + B.length];
        System.out.println("Before : ");
        System.out.print("A : ");
        for (int x:A) {
            System.out.print(x+"\t");
        }
        System.out.print("\nB : ");
        for (int x:B) {
            System.out.print(x+"\t");
        }

        int k1 = 0;
        for (int i = 0; i < C.length; i++) {
            if(i < A.length){
                C[i] = A[i];
            }else {
                C[i] = B[k1];
                k1++;
            }
        }

        for (int i = 0; i < C.length; i++) {
            for (int l = i+1; l < C.length; l++) {
                if (C[i] > C[l]){
                    int temp = C[i];
                    C[i] = C[l];
                    C[l] = temp;
                }
            }
        }

        int w = 0;
        for (int i = 0; i < C.length ; i++) {
            if(i < A.length)
                A[i] = C[i];
            else{
                B[w] = C[i];
                w++;
            }
        }

        System.out.println("\nAfter : ");

        System.out.print("A : ");
        for (int x:A) {
            System.out.print(x+"\t");
        }
        System.out.print("\nB : ");
        for (int x:B) {
            System.out.print(x+"\t");
        }
    }

    // Exercise 15

    public static void sumElementsEqual(int[] tab15,int target){
        /*
        15.Write a Java program to find the sum of the two elements of a given array which is
        equal to a given integer.
         */

        for (int i = 0; i < tab15.length; i++) {
            for (int j = i; j < tab15.length; j++) {
                if(tab15[i]+tab15[j] == target)
                    System.out.println(tab15[i]+" + "+tab15[j] +" = "+target);

            }
        }
    }

    // Exercise 16

    public static void rotation(int[] tab16){
        /*
        16.Write a Java program to cyclically rotate a given array counterclockwise by one.
         */

        System.out.println("Before");
        for (int x : tab16) {
            System.out.print(x + "\t");
        }

        for (int i = 1; i < tab16.length; i++) {
            int temp = tab16[i - 1];
            tab16[i - 1] = tab16[i];
            tab16[i] = temp;

        }

        System.out.println("\nAfter");
        for (int x : tab16) {
            System.out.print(x + "\t");
        }

    }

    // Exercise 17

    public static void numbersSign(int[] tab17){
        /*
        17.Write a Java program to print the number of positive numbers, number of negative
         numbers and the number of 0 of an array of integers.
         */
        System.out.println("\nExercise 17");

        for (int x:tab17)
            System.out.print(x+"\t");

        int positive = 0, negative = 0, zero = 0;
        for (int x:tab17) {
            if(x > 0)
                positive++;
            else if (x < 0)
                negative++;
            else
                zero++;
        }
        System.out.println("\nPositive : "+positive+"\nNegative : "+negative+"\nZero : "+zero);
    }

    // Exercise 18

    public static void minMaxAverage(int[] tab18){
        /*
        18.Write a Java program that splits an array of integers into two. The first array will
        contain all the values less than the average of the two extremes (min & max); the second
        contains the values equal or greater than the average.
         */

        System.out.println("Initial tableau");
        for (int x:tab18) {
            System.out.print(x+"\t");

        }
        int min = tab18[0];
        int max = tab18[0];
        for (int i = 0; i < tab18.length; i++) {
            if (max < tab18[i])
                max = tab18[i];
            if (min > tab18[i])
                min = tab18[i];
        }
        int average = (max + min)/2;

        System.out.println("\nThe average between the min and the max is : "+average);

        int left = 0;
        int right = 0;

        for (int x:tab18) {
            if (x > average)
                right++;
            else if(x < average)
                left++;
        }
        int tabLeft[] = new int[left];
        int tabRight[] = new int[right];

        left = 0;
        right = 0;
        for (int x:tab18) {
            if(x < average){
                tabLeft[left] = x;
                left++;
            }
            else if (x > average){
                tabRight[right] = x;
                right++;
            }
        }
        System.out.println("\nLeft tableau");
        for (int x:tabLeft) {
            System.out.print(x+"\t");
        }
        System.out.println("\nRight tableau");
        for (int x:tabRight) {
            System.out.print(x+"\t");
        }
    }

    // Exercise 19
    public static void sortCharacterOfArray(char[] tab19){
        /*
        19.Write a Java program to sort an array of Characters descending
         */
        System.out.println("\nExercise 19");


        System.out.println("Before  :");
        for (char x:tab19) {
            System.out.print(x+"\t");
        }

        for (int i = 0; i < tab19.length; i++) {
            for (int j = 0; j < tab19.length; j++) {
                if (tab19[i] < tab19[j]){
                    char temp = tab19[j];
                    tab19[j] = tab19[i];
                    tab19[i] = temp;
                }

            }
        }

        System.out.println("\nAfter :");
        for (char x:tab19) {
            System.out.print(x+"\t");
        }
    }

    // Exercise 20

    public static void reverseArrayOfString(String[] tab20){
        /*
        20.Write a Java program to reverse the order of an array of String
         */

        System.out.println("\nExercise 20");

        System.out.println("Before : ");
        for (String x:tab20) {
            System.out.print(x +"\t");
        }
        int k2 = 0;
        for (int i = tab20.length-1; i > tab20.length/2; i--) {
            String temp = tab20[i];
            tab20[i] = tab20[k2];
            tab20[k2] = temp;
            k2++;
        }
        System.out.println("\nAfter : ");
        for (String x:tab20) {
            System.out.print(x+"\t");
        }
    }

    // Multidimensional array

    // Exercise 1 :
    public static void multidimExo1(){

        System.out.println("\nExercise 1 : ");

        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"\t");
            }

        }
    }

    // Exercise 2 :
    public static void multidimExo2(){
        System.out.println("\nExercise 2 : ");

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                if(i == j)
                    System.out.print(j+"\t");
                else
                    System.out.print("\t");
            }

        }
    }

    // Exercise 3 :
    public static void multidimExo3(){
        System.out.println("\nExercise 3 : ");

        for (int i = 10; i >= 1; i--) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                if(i == j)
                    System.out.print(j+"\t");
                else
                    System.out.print("\t");
            }

        }
    }

    // Exercise 4 :
    public static void multidimExo4(){
        System.out.println("\nExercise 4 : ");

        for (int i = 10; i >= 1; i--) {
            System.out.println();

            for (int j = 1; j <= 10; j++) {
                if(i == j || i+j == 11)
                    System.out.print(j+"\t");
                else
                    System.out.print("\t");

            }
        }
    }

    // Exercise 5 :
    public static void multidimExo5(){
        System.out.println("\nExercise 5 : ");

        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                if(i == j)
                    System.out.print("\t");
                else
                    System.out.print(j+"\t");
            }

        }
    }

    // Exercise 6 :
    public static void multidimExo6(){
        System.out.println("\nExercise 6 : ");

        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                if(i >= j || i+j == 11)
                    System.out.print(j+"\t");
                else
                    System.out.print("\t");
            }
        }
    }

    // Exercise 7 :
    public static void multidimExo7(int n){
        // int n = 10;
       /* for (int i =  1; i <= n; i++) {
            for (int j = n - i; j > 0  ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - 1; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

        */

        int nbLignes = 10;

        for (int noLigne = 1; noLigne <= nbLignes; noLigne++) {
            for (int i = nbLignes - noLigne; i > 0; i--)
                System.out.print(" ");
            for (int i = 0; i < 2 * noLigne - 1; i++)
                System.out.print("*");
            System.out.println();
        }
    }

    // Exercise 8 :
    public static void multidimExo8(){
        System.out.println("\nExercise 8 : ");
        char[][] matrix8 = {
                {'a','z','e','f','g','h','j','u','y','s'},
                {'l','c','v','r','y','u','k','k','g','s'},
                {'o','o','p','p','x','q','e','s','a','d'},
                {'x','v','v','s','z','e','d','g','i','u'},
                {'y','n','v','c','w','x','q','z','a','b'},
                {'i','g','m','l','k','s','d','f','j','h'},
                {'o','r','n','e','z','d','v','s','j','l'},
                {'e','e','t','i','k','c','c','h','r','r'},
                {'g','d','n','y','a','i','s','s','a','d'},
                {'v','s','s','d','g','f','d','z','e','t'}

        };

        System.out.println("Before");
        for (int i = 0; i < matrix8.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix8[i].length; j++) {
                System.out.print(matrix8[i][j]+"\t");
            }
        }

        char[] tempsTab = new char[matrix8.length * matrix8[0].length];

        int k8 = 0;
        for (int i = 0; i < matrix8.length; i++) {
            for (int j = 0; j < matrix8[i].length; j++) {
                tempsTab[k8++] = matrix8[i][j];
            }
        }

        // Hard way to sort
        for (int i = 0; i < tempsTab.length; i++) {
            for (int j = 0; j < tempsTab.length; j++) {
                if (tempsTab[i] < tempsTab[j]){
                    char temp = tempsTab[i];
                    tempsTab[i] = tempsTab[j];
                    tempsTab[j] = temp;
                }
            }
        }

        // Easy way to sort
        //Arrays.sort(tempsTab);

        k8 = 0;
        for (int i = 0; i < matrix8.length; i++) {
            for (int j = 0; j < matrix8[i].length; j++) {
                matrix8[i][j] = tempsTab[k8++];
            }
        }

        System.out.println("\nAfter");
        for (int i = 0; i < matrix8.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix8[i].length; j++) {
                System.out.print(matrix8[i][j]+"\t");
            }
        }
    }

    // Exercise 9 :
    public static void multidimExo9(){
        System.out.println("\nExercise 9 : ");
        int[][] matrix9 = {
                {1,2,3,4},
                {4,5,6,2},
                {7,8,9,9},
                {4,2,1,0}
        };

        int sum = 0;
        for (int i = 0; i < matrix9.length; i++) {
            for (int j = 0; j < matrix9[i].length; j++) {
                if(i+j == matrix9.length-1)
                    sum += matrix9[i][j];
            }
        }
        System.out.println("The sum of the secondary diagonal is : "+sum);
    }

    // Exercise 10 :
    public static void multidimExo10(){
        System.out.println("\nExercise 10 : ");
        int[][] matrix10 = {
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };
        System.out.println("Before : ");
        for (int[] x:matrix10) {
            System.out.println(java.util.Arrays.toString(x));
        }



        int[] tempArray = new int[matrix10.length * matrix10[0].length];
        int k10 = 0;
        for (int i = 0; i < matrix10.length; i++) {
            for (int j = 0; j < matrix10[i].length; j++) {
                tempArray[k10++] = matrix10[i][j];
            }
        }
        // Hard way to sort
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray.length; j++) {
                if (tempArray[i] < tempArray[j]){
                    int temp = tempArray[i];
                    tempArray[i] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }

        k10 = 0;
        for (int i = 0; i < matrix10.length; i++) {
            for (int j = 0; j < matrix10.length; j++) {
                matrix10[i][j] = tempArray[k10++];
            }

        }

        // Easy xay
        //Arrays.sort(tempArray);

        System.out.println("After : ");
        for (int[] x:matrix10) {
            System.out.println(java.util.Arrays.toString(x));
        }
    }

}
