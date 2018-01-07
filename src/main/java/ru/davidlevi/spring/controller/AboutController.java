package ru.davidlevi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class AboutController {
    /**
     * Метод welcome обрабатывает запрос "/about", а именно "http://localhost:8080/about"
     *
     * @param model Map
     * @return String
     */
    @RequestMapping("/about")
    public String about(Map<String, Object> model) {
        return "about";
    }
}
