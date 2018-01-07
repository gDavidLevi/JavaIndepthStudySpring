package ru.davidlevi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class SearchController {
    /**
     * Метод welcome обрабатывает запрос "/search/{sdata}", а именно "http://localhost:8080/search/{sdata}".
     * Данный метод будет получать (method = RequestMethod.GET) данные из запроса.
     * Переменная {sdata} из запроса будет ассоциирована как параметр sdata.
     *
     * @param model Map
     * @param sdata String
     * @return String
     */
    @RequestMapping(value = "/search/{sdata}", method = RequestMethod.GET)
    public String search(Map<String, Object> model, @PathVariable("sdata") String sdata) {
        model.put("query", sdata);
        return "search";
    }
}
