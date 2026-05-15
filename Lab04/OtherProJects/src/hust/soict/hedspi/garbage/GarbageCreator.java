package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filename = "test.txt"; // Đã đổi thành file .txt
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b; 
            }
            
            endTime = System.currentTimeMillis();
            System.out.println("Time with + operator: " + (endTime - startTime) + " ms");
        } catch (IOException e) {
            System.err.println("Lỗi: Hãy đảm bảo file " + filename + " nằm trong thư mục OtherProjects!");
        }
    }
}