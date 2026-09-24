public class Matriks {
    //12 20 67 10 2 8 
    public static void main(String[] args) {
        int matriksA[][]={
            {12,20},
            {67,10},
            {2,8}
        };
        System.out.println(" Matriks A:");
        for ( int i = 0; i < matriksA.length; i++) {
            for ( int j = 0; j < matriksA[i].length; j++) {
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.println();
        }
        int matriksB[][]={
            {19,15},
            {32,10},
            {12,18}
        };
        System.out.println(" Matriks B:");
        for ( int i = 0; i < matriksB.length; i++) {
            for ( int j = 0; j < matriksB[i].length; j++) {
                System.out.print(matriksB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" Hasil Penjumlahan Matriks A dan B:");
        for ( int i = 0; i < matriksA.length; i++) {
            for ( int j = 0; j < matriksA[i].length; j++) {
                System.out.print(matriksA[i][j] + matriksB[i][j]+ " ");
            }
            System.out.println();
    }
}
}