package JavaBasic;

public class MethodParameter {
    
    public static void main(String[] args) {
        
       sayHello("Sehun", "Alfarisi");
       sayHello("Alves", "Givi");
       sayHello("Alexa", "Modric");
        
    }

    static void sayHello(String firstName, String secondName) {
        System.out.println("Hello " + firstName + " " + secondName);
    }
}
