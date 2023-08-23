import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        // Program sederhana menghitung BMI atau indeks masa tubuh
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Berat Badan : ");
        double Berat = input.nextDouble();

        System.out.println("Masukan Tinggi Badan : ");
        double Tinggi = input.nextDouble();

        double konversiBerat = Berat * 2.205;
        double konversiTinggi = Tinggi / 2.54;
        double RumusBmi = konversiBerat / konversiTinggi * konversiTinggi * 703;
        System.out.println("BMI =" + RumusBmi);

        // menghitung volume bangun ruang
        // bola V = 4/3 x π x r3
        Scanner inputBola = new Scanner(System.in);

        System.out.println("Masukan Jari Jari");
        double JariJari = inputBola.nextDouble();

        double PhiPhi = 3.14;
        double volumeBola = 4/3 * PhiPhi * JariJari * JariJari;
        System.out.println("Volume Bola Adalah : " + volumeBola);

        // tabung
        // Tabung V = Phi x r xr x t
        Scanner inputTabung = new Scanner(System.in);

        System.out.println("Masukan Jari Jari: ");
        double JariJariTabung = inputTabung.nextDouble();

        System.out.println("Masukan Tinggi : ");
        double TinggiTabung = inputTabung.nextDouble();

        double VolumeTabung = PhiPhi * JariJariTabung * TinggiTabung;
        System.out.println("Volume Tabung Adalah : " + VolumeTabung);

        // kerucut
        // Kerucut V = 1/3 x phi x r x r x t
        Scanner inputKerucut = new Scanner(System.in);


        System.out.println("Masukan Jari Jari : ");
        double JariJariKerucut = inputKerucut.nextDouble();

        System.out.println("Masukan Tinggi");
        double TinggiKerucut = inputKerucut.nextDouble();

        double Volumekerucut = 1/3 * PhiPhi * JariJariKerucut * TinggiKerucut;
        System.out.println(Volumekerucut);

        

    }
}