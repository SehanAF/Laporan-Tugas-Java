package JavaBasic.src_uts;

public class OperasiBoolean {
    public static void main(String[] args) {
        
        var nilaiAbsen = 70;
        var nilaiUjian = 80;

        var lulusAbsen = nilaiAbsen >= 60;
        var lulusUjian = nilaiUjian >= 65;

        var lulus = lulusAbsen && lulusUjian;
        System.out.println(lulus);


    }
}
