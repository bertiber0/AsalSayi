import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Hangi sayıya kadar asalları bulmak istiyorsunuz ? :");
        n = input.nextInt();

        for(int i=2; i<n; i++){
            int sayi = 0;
            for (int k=2; k<i; k++){
                if(i%k==0)sayi++;
                }
            if(sayi == 0) System.out.print(i+" ");
        }
    }
}