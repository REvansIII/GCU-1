package exercises4;
//exercise 10.1

import java.util.*;

class Time {

	long hours;
	long minutes;
	long seconds;
	long elapseTime;
    long currentMills;
	
	
	// construct Time in current milliseconds
	public Time() {
		currentMills = System.currentTimeMillis();
		
		
	}

	// construct Time with specified hour, minute, second
	public Time(long elapseTime) {
		long totalSeconds = elapseTime / 1000;
		this.seconds = (int) totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		this.minutes = (int) totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		this.hours = (int) totalHours % 24;

	}

	// construct object current Time
	public Time(int i) {
		long totalSeconds = currentMills / 1000;
		this.seconds = (int) totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		this.minutes = (int) totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		this.hours = (int) totalHours % 24;
	}

	public void setTime (long elapseTime) {
		// Obtain the total seconds
		long totalSeconds = elapseTime / 1000;

		// Compute the current second in the minute in the hour
		seconds = (int) totalSeconds % 60;

		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the current minute in the hour
		minutes = (int) totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// Compute the current hour
		hours = (int) totalHours % 24;

	}

	public long getHours() {
		return hours;
	}

	public long getMinutes() {
		return minutes;
	}

	public long getSeconds() {
		return seconds;
	}

	
	public String toString() {
		return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
	}
}
