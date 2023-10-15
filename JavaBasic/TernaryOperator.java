package JavaBasic;

public class TernaryOperator {
    public static void main(String[] args) {
    // menggunakan if else biasa    
        var nilai = 75;
        String ucapan;

        if (nilai >= 75){
            ucapan = "Selamat anda lulus";
        } else {
            ucapan = "Silahkan Coba lagi";
        }

        System.out.println(ucapan);

        // Menggunakan Ternary Operator (rekomendasi)

        String data = nilai > 75 ? "Selamat anda lulus" : "Silahkan coba lagi";

        System.out.println(data);

    }
}
