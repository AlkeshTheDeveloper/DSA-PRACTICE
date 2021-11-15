package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapPractice {


    public static void main(String[] args) {
        HashMap <String,Integer> test= new HashMap<>();
        test.put("Alkesh",1);
        test.put("jitu",2);
        test.put("deepa",3);
        test.put("kanchu",4);
        test.put("father",5);
        test.put("mother",6);

        // Print size and content of the Map
        System.out.println("Size of map is:- "
                + test.size());
        // Printing elements in object of Map
        System.out.println(test);

        // Checking if a key is present and if
        // present, print value by passing
        // random element
        System.out.println(test);

        if (test.containsKey("Alkesh")) {

            // Mapping
            Integer a = test.get("Alkesh");

            // Printing value fr the corresponding key
            System.out.println("value for key"
                    + " \"Alkesh\" is:- " + a);
        }
           test.remove("Alkesh");
      for (Map.Entry<String,Integer> E: test.entrySet()) {


          System.out.println("Keys  "+E.getKey()+" Value  "+E.getValue());

      }
    }
}
