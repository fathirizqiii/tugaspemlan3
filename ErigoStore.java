Main Menu
Pemrograman Lanjut Kelas TI E
Praktikum: Senin 12.50-14.29 di G1.5
[Praktikum - Tugas 3]
Iqbal Biondy
•
Mar 9
87/100
87 points out of possible 100
Due Mar 17, 11:59 PM
Petunjuk Tugas Praktikum:
Mengerjakan 1 soal studi kasus pada file terlampir
Kumpulkan file java
Kumpulkan class diagram (tipe file .jpg/.png)
Screenshoot output dari IDE (tipe file .jpg/.png)
Kumpulkan tepat pada waktunya 
Dikumpulkan tepat pada waktunya, setiap keterlambatan akan mendapatkan pengurangan poin 10 perharinya

Soal Tugas 3.pdf
PDF
Class comments
Your work
Graded

Screenshoot Output.jpeg
Image

Class Diagram.jpeg
Image

Baju.java
Java

ErigoStore.java
Java
1 private comment

Iqbal BiondyApr 10
Screenshoot output yang dikumpulkan hanya satu seharusnya 3

package pemlantugas3;
import java.util.*;

public class ErigoStore {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        Baju A = new Baju("A", 100000);
        Baju B = new Baju("B", 125000);
        Baju C = new Baju("C", 175000);

        System.out.println("Welcome to Erigo\n");
        System.out.println("List baju kami : ");
        System.out.println("Baju " + A.jenis + " harga = " + A.harga);
        System.out.println("Baju " + B.jenis + " harga = " + B.harga);
        System.out.println("Baju " + C.jenis + " harga = " + C.harga + "\n");

        System.out.print("Masukkan jenis baju yang ingin anda beli = ");
        String jenis = input.next();

        if (jenis.equalsIgnoreCase("A")) {
            System.out.print("Masukkan jumlah yang ingin anda beli = ");
            int jumlah = input.nextInt();
            System.out.println();

            A.belibaju(jumlah);
        }
        else if (jenis.equalsIgnoreCase("B")) {
            System.out.print("Masukkan jumlah yang ingin anda beli = ");
            int jumlah = input.nextInt();
            System.out.println();

            B.belibaju(jumlah);
        }
        else if (jenis.equalsIgnoreCase("C")) {
            System.out.print("Masukkan jumlah yang ingin anda beli = ");
            int jumlah = input.nextInt();
            System.out.println();

            C.belibaju(jumlah);
        }
    }
}
ErigoStore.java
Displaying ErigoStore.java.