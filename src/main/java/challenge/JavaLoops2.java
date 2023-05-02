/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

import java.util.Scanner;

/**
 *
 * @author User
 */

//Problme Link: https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

public class JavaLoops2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            long prev = a;
            for(int j = 0; j < n; j++){
                long current = prev + (int) Math.pow(2, j)*b;
                prev = current;
                System.out.print(current+" ");
            }
            System.out.println();
        }
        in.close();
    }
    
}
