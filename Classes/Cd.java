package Classes;

public class Cd {
	private static String artist;
	private static int numberOfTracks;
	public Cd(String artist, int numberOfTracks) {
		super();
		this.artist = artist;
		this.numberOfTracks = numberOfTracks;
	}
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}
	public static void print()	{
		System.out.println("Artist: "+artist);
		System.out.println("Number of tracks: "+numberOfTracks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cd cd=new Cd("DaBaby",43);
		print();
	}
}