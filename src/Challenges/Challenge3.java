package Challenges;

import Challanges.ChallangeObjects.Fabric;

public class Challenge3 extends Challenge {

	public final static String DAY3FILE = "./src/FileInputs/challenge3.txt";
	
	public final static int MAX_FABRIC_SIZE = 1000;

	public Challenge3() {
		super(DAY3FILE);
	}

	public void runChallenge() {
		System.out.println("Challange 3 starting");
		partOne();
		partTwo();
	}
	
	@Override
	void partOne() {
		int[][] fabricPatch = new int [MAX_FABRIC_SIZE][MAX_FABRIC_SIZE];
		
		for(String s : this.input) {
			Fabric fabric = new Fabric();
			fabric.createFabric(s);
			
			for(int i = fabric.getTopStart(); i < fabric.getTopStart() + fabric.getHeight(); i++) {
				for(int j = fabric.getLeftStart(); j < fabric.getLeftStart() + fabric.getWidth(); j++) {
					fabricPatch[i][j]++;
				}
			}
		}
		
		int result = 0;
		for(int i = 0; i < MAX_FABRIC_SIZE; i++) {
			for(int j = 0; j < MAX_FABRIC_SIZE; j++) {
				if(fabricPatch[i][j] > 1) {
					result++;
				}
			}
		}
		
		System.out.print("Total overlaps: " + result );
	}
	

	@Override
	void partTwo() {

	}

}
