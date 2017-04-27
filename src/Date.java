
public class Date  {
	private int year;
	private int month;
	private int day;



	public Date(int year, int month, int day){
		if( year >= 1900 && year <= 3000){
			this.year = year;
		}
		if(month >= 1 && month <= 12){
			this.month = month;
		}
		if(day <= 31 && day >= 1){
			this.day = day;
		}

	}
	public int getYear(){
		return year;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public int dayOfYear() {
		int totalDays = 0;
		switch (month) {
		case 12: totalDays += 30;
		case 11: totalDays += 31;
		case 10: totalDays += 30;
		case 9 : totalDays += 31;
		case 8 : totalDays += 31;
		case 7 : totalDays += 30;
		case 6 : totalDays += 31;
		case 5 : totalDays += 30;
		case 4 : totalDays += 31;
		case 3 : totalDays += 28;
		case 2 : totalDays += 31;
		} 
		totalDays += day;
		return totalDays;
	}
	
	public boolean isValidDate(int day, int month) {
		boolean isValid = true;
		
		switch (month) {
		case 1:
			if(day < 1 || day > 31)
				isValid = false;
			break;
		case 2:
			if (day < 1 || day > 28) 
				isValid = false;
			break;
		case 3:
			if(day < 1 || day > 31)
				isValid = false;
			break;
		case 4:
			if(day < 1 || day > 30)
				isValid = false;
			break;
		case 5:
			if (day < 1 || day > 31) 
				isValid = false;
			break;
		case 6:
			if(day < 1 || day > 30)
				isValid = false;
			break;
		case 7:
			if(day < 1 || day > 31)
				isValid = false;
			break;
		case 8:
			if (day < 1 || day > 31) 
				isValid = false;
			break;
		case 9:
			if(day < 1 || day > 30)
				isValid = false;
			break;
		case 10:
			if(day < 1 || day > 31)
				isValid = false;
			break;
		case 11:
			if (day < 1 || day > 30) 
				isValid = false;
			break;
		case 12:
			if(day < 1 || day > 31)
				isValid = false;
			break;
			
		default:
			isValid = false;
		
		}
		
		return isValid;
	}
	public int compare(Date dt){
		int difference = Math.abs(this.dayOfYear() + 
				365 - dt.dayOfYear() +365 ) / 30;
		if (difference > 60 ){
			return 60;
		}
		
		return difference;
		
	}
	
}


