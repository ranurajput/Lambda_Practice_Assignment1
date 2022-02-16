package com.knoldus.kup.lambda.assignment1;
public class FindMaximumNumber {
    public static void main(String... args){
        // Writing Lambda
        MaximumNumbers maximumNumbers = ((number1, number2) ->(number1>number2) ?number1:(number1<number2) ?number2:0);
        // Calling function
        int max = maximumNumbers.findMax(5, 15);
        System.out.println("Compiled by Ranu Rajput");
        System.out.println("Maximum number is " +max);
    }
}
