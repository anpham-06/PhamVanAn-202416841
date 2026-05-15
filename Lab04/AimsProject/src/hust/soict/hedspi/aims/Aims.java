package hust.soict.hedspi.aims;

import java.util.Scanner;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.media.*;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Thêm dữ liệu mẫu vào Store để test
        store.addMedia(new DigitalVideoDisc(1, "The Lion King", "Animation", 19.95f, 87, "Roger Allers"));
        store.addMedia(new Book(2, "Java Programming", "Technology", 25.0f));
        
        int choice;
        while (true) {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1: storeMenu(); break;
                case 2: updateStore(); break;
                case 3: cartMenu(); break;
                case 0: System.out.println("Goodbye!"); return;
                default: System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // --- CÁC HÀM HIỂN THỊ MENU ---
    
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    public static void storeMenu() {
        while (true) {
            store.print(); // Giả sử bạn đã viết hàm print() hiển thị danh sách Media trong Store
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.print("Please choose a number: 0-1-2-3-4: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0) break;
            
            handleStoreChoice(choice);
        }
    }

    private static void handleStoreChoice(int choice) {
        System.out.print("Enter the title of the media: ");
        String title = scanner.nextLine();
        Media found = store.searchByTitle(title); // Cần hàm searchByTitle trong Store

        if (found == null) {
            System.out.println("Media not found!");
            return;
        }

        switch (choice) {
            case 1:
                System.out.println(found.toString());
                mediaDetailsMenu(found);
                break;
            case 2:
                cart.addMedia(found);
                break;
            case 3:
                if (found instanceof Playable) {
                    ((Playable) found).play();
                } else {
                    System.out.println("This media cannot be played!");
                }
                break;
            case 4:
                cartMenu();
                break;
        }
    }

    public static void mediaDetailsMenu(Media media) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        if (media instanceof Playable) System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) cart.addMedia(media);
        else if (choice == 2 && media instanceof Playable) ((Playable) media).play();
    }

    public static void cartMenu() {
        while (true) {
            cart.print();
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter medias in cart");
            System.out.println("2. Sort medias in cart");
            System.out.println("3. Remove media from cart");
            System.out.println("4. Play a media");
            System.out.println("5. Place order");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 0) break;

            switch (choice) {
                case 2: // Sort
                    System.out.println("1. Sort by title | 2. Sort by cost");
                    int sortChoice = scanner.nextInt();
                    if (sortChoice == 1) cart.sortByTitle();
                    else cart.sortByCost();
                    break;
                case 5:
                    System.out.println("Order created! Emptying cart...");
                    cart = new Cart(); // Clear cart
                    return;
                // Triển khai các case khác tương tự...
            }
        }
    }

    public static void updateStore() {
        // Cho phép thêm hoặc xóa Media khỏi Store
        System.out.println("Update Store functionality goes here.");
    }
}