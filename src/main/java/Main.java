import java.util.Random;
import java.lang.Math;;

public class Main {
  public static void main(String[] args) {
    Random li = new Random();
    int suma = 0;
    int liran = 0;
    for(int i = 0; i < 5; i++){
      liran = li.nextInt(100);
      System.out.println(liran);
      suma = suma + (int)Math.pow(liran, 2);
    }
    System.out.println(suma);

    
  
  }

}