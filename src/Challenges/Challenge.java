package Challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A base challenge class which deals with file handling and producing an ArrayList<String>
 * of the expected input
 * 
 * @author GaryMalone
 *
 */
public abstract class Challenge {
	public ArrayList<String> input = new ArrayList<String>();
	
	public Challenge(String fileName) {
		readFile(fileName);
	}
	
	abstract void partOne();
	
	abstract void partTwo();
	
	public void readFile(String fileName) {
		try {
			Scanner reader;
			reader = new Scanner(new File(fileName));
			while(reader.hasNext()) {
				String line = reader.nextLine();
				this.input.add(line);
			}
			
			reader.close();
			reader = null;
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
