import java.util.Scanner;
public class tugas111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        if (n < 3) {
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(n + " ");
            }
            System.out.println();

            for (int i = 1; i < n - 1; i++) {
                System.out.print(n + " ");
                for (int j = 1; j < n - 1; j++) {
                    System.out.print("  ");
                }
                System.out.println(n + " ");
            }

            for (int i = 0; i < n; i++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}