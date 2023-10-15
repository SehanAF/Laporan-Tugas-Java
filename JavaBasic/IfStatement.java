package JavaBasic;

public class IfStatement {
    
   public static void main(String[] args) {
    
        var nilai = 70;
        var absen = 80;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;

        var lulus = lulusNilai && lulusAbsen;
        System.out.println(lulus);

        if(nilai >= 75 && absen >= 80) {
            System.out.println("Selamat anda Lulus");
        } 
        else { // Kode: Else Statement
            System.out.println("Silahkan coba lagi tahun depan");   
        }

        //-----------------------------------//

        if(nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        }
        else if(nilai >= 70 && absen >= 79) {
            System.out.println("Nilai Anda B");  
        }
         else if(nilai >= 60 && absen >= 69) {
            System.out.println("Nilai Anda C");  
        }
         else if(nilai >= 50 && absen >= 69) {
            System.out.println("Nilai Anda D");  
        }
         else if(nilai >= 0 && absen >= 49) {
            System.out.println("Nilai Anda E");  
        }
         else { // Kode: Else Statement
            System.out.println("Silahkan coba lagi tahun depan");   
        }

    }

}
