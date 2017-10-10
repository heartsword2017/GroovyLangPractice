package com.xinjian.practice.randomPractice

class CharactersPractice {
    static void main(String[] args) {
        //There is no character literal is groovy but three ways to fulfill it
        char c1 = 'A'
        assert c1 instanceof Character

        def c2 = 'B' as char
        assert c2 instanceof Character

        def c3 = (char)'C'
        assert c3 instanceof Character
    }
}
