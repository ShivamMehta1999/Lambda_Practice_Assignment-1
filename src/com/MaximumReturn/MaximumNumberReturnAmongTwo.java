package com.MaximumReturn;


import java.util.Scanner;
// public class initialized as name MaximumNumberReturnAmongTwo
public class MaximumNumberReturnAmongTwo{
    // main method called
    public static void main(String[] args) {

        // Lambda Expression for Return Maximum  integer values :
        Interface_of_MaximumNumberReturnAmongTwo result=(fNumber, secNumber) -> Math.max(fNumber,secNumber);
        Scanner sc = new Scanner(System.in);

        // User Input for Above function's Implementation
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.println("\n Enter your second number:");
        int num2 = sc.nextInt();

        // Showing Result of Maximum among 2 integers
        System.out.println("Maximum of above number is:");
        System.out.println(result.max(num1,num2));
    }
}
