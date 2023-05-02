/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge;

/**
 *
 * @author User
 */

//Problem Link: https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true

public class JavaAnagrams {
    
    public static boolean isAnagram(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length()){
            return false;
        }
        
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (int i = 0; i < a.length(); i++) {
            freq1[a.charAt(i)-'a']++;
            freq2[b.charAt(i)-'a']++;
        }
        
        for(int i = 0; i < 26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        String a = "anagram";
        String b = "naagram";
        System.out.println(isAnagram(a, b));
    }
    
}
