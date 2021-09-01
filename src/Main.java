import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int sumOfEvens(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0 ) {
                sum+= array[i];
            }
        }
        return sum;
    }
}
