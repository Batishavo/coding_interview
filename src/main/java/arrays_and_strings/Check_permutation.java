/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_and_strings;

import java.util.Scanner;

/**
 *
 * @author famil
 */
public class Check_permutation {
    
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        String cad  = leer.next(),
               cad2 = leer.next();
            
        System.out.println(isPermutation(cad, cad2));

    }
    
    static boolean isPermutation(String cad1,String cad2){
        
        if(cad1.length()!= cad2.length()){
            return false;
        }
        
        int arr[]=new int[300];
         
        for(int i=0;i<cad1.length();i++){
            int aux=cad1.charAt(i);
            arr[aux]++;
        }
        for(int i=0;i<cad2.length();i++){
            int aux=cad2.charAt(i);
            arr[aux]--;
        }
        
        for(int i=0;i<200;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        
    
        return true;
    }
    
}
