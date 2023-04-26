package com.eundms.learnwithtestcode.java.collections;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapTreeMap {

    @Test
    @DisplayName("TreeMap 선언")
    public void treeMapDeclare() {
        TreeMap<Integer, String> map1 = new TreeMap<>(){{
            put(2, "복숭아");
            put(3, "수박");
            put(1, "사과");
        }}; // TreeMap 생성
        TreeMap<Integer, String> map2 = new TreeMap<>(map1); // map1의 모든 값을 가진 TreeMap 생성
        TreeMap<Integer, String> map3 = new TreeMap<>(); // 초기값 설정
    }

    @Test
    @DisplayName("TreeMap.keySet() -> List")
    public void treeMapToList() {
        TreeMap<Integer, String> treeMap = new TreeMap<>() {{ // 초기값 설정
            put(2, "복숭아");
            put(3, "수박");
            put(1, "사과");
        }};
        List<Integer> items = new ArrayList<>(treeMap.keySet());
        List<Integer> expected = new ArrayList<>(List.of(1,2,3));
        assertThat(items).isEqualTo(expected);
    }

    @Test
    @DisplayName("TreeMap 값 추가/제거")
    public void treeMapAddDelete(){
        TreeMap<Integer,String> map = new TreeMap<>(); // TreeMap 생성
        map.put(1, "사과"); // 값 추가
        map.put(2, "복숭아");
        map.put(3, "수박");

        map.remove(1); // 1 [제거]

        TreeMap<Integer,String> map2 = new TreeMap<>();
        map2.put(2,"복숭아");
        map2.put(3,"수박");

        assertThat(map.toString()).isEqualTo(map2.toString()); // toString [null]

        map2 = new TreeMap<>();
        map.clear(); // null [clear]
        assertThat(map.toString()).isEqualTo(map2.toString());
    }

    @Test
    @DisplayName("TreeMap 메소드 테스트")
    public void treeMapMethod(){
        TreeMap<Integer, String> treeMap = new TreeMap<>(){{
            put(2, "복숭아");
            put(3, "수박");
            put(1, "사과");
        }}; // TreeMap 생성

        assertThat(treeMap.firstEntry()).isEqualTo("1=사과");
        assertThat(treeMap.firstKey()).isEqualTo(1);
    }

}
