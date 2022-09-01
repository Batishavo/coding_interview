/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_and_strings;

/**
 *
 * @author famil
 */
public class URLify {
    
    static String cad="MR John Smith          ";
    static int num = 13;
    static char[] c2= cad.toCharArray();
    
    public static void main(String[] args) {
        
        System.out.println(url(cad));
        
        repleaceSpaces(c2, num);
        cad= new String(c2);
        System.out.println(cad);
    }
    static String url(String cad){
        
        String tam[]=cad.split(" "),
               result="";
        
        result+=""+tam[0];
        for(int i=1;i<tam.length;i++){
            result+="%20"+tam[i];
        }
        
        return result;
    }
    static void repleaceSpaces(char[] str,int trueLenght){
        
        int spaceCount =0,index,i =0;
        
        for(i=0;i<trueLenght;i++){
            if(str[i]==' '){
                spaceCount++;
            }
        }
        index= trueLenght + spaceCount*2;
        if(trueLenght<str.length){
            str[trueLenght]='\0';
        }
        for(i = trueLenght-1;i>=0;i--){
            if(str[i] == ' '){
               str[index-1] = '0';
               str[index-2] = '2';
               str[index-3] = '%';
               index-=3;
            
            }
            else{
                str[index-1]=str[i];
                index--;
            }
        }
        
        
    }
}
