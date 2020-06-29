package com.omar.springframework.sfgdi.config;

import com.omar.springframework.sfgdi.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")//classpath del archivo donde estan nuestras nuevas propiedades
public class PropertyConfig {

    @Value("${com.omar.username}")//se asigna el valor de la propiedad com.omar.username
    String user;

    @Value("${com.omar.password}")
    String password;

    @Value("${com.omar.ddbbUrl}")
    String url;

    @Bean
    public FakeDataSource fakeDatsaSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    //Este bean se utiliza para scanear y leer  las propiedades del archivo properties indicado arriba
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();

    }
}
