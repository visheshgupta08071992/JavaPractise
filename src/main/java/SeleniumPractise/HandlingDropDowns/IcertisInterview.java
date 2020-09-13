package SeleniumPractise.HandlingDropDowns;

public class IcertisInterview {

	public static void main(String[] args) {

		String inputString = "Let's meet l8r 2nite?";

		StringBuilder result = new StringBuilder();
		String prev=" ";
		for(Character c : inputString.toCharArray()){

			if(!Character.isLetter(c)){
				prev = c.toString();
				result.append(c);
			}
			else{
				if(!prev.equals("*")) {
					prev = "*";
					result.append("*");
				}
			}
		}
		System.out.println(result.toString());
	}

	public String replaceWords(String inputString){

		StringBuilder result = new StringBuilder();
		String prev=" ";
		for(Character c : inputString.toCharArray()){

			if(!Character.isLetter(c)){
				prev = c.toString();
				result.append(c);
			}
			else{
				if(!prev.equals("*")) {
					prev = "*";
					result.append("*");
				}
			}
		}
		return result.toString();
	}
}
