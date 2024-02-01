package Random_Day_Practice.Greedy;

import java.lang.reflect.Array;
import java.util.*;
public class fractionalKnapSack {

    public static class Item {
        int value;
        int weight;

        public Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public static int fractionalKnapSack(int capacity, Item items[], int n) {
        Arrays.sort(items, 0, n, Comparator.comparingDouble((Item item) -> (double) item.value / item.weight).reversed());
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (capacity > items[i].weight) {
                capacity -= items[i].weight;
                max += items[i].value;
            } else {
                max += (double) items[i].value / items[i].weight * capacity;
                break;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int capacity = 50;
        Item[] items = new Item[3];
        items[0] = new Item(60, 10);
        items[1] = new Item(100, 20);
        items[2] = new Item(120, 30);
        int n = items.length;
        System.out.println("Maximum value we can obtain = " + fractionalKnapSack(capacity, items, n));
    }
}
