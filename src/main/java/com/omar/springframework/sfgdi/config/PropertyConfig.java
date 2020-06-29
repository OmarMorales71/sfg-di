package com.omar.springframework.sfgdi.config;

import com.omar.springframework.sfgdi.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")//classpath del archivo donde estan nuestras nuevas propiedades
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${com.omar.username}")//se asigna el valor de la propiedad com.omar.username
    String user;

    @Value("${com.omar.password}")
    String password;

    @Value("${com.omar.ddbbUrl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(env.getProperty("USERNAME"));//Obtener una propiedad o variable de entorno del sistema operativo
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
