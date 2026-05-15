package hust.soict.hedspi.aims.media;

public class Track implements Playable{
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    public void play() {
        if (this.getLength() <= 0) {
            System.out.println("Track cannot be played: invalid length.");
            return;
        }
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    @Override
    public String toString() {
        return "Track - " + this.getTitle() + " - " + this.getLength();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Track)) {
            return false;
        }
        Track other = (Track) obj;
        if (this.getTitle() == null || other.getTitle() == null) {
            return false;
        }
        // Bằng nhau nếu cùng tiêu đề VÀ cùng độ dài
        return this.getTitle().equalsIgnoreCase(other.getTitle()) 
               && this.getLength() == other.getLength();
    }
}