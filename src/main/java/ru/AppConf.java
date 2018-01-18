package ru;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.PostConstruct;

/**
 * Created by Dmitry Tkachenko on 1/18/18
 */
@Configuration
@PropertySource("classpath:database.properties")
public class AppConf {

    @Value("${test.one}")
    public String one;

    @Value("${test.two}")
    public String two;

    @PostConstruct
    private void init() {
        int z = 5; // ставим сюда брэкпоинт и проверям свойства one и two выше
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
