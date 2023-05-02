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

//Problem Link: https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

public class ReverseString {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int start = 0;
        int end = A.length()-1;
        boolean isPalindrome = true;
        while(start <= end){
            if(A.charAt(start) != A.charAt(end)){
                isPalindrome = false;
            }
            start++;
            end--;
        }
        
        if(isPalindrome){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
