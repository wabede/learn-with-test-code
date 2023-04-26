package com.eundms.learnwithtestcode.java;

import java.util.Arrays;
import java.util.Collections;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortInArray {
    @Test
    @DisplayName("int[]에서 오름차순 정렬")
    public void sortAscInArray() {
        int[] arr = {4, 2, 1, 5, 3};
        Arrays.sort(arr);
        Assertions.assertThat(arr).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }

    @Test
    @DisplayName("int[]에서 내림차순 정렬")
    public void sortDescInArray() {
        Integer[] arr = {4, 2, 1, 5, 3};
        Arrays.sort(arr, Collections.reverseOrder());
        Assertions.assertThat(arr).isEqualTo(new Integer[]{5, 4, 3, 2, 1});
    }

    @Test
    @DisplayName("Item[]에서 특정 값(x) 기준으로 오름차순 정렬")
    public void sortAscInObjectArray() {
        Item[] arr = new Item[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = new Item(4 - i, i);
        }
        Arrays.sort(arr);

        Item[] expected = new Item[]{new Item(1, 3), new Item(2, 2), new Item(3, 1), new Item(4, 0)};
        Assertions.assertThat(Arrays.toString(arr)).isEqualTo(Arrays.toString(expected));

    }

    @Test
    @DisplayName("Item[]에서 특정 값(x) 기준으로 내림차순 정렬")
    public void sortDescInObjectArray() {
        Item[] arr = new Item[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = new Item(4 - i, i);
        }
        Arrays.sort(arr,Collections.reverseOrder());

        Item[] expected = new Item[]{new Item(4, 0), new Item(3, 1), new Item(2, 2), new Item(1, 3)};
        Assertions.assertThat(Arrays.toString(arr)).isEqualTo(Arrays.toString(expected));

    }

    class Item implements Comparable<Item> {
        int x, y;

        public Item(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Item o) {
            return this.x - o.x;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
