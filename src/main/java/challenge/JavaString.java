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

//Problem Link: https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true

public class JavaString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        System.out.println(a.length()+b.length());
        
        boolean isGreater = false;
        for(int i = 0; i < Math.min(a.length(), b.length()); i++){
            if(a.charAt(i) > b.charAt(i)){
                isGreater = true;
                break;
            }
            
            if(a.charAt(i) < b.charAt(i)){
                isGreater = false;
                break;
            }
        }
        
        if(isGreater){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        String A = a.toUpperCase();
        String B = b.toUpperCase();
        a = A.substring(0, 1)+a.substring(1);
        b = B.substring(0, 1)+b.substring(1);
        System.out.println(a+" "+b);
    }
    
}
