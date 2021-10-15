package Classes;

public class Dvd {
	private static String director;
	public Dvd(String director) {
		super();
		this.director = director;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	public static void print()	{
		System.out.println("Director: " +director);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dvd dvd=new Dvd("Ika");
		print();
	}
	
}
