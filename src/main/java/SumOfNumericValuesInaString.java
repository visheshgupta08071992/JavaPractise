//Given String He3llo5H11........Output should be sum of all numeric values within string i.e 10



public class SumOfNumericValuesInaString {

    public static void sum(){
        String input="He3llo5H11";
        int sum=0;
        for(int i=0;i<input.length();i++){
            if (Character.isDigit(input.charAt(i))){
                sum=sum + Character.getNumericValue(input.charAt(i));
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sum();
    }
}
