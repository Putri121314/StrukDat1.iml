package com.JenericJava;
import java.util.Scanner;

public class Segitiga<T extends Number> {
    private T alas;
    private T tinggi;

    public Segitiga (T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultlnt(){
        double hitunglnt = 0.5 * alas.intValue() * tinggi.intValue();
        int hasilint = (int) Math.round(hitunglnt);
        return hasilint;
    }

    public double getResultDoub(){
        return 0.5 * alas.doubleValue()* tinggi.doubleValue();

    }

    public static void main(String[] args) {Main();}

    public static void Main(){
        Scanner type = new Scanner(System.in);
        System.out.println("\n====HITUNG LUAS SEGITUGA====\n");
        System.out.println("Pilih Tipe data");
        System.out.println("1. Nilai dalam Integer\n2.Nilai adalam Double");
        System.out.print("Choose :"); int choose = type.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Tipe data Integer");
                System.out.println("Alas : ");
                int alas1 = type.nextInt();
                System.out.println("Tinggi : ");
                int tinggi1 = type.nextInt();

                Segitiga<Integer>intSegitiga = new Segitiga<>(alas1,tinggi1);

                System.out.println("Nilai Dalam Integer:" + intSegitiga.getResultlnt());
                break;


            case 2:
                System.out.println("\nTipe Data Double : ");
                System.out.println("Alas : ");
                double alas2 = type.nextDouble();
                System.out.println("Tinggi : ");
                double tinggi2 = type.nextDouble();

                Segitiga<Double>doubleSegitiga = new Segitiga<>(alas2,tinggi2);

                System.out.println("Nilai dalam Double : " + doubleSegitiga.getResultDoub());
                break;

        }
    }
}