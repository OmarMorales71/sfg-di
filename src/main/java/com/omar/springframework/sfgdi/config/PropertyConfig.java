package com.omar.springframework.sfgdi.config;

import com.omar.springframework.sfgdi.examplebeans.FakeDataSource;
import com.omar.springframework.sfgdi.examplebeans.FakeDataSource2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//classpath del archivo donde estan nuestras nuevas propiedades
//@PropertySource({"classpath:datasource.properties", "classpath:datasource2.properties"})
/*@PropertySources({//Multiple property files
        @PropertySource({"classpath:datasource.properties"}),
        @PropertySource({"classpath:datasource2.properties"})
})*/
public class PropertyConfig {


    @Value("${com.omar.username}")//se asigna el valor de la propiedad com.omar.username
    String user;

    @Value("${com.omar.password}")
    String password;

    @Value("${com.omar.ddbbUrl}")
    String url;

    @Value("${com.omar2.username}")//se asigna el valor de la propiedad com.omar.username
            String user2;

    @Value("${com.omar2.password}")
    String password2;

    @Value("${com.omar2.ddbbUrl}")
    String url2;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);//fakeDataSource.setUser(env.getProperty("USERNAME"));//Obtener una propiedad o variable de entorno del sistema operativo
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeDataSource2 fakeDataSource2(){
        FakeDataSource2 fakeDataSource2 = new FakeDataSource2();
        fakeDataSource2.setUser(user2);
        fakeDataSource2.setPassword(password2);
        fakeDataSource2.setUrl(url2);
        return fakeDataSource2;
    }

    /*@Bean
    //Este bean se utiliza para scanear y leer  las propiedades del archivo properties indicado arriba
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();

    }*/
}
