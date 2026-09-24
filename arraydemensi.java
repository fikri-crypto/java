public class arraydemensi {
public static void main(String[] args) {
    int matriksA[][] ={
        {2,1,1},
        {2,1,1}
    };

        int matriksB[][] = {
            {3,2,1},
            {3,2,1}
    
    };
    System.out.println(" Matriks A:");
    for ( int i = 0; i < matriksA.length; i++) {
        for ( int j = 0; j < matriksA[i].length; j++) {
            System.out.print(matriksA[i][j] + " ");
        }
        System.out.println();
    }
       
    System.out.println(" Matriks B:");
    for ( int i = 0; i < matriksB.length; i++) {
        for ( int j = 0; j < matriksB[i].length; j++) {
            System.out.print(matriksB[i][j] + " ");
        }
        System.out.println();
    }
   
}    
}