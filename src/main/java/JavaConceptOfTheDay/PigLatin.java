package JavaConceptOfTheDay;

import java.util.Arrays;

import org.testng.annotations.Test;

public class PigLatin {

	/*Challenge #0
	Pig Latin is an English language game that alters a word based on simple rules.
	Translate a word beginning with a vowel into Pig Latin.
	As a user I can enter a word “apples” and see it translated to “applesay”

	Challenge #1
	Translate a word beginning with a consonant into Pig Latin.
	As a user I can enter a word “bird” and see it translated to “irdbay”

	Challenge #2
	A ​phrase is made up of several words, all lowercase, split by a single space. Translate a whole phrase into
	Pig Latin.
	As a user I can enter a phrase “delicious apples” and see it translated to “eliciousday applesay”

	Challenge #3
	Titlecase input should yield a titlecase output.
	As a user I can enter a phrase “Hello World” and see it translated to “Ellohay Orldway”
	Challenge #4
	Handle punctuations - commas, fullstops, exclamations, semicolons.
	As a user I can enter a phrase “Hello, World!” and see it translated to "Ellohay, Orldway!”

	Challenge #5
	Handle consonant clusters:
	a. “kn”, “qu”, “th”, “str” at the beginning of the word behaves as a single consonant.
	As a user I can enter a phrase “knights strike quickly" and see it translated to “ightsknay ikestray
	icklyquay"
	b. “xr” and “yt” at the beginning of the word as a single vowel.
	As a user I can enter a word “yttrium” and see it translated to “yttriumay”*/


	@Test
	public void pigLatin(){
		String [] inputArray=new String[]{"delicious apples","Hello World"};
		String [] outputArray=pigLatinSolution(inputArray);
		System.out.println(Arrays.toString(outputArray));

	}

	public String[] pigLatinSolution(String [] inputArray){

		String input;
		String [] outputArray=new String[inputArray.length];
		for(int i=0;i<=inputArray.length-1;i++){

			input=inputArray[i];
			if(input.contains(" ")){
				String [] inputAgainstSpace=input.split(" ");
				String separatedString1AfterSpace;
				String separatedString2AfterSpace;
				for(int j=0;j<=inputAgainstSpace.length-1;j++){
					String inputWithoutSpace=inputAgainstSpace[j];
					if(inputWithoutSpace.startsWith("a")||inputWithoutSpace.startsWith("e")||inputWithoutSpace.startsWith("i")||inputWithoutSpace.startsWith("o")||inputWithoutSpace.startsWith("u")){
						inputWithoutSpace=inputWithoutSpace+"ay";
						separatedString1AfterSpace=inputWithoutSpace;
						outputArray[i]+=separatedString1AfterSpace;
					}
					else{
						if(Character.isUpperCase(input.charAt(0))){
							inputWithoutSpace=inputWithoutSpace.substring(1)+inputWithoutSpace.charAt(0) + "ay";
							char c=Character.toUpperCase(input.charAt(0));
							inputWithoutSpace=c + inputWithoutSpace.substring(1);
							separatedString1AfterSpace=inputWithoutSpace;
							outputArray[i]+=separatedString1AfterSpace;
						}
						else{
							inputWithoutSpace=inputWithoutSpace.substring(1)+inputWithoutSpace.charAt(0) + "ay";
							char c=Character.toLowerCase(input.charAt(0));
							inputWithoutSpace=c + inputWithoutSpace.substring(1);
							separatedString1AfterSpace=inputWithoutSpace;
							outputArray[i]+=separatedString1AfterSpace;
						}
					}

				}
			}
			else {
				if (input.startsWith("a") || input.startsWith("e") || input.startsWith("i") || input.startsWith("o") || input.startsWith("u")) {
					input = input + "ay";
					outputArray[i] = input;
				} else {
					if (Character.isUpperCase(input.charAt(0))) {
						input = input.substring(1) + input.charAt(0) + "ay";
						char c = Character.toUpperCase(input.charAt(0));
						input = c + input.substring(1);
						outputArray[i] = input;
					} else {
						input = input.substring(1) + input.charAt(0) + "ay";
						char c = Character.toLowerCase(input.charAt(0));
						input = c + input.substring(1);
						outputArray[i] = input;
					}
				}
			}
		}
		return outputArray;
	}
}
