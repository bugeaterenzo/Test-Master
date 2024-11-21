package Java_References.Tree_Set__Navigable_Set;

public class Tree_Set
{
    public static void main(String[] args)
    {

        // TreeSet

        // Implemented Interfaces:

        // NavigableSet<E>: This extends SortedSet, providing navigation methods
        // such as ceiling(), floor(), pollFirst(), etc.

        // SortedSet<E>: This interface provides methods for accessing elements
        // based on their sorted order (e.g., first(), last(), headSet(), tailSet()).

        // Set<E>: It implements the Set interface, so it follows the basic behavior of a set (no duplicates).
        // Cloneable: This allows objects of TreeSet to be cloned.
        // Serializable: This allows the TreeSet to be serialized.
        // Iterable<E>: This allows TreeSet to be used in enhanced for-loops and iterators.

        // Characteristics:

        // TreeSet maintains elements in sorted order according to their natural ordering
        // (or a comparator provided at the time of creation).
        // It is backed by a Red-Black Tree, which is a type of balanced binary search tree.
        // Provides methods for sorting and navigating elements like ceiling(), floor(),
        // subSet(), headSet(), tailSet(), etc.


        // ListIterator is not supported by Set or TreeSet.

        // ListIterator is specifically designed for List implementations (like ArrayList
        // or LinkedList) since it provides additional capabilities like traversing in
        // both directions (forward and backward), adding elements, and modifying elements
        // during iteration.

        // Set implementations, including TreeSet, do not allow indexed access and generally
        // don't support the bidirectional iteration provided by ListIterator.



    }
}
