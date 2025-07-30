/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cba;

/**
 *
 * @author varsha
 */
import java.util.*;
public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int  a = 0, b = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");
    if(n<=0){
        System.out.println("Enter positive Number");
    }
    for (int i = 1; i <= n; ++i) {
      System.out.print(a + ", ");

      // compute the next term
      int next = a + b;
      a = b;
      b = next;
    }
    }
}
