import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

                    //1.add
                    HashSet <String> set = new HashSet<>();
                    set.add("A");
                    set.add("B");
                    set.add("C");
                    set.add("D");
                    set.add("E");
                    set.printAll();


                    //2.Iterator
                    Iterator<String> iterator = set.iterator();
                    System.out.print("The iterator values are: ");
                    while (iterator.hasNext()) {
                        System.out.print(iterator.next() + " ");
                    }


                    //3.size
                    System.out.println("Size of the set: " + set.size());


                    //4.contain
                    System.out.println("Does the set contain 'C'? " + set.contains("C"));
                    System.out.println("Does the set contain 'F'? " + set.contains("F"));


                    //5.remove
                    set.remove("C");
                    set.printAll();


                    //6.addAll
                    Set<String> more = new HashSet<>();
                    more.add("F");
                    more.add("G");
                    more.add("H");
                    more.add("I");
                    set.addAll(more);
                    set.printAll();


                    //7.containAll
                    System.out.println("Does the set contain all elements from moreFruits? " + set.containsAll(more));


                    //8.retainAll
                    HashSet<String> retainSet = new HashSet<>();
                    retainSet.add("C");
                    retainSet.add("D");
                    set.retainAll(retainSet);


                    //9.removeAll
                    set.removeAll(more);
                    set.printAll();

                    //10.clear.
                    set.clear();
                    set.printAll();

                    //11.isEmpty.
                    System.out.println("Is the set empty? " + set.isEmpty());




    }

}







