package ru.davidlevi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller  // данный класс - это контроллер, который будет обрабатывать запрос @RequestMapping("/")
public class WelcomeController {
    /**
     * Метод welcome обрабатывает запрос "/", а именно "http://localhost:8080/"
     *
     * @param model Map
     * @return String
     */
    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {

        /* В темплете welcome.html есть переменная key="message" и типом "java.lang.String"
         * Мы можем к ней обратиться через метод put() */
        model.put("message", "David");
        return "welcome";
    }
}
