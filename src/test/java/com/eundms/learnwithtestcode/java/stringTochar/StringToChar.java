package com.eundms.learnwithtestcode.java.stringTochar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringToChar {

    @Test
    @DisplayName("string : toLowerCase, toUpperCase")
    public void stringToUpperLower() {
        // STring에 있는 모든 문자열을 작은 알파벳으로 만들기
        String str = "aBc";

        // Character 하나를 작은 알파벳으로 만들기
        assertThat(str.toLowerCase()).isEqualTo("abc");
        assertThat(str.toUpperCase()).isEqualTo("ABC");
    }

    @Test
    @DisplayName("char : toLowerCase, toUpperCase")
    public void charToUpperLower(){
        assertThat(Character.toLowerCase('P')).isEqualTo('p');// true
        assertThat(Character.toUpperCase('y')).isEqualTo('Y'); // true
    }

}
