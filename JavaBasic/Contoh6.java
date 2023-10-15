package JavaBasic;

public class Contoh6 {
        public static void main(String[] args) {
            int nomorPunggung = 91; // Ganti dengan nomor punggung pemain yang Anda inginkan
            
            if (nomorPunggung % 2 == 0) {
                if (nomorPunggung >= 50 && nomorPunggung <= 100) {
                    System.out.println("Pemain adalah target attacker dan berhak menjadi kapten tim.");
                } else {
                    System.out.println("Pemain adalah target attacker.");
                }
            } else {
                if (nomorPunggung > 90) {
                    System.out.println("Pemain adalah Playmaker.");
                } else if (nomorPunggung % 3 == 0 && nomorPunggung % 5 == 0) {
                    System.out.println("Pemain adalah keeper.");
                } else {
                    System.out.println("Pemain adalah defender.");
                }
            }
        }
    }
    

