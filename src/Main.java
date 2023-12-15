
public class Main {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();


        stringSet.add("Neuah");
        stringSet.add("Nea");
        stringSet.add("Chin");


        System.out.println("There're " + stringSet.size() + " element(s) in the set.");


        String searchElement = "Neuah";
        System.out.println("Is '" + searchElement + "' in the set?: " + stringSet.contains(searchElement));


        String removedElement = "Neuah";
        System.out.println("Removing '" + removedElement + "' from the set: " + stringSet.remove(removedElement));


        System.out.println("There're " + stringSet.size() + " element(s) in the set.");


        stringSet.clear();


        System.out.println("Is the set empty?: " + stringSet.isEmpty());//
    }
}