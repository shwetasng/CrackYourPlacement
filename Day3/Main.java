package Day3;

// SOLUTION-1: Using Hashing

/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;

class GFG 
{
  
  // Java program to count all duplicates
  // from string using maps
  static void printDups(String str)
  {
    Map<Character, Integer> count = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      if(count.containsKey(str.charAt(i)))
        count.put(str.charAt(i) , count.get(str.charAt(i))+1); 
      else count.put(str.charAt(i),1);
      //increase the count of characters by 1 
    }

    for (Map.Entry<Character,Integer> mapElement : count.entrySet()) {   //iterating through the unordered map 
      if (mapElement.getValue() > 1)   //if the count of characters is greater than 1 then duplicate found
        System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
    }
  }

  /* Driver program to test above function*/
  public static void main(String args[])
  {
    String str = "test string";
    printDups(str);
  }
}


// SOLUTION-2: Using Sorting

// Java code to implement the above approach
import java.util.*;

public class Main {

    public static void printDuplicates(String str)
    {
        int len = str.length();

        // Sorting the string
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);

        // Loop through the sorted string to find duplicates
        for (int i = 0; i < len; i++) {
            int count = 1;

            // Counting the occurrences of each character
            while (i < len - 1
                   && sortedStr.charAt(i)
                          == sortedStr.charAt(i + 1)) {
                count++;
                i++;
            }

            // Printing the duplicate character and its
            // count
            if (count > 1) {
                System.out.println(sortedStr.charAt(i)
                                   + ", count = " + count);
            }
        }
    }

    public static void main(String[] args)
    {
        String str = "test string";
        printDuplicates(str);
    }
}
// This code is contributed by rutikbhosale


