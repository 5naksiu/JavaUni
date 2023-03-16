import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int x = scan.nextInt();
        System.out.println("Podaj drugą liczbę");
        int y = scan.nextInt();
        System.out.println(compare(x,y));

    }
    public static int compare(int a,int b){
        if(a > b){
            return -1;
        }else if (a < b){
            return 1;
        }else{
            return 0;
        }
    }
}
