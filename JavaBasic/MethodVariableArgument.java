package JavaBasic;

public class MethodVariableArgument {
    
    public static void main(String[] args) {
        int[] valuess = {80, 80, 80, 80, 80};
        sayCongrats("Sehun", valuess);

        // dengan args int... bisa langsung masukan value
        sayCongrats("Alexa",90, 90, 90, 90);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;

        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus ");
        } else {
            System.out.println("Maaf" + name + ", Anda Tidak Lulus"); 
        }
    }
}
