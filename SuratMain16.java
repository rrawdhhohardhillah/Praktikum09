import java.util.Scanner;

public class SuratMain16 {
    public static void main(String[] args) {
        StackSurat16 stack = new StackSurat16(10); 
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU SISTEM SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("=== INPUT SURAT IZIN ===");
                    System.out.print("Masukkan Id Surat: ");
                    String idSurat = sc.next();
                    System.out.print("Nama Mahasiswa: ");
                    sc.nextLine(); 
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.next();
                    System.out.print("Keterangan Izin (S/I): ");
                    char jenisIzin = sc.next().charAt(0);
                    System.out.print("Durasi Izin: ");
                    int durasi = sc.nextInt();

                    Surat16 suratBaru = new Surat16(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(suratBaru);
                    break;

                case 2:
                    System.out.println("=== PROSES SURAT IZIN ===");
                    Surat16 suratDiproses = stack.pop();
                    if (suratDiproses != null) {
                        System.out.println("Surat yang diproses:");
                        suratDiproses.tampilkanSurat16();
                    }
                    break;

                case 3:
                    System.out.println("=== LIHAT SURAT IZIN TERAKHIR ===");
                    Surat16 suratTerakhir = stack.peek();
                    if (suratTerakhir != null) {
                        suratTerakhir.tampilkanSurat16();
                    }
                    break;

                case 4:
                    System.out.println("=== CARI SURAT IZIN ===");
                    System.out.print("Masukkan nama mahasiswa: ");
                    sc.nextLine();
                    String namaCari = sc.nextLine();
                    stack.cariSurat(namaCari);
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
