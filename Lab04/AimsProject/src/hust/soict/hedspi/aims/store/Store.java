package hust.soict.hedspi.aims.store;

import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media; // Import lớp Media thay vì DigitalVideoDisc

public class Store {
    // Thay đổi thuộc tính sang ArrayList <Media>
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public Store() {
        super();
    }

    // Thay thế addDVD() bằng addMedia()
    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("The media has been added to the store.");
        } else {
            System.out.println("The media is already in the store.");
        }
    }

    // Thay thế removeDVD() bằng removeMedia()
    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The media has been removed from the store.");
        } else {
            System.out.println("The media was not found in the store.");
        }
    }

    public void addDVD(Media media) {
        addMedia(media);
    }

    public void removeDVD(Media media) {
        removeMedia(media);
    }

    // Getter cho danh sách sản phẩm
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public int getQtyInStore() {
        return itemsInStore.size();
    }

    public Media searchByTitle(String title) {
        for (Media media : itemsInStore) {
            if (media.getTitle() != null && media.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return media;
            }
        }
        return null;
    }

    // Phương thức in danh sách cửa hàng để kiểm tra
    public void printStore() {
        System.out.println("**********STORE**********");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
        }
        System.out.println("*************************");
    }

    public void print() {
        printStore();
    }
}