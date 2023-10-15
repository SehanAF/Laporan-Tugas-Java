package JavaBasic;

public class ForEach {
    public static void main(String[] args) {
        
        String[] names = {
            "Sehun", "Alfarisi", "Alexa", 
            "Diamond", "Luffy"
        };

        // mengambil array dengan for(Ribet)
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }    

        System.out.println("F0R EACH");

        for(var name: names) {
            System.out.println(name);
        }    
    }
}
