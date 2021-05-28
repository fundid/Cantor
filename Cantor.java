// Java program to print up to the N-th term in

// George Cantor set of rational number

import java.io.*;

 import java.util.*;

class Cantor

{

    static void georgeCantor(int n)

    { 

        // let i = numerator

        int i = 1; 

         

        // let j = denominator

        int j = 1; 

         

        // to keep the check of no. of terms

        int k = 1; 

             

        // loop till k is not equal to n

        while (k < n)

        {

            j++ ;

            k++;

             

            // check if k is already equal to N

            // then the first term is the required

            // rational number

            if (k == n)

                break;

             

            // loop for traversing from right to left

            // downwards diagonally

            while (j > 1 && k < n) {

                i++;

                j--;

                k++;

            }

             

            if (k == n)

            break;

             

            i++;

            k++;

             

            if (k == n)

            break;

             

            // loop for traversing from left 

            // to right upwards diagonally

            while (i > 1 && k < n) {

                i--;

                j++;

                k++;

            } 

        } 

        System.out.print(i +"/" +j + " ");

    }

     

    // Running code

    public static void main (String[] args) 

    {

        System.out.println("This program outputs the n terms");

	Scanner sc = new Scanner(System.in);	System.out.print("Enter the number of terms you want: ");

        int a = sc.nextInt(); 

        for(int n=1;n<=a;++n){

            georgeCantor(n);

        }

         

    }

} 

 
