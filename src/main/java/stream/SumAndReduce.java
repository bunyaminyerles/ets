package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumAndReduce {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList = Arrays.asList(12,15,45,33);
        System.out.println(calculate(numberList));
        System.out.println(calculate2(numberList));
    }

    public static int calculate (List <Integer> numbers){
        int total = 0;
        for(int number: numbers){
            total+=number;
        }
        return total;
    }
    public static int calculate2 (List <Integer> numbers){
        return numbers.stream().reduce(Integer::sum).orElse(0);
    }
}
