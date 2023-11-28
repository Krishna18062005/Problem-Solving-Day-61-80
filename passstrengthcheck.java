import java.util.*;

public class passstrengthcheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("ENTER PASSWORD TO CHECK\n");
        String aq = sc.nextLine();
        char[] a = aq.toCharArray();
        int sy = 0, up = 0, le = 0, nu = 0, lo = 0;
        for (int i = 0; i < aq.length(); i++) {
            // for check lowercase letters
            if (a[i] > 96 && a[i] <= 123) {
                lo += 1;
            }
            if (a[i] > 64 && a[i] <= 90) {
                // for check uppercase letters
                up += 1;
            }
            if (a[i] >= 33 && a[i] <= 47 || a[i] >= 58 && a[i] <= 64) {
                // for checking symbols
                sy += 1;
            }
            if (a[i] != ' ') {
                // for checking length
                le += 1;
            }
            if (a[i] >= 48 && a[i] <= 57) {
                // for checking numbers
                nu += 1;
            }
        }
        if (sy >= 1 && le >= 8 && up >= 1 && nu >= 1 && lo >= 1) {
            System.out.printf("----STRONG PASSWORD----");
        } else if (le < 8) {
            System.out.printf("----NOT ENOUGH LENGTH----");
        } else if (lo == 0) {
            System.out.printf("---DOESNOT CONTAINS LOWERCASE");
        } else if (up == 0) {
            System.out.printf("---DOESNOT CONTAINS UPPERCASE");
        } else if (nu == 0) {
            System.out.printf("---DOESNOT CONTAINS NUMERICVAL");
        } else if (sy == 0) {
            System.out.printf("---DOESNOT CONTAINS SYMBOLS");
        } else
            System.out.printf("----INVALID PASSWORD----");

    }
}
