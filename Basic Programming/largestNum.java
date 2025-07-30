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
public class largestNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the n1 :");
        int x=sc.nextInt();
        System.out.print("Enter the n2 :");
        int y=sc.nextInt();
        System.out.print("Enter the n3 :");
        int z=sc.nextInt();
        int largest;
        if(x>=y && x>=z)
            largest=x;
        else if(y>=x && y>=z)
            largest=y;
        else
            largest=z;
        System.out.println("Largest is: "+largest);
    }
}
