import java.util.Arrays;

public class Varags {

public static void numbers(int ... no){
    System.out.println(Arrays.toString(no));
}

    public static void letters(String ... str){
        System.out.println(Arrays.toString(str));
    }

    public static void intarr(int[] ... numbers){
        System.out.println(numbers.length);
        for(int [] number : numbers){
            System.out.println(Arrays.toString(number));
        }

    }

    public static void main(String args[])
    {
        numbers(5,4,5,7,8);
        letters("Hi","Vishesh","Gupta");
        intarr(new int[] {1,2,4},new int[] {3,4,5},new int[] {5,6,7});

    }
}
