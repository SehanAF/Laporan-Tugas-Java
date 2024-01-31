package JavaBasic;

import java.util.Stack;


public class Stack0 {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Stack<String> animals= new Stack<>();

        boolean result = stk.empty();
        System.out.println("Apakah stack kosong? " + result);

        stk.push(81);
        stk.push(23);
        System.out.println("Element dalam Stack "+ stk);

        stk.push(99);
        System.out.println("Element dalam Stack "+ stk);


        stk.pop();
        System.out.println("Element dalam Stack setelah pop "+ stk);

        // peek = untuk melihat item paling atas
        System.out.println("Ini item paling atas "+ stk.peek());

        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        animals.pop();
        System.out.println("Ini element setelah pop "+ animals);

        System.out.println("Dimanakah lokasinya? " + animals.search("Dog"));

        
    }
}
