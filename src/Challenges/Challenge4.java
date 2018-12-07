package Challenges;

import java.util.ArrayList;
import java.util.Collections;
import Challanges.ChallangeObjects.Guard;

public class Challenge4 extends Challenge {

	public final static String DAY4FILE = "./src/FileInputs/challenge4.txt";

	public Challenge4() {
		super(DAY4FILE);
	}
	
	public void runChallenge() {
		partOne();
		partTwo();
	}

	@Override
	void partOne() {
		Collections.sort(this.input);
		
		ArrayList<Guard> guards = new ArrayList<Guard>();
		int currentGuardId = 0;
		int sleepStartTime = 0;
		
		for(String s : this.input) {
			int minute = Integer.parseInt(s.substring(15,17));
			
			int id;
			if(s.contains("begins")) {
				id = Integer.parseInt(s.split(" ")[3].substring(1));
				currentGuardId = id;
				Guard guard = getGuardById(guards, id);
				if(guard.getId() == -1) {
					guard.setId(id);
					guards.add(guard);
				}
			}
			if(s.contains("asleep")) {
				sleepStartTime = minute;
			}
			else if(s.contains("wakes")) {
				int totalSleepTime = minute - sleepStartTime;
				Guard guard = getGuardById(guards, currentGuardId);
				guard.updateHashmap(sleepStartTime, minute);
				guard.setTimeSpentSleeping(guard.getTimeSpentSleeping() + totalSleepTime);
			}
		}
		
		Guard maxGuard = new Guard();
		for(Guard guard : guards) {
			if(guard.getTimeSpentSleeping() > maxGuard.getTimeSpentSleeping()) {
				maxGuard = guard;
			}
		}
		
		System.out.println("guard id: " + maxGuard.getId() + " most slept minute: " + maxGuard.findMostSleptMinute());
		
		System.out.println("the answer for strategy 1 is: " + maxGuard.getId() * maxGuard.findMostSleptMinute());
	}

	@Override
	void partTwo() {

	}
	
	public Guard getGuardById(ArrayList<Guard> guards, int guardId) {
		for(Guard guard : guards) {
			if(guard.getId() == guardId) {
				return guard;
			}
		}
		return new Guard();
	}

}
