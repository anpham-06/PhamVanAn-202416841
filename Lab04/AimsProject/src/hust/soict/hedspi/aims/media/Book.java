package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    // Chỉ giữ lại thuộc tính riêng của lớp Book
    private List<String> authors = new ArrayList<String>();

    public Book() {
        super(); // Gọi constructor của lớp Media
    }

    public Book(int id, String title, String category, float cost) {
        this();
        setId(id);
        setTitle(title);
        setCategory(category);
        setCost(cost);
    }

    // Các phương thức xử lý tác giả (riêng của Book)
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("Tác giả " + authorName + " đã tồn tại.");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Không tìm thấy tác giả: " + authorName);
        }
    }

    // Bạn có thể thêm Getter cho authors nếu cần, nhưng không nên thêm Setter
    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        StringBuilder authorList = new StringBuilder();
        for (int i = 0; i < authors.size(); i++) {
            if (i > 0) {
                authorList.append(", ");
            }
            authorList.append(authors.get(i));
        }
        if (authorList.length() == 0) {
            authorList.append("N/A");
        }
        return "Book - " + getTitle()
                + " - " + getCategory()
                + " - Authors: " + authorList
                + " - Content length: " + authorList.length();
    }
}