package Challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge1 extends Challenge  {
			
	public final static String DAY1FILE = "./src/FileInputs/challenge1.txt";
	
	public Challenge1() {
		super(DAY1FILE);
	}
	
	public void runChallenge() {
		System.out.println("Challange 1 starting");
		partOne();
		partTwo();
	}
	
	@Override
	public void partOne(){
		int freq = 0;
		
		for(String s : this.input) {
			freq += Integer.parseInt(s);
		}
		
		System.out.println("The frequencey is: " + freq);
	}
	
	@Override
	public void partTwo() {
		List<Integer> frequencies = new ArrayList<Integer>();
		boolean stop = false;
		int frequency = 0;
		frequencies.add(frequency);
		
		while(!stop) {
			for(String s : this.input) {
				frequency += Integer.parseInt(s);
                if (frequencies.contains(frequency)) {
                    System.out.println("the first dupe is: " + frequency);
                    stop = true;
                    break;
                }
                frequencies.add(frequency);
			}
		}
	}
}
