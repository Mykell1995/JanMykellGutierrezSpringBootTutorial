package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return  args -> {
            Student mykell = new Student(
                    1L, "Mykell", "mykell.gutierrez@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );
            Student jan = new Student(
                     "jan", "jan.gutierrez@gmail.com",
                    LocalDate.of(2004, JANUARY, 5)
            );

            repository.saveAll(List.of(mykell, jan));

        };
    }
}

