package hust.soict.hedspi.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc() {
        super();
    }

    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
        this();
        setId(id);
        setTitle(title);
        setCategory(category);
        setCost(cost);
        setLength(length);
        setDirector(director);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track " + track.getTitle() + " has been added.");
        } else {
            System.out.println("Track " + track.getTitle() + " is already in the list.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track " + track.getTitle() + " has been removed.");
        } else {
            System.out.println("Track " + track.getTitle() + " does not exist.");
        }
    }

    @Override
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    public void play() {
        if (getLength() <= 0) {
            System.out.println("CD cannot be played: invalid length.");
            return;
        }
        System.out.println("Playing CD: " + this.getTitle() + " by " + this.getArtist());
        for (Track track : tracks) {
            track.play(); // Gọi hàm play() của từng track
        }
    }

    @Override
    public String toString() {
        StringBuilder trackList = new StringBuilder();
        for (int i = 0; i < tracks.size(); i++) {
            if (i > 0) {
                trackList.append("; ");
            }
            trackList.append(tracks.get(i).toString());
        }
        if (trackList.length() == 0) {
            trackList.append("No tracks");
        }

        String itemCategory = getCategory() == null ? "N/A" : getCategory();
        String itemDirector = getDirector() == null ? "N/A" : getDirector();
        String itemArtist = getArtist() == null ? "N/A" : getArtist();

        return "CD - " + getTitle()
                + " - " + itemCategory
                + " - " + itemArtist
                + " - " + itemDirector
                + " - " + getLength()
                + ": " + getCost() + " $"
                + " - Tracks: " + trackList;
    }
}