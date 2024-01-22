package Bt2_StopWatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ClientTest {
    public static void main(String[] args) {
        StopWatch dem = new StopWatch();
        ArrayList<Integer> list = new ArrayList<>(100000);
        Random soInt = new Random();
        for (int i = 0; i < 100000; i++) {
            list.add(soInt.nextInt(100000));
        }
//        System.out.println(list);

        dem.start();
        System.out.println("tg start: "+dem.getStarTime());

        Collections.sort(list);
        dem.stop();
        System.out.println("tg stop: "+dem.getEndTime());
        System.out.println("tg chạy là: "+dem.getElapsedTime());

//        System.out.println("list sau khi sắp xếp là: \n"+list);
    }
}
