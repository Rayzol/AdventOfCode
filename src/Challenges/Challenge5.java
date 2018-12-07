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
			for(int i = 0; i < s.length(); i++) {
				
				//is the current and next character the same letter but different cases?
				if(i + 2 < s.length() && s.substring(i, i + 1).toLowerCase().equals(s.substring(i + 1, i + 2).toLowerCase()) &&
						!s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
					
					String substring = s.substring(i, i + 1) + s.substring(i + 1, i + 2);
					s = s.replace(substring, "");
					
					//set the iterator to the start
					i = -1; 
					System.out.print("The length string is: " + s.length() +"\n");

				}
			}
			
			System.out.print("The length of the finished string is: " + s.length());
		}

	}

	@Override
	void partTwo() {
		// TODO Auto-generated method stub

	}

}
