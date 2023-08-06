package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int bigger = first > second ? first : second;
        int result = 1;

        for (int i = 1; i <= bigger; i++) {
            if (first % i == 0 && second % i == 0) {
                result = i;
            }
        }
        System.out.println(result);

    }
    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        int first = 20;
        int second = 40;
        greatestCommonDivisor.printGCD(first,second);
    }
}