package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        RangeSum rangeSum = new RangeSum();
        int firstBoarder = 1;
        int secondBoarder = 10;
        rangeSum.printSumInclusive(firstBoarder,secondBoarder);
    }}
