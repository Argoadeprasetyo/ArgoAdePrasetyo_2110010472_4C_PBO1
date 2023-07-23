
public class bukuberaksi {

    
    public static void main(String[] args) {
        inputbuku inputbuku = new inputbuku();

        // Array untuk menyimpan data buku
        Buku[] bukuArr = new Buku[3];

        // Input data buku
        for (int i = 0; i < bukuArr.length; i++) {
            System.out.println("Masukkan data buku ke-" + (i + 1));
            bukuArr[i] = inputBukuDataWithValidation(inputbuku);
        }

        // Output data buku
        System.out.println("\nData Buku:");
        for (Buku buku : bukuArr) {
            System.out.println("\n" + buku.toString());
        }
    }

    // Method untuk meminta input data buku dengan error handling untuk tahun terbit
    public static Buku inputBukuDataWithValidation(inputbuku inputbuku) {
        while (true) {
            try {
                return inputbuku.inputBukuData();
            } catch (NumberFormatException e) {
                System.out.println("Tahun terbit harus berupa angka!");
            }
        }
    }
}



