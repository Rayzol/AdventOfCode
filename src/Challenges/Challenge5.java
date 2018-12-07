package Challenges;

public class Challenge5 extends Challenge {

	public final static String DAY5FILE = "./src/FileInputs/challenge5.txt";

	
	public Challenge5() {
		super(DAY5FILE);
	}

	public void runChallenge(){
		partOne();
		partTwo();
	}
	@Override
	void partOne() {
		for(String s : this.input){
			s = reductStringPolymer(s);
			System.out.print("The length of the finished string is: " + s.length() + "\n");
		}
	}

	@Override
	void partTwo() {
		for(String s : this.input){
			s = reductStringPolymer(s);
			int maxLength = s.length();
			
			//iterate through A-Z
			for(int i = 65; i <= 90; i++) {
				String newString = s;
				String characterToRemove = String.valueOf((char) i);
				newString = removeCharacter(newString, characterToRemove);
				newString = reductStringPolymer(newString);
				if(maxLength > newString.length()) {
					maxLength = newString.length();
				}
			}
			
			System.out.print("The length of the shortest string is: " + maxLength);
		}
	}
	
	public String reductStringPolymer(String s) {
		for(int i = 0; i < s.length(); i++) {
			
			//is the current and next character the same letter but different cases?
			if(i + 2 < s.length() && s.substring(i, i + 1).toLowerCase().equals(s.substring(i + 1, i + 2).toLowerCase()) &&
					!s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
				
				String substring = s.substring(i, i + 1) + s.substring(i + 1, i + 2);
				s = s.replace(substring, "");
				
				//set the iterator
				if(i - 2 < -1) {
					i = -1; 
				}
				else {
					i = i -2;
				}
			}
		}
		return s;
	}

	public String removeCharacter(String s, String characterToRemove) {
		s = s.replaceAll("["+characterToRemove.toLowerCase() + characterToRemove.toUpperCase()+"]", "");
		return s;
	}
}
