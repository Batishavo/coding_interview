/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_and_strings;

/**
 *
 * @author famil
 */
public class PalindromePermutation {
    
    static String cad="";
    
    public static void main(String[] args) {
        
    }
    void revisa(){
        
        int bucket[]=new int[250],
            odd     = 0,
            even    = 0;
        
        for(int i=0;i<cad.length();i++){
            
            int aux=cad.charAt(i);
            bucket[aux]++;
        }
        
        for(int i=0;i<250;i++){
            if(bucket[i]>0){
                if(bucket[i]%2==0){
                    even++;
                }
                else{
                    odd++;
                }
                
            }
        }
        
        if((cad.length()%2==0 && odd==0) ||
           (cad.length()%2!=0 && odd==1))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}
