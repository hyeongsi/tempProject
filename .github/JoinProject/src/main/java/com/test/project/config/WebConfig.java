//package com.test.project;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		//WebMvcConfigurer.super.addCorsMappings(registry);
//		
//		//registry.addMapping("/**").allowedOrigins("http://localhost:8090");
//		registry.addMapping("/**").allowedOrigins("*"); //모든 경로 모든 곳에서 접속 가능하게 설정
//		registry.addMapping("/search").allowedOrigins("schoolSearch"); //모든 경로 모든 곳에서 접속 가능하게 설정
//	}
//	
//
//}
package com.test.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	/*
	@Override
    public void addCorsMappings(CorsRegistry registry) {
    	registry.addMapping("/**").allowedOrigins("*"); //모든 경로 모든 곳에서 접속 가능하게 설정
    }
	
	*/
	
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/schedule").setViewName("schedule");
        registry.addViewController("/timetable").setViewName("timetable");
        registry.addViewController("/timetable3").setViewName("timetable3");
        registry.addViewController("/search").setViewName("schoolSearch");
        registry.addViewController("/blank").setViewName("blank");
        
        
    }
}