package org.example.config;

import org.example.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateConfig {

    public static SessionFactory getSession(){
        Properties properties=new Properties();
        properties.put(Environment.DRIVER,"org.postgresql.Driver");
        properties.put(Environment.URL,"jdbc:postgresql://localhost:5432/postgres");
        properties.put(Environment.USER,"postgres");
        properties.put(Environment.PASS,"postgres");
        properties.put(Environment.HBM2DDL_AUTO,"create-drop ");
        properties.put(Environment.DIALECT,"org.hibernate.dialect.PostgreSQLDialect");
        properties.put(Environment.SHOW_SQL,"true");

        Configuration configuration=new Configuration();
        configuration.addProperties(properties);
        configuration.addAnnotatedClass(Student.class);


        return configuration.buildSessionFactory();


    }

}
