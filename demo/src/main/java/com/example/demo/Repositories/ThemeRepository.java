package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Integer>{

}
