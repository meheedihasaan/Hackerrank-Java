/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

/**
 *
 * @author User
 */

//Problem Link: https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true

public class StringComparison {
    
    public static String smallestAndLargest(String s, int k){
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        int start = 0;
        int end = k;
        while(end <= s.length()){
            String sub = s.substring(start, end);
            if(smallest.compareTo(sub) > 0){
                smallest = sub;
            }
            
            if(largest.compareTo(sub) < 0){
                largest = sub;
            }
            start++;
            end++;
        }
        return smallest+"\n"+largest;
    }
    
    public static void main(String[] args) {
        String s = "Bangladesh";
        System.out.println(smallestAndLargest(s, 2));
    }
    
}
