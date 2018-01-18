package ru;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

/**
 * Created by Dmitry Tkachenko on 1/18/18
 */
public class MyComponent {

    @Value("${test.one}")
    private String one;

    @Value("${test.two}")
    private String two;

    @PostConstruct
    private void init() {
        int k = 4; // ставим сюда брэкпоинт и проверям свойства one и two выше
    }

}
