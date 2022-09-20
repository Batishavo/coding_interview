/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_and_strings;

/**
 *
 * @author famil
 */
public class RotateMatrix {
    static int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
    public static void main(String[] args) {
       
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
        rotar(3,3);
        System.out.println("//////");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
    }
    
    static void rotar(int n,int m){
        
        int[][] copia=new int[n][m];
        
        int p1=n-1,p2=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                copia[i][j]=mat[p1--][p2];
            }
            p2++;
            p1 = n-1;
                   
        }
        mat=copia;
    }
    
}
