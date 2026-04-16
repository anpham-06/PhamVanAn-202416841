import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = -1;
        int year;

        // nhập tháng
        while (month == -1) {
            System.out.print("Enter month: ");
            String input = sc.nextLine().trim().toLowerCase();

            month = parseMonth(input);

            if (month == -1) {
                System.out.println("Invalid month. Try again.");
            }
        }

        // nhập năm
        while (true) {
            System.out.print("Enter year: ");
            String input = sc.nextLine();

            if (input.matches("\\d+")) {
                year = Integer.parseInt(input);
                break;
            } else {
                System.out.println("Invalid year. Try again.");
            }
        }

        int days = getDays(month, year);
        System.out.println("Number of days: " + days);

        sc.close();
    }

    // chuyển input tháng thành số
    public static int parseMonth(String m) {
        switch (m) {
            case "1": case "jan": case "jan.": case "january": return 1;
            case "2": case "feb": case "feb.": case "february": return 2;
            case "3": case "mar": case "mar.": case "march": return 3;
            case "4": case "apr": case "apr.": case "april": return 4;
            case "5": case "may": return 5;
            case "6": case "jun": case "june": return 6;
            case "7": case "jul": case "july": return 7;
            case "8": case "aug": case "aug.": case "august": return 8;
            case "9": case "sep": case "sept": case "sep.": case "september": return 9;
            case "10": case "oct": case "oct.": case "october": return 10;
            case "11": case "nov": case "nov.": case "november": return 11;
            case "12": case "dec": case "dec.": case "december": return 12;
            default: return -1;
        }
    }

    // kiểm tra năm nhuận
    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    // lấy số ngày
    public static int getDays(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1;
        }
    }
}