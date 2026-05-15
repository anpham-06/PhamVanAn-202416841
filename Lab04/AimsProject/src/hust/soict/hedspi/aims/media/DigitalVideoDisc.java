package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    private static int nbDigitalVideoDiscs = 0;

    // Constructors
    public DigitalVideoDisc(String title) {
        super(); // Gọi constructor của Disc, Disc gọi Media
        nbDigitalVideoDiscs++;
        this.setId(nbDigitalVideoDiscs);
        this.setTitle(title);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title);
        this.setCategory(category);
        this.setCost(cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, cost);
        this.setDirector(director); // Dùng Setter của Disc
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this(title, category, director, cost);
        this.setLength(length); // Dùng Setter của Disc
    }

    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        this(title, category, director, length, cost);
        this.setId(id);
    }

    @Override
    public String toString() {
        // Lấy dữ liệu thông qua Getter của Media và Disc
        String itemCategory = getCategory() == null ? "N/A" : getCategory();
        String itemDirector = getDirector() == null ? "N/A" : getDirector();
        
        return "DVD - " + getTitle()
                + " - " + itemCategory
                + " - " + itemDirector
                + " - " + getLength()
                + ": " + getCost() + " $";
    }

    public boolean isMatch(String title) {
        if (getTitle() == null || title == null) {
            return false;
        }
        return getTitle().toLowerCase().contains(title.trim().toLowerCase());
    }

    public void play() {
        if (getLength() <= 0) {
            System.out.println("DVD cannot be played: invalid length.");
            return;
        }
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}