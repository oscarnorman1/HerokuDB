package com.testdb.herokudbtest.controllers;

import com.testdb.herokudbtest.models.Fruit;
import com.testdb.herokudbtest.repo.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/fruit")
public class FruitController {

    @Autowired
    private FruitRepository fruitRepository;

    @GetMapping(path = "/add")
    public @ResponseBody String addFruit(@RequestParam String name, @RequestParam String color) {
        Fruit f = new Fruit(name, color);
        fruitRepository.save(f);
        return "Frukt adderad!";
    }

    @GetMapping(path = "/allFruits")
    public @ResponseBody Iterable<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }

}
