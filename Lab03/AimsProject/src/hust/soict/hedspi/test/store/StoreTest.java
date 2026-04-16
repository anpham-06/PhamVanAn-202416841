package hust.soict.hedspi.test.store;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
                "Aladin", "Animation", 18.99f);

        System.out.println("Add DVDs to store:");
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        System.out.println("Current quantity in store: " + store.getQtyInStore());

        System.out.println("\nRemove one DVD from store:");
        store.removeDVD(dvd2);
        System.out.println("Current quantity in store: " + store.getQtyInStore());

        System.out.println("\nTry removing a DVD that is not in store:");
        store.removeDVD(dvd2);
    }
}