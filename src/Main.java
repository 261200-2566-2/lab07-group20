// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // client code
        Set<String> s = new HashSet<>();
        s.add("hello");
        s.add("world");
        s.add("hello"); // no effect
        s.remove("hello");
        s.remove(261200); // no effect
        System.out.println(s.size()); // 1
        System.out.println(s.contains("world"));
        // true
    }
}