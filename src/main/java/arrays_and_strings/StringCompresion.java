/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_and_strings;

/**
 *
 * @author famil
 */
public class StringCompresion {
    public static void main(String[] args) {
        
        System.out.println(compresion("aabcccccaaa"));
        System.out.println("aabb");
        
    }
    static String compresion(String cad){
        
        String actual="";
        int cont =1;
        
        for(int i=1;i<cad.length();i++){
            
            if(cad.charAt(i)== cad.charAt(i-1)){
                cont++;
            }
            else{
                actual+=""+cad.charAt(i-1)+""+cont;
                cont=1;
            }   
        }
        actual+=""+cad.charAt(cad.length()-1)+""+cont;
        if(actual.length()<cad.length()){
            return actual;
        }
        return cad;
    }
    
    static String compress(String str){
        StringBuilder compressed = new StringBuilder();
        int countConsectuvide = 0;
        for(int i = 0;i<str.length();i++){
            countConsectuvide++;
            if(i+1>= str.length() || str.charAt(i)!=str.charAt(i)){
                compressed.append(str.charAt(i));
                compressed.append(countConsectuvide);
                countConsectuvide = 0;
            }
        }
        return compressed.length() < str.length()? compressed.toString() : str;
    }
    
}
