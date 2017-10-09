package com.xinjian.practice

class IdentifierPractice {
    static void main(String[] args) {
        def testMap = [:]
        testMap."this is a double quoted string with spaces as a identifier" = "the value of double quoted identifier"
        testMap./this-is-a-slashy-string-with-dashes-as-a-identifier/ = /The value of slashy string/
        testMap.someNormalIdentifier= "the value of a normal one"
        println testMap.someNormalIdentifier
        println testMap./this-is-a-slashy-string-with-dashes-as-a-identifier/
        println testMap."this is a double quoted string with spaces as a identifier"


    }
}
