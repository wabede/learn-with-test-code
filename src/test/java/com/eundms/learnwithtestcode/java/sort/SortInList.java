package com.eundms.learnwithtestcode.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortInList {
    @Test
    @DisplayName("List<Integer> 오름차순 정렬")
    public void sortAscInList() {
        List<Integer> numbers = new ArrayList<>(List.of(5, 4, 3, 2, 1));
        Collections.sort(numbers);
        Assertions.assertThat(numbers).isEqualTo(new ArrayList<>(List.of(1, 2, 3, 4, 5)));
    }

    @Test
    @DisplayName("List<Integer> 내림차순 정렬")
    public void sortDescInList() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 4, 5, 3));
        Collections.sort(numbers, Collections.reverseOrder());
        Assertions.assertThat(numbers).isEqualTo(new ArrayList<>(List.of(5, 4, 3, 2, 1)));
    }

    @Test
    @DisplayName("List<Item> 오름차순 정렬")
    public void sortItemAscInList() {
        List<Item> numbers = new ArrayList<>(List.of(new Item(5, 1), new Item(4, 2), new Item(3, 3)));
        Collections.sort(numbers);
        Assertions.assertThat(numbers.toString())
                .isEqualTo(new ArrayList<>(List.of(new Item(3, 3), new Item(4, 2), new Item(5, 1))).toString());
    }

    @Test
    @DisplayName("List<Item> 내림차순 정렬")
    public void sortItemDescInList() {
        List<Item> numbers = new ArrayList<>(List.of(new Item(3, 1), new Item(4, 2), new Item(5, 3)));
        Collections.sort(numbers, Collections.reverseOrder());
        Assertions.assertThat(numbers.toString())
                .isEqualTo(new ArrayList<>(List.of(new Item(5, 3), new Item(4, 2), new Item(3, 1))).toString());
    }

}
