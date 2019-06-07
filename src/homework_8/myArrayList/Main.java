package homework_8.myArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> myArrayList1 = new MyArrayList<>();
        List<Integer> myArrayList2 = new MyArrayList<>(5);

        for (int i = 0; i < myArrayList1.size(); i++) {
            myArrayList1.add(i + 10);
        }

        myArrayList1.add(20);
        myArrayList1.addAll(myArrayList2);
        myArrayList1.add(21, 11);

        for (int i = 0; i < myArrayList1.size(); i++) {
            System.out.print(myArrayList1.get(i) + ", ");
        }
        myArrayList1.set(23, 13);
        System.out.println();

        if (!myArrayList1.isEmpty()) {
            for (int i = 0; i < myArrayList1.size(); i++) {
                System.out.print(myArrayList1.get(i) + ", ");
            }
        }
        myArrayList1.remove(9);
        myArrayList1.remove(Integer.valueOf(23));
        myArrayList1.remove(Integer.valueOf(100));
        System.out.println();

        for (int i = 0; i < myArrayList1.size(); i++) {
            System.out.print(myArrayList1.get(i) + ", ");
        }
    }
}
