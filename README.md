# Praktikum4 Pertemuan 7 OOP

***Nama: Gufranaka Samudra***<br/>
***NIM: 312110300***<br/>
***Matkul: OOP***<br/>


# Step 1
Saya memulai projek dengan software InttileJ IDEA dan membuat 5 file java dengan sala satu diantaranya adalah Main.java sebagai file utama. Pada kasus kali ini saya akan membuat perhitungan bangun ruas Persegi, Lingkaran dan Segitiga. Dan ketiga file tersebut merupakan child class dari BangunDatar.java sebagai parent class. Jadi strukturnya akan seperti ini,

- Main.java (File Utama)
- BangunDatar.java (Parent Class)
- Lingkaran.java (Child Class)
- Persegi.java (Child Class)
- Segitiga.java (Child Class)

# Step 2
Setelah ini saya mulai menulis baris code untuk parent class nya terlebih dahulu, saya membuat dua fungsi yang akan di jadikan override di kelas child yaitu `luas` dan `keliling` kedua fungsi ini akan di turunkan juga di child class.

```java

public class BangunDatar {
    public float luas(){
        return 0;
    }
    public float keliling(){
        return 0;
    }
}
```

# Step 3
Setelah saya membuat fungsi di class BangunDatar.java, saya langsung membuat override untuk ketiga kelas child, namun sebelum itu override sendiri artinya adalah situasi dimana method class turunan menimpa method milik parent class. Ini bisa terjadi jika terdapat nama method yang sama baik di child class dan juga parent class. 


Maka code di dalam child class tidak akan berbeda jauh, hanya berbeda dari segi rumus penyelesaian, selebihnya akan sama saja dalam penerapan code nya. Dan sample code nya akan menjadi seperti ini.

```java
public class Persegi extends BangunDatar {
    private final double sisi = 5;

    public float luas(){
        return (float) (this.sisi * this.sisi);
    }

    public float keliling(){
        return (float) (4 * this.sisi);
    }
}

```

# Step 4
Dan di akhir kita hanya membuat objek di class Main atau file utama kita, sehingga program kita bisa di jalankan dan mengeluarkan output. Sehingga full code Main.java akan menjadi sebagi berikut,

```java
public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        Segitiga segitiga = new Segitiga();
        Persegi persegi = new Persegi();

        // Lingkaran
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling() + "\n");

        // Segitiga
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling() + "\n");

        // Persegi
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling() + "\n");
    }
}
```

Maka hasil output yang dikeluarkan akan menjadi seperti gambar di bawah ini,

![output](https://raw.githubusercontent.com/AgufSamudra/Praktikum4/main/Screenshot%20(31).png)

# TERIMA KASIHHHH 
