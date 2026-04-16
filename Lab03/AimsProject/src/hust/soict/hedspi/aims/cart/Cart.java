package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;

    private static final String CART_SEPARATOR = "******************************CART******************************";

    // Constructor
    public Cart() {
        setQtyOrdered(0);
    }

    // Getter and Setter
    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    // Method to add DVD
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // If cart is full
        if (getQtyOrdered() >= 20) {
            System.out.println("The cart is almost full");
            return;
        }

        // Increase the qtyOrdered
        setQtyOrdered(getQtyOrdered() + 1);

        // Add DVD to Cart
        DigitalVideoDisc[] newItemsOrdered = getItemsOrdered();
        newItemsOrdered[getQtyOrdered() - 1] = disc;
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The disc has been added");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc: dvdList) {
            addDigitalVideoDisc(disc);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    // Method to remove DVD
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        // Search for disc
        int indexOfRemoved = -1;
        DigitalVideoDisc[] newItemsOrdered = getItemsOrdered();
        for (int i = 0; i < getQtyOrdered(); i++) {
            if (newItemsOrdered[i].equals(disc)) {
                indexOfRemoved = i;
                break;
            }
        }

        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("The disc is not found");
            return;
        }

        // Remove DVD from Cart
        for (int i = indexOfRemoved; i < getQtyOrdered() - 1; i++) {
            newItemsOrdered[i] = newItemsOrdered[i + 1];
        }
        setQtyOrdered(getQtyOrdered() - 1);
        newItemsOrdered[getQtyOrdered()] = null;
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The disc has been removed");
    }

    // Method to calculate the total cost
    public double totalCost() {
        double cost = 0;
        DigitalVideoDisc[] itemsOrdered = getItemsOrdered();
        for (DigitalVideoDisc disc: itemsOrdered) {
            if (disc != null) {
                cost += disc.getCost();
            }
        }

        return Math.round(cost * 100.0) / 100.0;
    }

    // Print ordered items with price and the total cost.
    public void print() {
        System.out.println(CART_SEPARATOR);
        System.out.println("Ordered Items:");

        for (int i = 0; i < getQtyOrdered(); i++) {
            System.out.println((i + 1) + ". " + getItemsOrdered()[i].toString());
        }

        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println(CART_SEPARATOR);
    }

    public void searchById(int id) {
        for (int i = 0; i < getQtyOrdered(); i++) {
            if (getItemsOrdered()[i].getId() == id) {
                System.out.println("Search result: " + getItemsOrdered()[i]);
                return;
            }
        }

        System.out.println("No matching DVD found with id: " + id);
    }

    public void searchByTitle(String title) {
        boolean found = false;

        for (int i = 0; i < getQtyOrdered(); i++) {
            if (getItemsOrdered()[i].isMatch(title)) {
                System.out.println("Search result: " + getItemsOrdered()[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching DVD found with title: " + title);
        }
    }
}
