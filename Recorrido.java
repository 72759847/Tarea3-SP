
public class Recorrido
{
    //Atributos
    int n;
    int m;
    int k;
    int r = 1;
    String [][] matriz;
    public Recorrido(int tam){
        n = tam;
        m = n-1;
        matriz = new String [n][n];
    }

    public void RecorridoCaracol(){
        for(int i = 0; i < matriz.length; i++){
            // Llenado de la fila superior
            for(int j = k; j <= m; j++ ){
                matriz[k][j] = r++ +"\u2192\t";
            }
            // Llenado de la columna extremo derecho
            for(int j = k+1; j <= m; j++ ){
                matriz[j][m] = r++ +"\u2193\t";
            }
            // Llenado de la fila inferior de derecha a izquierda
            for(int j = m-1; j >= k; j--){
                matriz[m][j] = r++ +"\u2190\t";
            }
            // Llenado de la columna del extremo izquierda de abajo hacia arriba
            for(int j = m-1; j >= k+1; j--){
                matriz[j][k] = r++ +"\u2191\t";
            }
            k++; 
            m--;
        } // Fin del ciclo externo
        // Imprimir la matriz
        for(int f = 0; f < matriz.length; f++){
            for(int i = 0; i < matriz[f].length; i++){
                System.out.print( matriz[f][i]);
            }
            System.out.println();
        }

    }

}
