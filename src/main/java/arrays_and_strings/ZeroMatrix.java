/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays_and_strings;

import static arrays_and_strings.RotateMatrix.mat;

/**
 *
 * @author famil
 */
public class ZeroMatrix {
    static int[][] mat={{1,1,1},{1,1,1},{1,1,1}};
    public static void main(String[] args) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
        make0(3,3);
        System.out.println("///////");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
    }
    
    static void ceros(int ini,int fin,int paso,int j,int up,int [][]aux){
        for(int i=ini;;i+=paso){
            if(i==fin){
                break;
            }
            if(up==1){
                aux[i][j]=0;
            }
            else{
                aux[j][i]=0;
            }
        }
    }
    
    static void make0(int n,int m){
        int[][] aux=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               aux[i][j]=mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    ceros(i,n,1,j,1,aux);
                    ceros(i,-1,-1,j,1,aux);
                    ceros(j,n,1,i,2,aux);
                    ceros(j,-1,-1,i,2,aux);
                }
            }
        }
        mat=aux;
    }
    
}
