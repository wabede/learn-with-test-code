package com.eundms.learnwithtestcode.java.arrayAndList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayAndList {
    @Test
    @DisplayName("int[] -> List<Integer>")
    public void arrayToList(){
        int[] items = new int[]{1,2,3};

        List<Integer> result = Arrays.stream(items).boxed().collect(Collectors.toList());

        Assertions.assertThat(result).isEqualTo(List.of(1,2,3));

    }
    @Test
    @DisplayName("List<Integer> -> int[]")
    public void listToArray(){
        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);

        int[] result = items.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        Assertions.assertThat(result).isEqualTo(new int[]{1,2,3});

    }
}
