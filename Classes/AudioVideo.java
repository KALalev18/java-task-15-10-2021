package Classes;

public class AudioVideo {
	private int MAX_BORROW_DAY = 7;
	private String borrowDate;
	private static String artist;
	private static int numberOfTracks;
	private static String director;
	public AudioVideo(int mAX_BORROW_DAY) {
		super();
		MAX_BORROW_DAY = mAX_BORROW_DAY;
	}
	public int getMAX_BORROW_DAY() {
		return MAX_BORROW_DAY;
	}
	public void setMAX_BORROW_DAY(int mAX_BORROW_DAY) {
		MAX_BORROW_DAY = mAX_BORROW_DAY;
	}
	public String dueDate()
	{
		return borrowDate;
	}
	public void getDate(String borrowDate) {
		this.borrowDate=borrowDate;
	}
	public static void print()	{
		System.out.println(artist);
		System.out.println(numberOfTracks);
	}
	public static void printl()	{
		System.out.println(director);
	}
	public static void main(String[] args) {
		Cd cd=new Cd("DaBaby",42);
		print();
		Dvd dvd=new Dvd("ST");
		printl();
	}

}
