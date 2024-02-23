package org.example.junittest;

public class SimpleMethod {
    public static boolean isBlank(String input) {
      return input == null || input.trim().isEmpty();
    }

    public int multiply(int x,int y){
        return Math.multiplyExact(x, y);
    }
}
