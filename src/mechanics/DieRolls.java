package mechanics;

import java.util.Random;

public class DieRolls {

    private static Random random = new Random();

    public static int d4roll(){
        return random.nextInt(4) + 1;
    }

    public static int d6roll(){
        return random.nextInt(6) + 1;
    }

    public static int d8roll(){
        return random.nextInt(8) + 1;
    }

    public static int d10roll(){
        return random.nextInt(10) + 1;
    }

    public static int d12roll(){
        return random.nextInt(12) + 1;
    }

    public static int d20roll(){
        return random.nextInt(20) + 1;
    }

    public static int d100roll(){
        return random.nextInt(100) + 1;
    }
}
