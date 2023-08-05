package utilis;

import java.util.Random;

public class random {
    public static int randomNumber(int size){
        Random random = new Random();
        return random.nextInt(size-1);

    }
}
