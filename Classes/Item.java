package Classes;

public class Item {
	private static String title;
	private static boolean borrowed;
	private static int year;
	private static int month;
	private static int dayOfMonth;
	public Item(String title, boolean borrowed, int year, int month, int dayOfMonth) {
		super();
		this.title = title;
		this.borrowed = borrowed;
		this.year = year;
		this.month = month;
		this.dayOfMonth = dayOfMonth;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	public static void print()	{
		System.out.println(title);
		System.out.println(borrowed);
		System.out.println(year);
		System.out.println(month);
		System.out.println(dayOfMonth);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item=new Item("Java",true,2019,4,7);
		print();
	}

}
