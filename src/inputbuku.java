   import java.util.Scanner;
public class inputbuku {
 
    private final Scanner scanner;

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

