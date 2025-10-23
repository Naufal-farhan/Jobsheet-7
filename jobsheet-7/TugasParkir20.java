import java.util.Scanner;
public class TugasParkir20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jam;
        int tarif = 0;
        int tarifTotal;
        String kendaraan;

        do {
            System.out.print("Masukkan jenis kendaraan : ");
            kendaraan = sc.nextLine();
            
            if (kendaraan.equalsIgnoreCase("Mobil")){
                tarif = 3000;
            }else if (kendaraan.equalsIgnoreCase("Motor")){
                tarif = 2000;
            }else{
                System.out.println("Error, Silahkan masukan jenis kendaraan yang valid");
            continue;}
            System.out.print("Masukkan lama parkir(dalam jam) : ");
            
            jam = sc.nextInt();
            tarifTotal = tarif * jam;

            if(jam > 5){
                tarifTotal = 15000;
            } else if (jam <= 0){
                System.out.println("Program berhenti");
                break;
            }
            System.out.println("Harga yang harus di bayar adalah : "+ tarifTotal);
            sc.nextLine();
        }
        while (true);
    }
}
