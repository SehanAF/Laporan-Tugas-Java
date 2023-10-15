package JavaBasic;

public class SwitchStatement {
    public static void main(String[] args) {
        
        var nilai = "H";

        switch (nilai) {
            case "A":
                System.out.println("Wow, anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");    
                break;
            case "D":
                System.out.println("Anda tidak lulus");
            default:
                System.out.println("Mungkin anda salah jurusan");      
        }

        // This Switch Lambda (short)
        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah Jurusan");
            }
        }
        // Switch dengan tanpa Yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Nilai anda cukup baik";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> {
                ucapan = "Mungkin anda salah Jurusan";
            }
        }

        System.out.println(ucapan);

        // Switch dengan Yield (rekomendasi)
        ucapan = switch (nilai) {
            case "A": 
                yield "Wow, Anda lulus dengan baik";
            case "B", "C": 
                yield "Nilai anda cukup baik";
            case "D": 
                yield "Anda tidak lulus";
            default:
                yield "Mungkin anda salah Jurusan";
            
        };

        System.out.println(ucapan);
    }   
}
