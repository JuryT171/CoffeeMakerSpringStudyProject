package org.example.studyprojectcoffemaker.components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoffeeShopConfig {
    @Bean
    public String coffeeRecipe() {
        return "Рецепт кофе: взять кофе, добавить воды и любви!";
    }
}
