package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        if (lengthOfLastNumber == 0){
            System.out.println(0);
            return;
        }

        var num = "";
        int sum = 0;
        for(int i = 0; i< lengthOfLastNumber; i++){

            num +="9";
            sum += Integer.parseInt(num);}

        System.out.println(sum);

    }
}
