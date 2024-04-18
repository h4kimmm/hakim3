//Scrivi una funzione che presi come parametri una matrice rettangolare mxn e due indici di
//riga modifichi la matrice in modo che le corrispondenti righe siano invertite
//riga modifichi la matrice in modo che le corrispondenti righe siano invertite
public class Main {
    public static void invertRow(int[][] matrix, int r1, int r2) {
        int[] temp = matrix[r1];
        matrix[r1] = matrix[r2];
        matrix[r2] = temp;
    }

    public static void main(String[] args) {
        int[][] ex = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        invertRow(ex, 0, 2);
        for (int[] r : ex) {
            for (int num : r) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
