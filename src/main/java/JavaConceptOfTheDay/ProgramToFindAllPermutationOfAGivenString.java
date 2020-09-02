package JavaConceptOfTheDay;

//The given concept is pretty nicely explained on https://www.youtube.com/watch?v=TnZHaH9i6-0

public class ProgramToFindAllPermutationOfAGivenString {

	public static void main(String[] args) {
		String inputString="abc";
		calculate(inputString,0,inputString.length()-1);
	}

	public static void calculate(String str,int left,int right){
		if(left==right){
			System.out.println(str);
		}
		else{
			for(int i=left;i<=right;i++){
				String swappedString=swap(str,left,i);
				calculate(swappedString,left+1,right);
			}
		}
	}

	public static String swap(String str, int i, int j){
		char [] stringArray=str.toCharArray();
		char temp;
		temp=stringArray[i];
		stringArray[i]=stringArray[j];
		stringArray[j]=temp;
		return String.valueOf(stringArray);
	}
}
