
package daraayudhia86;

import java.util.Scanner;

public class DaraAyudhia86 {

 
    public static void main(String[] args) {
       int data1, data2, output;
        
        Scanner keyboard = new Scanner(System.in);
                            
                            //OPERATOR PENUGASAN
                            
        System.out.print("Input data-1: ");
        data1 = keyboard.nextInt();
        System.out.print("Input data-2: ");
        data2 = keyboard.nextInt();

        //*PENJUMLAHAN
        output = data1 + data2;
        System.out.println("Hasil = " + output);

        System.out.print("Input data-1: ");
        data1 = keyboard.nextInt();
        System.out.print("Input data-2: ");
        data2 = keyboard.nextInt();

        //*PENGURANGAN
        output = data1 - data2;
        System.out.println("Hasil = " + output);

         System.out.print("Input data-1: ");
        data1 = keyboard.nextInt();
        System.out.print("Input data-2: ");
        data2 = keyboard.nextInt();

        //*PERKALIAN
        output = data1 * data2;
        System.out.println("Hasil = " + output);


        System.out.print("Input data-1: ");
        data1 = keyboard.nextInt();
        System.out.print("Input data-2: ");
        data2 = keyboard.nextInt();

        //*PEMBAGIAN
        output = data1 / data2;
        System.out.println("Hasil = " + output);

        System.out.print("Input data-1: ");
        data1 = keyboard.nextInt();
        System.out.print("Input data-2: ");
        data2 = keyboard.nextInt();

        //*SISA BAGI (MODULUS)
        output = data1 % data2;
        System.out.println("Hasil = " + output);
        
                            // OPERATOR PEMBANDING

        //*Data A lebih besar dari Data B
        
        System.out.print("Masukkan Data A: ");
        float DataA = keyboard.nextInt();
        System.out.print("Masukkan Data B: ");
        float DataB = keyboard.nextInt();
        boolean hasil;
        hasil = DataA > DataB;
        System.out.println("Pernyataan = " + hasil);
        
        //*Data 1 lebih kecil dari Data 2
       
        System.out.print("Masukkan Data 1: ");
        float Data1 = keyboard.nextInt();
        System.out.print("Masukkan Data 2: ");
        float Data2 = keyboard.nextInt();
        boolean hasil2;
        hasil2 = Data1 > Data2;
        System.out.println("Pernyataan = " + hasil2);

        //*Data C lebih besar sama dengan Data D
       
        System.out.print("Masukkan Data C: ");
        float DataC = keyboard.nextInt();
        System.out.print("Masukkan Data D: ");
        float DataD = keyboard.nextInt();
        boolean hasil3;
        hasil3 = DataC >= DataD;
        System.out.println("Pernyataan = " + hasil3);

        //*Data 3 lebih kecil sama dengan Data 4
       
        System.out.print("Masukkan Data 3: ");
        float Data3 = keyboard.nextInt();
        System.out.print("Masukkan Data 4: ");
        float Data4 = keyboard.nextInt();
        boolean hasil4;
        hasil4 = Data3 <= Data4;
        System.out.println("Pernyataan = " + hasil4);
        
        //*Data E sama dengan Data F
        
        System.out.print("Masukkan Data E: ");
        float DataE = keyboard.nextInt();
        System.out.print("Masukkan Data F: ");
        float DataF = keyboard.nextInt();
        boolean hasil5;
        hasil5 = DataE == DataF;
        System.out.println("Pernyataan = " + hasil5);
        
        //*Data 5 tidak sama dengan Data 6
        
        System.out.print("Masukkan Data 5: ");
        float Data5 = keyboard.nextInt();
        System.out.print("Masukkan Data 6: ");
        float Data6 = keyboard.nextInt();
        boolean hasil6;
        hasil6 = Data5 != Data6;
        System.out.println("Pernyataan = " + hasil6);
       
        
                            // OPERATOR BITWISE
                            
        int angka1, angka2, output1;
        boolean output2;

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input data-2: ");
        angka2 = keyboard.nextInt();
        
        //*Fungsi AND
        
        output1 = angka1 & angka2;
        System.out.println("Hasil & =" + output1);
        
        System.out.print("Input data-3: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input data-4: ");
        angka2 = keyboard.nextInt();
        
        //*Fungsi OR
        
        output1 = angka1 | angka2;
        System.out.println("Hasil | =" + output1);
        
        System.out.print("Input data-3: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input data-4: ");
        angka2 = keyboard.nextInt();
        
        //*Fungsi XOR
        
        output1 = angka1 ^ angka2;
        System.out.println("Hasil ^ =" + output1);
        
        System.out.print("Input data-4: ");
        angka2 = keyboard.nextInt();
        
        //*Fungsi NEGASI
        
        output1 = ~angka2;
        System.out.println("Hasil ^ =" + output1);
        
        System.out.print("Input data-3: ");
        angka1 = keyboard.nextInt();
        
        //*Fungsi LEFT SHIFT
        
        output1 = angka1 << 5;
        System.out.println("Hasil ^ =" + output1);
        
        System.out.print("Input data-3: ");
        angka1 = keyboard.nextInt();
        
        //*Fungsi RIGHT SHIFT
        
        output1 = angka1 >> 6;
        System.out.println("Hasil ^ =" + output1);
        
    }
    
}
