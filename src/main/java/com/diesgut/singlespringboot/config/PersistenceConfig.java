/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diesgut.singlespringboot.config;

/*
import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;
import javax.servlet.DispatcherType;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.hibernate5.support.OpenSessionInViewFilter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class PersistenceConfig {

    @Value("${spring.datasource.username}")
    String username;

    @Value("${spring.datasource.password}")
    String password;

    @Value("${spring.datasource.driver-class-name}")
    String driver;

    @Value("${spring.datasource.url}")
    String jdbcUrl;

    @Bean
    public ComboPooledDataSource dataSource() throws PropertyVetoException {

        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass(this.driver);
        ds.setJdbcUrl(this.jdbcUrl);
        ds.setUser(this.username);
        ds.setPassword(this.password);
        ds.setAcquireIncrement(3);
        ds.setMinPoolSize(3);
        ds.setMaxPoolSize(10);
        ds.setMaxIdleTime(20);

        return ds;
    }

    @Autowired
    @Bean(name = "sessionFactory")
    public LocalSessionFactoryBean factoryBean(ComboPooledDataSource ds) {

        LocalSessionFactoryBean fb = new LocalSessionFactoryBean();
        fb.setDataSource(ds);
        fb.setPackagesToScan("pe.albatross.unalm-connector.model");

        Properties prop = new Properties();
        prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        prop.setProperty("hibernate.show_sql", "true");
        //prop.setProperty("hibernate.hbm2ddl.auto", "create");
        prop.setProperty("hibernate.connection.release_mode", "after_transaction");
        prop.setProperty("hibernate.connection.useUnicode", "true");
        prop.setProperty("hibernate.connection.charSet", "UTF8");

        fb.setHibernateProperties(prop);

        return fb;
    }

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sf) {
        HibernateTransactionManager transManager = new HibernateTransactionManager();
        transManager.setSessionFactory(sf);
        return transManager;
    }

    @Bean
    public FilterRegistrationBean someFilterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(someFilter());
        registration.addUrlPatterns("/*");
        registration.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
        registration.setName("hibernateFilter");
        return registration;
    }

    @Bean(name = "hibernateFilter")
    public OpenSessionInViewFilter someFilter() {
        OpenSessionInViewFilter filter = new OpenSessionInViewFilter();
        filter.setSessionFactoryBeanName("sessionFactory");

        return filter;
    }

}
 */
