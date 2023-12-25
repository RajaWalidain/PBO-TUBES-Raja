import java.util.Scanner;

interface Jasa {
    void pemilihanKatergori();
    void pemilihanHarga();
    void prosesPengerjaan();
    boolean selesaiPengerjaan();
}

class Photoshop implements Jasa {
    private static final int HARGA = 150000;
    private static final String KATEGORI = "Basic Editing";
    private boolean selesai = false;

    @Override
    public void pemilihanKatergori() {
        System.out.println("Anda memilih kategori: Adobe Photoshop");
    }

    @Override
    public void pemilihanHarga() {
        Scanner scanner = new Scanner(System.in);

        // Konfirmasi 1
        System.out.print("Apakah Anda ingin melanjutkan? (ya/tidak): ");
        String mengkonfirmasi = scanner.nextLine();

        if (!mengkonfirmasi.equalsIgnoreCase("ya")) {
            System.out.println("Pengerjaan dibatalkan.");
            return;
        } else if (mengkonfirmasi.equalsIgnoreCase("tidak")) {
            System.out.println("Pengerjaan dibatalkan.");
            selesai = true;
            return;
        }

        System.out.println("Harga jasa untuk " + KATEGORI + ": Rp " + HARGA);

        // Konfirmasi 2
        System.out.print("Apakah Anda yakin ingin melanjutkan pengerjaan? (ya/tidak): ");
        mengkonfirmasi = scanner.nextLine();
        System.out.println("Mohon tunggu...");
        if (!mengkonfirmasi.equalsIgnoreCase("ya")) {
            System.out.println("Anda membatalkan pemesanan.");
            return;
        }
    }

    @Override
    public void prosesPengerjaan() {
        Scanner scanner = new Scanner(System.in);

        // Proses pengerjaan jasa edit
        System.out.print("Apakah hasil edit sudah sesuai ? (ya/tidak): ");
        String completionMengkonfirmasi = scanner.nextLine();

        if (completionMengkonfirmasi.equalsIgnoreCase("ya")) {
            System.out.println("Pengerjaan telah selesai. Terima kasih!");
            selesai = true;
        } else if (completionMengkonfirmasi.equalsIgnoreCase("tidak")) {
            System.out.println("Pengerjaan dibatalkan.");
            selesai = true;
        } else {
            System.out.println("Silakan melanjutkan pengerjaan jasa edit.");
        }
    }


    @Override
    public boolean selesaiPengerjaan() {
        return selesai;
    }
}

class PremierePro implements Jasa {
    private static final int HARGA = 750000;
    private static final String KATEGORI = "Basic Video Editing";
    private boolean selesai = false;

    @Override
    public void pemilihanKatergori() {
        System.out.println("Anda memilih kategori: Adobe Premiere Pro");
    }
    @Override
    public void pemilihanHarga() {
        Scanner scanner = new Scanner(System.in);

        // Konfirmasi 1
        System.out.print("Apakah Anda ingin melanjutkan? (ya/tidak): ");
        String mengkonfirmasi = scanner.nextLine();

        if (!mengkonfirmasi.equalsIgnoreCase("ya")) {
            System.out.println("Pengerjaan dibatalkan.");
            return;
        } else if (mengkonfirmasi.equalsIgnoreCase("tidak")) {
            System.out.println("Pengerjaan dibatalkan.");
            selesai = true;
            return;
        }

        System.out.println("Harga jasa untuk " + KATEGORI + ": Rp " + HARGA);

        // Konfirmasi 2
        System.out.print("Apakah Anda yakin ingin melanjutkan pengerjaan? (ya/tidak): ");
        mengkonfirmasi = scanner.nextLine();
        System.out.println("Mohon tunggu...");
        if (!mengkonfirmasi.equalsIgnoreCase("ya")) {
            System.out.println("Anda membatalkan pemesanan.");
            return;
        }
    }
    @Override
    public void prosesPengerjaan() {

        // Proses pengerjaan jasa edit
        System.out.print("Apakah hasil edit sudah sesuai ? (ya/tidak): ");
        Scanner scanner = new Scanner(System.in);
        String completionMengkonfirmasi = scanner.nextLine();

        if (completionMengkonfirmasi.equalsIgnoreCase("ya")) {
            System.out.println("Pengerjaan telah selesai. Terima kasih!");
            selesai = true;
        } else if (completionMengkonfirmasi.equalsIgnoreCase("tidak")) {
            System.out.println("Pengerjaan dibatalkan.");
            selesai = true;
        } else {
            System.out.println("Silakan melanjutkan pengerjaan jasa edit.");
        }
    }

    @Override
    public boolean selesaiPengerjaan() {
        return selesai;
    }
}

class AfterEffects implements Jasa {
    private static final int HARGA = 7500000;
    private static final String KATEGORI = "Motion Graphics";
    private boolean selesai = false;

    @Override
    public void pemilihanKatergori() {
        System.out.println("Anda memilih kategori: Adobe After Effects");
    }

    @Override
    public void pemilihanHarga() {
        Scanner scanner = new Scanner(System.in);

        // Konfirmasi 1
        System.out.print("Apakah Anda ingin melanjutkan? (ya/tidak): ");
        String mengkonfirmasi = scanner.nextLine();

        if (!mengkonfirmasi.equalsIgnoreCase("ya")) {
            System.out.println("Pengerjaan dibatalkan.");
            return;
        } else if (mengkonfirmasi.equalsIgnoreCase("tidak")) {
            System.out.println("Pengerjaan dibatalkan.");
            selesai = true;
            return;
        }

        System.out.println("Harga jasa untuk " + KATEGORI + ": Rp " + HARGA);

        // Konfirmasi 2
        System.out.print("Apakah Anda yakin ingin melanjutkan pengerjaan? (ya/tidak): ");
        mengkonfirmasi = scanner.nextLine();
        System.out.println("Mohon tunggu...");
        if (!mengkonfirmasi.equalsIgnoreCase("ya")) {
            System.out.println("Anda membatalkan pemesanan.");
            return;
        }
    }

    @Override
    public void prosesPengerjaan() {

        // Proses pengerjaan jasa edit
        System.out.print("Apakah hasil edit sudah sesuai ? (ya/tidak): ");
        Scanner scanner = new Scanner(System.in);
        String completionMengkonfirmasi = scanner.nextLine();

        if (completionMengkonfirmasi.equalsIgnoreCase("ya")) {
            System.out.println("Pengerjaan telah selesai. Terima kasih!");
            selesai = true;
        } else if (completionMengkonfirmasi.equalsIgnoreCase("tidak")) {
            System.out.println("Pengerjaan dibatalkan.");
            selesai = true;
        } else {
            System.out.println("Silakan melanjutkan pengerjaan jasa edit.");
        }
    }

    @Override
    public boolean selesaiPengerjaan() {
        return selesai;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int layananKategori;
        Jasa layananPengerjaan = null;

        do {
            System.out.println("===== Layanan Adobe Creative Service =====");
            System.out.println(" 1. Adobe Photoshop");
            System.out.println(" 2. Adobe Premiere Pro");
            System.out.println(" 3. Adobe After Effect");
            System.out.println(" 4. Selesai");

            System.out.print("Masukkan pilihan Anda (1-4): ");
            layananKategori = scanner.nextInt();

            switch (layananKategori) {
                case 1:
                    layananPengerjaan = new Photoshop();
                    break;
                case 2:
                    layananPengerjaan = new PremierePro();
                    break;
                case 3:
                    layananPengerjaan = new AfterEffects();
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-4.");
                    break; // Tambahkan break di sini
            }

            if (layananPengerjaan != null && layananKategori != 4) {
                layananPengerjaan.pemilihanKatergori();
                layananPengerjaan.pemilihanHarga();
                layananPengerjaan.prosesPengerjaan();

                if (!layananPengerjaan.selesaiPengerjaan()) {
                    // Konfirmasi pesanan sesuai
                    System.out.print("Apakah pesanan Anda sudah sesuai? (ya/tidak): ");
                    String konfirmasiPengerjaan = scanner.next();

                    if (konfirmasiPengerjaan.equalsIgnoreCase("ya")) {
                        System.out.println("Jasa edit selesai. Terima kasih!");
                    } else {
                        System.out.println("Silakan sampaikan revisi yang diperlukan.");
                    }
                }
            }

        } while (layananKategori != 4 && (layananPengerjaan == null || !layananPengerjaan.selesaiPengerjaan()));

        scanner.close();
    }
}
