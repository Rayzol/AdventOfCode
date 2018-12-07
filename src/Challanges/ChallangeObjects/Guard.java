package Challanges.ChallangeObjects;

import java.util.HashMap;
import java.util.Map;

public class Guard {

	public Guard(){}
	
	private int id = -1;
	private int timeSpentSleeping = 0;
	private HashMap<Integer, Integer> minuteSleepStart;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getTimeSpentSleeping() {
		return timeSpentSleeping;
	}
	
	public void setTimeSpentSleeping(int timeSpentSleeping) {
		this.timeSpentSleeping = timeSpentSleeping;
	}
	
	public HashMap<Integer, Integer> getMinuteSleepStart() {
		return minuteSleepStart;
	}

	public void setMinuteSleepStart(HashMap<Integer, Integer> minuteSleepStart) {
		this.minuteSleepStart = minuteSleepStart;
	}

	public void updateHashmap(int startMin, int finishMin) {
		if(this.minuteSleepStart == null) {
			this.minuteSleepStart = new HashMap<>();
		}
		
		for (int i = startMin; i < finishMin; i++) {
			if(!this.minuteSleepStart.containsKey(i)) {
				this.minuteSleepStart.put(i, 1);
			}
			else {
				this.minuteSleepStart.put(i, this.minuteSleepStart.get(i) + 1);
			}
		}
	}
	
	public int findMostSleptMinute() {
		int mostSleptMinuteTime = 0;
		int mostSleptMinute = 0;
		
		for(Map.Entry<Integer, Integer> min : this.minuteSleepStart.entrySet()) {
			if(min.getValue() > mostSleptMinuteTime) {
				mostSleptMinute = min.getKey();
				mostSleptMinuteTime = min.getValue();
			}
		}
		
		return mostSleptMinute;
	}
}
