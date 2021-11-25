package chapter5.test;

import java.text.SimpleDateFormat;

public class MyDate {
	private int day;
	private int month;
	private int year;
	private boolean isValid;
	
	public MyDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
		
	}
	
	public String isValid() {
		if(isValid) {
			return "��ȿ�� ��¥ �Դϴ�.";
		}else {
			return "��ȿ���� ���� ��¥�Դϴ�.";
		}	
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		switch(day) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				if( day < 0 || day > 31) {
					isValid = false;
				}else {
					this.day = day;
				}
				break;
			case 4: case 6: case 9: case 11:
				if( day < 0 || day > 30) {
					isValid = false;
				}else {
					this.day = day;
				}
				break;
			case 2:
				if((year %4 ==0 && year % 100 !=0) || year %4 == 0) {
					if(day < 0 || day >29 ) {
						isValid = false;
					}else {
						this.day = day;
					}
				}else {
					if(day<0 || day>28) {
						isValid = false;
					}else {
						this.day = day;
					}
				}
				break;
			default:
				isValid = true;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	

}
