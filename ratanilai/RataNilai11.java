import java.util.Scanner;

public class RataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahMahasiswa = 5;
        int jumlahNilai = 5;

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            float totalNilai = 0;

            System.out.println("Input Nilai Mahasiswa ke " + i);
            for (int j = 1; j <= jumlahNilai; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                float nilai = sc.nextFloat(); 
                totalNilai += nilai;
            }
            float rataNilai = totalNilai / jumlahNilai; 
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
        }

        sc.close(); 
    }
}
