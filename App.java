package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //objective: determine compound interest
        Scanner scan = new Scanner(System.in);
        double A,P, r, n, t, exp, par,percent, mult;
        NumberFormat round = NumberFormat.getCurrencyInstance(); //round in dollar format
        System.out.print("Enter the principle: "); //P
        P= scan.nextDouble();
        System.out.print("Enter the rate of interest: ");//r
        r= scan.nextDouble();
        percent = r/100; //convert to a percentage
        System.out.print("Enter the number of years: "); //t
        t = scan.nextDouble();
        System.out.print("Enter the number of times the interest is compounded per year: "); //n
        n = scan.nextDouble();
        exp = n * t; //exponent
        par = 1+(percent/n); //parentheses
        par = Math.pow(par, exp);
        A= P * par;
        System.out.print(P +" invested at" +r +"% for " +t +" years, compounded " +n +" times per year is " +round.format(A));


    }
}
