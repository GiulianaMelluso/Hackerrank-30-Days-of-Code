package Day11.Arrays2D;

import java.util.Scanner;

public class Solution {
    
    public static int Suma(int h, int v, int [][]aryReloj){
            
            int nivel1 = (aryReloj[h][v] + aryReloj[h][v+1] + aryReloj[h][v+2]);
            int nivel2 = (aryReloj[h+1][v+1]);
            int nivel3 = (aryReloj[h+2][v] + aryReloj[h+2][v+1] + aryReloj[h+2][v+2]);
            
            int suma = nivel1 + nivel2 + nivel3;
            
            return suma;
    } 
    public static void main(String[] args) {

        
        Scanner in = new Scanner(System.in);
        int[][] aryReloj = new int [6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                aryReloj[i][j] = in.nextInt();
            }
        }
        int v;
        int h;
          
        int valorMax = -300000;     
        
        for (h=0; h<=3; ++h ){
            
            for (v=0; v<=3; ++v ){
                
                Suma(h, v, aryReloj);
                int Suma = Suma(h, v, aryReloj); 
                
                if(valorMax< Suma){
                
                    valorMax= Suma;
                    
                }            
            }  
        }
        System.out.println(valorMax);
        
    }
}        
