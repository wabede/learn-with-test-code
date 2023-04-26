package com.eundms.learnwithtestcode.java.collections;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapHashMap {

    @Test
    @DisplayName("Map.getOrDefault(key,defaultValue)")
    public void mapGetOrDefault() {
        Map<Integer, Integer> intMap = new HashMap<>();
        intMap.put(0, intMap.getOrDefault(0, 0) + 1);
    }

    @Test
    @DisplayName("Map의 key를 집합으로 받아낼 수 있다.")
    public void mapKeySetToList() {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            intMap.put(i, i + 1);
        }

        List<Integer> keySetList = new ArrayList<>(intMap.keySet());

        assertThat(keySetList).isEqualTo(new ArrayList<>(List.of(0, 1, 2, 3, 4)));
    }

    @Test
    @DisplayName("containsKey(key) : key 존재하면 true, key 존재하지 않으면 false")
    public void containsKey(){
        Map<Integer, String> intMap = new HashMap<>();
        intMap.put(3,"ghi");
        intMap.put(1,"abc");
        intMap.put(2,"def");

        assertThat(intMap.containsKey(3)).isEqualTo(true);
        assertThat(intMap.containsKey(4)).isEqualTo(false);
    }
}
