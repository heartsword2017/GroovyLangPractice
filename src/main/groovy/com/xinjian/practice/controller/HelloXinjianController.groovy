package com.xinjian.practice.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class HelloXinjianController {

    @RequestMapping(value="/helloxinjian", method = RequestMethod.GET, produces = 'application/html')
    String sayHelloXinjian(){
        return 'Hello Xinjian. There is your first groovy spring MVC app'
    }

}
