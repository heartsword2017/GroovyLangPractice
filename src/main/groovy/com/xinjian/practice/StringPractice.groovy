package com.xinjian.practice

import org.codehaus.groovy.syntax.Numbers

/**
 * Created by xinjianyao on 10/6/17.
 */
class StringPractice {

    static void main(String[] args) {
        String a = 'single quoted string is a java string'
        String b = '''triple quoted string 
                    can
                    be
                    multiple
                    lines'''
        String c = "double quoted string is a java string without interpolation"
        int d = 1312
        String e = "Number is $d" + ". Double quoted string is a GString if interpolation is present"
//        String f = "Number is $d.toString()" + "will fail cuz dollar sign is for dotted expression, use \${} instead"
        String f = "Number is ${d.toString()}"
        String g ="""Triple double quoted strings behave like double quoted strings, 
                    with the addition that they are multiline
                    and the value of number is $d"""

        String h = /slashy string is good for regx, no need to escape backslash/
        String i = /slashy string can
                    also be multiple lines/
        String j = /slashy string also
                    support interpolation so
                    the value of the number is ${d}/

        String k = $/Dollar slashy string are multiple lines and
                    no dollar sign is the escaping character
                    There is no need to escape $ or /
                    but you need to escape $$$/ and $/$$
                    /$


        println e
        println f
        println g
        println i
        println j
        println k
    }


}
