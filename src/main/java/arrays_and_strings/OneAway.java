/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_and_strings;

/**
 *
 * @author famil
 */
public class OneAway {
    public static void main(String[] args) {
        System.out.println(edit("pale","ple"));
        System.out.println(edit("pales","pale"));
        System.out.println(edit("pale","bale"));
        System.out.println(edit("pale","bake"));


    }
    static boolean edit(String cad1,String cad2){
        
        
        int cont=0,
            p1=0,
            p2=0,
            sizeCad1=cad1.length(),
            sizeCad2=cad2.length();
        
        if(Math.abs(sizeCad1 - sizeCad2)>1){
            return false;
        }
        
        while(p1<sizeCad1 && p2<sizeCad2){
            if(cad1.charAt(p1)==cad2.charAt(p2)){
                p1++;
                p2++;
            }
            else{
                if(sizeCad1==sizeCad2){
                    p1++;
                    p2++;
                    
                }
                else if(sizeCad1>sizeCad2){
                    p1++;
                }
                else{
                    p2++;
                }
                cont++;
            }
            
            if(cont>1){
                return false;
            }
        }
        
        return Math.abs(cont)<=1;
    }
}
