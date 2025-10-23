import java.util.Scanner;

public class TugasTiket20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hTiket = 50000;
        int tiket;
        double total, disc;
        int jml;
        int i = 1;
        int jTiket = 0;
        double jHarga = 0;

        System.out.print("Masukkan jumlah total pelanggan hari ini : ");
        jml = sc.nextInt();

        while (i <= jml) {
            System.out.print("Input tiket yang di beli pelanggan-" + i + " : ");
            tiket = sc.nextInt();

            if (tiket <= 0) {
                System.out.print("Jumlah tiket tidak valid, silahkan input ulang");
                continue;
            }
            if (tiket > 4 && tiket <=10) {
                disc = 0.1;
            }else if (tiket > 10){
                disc = 0.15;
            }else {
                disc = 0;
            }          
            total = ((hTiket*tiket)-((hTiket * tiket)* disc));
            jTiket = jTiket + tiket;
            jHarga = jHarga + total;
            System.out.println("Total harga tiket pelanggan-"+i+" : "+total);
            i++;
        }
        System.out.println("Total tiket terjual hari ini adalah : " + jTiket);
        System.out.println("Total pendapatan hari ini adalah :" + jHarga);
    }

}
