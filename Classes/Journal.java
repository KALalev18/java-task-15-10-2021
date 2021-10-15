package Classes;

public class Journal {
	private int isbn;
	private String type;

	public Journal(int isbn, String type) {
		super();
		this.isbn = isbn;
		this.type = type;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
