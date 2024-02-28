package Tabaosares_Java;
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        
        int[] randomIntegers = new int[5];     
        Random random = new Random();
      
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = random.nextInt(100);
        }
        
        for (int i = 0; i < randomIntegers.length; i++) {
            System.out.println("Random integer value " + "[" +(i + 1) + "]: " + randomIntegers[i]);
        }
    }
}