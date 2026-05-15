package hust.soict.hedspi.test.store;

import java.util.ArrayList;
import java.util.List;
import hust.soict.hedspi.aims.media.*;

public class PolymorphismTest {
    public static void main(String[] args) {
        // 1. Tạo danh sách Media
        List<Media> mediae = new ArrayList<Media>();

        // 2. Thêm các loại media khác nhau
        // Giả sử bạn đã có các constructor phù hợp từ mục 9
        Media cd = new CompactDisc(1, "Greatest Hits", "Music", 15.0f, 60, "Director A", "Artist A");
        Media dvd = new DigitalVideoDisc(2, "Inception", "Movie", 20.0f, 148, "Christopher Nolan");
        Media book = new Book(3, "Java Programming", "Education", 50.0f);

        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);

        // 3. Duyệt danh sách và in thông tin
        for (Media m : mediae) {
            // Quan sát: Dù biến m có kiểu Media, nhưng Java sẽ gọi đúng toString() của lớp con
            System.out.println(m.toString());
        }
    }
}
