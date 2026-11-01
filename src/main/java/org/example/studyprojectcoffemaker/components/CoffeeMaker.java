package org.example.studyprojectcoffemaker.components;

import org.springframework.stereotype.Component;

@Component //аннотация говорит что при запуске найди этот класс, создай из него объект (бин)
public class CoffeeMaker {
    public String makeCoffee() {
        return "☕ Кофе готов!";
    }
}
