public class Multidimensioal_arrays {
    public static void main(String[] args) {
        int[] number = {1, 2, 3,};
        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);
        String[][] strings = new String[2][3];
        strings[0][1]="Hi";
        System.out.println(strings[0][1]);

        for(int i=0;i< matrice.length;i++){
            for (int y=0;y< matrice.length;y++){
                System.out.print(matrice[i][y]+ " ");
            }
            System.out.println();
        }


    }
}
