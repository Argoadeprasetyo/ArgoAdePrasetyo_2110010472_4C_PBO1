# ArgoAdePrasetyo_2110010472_4C_PBO1
Project Akhir Mata Kuliah Pemrograman Berbasis Objek 1
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `bukuberaksi`, dan `inputbuku` adalah contoh dari class.

```bash
public class Buku {
    ...
}

public class bukuberaksi extends buku {
    ...
}

public class inputbuku {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, ` inputbuku inputbuku = new inputbuku();` adalah contoh pembuatan object.

```bash
 inputbuku inputbuku = new inputbuku();
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `penulis`,`tahun terbit` dan `dipinjam` adalah contoh atribut.

```bash
 private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mahasiswa` dan `MahasiswaDetail`.

```bash
 // Constructor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;

}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setJudul`,`setPenulis`,`setTahunTerbit`dan`setDipinjam` adalah contoh method mutator.

```bash

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
     public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getJudul`, `getPenulis`, `getTahunTerbit`,  adalah contoh method accessor.

```bash
 public String getJudul() {
        return judul;
    }

 public String getPenulis() {
        return penulis;
    }
   public int getTahunTerbit() {
        return tahunTerbit;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `bukuberaksi` mewarisi `buku` dengan sintaks `extends`.

```bash
public class bukuberaksi extends buku {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `c` di `Buku` merupakan overloading method `String toString()` dan `String toString()` di `bukuberaksi` merupakan override dari method `String toString()` di `Buku`.

```bash
@Override
 public String toString() {
        String statusPinjam = dipinjam ? "Sedang Dipinjam" : "Tersedia";
        return "Judul: " + judul + "\nPenulis: " + penulis + "\nTahun Terbit: " + tahunTerbit + "\nStatus: " + statusPinjam;
    }
}

```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash

```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < bukuArr.length; i++) {
            System.out.println("Masukkan data buku ke-" + (i + 1));
            bukuArr[i] = inputBukuDataWithValidation(inputbuku);
        }

        
        System.out.println("\nData Buku:");
        for (Buku buku : bukuArr) {
            System.out.println("\n" + buku.toString());
        }
    }
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
public inputbuku() {
        scanner = new Scanner(System.in);
    }

    // Method untuk meminta input data buku
    public Buku inputBukuData() {
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();

        int tahunTerbit = 0;
        boolean inputValid = false;
        while (!inputValid) {
            try {
                System.out.print("Tahun Terbit: ");
                tahunTerbit = Integer.parseInt(scanner.nextLine());
                inputValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Tahun terbit harus berupa angka!");
            }
        }

        return new Buku(judul, penulis, tahunTerbit);
    }
}
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, ` Buku[] bukuArr = new Buku[3];` adalah contoh penggunaan array.

```bash
 Buku[] bukuArr = new Buku[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
 try {
                return inputbuku.inputBukuData();
            } catch (NumberFormatException e) {
                System.out.println("Tahun terbit harus berupa angka!");
            }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Argo Ade Prasetyo
NPM: 2110010472
