import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] tablica1 = {1,2,3};
        int[] tablica2 = {4,5,6};
        int[] tablica3;
        tablica3 = new int[tablica1.length];
        MetodaNaTablice(tablica1,tablica2,tablica3);
        for (int i = 0; i < tablica3.length; i++) {
            System.out.print(tablica3[i]);

        }
    }
    public static int[] MetodaNaTablice(int[] tab1, int[] tab2, int[] tab3){
        if (tab1.length == tab2.length){
            for (int i = 0; i < tab1.length ; i++) {
                tab3[i]= tab1[i] + tab2[i];

            }
            return tab3;
        }
        return tab3;

    }
}