package org.zerock;

import javax.servlet.Filter;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.zerock.filter.SampleFilter;

@SpringBootApplication
@MapperScan(value = { "org.zerock.mapper" })
public class AppTestApplication {

  public static void main(String[] args) {
    SpringApplication.run(AppTestApplication.class, args);
  }

  @Bean
  public SqlSessionFactory sqlSessionFactory(DataSource dataSource) 
      throws Exception {
    
    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(dataSource);

    Resource[] res = 
        new PathMatchingResourcePatternResolver().
        getResources("classpath:mappers/*Mapper.xml");

    sessionFactory.setMapperLocations(res);

    return sessionFactory.getObject();
  }
  
  @Bean
  public FilterRegistrationBean someFilterRegistration() {

      FilterRegistrationBean<Filter> registration = new FilterRegistrationBean();
      registration.setFilter(getFilter());
      registration.addUrlPatterns("/test/*");
      
      registration.setName("sampleFilter");
      return registration;
  }

  public Filter getFilter() {
      return new SampleFilter();
  }
}
