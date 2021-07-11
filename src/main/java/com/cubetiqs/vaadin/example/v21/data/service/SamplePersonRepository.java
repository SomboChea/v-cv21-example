package com.cubetiqs.vaadin.example.v21.data.service;

import com.cubetiqs.vaadin.example.v21.data.entity.SamplePerson;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, Integer> {

}