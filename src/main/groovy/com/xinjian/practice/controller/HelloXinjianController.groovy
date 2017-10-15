package com.xinjian.practice.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HelloXinjianController {

    @RequestMapping(value="/helloxinjian", method = RequestMethod.GET, produces = 'application/json')
    @ResponseBody
    String sayHelloXinjian(){
        println "Hi, Xinjian! You hit the your first controller! Congratz!"
        return 'The output of your first controller!!!'
    }


    @RequestMapping(value="/testData", method = RequestMethod.GET, produces = 'application/json')
    @ResponseBody
    String generateTestData(){
        def Data = '''{"menu": {
  "id": "file",
  "value": "File",
  "popup": {
    "menuitem": [
      {"value": "New", "onclick": "CreateNewDoc()"},
      {"value": "Open", "onclick": "OpenDoc()"},
      {"value": "Close", "onclick": "CloseDoc()"}
    ]
  }
}}'''
        return Data
    }
}
