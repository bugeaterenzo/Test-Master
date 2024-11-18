package Java_References.Set;

import java.util.*;

public class set
{
    public static void main(String[] args)
    {


        // Create a Set using HashSet
        Set<String> set = new HashSet<>(16);

        // add(E e): Adds elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        System.out.println("After add(): " + set); // Output: [Apple, Banana, Cherry]

        List fruits = new ArrayList<>(10);
        fruits.addAll(Arrays.asList("Orange", "Banana", "Grapes"));

        // addAll(Collection<? extends E> c): Adds all elements from a collection
        // set.addAll(Arrays.asList("Orange", "Banana", "Grapes"));
        set.addAll(fruits);
        System.out.println("After addAll(): " + set); // Output: [Apple, Banana, Cherry, Orange, Grapes] (no duplicates)



        // clear(): Removes all elements
        Set<String> tempSet = new HashSet<>(set);
        tempSet.clear();
        System.out.println("After clear(): " + tempSet); // Output: []
        System.out.println("After clear() original set: " + set);


        // contains(Object o): Checks if an element is present
        boolean containsApple = set.contains("Apple");
        System.out.println("Contains 'Apple': " + containsApple); // Output: true



        // containsAll(Collection<?> c): Checks if all elements are present
        boolean containsAll = set.containsAll(Arrays.asList("Apple", "Cherry"));
        System.out.println("Contains all [Apple, Cherry]: " + containsAll); // Output: true





        // isEmpty(): Checks if the set is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is set empty? " + isEmpty); // Output: false





        // iterator(): Returns an iterator over the elements

        // The ListIterator is obtained using the listIterator() method provided by the List interface.
        // It is not available for Set because sets do not guarantee order, making indexed traversal irrelevant.

        // hasNext() and next(): Traverses forward.
        // hasPrevious() and previous(): Traverses backward.
        // nextIndex() and previousIndex(): Returns the index of the next or previous element.
        // remove(), set(E e), add(E e): Allows element modification.

        Iterator<String> iterator = set.iterator();
        System.out.print("Elements using iterator(): ");
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // Output: Elements using iterator(): Apple Banana Cherry Orange Grapes


        Set<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Date");

        // Get a Spliterator for the set
        Spliterator<String> spliterator1 = fruit.spliterator();

        // Split the spliterator
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        // First spliterator processes elements
        System.out.println("First Spliterator:");
        spliterator1.forEachRemaining(System.out::println);

        // Second spliterator processes elements if it exists
        System.out.println("\nSecond Spliterator:");
        if (spliterator2 != null)
        {
            spliterator2.forEachRemaining(System.out::println);
        }

        // How trySplit() Works:

        // trySplit():
        // The trySplit() method doesn't operate on the collection (e.g., a List or Set) directly.
        // Instead, it operates on the Spliterator itself. The idea is that a Spliterator might
        // be capable of "splitting" the work it is doing (i.e., the elements it is traversing)
        // into two parts, allowing each part to be processed independently and potentially in parallel.

        // When a collection (like a List or Set) is large - and you want to process its elements in parallel,
        // the Spliterator can split the task of iterating over the collection into two "splits" or parts.
        // Each split can then be processed independently.
        // Think of the Spliterator as a worker that is tasked with processing elements of the collection.
        // The trySplit() method allows this worker to divide its job into two smaller tasks, which can be



        // remove(Object o): Removes a specific element
        set.remove("Banana");
        System.out.println("After remove('Banana'): " + set); // Output: [Apple, Cherry, Orange, Grapes]



        // removeAll(Collection<?> c): Removes all elements in the specified collection
        set.removeAll(Arrays.asList("Apple", "Grapes"));
        System.out.println("After removeAll([Apple, Grapes]): " + set); // Output: [Cherry, Orange]



        // retainAll(Collection<?> c): Retains only the elements present in the specified collection
        set.retainAll(Arrays.asList("Cherry", "Pineapple"));
        System.out.println("After retainAll([Cherry, Pineapple]): " + set); // Output: [Cherry]



        // size(): Returns the number of elements in the set
        int size = set.size();
        System.out.println("Size of set: " + size); // Output: 1



        // toArray(): Converts the set to an array
        Object[] array = set.toArray();
        System.out.println("Array: " + Arrays.toString(array)); // Output: [Cherry]



        // toArray(T[] a): Converts the set to an array of specified runtime type
        String[] strArray = set.toArray(new String[0]);
        System.out.println("String Array: " + Arrays.toString(strArray)); // Output: [Cherry]

        // The method toArray(T[] a) is part of the Collection interface and allows converting
        // the collection's elements to an array of the specified type.
        // The argument new String[0] is used to specify the desired type and size of the output array.

    }


}
