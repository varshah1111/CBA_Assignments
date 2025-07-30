/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cba;

/**
 *
 * @author varsha
 */
import java.util.Scanner;
public class SumCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,y,sum=0;
        System.out.println("Enter the value of x");
        x=sc.nextInt();
        System.out.println("Enter the value of x and y");
        y=sc.nextInt();
        sum=x+y;
        System.out.println("Sum of " +x+ " and " +y+ " = " +sum);
    }
}
