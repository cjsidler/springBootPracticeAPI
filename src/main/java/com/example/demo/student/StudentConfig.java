package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student harry = new Student(
                    "Harry",
                    LocalDate.of(1980, Month.JULY, 31),
                    "harry@gryffindor.hogwarts.co.uk"
            );

            Student hermione = new Student(
                    "Hermione",
                    LocalDate.of(1979, Month.SEPTEMBER, 19),
                    "hermione@gryffindor.hogwarts.co.uk"
            );

            Student ron = new Student(
                    "Ronald",
                    LocalDate.of(1980, Month.MARCH, 1),
                    "hermione@gryffindor.hogwarts.co.uk"
            );

            Student draco = new Student(
                    "Draco",
                    LocalDate.of(1980, Month.JUNE, 5),
                    "draco@slytherin.hogwarts.co.uk"
            );

            studentRepository.saveAll(
                    List.of(harry, hermione, ron, draco)
            );
        };
    }
}
