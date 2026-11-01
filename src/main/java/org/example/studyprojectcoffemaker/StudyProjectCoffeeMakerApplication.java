package org.example.studyprojectcoffemaker;

import org.example.studyprojectcoffemaker.components.Barista;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

// @SpringBootApplication — это "три в одном".
// Она включает в себя:
// 1. @Configuration (разрешает настраивать бины)
// 2. @EnableAutoConfiguration (включает автоконфигурацию Spring Boot)
// 3. @ComponentScan (говорит Spring сканировать этот пакет и все вложенные
//    пакеты на наличие аннотаций вроде @Component, @Service и т.д.)
@SpringBootApplication
public class StudyProjectCoffeeMakerApplication {

    public static void main(String[] args) {
        // SpringApplication.run запускает Spring Boot
        // Внутри происходит - создается IoC-контейнер
        // сканируются классы, создаются бины, внедряются зависимости.
        // Возвращает нам объект ApplicationContext — это и есть наш IoC-контейнер.
        ApplicationContext context =
                SpringApplication.run(StudyProjectCoffeeMakerApplication.class, args);

        // Получаем Barista из IoC контейнера
        // Мы просим контейнер: "Дай мне готовый бин типа Barista".
        // Spring не создает его здесь заново, он отдает тот, который
        // уже был собран при старте (и в который уже была внедрена кофеварка).
        Barista barista = context.getBean(Barista.class);
        barista.serveCoffee();

        // Также доступен бин с кофейным рецептом
        String recipe = context.getBean(String.class);
        System.out.println(recipe);
    }

}
