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

public class Baju {
    String jenis;
    final int harga;

    Baju (String jenis, int harga) {
        this.jenis = jenis;
        this.harga = harga;
    }
    void belibaju (int jumlah) {
        System.out.println("Anda membeli " + jumlah + " baju jenis " + jenis + " dengan harga satuan " + harga);

        if (jumlah > 100) {
            System.out.println("Anda mendapat potongan karena pembelian lebih dari 100 pcs");
            System.out.print("Total pembayaran anda adalah ");
            if (harga > 150000)
                System.out.println((harga - 15000) * jumlah);
            else
                System.out.println((harga - 5000) * jumlah);
        } else {
            System.out.print("Total pembayaran anda adalah ");
            System.out.println(harga * jumlah);
        }
    }
}
Baju.java
Displaying Baju.java.