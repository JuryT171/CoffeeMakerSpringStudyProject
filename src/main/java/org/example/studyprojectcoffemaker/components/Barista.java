package org.example.studyprojectcoffemaker.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Barista {
    private final CoffeeMaker coffeeMaker;

    @Autowired
    // Spring идет в свой контейнер, достает оттуда готовый бин coffeeMaker
    // и передает его сюда как аргумент,потому что он нужен для создания бариста
    public Barista(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    public void serveCoffee() {
        System.out.println(coffeeMaker.makeCoffee());
    }
}
