import java.util.ArrayList;
import java.util.function.IntUnaryOperator;

public class Main {
    // write the nextOddNum here
    public static NextOdd nextOddNum = (num) -> {
        return num % 1 ;
    };



    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
    }
}
@FunctionalInterface
interface NextOdd {
    int applyAsInt(int num);
}





