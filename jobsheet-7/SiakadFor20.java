import java.util.Scanner;

public class SiakadFor20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklarasi variable
        double nilai;
        double terendah = 100;
        double tertinggi = 0;

        //kode program (for)
        for (int i = 1;i <= 10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
        }
        System.out.println("Tertinggi adalah : " + tertinggi);
        System.out.println("Terendah adalah = " + terendah);
    }
}