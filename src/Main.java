public class Main {
    public static void main(String[] args) {
      Mosquito[] arr = new Mosquito[12];
      for (int i = 0; i<arr.length; i++){
          arr[i] = new Mosquito();

      }
      Frog frog = new Frog();
        frog.catchMosquito(arr);
        frog.catchMosquito(arr);
        frog.catchMosquito(arr);
        frog.catchMosquito(arr);
        frog.catchMosquito(arr);
        frog.catchMosquito(arr);
        frog.catchMosquito(arr);
        frog.catchMosquito(arr);
        frog.catchMosquito(arr);
        frog.catchMosquito(arr);
        frog.catchMosquito(arr);
        frog.catchMosquito(arr);
    }
}