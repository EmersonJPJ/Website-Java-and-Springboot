package com.tienda;


import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 *
 * @author emers
 */
@Configuration
public class WebConfig implements WebMvcConfigurer{
    @Bean
    public LocaleResolver localeResolver(){
        var srl=new SessionLocaleResolver();
        srl.setDefaultLocale(new Locale("es"));
        return srl;
    }
    
    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor(){
        var lci=new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registro){
        registro.addInterceptor(localeChangeInterceptor());
    }
    
}
