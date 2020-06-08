//Make Pattern like:
//        if num = 5;
//        *****
//        ** **
//        * * *
//        ** **
//        *****
//------------------------------------------------------------------------------


package com.pattern;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Height of Your Patter:: ");
        int num = input.nextInt();     //Height of our Pattern
        int m=1;
        int n=num;

        System.out.print("Our Pattern is:: \n");
        for(int i=1; i<=num; i++)
        {
            for (int j=1; j<=num; j++)
            {
                if (i == 1 || i == num)
                {
                    System.out.print("*");
                }
                else
                {
                    if ((j==1 || j==m) || (j==num || j==n))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
            m++;
            n--;
        }
    }
}
