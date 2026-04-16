package hust.soict.hedspi.aims.store;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Store {
    public static final int MAX_NUMBERS_IN_STORE = 1000;

    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
    private int qtyInStore;

    public Store() {
        this.qtyInStore = 0;
    }

    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }

    public int getQtyInStore() {
        return qtyInStore;
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore >= MAX_NUMBERS_IN_STORE) {
            System.out.println("The store is full");
            return;
        }

        itemsInStore[qtyInStore] = disc;
        qtyInStore++;
        System.out.println("The disc has been added to the store");
    }

    public void removeDVD(DigitalVideoDisc disc) {
        int indexOfRemoved = -1;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].equals(disc)) {
                indexOfRemoved = i;
                break;
            }
        }

        if (indexOfRemoved == -1) {
            System.out.println("The disc is not found in the store");
            return;
        }

        for (int i = indexOfRemoved; i < qtyInStore - 1; i++) {
            itemsInStore[i] = itemsInStore[i + 1];
        }

        qtyInStore--;
        itemsInStore[qtyInStore] = null;
        System.out.println("The disc has been removed from the store");
    }
}