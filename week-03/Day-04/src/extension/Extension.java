package extension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Extension {

  int add(int a, int b) {
    a = 2;
    b = 3;
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c) {
      return 1;
    } else if (b > a && b > c){
      return 2;
    } else{
      return 3;
    }
  }

  int median(List<Integer> pool) {
    if (pool == null || pool.isEmpty())
      return -1;
    Collections.sort(pool);
    int median;
    if (pool.size() % 2 == 0){
      median = (pool.get(pool.size()/2 -1) + pool.get(pool.size()/2 -1))/2;
    }else{
      median = pool.get(pool.size()/2);
    }
    return median;
  }


  boolean isVowel(char c) {
    c = Character.toLowerCase(c);

    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    if (hungarian ==null || hungarian.isEmpty()){
      return null;
    }
    String teve ="";

    for (int i = 0; i < hungarian.length(); i++) {
      //char c = teve.charAt(i);
      if (isVowel(hungarian.charAt(i))) {
        teve += hungarian.charAt(i) + "v" + hungarian.charAt(i);
      }else {
        teve+= hungarian.charAt(i);
      }
    }
    return teve;
  }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed
