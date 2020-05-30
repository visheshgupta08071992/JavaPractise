package Java8Practise.LambaFunction;

public class MathClass {

    public static void main(String[] args) {

        calculate(Integer::sum);
        calculate((s1,s2) -> s1-s2);
        calculate((s1,s2) -> s1*s2);
        calculate((s1,s2) -> s1/s2);
    }

    private static void calculate(MathOperation mathOperation){
        int c=mathOperation.operate(5,4);
        System.out.println(c);

    }

}
