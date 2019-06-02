package homework_1;

public class Rhombus {
    public static void main(String[] args) {
        printRhombus(3);
    }

    private static void printRhombus(int size) {
        int start, end;
        boolean flag1 = true;
        size += size - 1;
        start = end = (size / 2) + 1;

        for (int line = 0; line < size; line++) {
            boolean flag2 = true;
            System.out.println();

            for (int i = 1; i <= size; i++) {

                if (!(i >= start && i <= end)) {
                    System.out.print(' ');
                } else {
                    if (flag2) {
                        System.out.print('*');
                        flag2 = false;
                    } else {
                        System.out.print(' ');
                        flag2 = true;
                    }
                }
            }
            if (flag1) {
                start = --start;
                end = ++end;

                if (start == 1) {
                    flag1 = false;
                }
            } else {
                start = ++start;
                end = --end;
            }
        }
    }
}
