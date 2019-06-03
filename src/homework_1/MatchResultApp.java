package homework_1;

public class MatchResultApp {
    public static void main(String[] args) {
        System.out.println("Не вгаданний результат матчу. " + similarityCheck(2, 0, 0, 2));
        System.out.println("Не вгаданний результат матчу. " + similarityCheck(0, 2, 2, 0));
        System.out.println("Не вгаданний результат матчу. " + similarityCheck(0, 2, 0, 0));
        System.out.println("Не вгаданний результат матчу. " + similarityCheck(0, 0, 0, 2));

        System.out.println("Вгаданний результат матчу. " + similarityCheck(0, 1, 1, 2));
        System.out.println("Вгаданний результат матчу. " + similarityCheck(1, 0, 2, 1));
        System.out.println("Вгаданний результат матчу. " + similarityCheck(0, 0, 1, 1));

        System.out.println("Вгаданний рахунок матчу. " + similarityCheck(0, 1, 0, 1));
        System.out.println("Вгаданний рахунок матчу. " + similarityCheck(2, 1, 2, 1));
        System.out.println("Вгаданний рахунок матчу. " + similarityCheck(1, 1, 1, 1));
    }

    private static int similarityCheck(int gsTmA, int gsTmB, int possGsTmA, int possGsTmB) {
        return (gsTmA == possGsTmA && gsTmB == possGsTmB) ? 2
                : (gsTmA < gsTmB && possGsTmA < possGsTmB)
                || (gsTmA > gsTmB && possGsTmA > possGsTmB)
                || (gsTmA == gsTmB && possGsTmA == possGsTmB) ? 1 : 0;
    }
}
