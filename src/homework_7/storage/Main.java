package homework_7.storage;

public class Main {
    public static void main(String[] args) {
        Storage<Integer, Box> storage = new Storage<>();
        Box<String> box = new Box<>();

        box.setSomething("Horse");
        storage.put(7, box);
        System.out.println(storage.get(7).getSomething());

        box.setSomething("Dog");
        storage.put(7, box);
        System.out.println(storage.get(7).getSomething());
    }
}
