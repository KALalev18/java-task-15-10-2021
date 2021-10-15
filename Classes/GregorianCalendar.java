package Classes;

public class GregorianCalendar {
	public int month;
	public int day;
	public int year;
	public String borrowDate=month+" "+" "+day+" "+year;
	public GregorianCalendar(int month, int day, int year, String borrowDate) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.borrowDate = borrowDate;
	}
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
