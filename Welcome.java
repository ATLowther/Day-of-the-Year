package demo;



public class Welcome {

	public static void main(String[] args) {
		
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;	
		long currentMinute = totalMinutes % 60;		
		
		long totalHours = totalMinutes / 60;
		long currentHour = (totalHours -5) % 24;			
				
		
		long totalDays = totalHours / 24;
		long currentDay = totalDays % 365;
				
		
		long totalYears = totalDays / 365;
		long currentYear = 1970  + totalYears;
		
		long firstYear = 1970;
		long leapYearCount = 0;		
		while (firstYear < currentYear) {
			if ((firstYear % 4 == 0) && !(firstYear % 100 == 0)) {
				leapYearCount++;
			}
			if ((firstYear % 4 == 0) && (firstYear % 100 == 0) && (firstYear % 400 == 0)) {
				leapYearCount++;
			}
			firstYear++;
			
		}
		
		
		boolean thisYear = false;
		
		thisYear = ((currentYear % 4 == 0) && !(currentYear % 100 == 0))
				? true : false;
		thisYear = ((currentYear % 4 == 0) && (currentYear % 100 == 0) && (currentYear % 400 == 0))
				? true : false;
		
		
		String currentMonth = "None";
		long dayInMonth = 1;
		currentDay -= leapYearCount;
		
		
		if (thisYear == true)	{				
			if ((0 < currentDay) && (currentDay <= 31)) {
				currentMonth = "January";				
			}
			else if ((31 < currentDay) && (currentDay <= 59)) {
				currentMonth = "February";
				dayInMonth = currentDay - 31;
			}
			else if ((59 < currentDay) && (currentDay <= 90)) {
				currentMonth = "March";
				dayInMonth = currentDay - 59;
			}
			else if ((90 < currentDay) && (currentDay <= 120)) {
				currentMonth = "April";
				dayInMonth = currentDay - 90;
			}
			else if ((120 < currentDay) && (currentDay <= 151)) {
				currentMonth = "May";
				dayInMonth = currentDay - 120;
			}
			else if ((151 < currentDay) && (currentDay <= 181)) {
				currentMonth = "June";
				dayInMonth = currentDay - 151;
			}
			else if ((181 < currentDay) && (currentDay <= 212)) {
				currentMonth = "July";
				dayInMonth = currentDay - 181;
			}
			else if ((212 < currentDay) && (currentDay <= 243)) {
				currentMonth = "August";
				dayInMonth = currentDay - 212;
			}
			else if ((243 < currentDay) && (currentDay <= 273)) {
				currentMonth = "September";
				dayInMonth = currentDay - 243;
			}
			else if ((273 < currentDay) && (currentDay <= 304)) {
				currentMonth = "October";
				dayInMonth = currentDay - 273;
			}
			else if ((304 < currentDay) && (currentDay <= 334)) {
				currentMonth = "November";
				dayInMonth = currentDay - 304;
			}
			else {
				currentMonth = "December";
				dayInMonth = currentDay - 334;
			}
		}
		else {				
			if ((0 < currentDay) && (currentDay <= 31)) {
				currentMonth = "January";				
			}
			else if ((31 < currentDay) && (currentDay <= 60)) {
				currentMonth = "February";
				dayInMonth = currentDay - 31;
			}
			else if ((60 < currentDay) && (currentDay <= 91)) {
				currentMonth = "March";
				dayInMonth = currentDay - 60;
			}
			else if ((91 < currentDay) && (currentDay <= 121)) {
				currentMonth = "April";
				dayInMonth = currentDay - 91;
			}
			else if ((121 < currentDay) && (currentDay <= 152)) {
				currentMonth = "May";
				dayInMonth = currentDay - 121;
			}
			else if ((152 < currentDay) && (currentDay <= 182)) {
				currentMonth = "June";
				dayInMonth = currentDay - 152;
			}
			else if ((182 < currentDay) && (currentDay <= 213)) {
				currentMonth = "July";
				dayInMonth = currentDay - 182;
			}
			else if ((213 < currentDay) && (currentDay <= 244)) {
				currentMonth = "August";
				dayInMonth = currentDay - 213;
			}
			else if ((244 < currentDay) && (currentDay <= 274)) {
				currentMonth = "September";
				dayInMonth = currentDay - 244;
			}
			else if ((274 < currentDay) && (currentDay <= 305)) {
				currentMonth = "October";
				dayInMonth = currentDay - 274;
			}
			else if ((305 < currentDay) && (currentDay <= 335)) {
				currentMonth = "November";
				dayInMonth = currentDay - 305;
			}
			else {
				currentMonth = "December";
				dayInMonth = currentDay - 335;
			}
		}
		
		
		System.out.println("Today is " + currentMonth + " " 
		+ dayInMonth + ", " + currentYear);		
		System.out.format("Current time is " + "%02d" + ":" + "%02d" + 
				":" + "%02d" + " EST", currentHour, currentMinute, currentSecond);
	
					
	}

}
