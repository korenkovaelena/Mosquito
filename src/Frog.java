import java.util.Random;

public class Frog {
  public void catchMosquito(Mosquito[] arr){
      Random random = new Random();
      int i = random.nextInt(0, arr.length);
      if (arr[i].alive) {
          System.out.println("Ква");
          arr[i].alive = false;
      }
      else
          System.out.println("Mosquito is dead");

  }
}
