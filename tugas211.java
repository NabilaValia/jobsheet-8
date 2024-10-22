import java.util.Scanner;
public class tugas211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jumlahPoltek = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= jumlahPoltek; i++) {
            System.out.println("Data untuk Politeknik ke-" + i);
            System.out.print("Nama Politeknik: ");
            String namaPoliteknik = sc.nextLine();

            System.out.println("Masukkan cabang olahraga");
            for (int j = 1; j <= 4; j++) {
                System.out.print("Nama cabang olahraga ke-" + j + ": ");
                String namaCabor = sc.nextLine();

                System.out.println("Masukkan 5 atlet untuk cabang olahraga " + namaCabor + ":");
                for (int k = 1; k <= 5; k++) {
                    System.out.print("Nama atlet ke-" + k + ": ");
                    String nama = sc.nextLine();
                }
            }
        }

        System.out.println("Data Atlet Porseni berhasil diinput!");
        sc.close();
    }
}