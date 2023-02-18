import entities.Stack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        try(BufferedReader br = new BufferedReader(new FileReader("src/file.txt"))){
            String value = br.readLine();

            while (value != null){
                stack.push(Integer.parseInt(value));
                value = br.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(stack);
        System.out.println("Value removed fom top: " + stack.pop());
        System.out.println("New top node: " + stack.top());


    }
}