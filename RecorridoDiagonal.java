
public class RecorridoDiagonal
{
    // Atributos  
    int r = 1;
    int s;
    int n;
    int m ;
    int  matriz [][];
    //Constructor
    public RecorridoDiagonal(int tam){
        n = tam; 
        s = n;
        m = n-1;
        matriz = new int [n][n];   
    }
    // Metodo de recorrido diagonal principal,secundaria
    public void RecorridoDiagonalPrinSecun(){
        // Recorrido de las filas
        for(int f = 0; f < matriz.length; f++, s--,m--){
            // Recorrido  de las columnas
            for(int c = 0; c < matriz.length; c++){
                // Pregunta si filas es igual a columnas
                if(f == c){
                    matriz[f][c] = r++;
                    matriz[f][m] = s;
                }
            }
        }
        // Imprimir la matriz
        for(int i = 0; i <  matriz.length; i++){
            for(int j = 0; j <  matriz.length; j++){
                // Imprimir el recorrido de la matriz diagonal principal , secundario
                System.out.print(matriz[i][j] +"\t");
            }
            System.out.println("\n");
        }
    }
}
