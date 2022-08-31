/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package arrays_and_strings;

import java.util.Scanner;

/**
 *
 * @author famil
 */
public class is_unique {

    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        String cad= leer.next();
        
        System.out.println(isUniqueChars(cad));
        System.out.println(isUniqueCharsV2(cad));
        
    }
    static boolean isUniqueChars(String str){
        if(str.length()>120){
            return false;
        }
        boolean[] char_set = new boolean[128];
        for(int i=0;i<str.length();i++){
            int val =str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
    
    static boolean isUniqueCharsV2(String str){
        int checker = 0;
        for(int i=0;i<str.length();i++){
            int val=str.charAt(i)-'a';
            if((checker & (1<<val))>0){
                return false;
            }
            checker |=(1<<val);
        }
        return true;
    }
}
