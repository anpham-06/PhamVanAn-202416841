package hust.soict.hedspi.aims.disc;
public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private int id;

	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	// Constructor
	public DigitalVideoDisc(String title) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.id = nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	// Getter
	public int getId() {
		return id;
	}

	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}

	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}

	// Setter
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		String itemCategory = category == null ? "N/A" : category;
		String itemDirector = director == null ? "N/A" : director;
		String itemCost = String.format("%.2f", cost);

		return "DVD - " + title
				+ " - " + itemCategory
				+ " - " + itemDirector
				+ " - " + length
				+ ": " + itemCost + " $";
	}

	public boolean isMatch(String title) {
		if (this.title == null || title == null) {
			return false;
		}

		String normalizedCurrentTitle = this.title.trim().toLowerCase();
		String normalizedInputTitle = title.trim().toLowerCase();

		return normalizedCurrentTitle.contains(normalizedInputTitle);
	}
	
}