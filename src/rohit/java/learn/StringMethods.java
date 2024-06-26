package rohit.java.learn;

import java.util.ArrayList;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String firstName= "Papa Mummy Madhu Rahul Rohit";
        ArrayList<String> family = new ArrayList<>();
        family.add("Papa");
        family.add("Maa");
        family.add("Madhu");
        family.add("Rahul");
        family.add("Rohit");
        System.out.println(family.indexOf("Rahul"));
    }
}
