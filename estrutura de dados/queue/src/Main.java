import entities.Person;
import entities.Queue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();

        try(BufferedReader br = new BufferedReader(new FileReader("./src/people.txt"))){
            String line = br.readLine();

            while (line != null){
                String[] personData = line.split(",");
                Person person = new Person(personData[0], Integer.parseInt(personData[1]));
                queue.enqueue(person);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(queue);
        System.out.println("Empty? " + queue.isEmpty());
        System.out.println("Clean Queue");
        queue.clean();
        System.out.println("Empty? " + queue.isEmpty());
    }
}