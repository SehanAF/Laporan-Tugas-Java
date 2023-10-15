package JavaBasic;

public class Tugas2Sechans {

    public static void main(String[] args) {
        int nilai = 32;
        String hasil = "";

        if(nilai >= 85 && nilai <= 100){
            hasil = "A";
        }
        else if(nilai>= 75 && nilai <= 84) {
            hasil = "B";
        }
        else if(nilai >= 70 && nilai <= 74){
            hasil = "C";
        }
        else if(nilai >= 50 && nilai <= 69){
            hasil = "D";
        }
        else if(nilai >= 0 && nilai <= 49){
            hasil = "E";
        }
        else{
            hasil = "Input anda salah";
        }

        System.out.println(hasil);
    }
}
