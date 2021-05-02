package com.example.projectmanagmenttool.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
        @RequestMapping(value = "/basic", method = RequestMethod.GET)
        @ResponseBody
  public String sayHello () {
          return "<h1>Hello</h1>";
        }
          @RequestMapping(value = "/proper", method = RequestMethod.GET)
          @ResponseBody
          public String sayProperHello () {
            return "<h1>Ello there, how are you? </h1>";

  }
}
