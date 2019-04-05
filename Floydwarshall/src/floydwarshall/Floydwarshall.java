/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floydwarshall;


public class Floydwarshall {

    
    public static void main(String[] args) {
        int grafo[][]=
        {
            {0,0,0,2,0},
            {3,0,0,0,0},
            {9,0,0,5,8},
            {0,1,0,0,0},
            {2,0,0,2,0},
        };
    }
    static void floyd(int grafo[][]){
            int n=grafo.length;
            int distancia[][]=getMatriz(0, grafo);
            int caminos[][]=getMatriz(1, grafo);  
            int tmp;
            for (int k = 0; k < n; k++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        tmp= distancia[i][k]+distancia[k][j];
                        if (tmp<distancia[i][j]) {
                            distancia[i][j]=tmp;
                            caminos[i][j]=k;
                        }
                    }
                }
        }
        }
    static void print(String txt, int M[][]){
        
    }
    static int[][] getMatriz(int tipo, int grafo[][]){
        int n=grafo.length;
        int M[][]= new int[n][n];
        if (tipo==1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    M[i][j]=j;
                }
            }
        }else{
            int INF=999;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i!=j && grafo[i][j]==0) {
                        M[i][j]=INF;
                    }else{
                        M[i][j]=grafo[i][j];
                    }
                }
            }
        }
        return M;
    }
}
