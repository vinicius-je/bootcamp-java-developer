import entities.LinkedList;
import entities.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        try(BufferedReader br = new BufferedReader(new FileReader("src/people.txt"))){
            String line = br.readLine();

            while(line != null){
                String[] personData = line.split(",");
                Person p = new Person(personData[0], Integer.parseInt(personData[1]));
                list.add(p);
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(list);
        System.out.println("Size: " + list.size());

        System.out.println("Get element in the index 7: " + list.get(7));

        System.out.println("\nRemove element in the index = 3");
        list.remove(3);
        System.out.println(list);
        System.out.println("Size: " + list.size());

        System.out.println("Add three elements in the list");
        list.add(new Person("Vinicius", 23));
        list.add(new Person("Marcos", 21));
        list.add(new Person("Eduardo", 20));
        System.out.println(list);
        System.out.println("Size: " + list.size());

        System.out.println("Remove first element");
        list.remove(0);
        System.out.println("Remove last element");
        list.remove(list.size()-1);
        System.out.println(list);
        System.out.println("Size: " + list.size());
    }
}