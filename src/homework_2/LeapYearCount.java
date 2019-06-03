package homework_2;

public class LeapYearCount {
    public static void main(String[] args) {
        System.out.println("Кількість високосних років в 3-му році нашої ери: " + leapYearCount(3));
        System.out.println("Кількість високосних років в 4-му році нашої ери: " + leapYearCount(4));
        System.out.println("Кількість високосних років в 25-му році нашої ери: " + leapYearCount(25));
        System.out.println("Кількість високосних років в 100-му році нашої ери: " + leapYearCount(100));
        System.out.println("Кількість високосних років в 2019-му році нашої ери: " + leapYearCount(2019));
    }

    private static int leapYearCount(int year) {
        return year / 4 - year / 100 + year / 400;
    }

}
