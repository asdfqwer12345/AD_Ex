package sw01;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Task {
    private static final Logger LOG = LogManager.getLogger();
    private static int task1Counter = 0;
    private static int task2Counter = 0;
    private static int task3Counter = 0;

    public static void task(int n){
        task1(); task1(); task1();
        for(int i = 0;i<n;i++){
            task2();task2(); task2();
            for(int j = 0; j<n;j++){
                task3(); task3();
            }
        }
        LOG.info("Task1 Counter: " + task1Counter);
        LOG.info("Task2 Counter: " + task2Counter);
        LOG.info("Task3 Counter: " + task3Counter);

    }

    private static void task1(){
        task1Counter++;
    }

    private static void task2(){
        task2Counter++;
    }

    private static void task3(){
        task3Counter++;
    }
}
