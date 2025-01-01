package org.anve.LibraryManagementSystem.Config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class HibernateConfig
{
    @Bean
    public SessionFactory sessionFactory() {
        return new Configuration()
                .configure()
                .addAnnotatedClass(org.anve.LibraryManagementSystem.Entity.UserEntity.class) // Add your annotated entity classes here
                .buildSessionFactory();
    }
}
