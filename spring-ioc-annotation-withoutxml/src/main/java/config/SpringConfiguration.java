package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

/**
 * 相当于bean.xml
 *
 */
@Configuration
@ComponentScan("org.example")   //<context:component-scan base-package="org.example"></context:component-scan>
public class SpringConfiguration {


    /*
    <bean id="birthday" class="java.util.Date">
        <constructor-arg name="year" value="95"></constructor-arg>
        <constructor-arg name="month" value="6"></constructor-arg>
        <constructor-arg name="date" value="22"></constructor-arg>
    </bean>
     */
    @Bean("birthday")
    public Date createDate(int year, int month, int date) {
        return new Date(year, month, date);
    }

    @Bean("year")
    public int getYear() {
        return 95;
    }

    @Bean("month")
    public int getMonth() {
        return 6;
    }

    @Bean("date")
    public int getDate() {
        return 22;
    }

}
