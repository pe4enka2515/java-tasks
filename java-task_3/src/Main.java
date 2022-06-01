import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception{
        SetSemaphore<Integer> one = new SetSemaphore<>();
        Thread first = new Thread(()->{
            for (int i=0; i<100; i++){
                one.add(i);
            }
        });
        Thread second = new Thread(()->{
            for (int i=0; i<100; i++){
                one.add(i);
            }
        });
        first.start();
        second.start();
        Thread.sleep(2000);

        ListLock<Integer> two = new ListLock<>();
        Thread first_2 = new Thread(()->{
            for (int i=0; i<100; i++){
                one.add(i);
            }
        });
        Thread second_2 = new Thread(()->{
            for (int i=0; i<100; i++){
                one.add(i);
            }
        });
        first_2.start();
        second_2.start();
        Thread.sleep(2000);
//        for (int id = 0; id < two.size(); id++) {
//            System.out.printf(id + " " + two.get(id)+" | ");
//        }
    }
}