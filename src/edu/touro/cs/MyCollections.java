package edu.touro.cs;

import java.util.Comparator;
import java.util.List;

// TODO : update with your code, making all needed changes

public class MyCollections { // a utility class like java.util.Collections

    // randomly shuffles list
    static <T> void shuffle(List list) {
    }

    // the maximum value of all elements in list (natural ordering)
    static <T extends Comparable<T> > T max(List<T> list) {return null;}

    // the minimum value of all elements in list (natural ordering)
    static <T extends Comparable<T> > T min(List<T> list)  {return null;}

    // the maximum value of all elements in list (comparator ordering)
    static <T> T max(List<T> list, Comparator<T> cmp) {return null;}

    // the minimum value of all elements in list (comparator ordering)
    static <T > T min(List<T> list, Comparator<T> cmp)  {return null;}

    // the rank specifies how far from the max.
    // E.g. rank=0, return the max.
    // rank = 1 return the second from max,
    // rank = list.size()-1, return the min
    static <T extends Comparable<T> > T max(List<T> list, int rank) {        return null;    }
}