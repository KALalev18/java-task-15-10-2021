package Classes;

public class Novel {
	private int isbn;
	private String genre;
	public Novel(int isbn, String genre) {
		super();
		this.isbn = isbn;
		this.genre = genre;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
