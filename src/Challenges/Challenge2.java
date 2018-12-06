package Challenges;

import java.util.ArrayList;

public class Challenge2 extends Challenge {
	
	public final static String DAY2FILE = "./src/FileInputs/challenge2.txt";

	public Challenge2() {
		super(DAY2FILE);
	}

	public void runChallenge() {
		System.out.println("Challange 2 starting");
		partOne();
		partTwo();
	}
	
	@Override
	void partOne() {
		int twoCount = 0;
		int threeCount = 0;
		
		for(String s : this.input) {
			
			boolean two = false;
			boolean three = false;
			
			for(int i = 0; i < s.length(); i ++) {
				char ch = s.charAt(i);

				if(countChar(s, ch) == 2) {
					two = true;
				}
				
				if(countChar(s, ch) == 3) {
					three = true;
				}
			}
			
			if(two) {
				twoCount++;
			}
			
			if(three) {
				threeCount++;
			}
		}
		
		System.out.println("The checksum is: " + twoCount * threeCount);
	}

	@Override
	void partTwo() {
		ArrayList<String> previous = new ArrayList<String>();
		
		for(String s : this.input) {
			
			for(String previousStr : previous) {
			ArrayList<Character> characterList = new ArrayList<Character>();
			
			
				for(int i = 0 ; i < s.length(); i++) {
					if(previousStr.charAt(i) == s.charAt(i)) {
						characterList.add(s.charAt(i));
					}
				}
				
				if(characterList.size() == s.length() - 1) {
					for(char c : characterList) {
						System.out.print(c);
					}
				}
			}
			
			previous.add(s);
		}
		
	}
	
	public int countChar(String inputString, char ch) {
		int count = 0;
		
		for(int i = 0; i < inputString.length(); i++) {
			if(inputString.charAt(i) == ch) {
				count++;
			}
		}
		
		return count;
	}
}
