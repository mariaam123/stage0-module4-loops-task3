package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int lat = 1;
        int form = 0;

        for(int i = 1; i<=lastFibonacci; i++){
            System.out.println(form);
            form = lat;
            lat = i;
        }
    }
}
