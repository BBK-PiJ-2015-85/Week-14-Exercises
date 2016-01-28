package mergesort;

import java.util.ArrayList;
import java.util.List;

public class Mergesort {
    private List<Integer> sortedList;
    private List<Integer> tempList;


    public Mergesort() {
        this.sortedList = new ArrayList<>();
        this.tempList = new ArrayList<>();
    }

    public List mergesort(List list) {
        if (list.size() > 1) {
            mergesort(list.subList(0, list.size() / 2));
            mergesort(list.subList(list.size() / 2, list.size()));
        }
        if (list.size() < 2) {
            if (tempList.size() == 0) {
                tempList.add((int) list.get(0));
                sortedList.add((int) list.get(0));
            } else {
                for (int i = 0; i < tempList.size(); i++) {
                    if ((int)list.get(0) < sortedList.get(i)) {
                        sortedList.add(i, (int) list.get(0));
                        break;
                    }
                    //number is bigger than all so add at end
                    if (i == tempList.size() - 1) {
                        sortedList.add((int) list.get(0));
                    }
                }
                tempList.add((int) list.get(0));
            }
        }

        return sortedList;
    }

    public static void main(String[] args) {
        Mergesort ms = new Mergesort();
        List list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(33);
        list.add(54);
        list.add(21);
        list.add(4);
        list.add(80);
        System.out.println("Original: " + list);
        ms.mergesort(list);
        System.out.println("Sorted: " + ms.sortedList);

        list.clear();
        ms.sortedList.clear();
        ms.tempList.clear();
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.abs(1000 * Math.random()));
        }
        System.out.println("Original: " + list);
        ms.mergesort(list);
        System.out.println("Sorted: " + ms.sortedList);

    }

}
