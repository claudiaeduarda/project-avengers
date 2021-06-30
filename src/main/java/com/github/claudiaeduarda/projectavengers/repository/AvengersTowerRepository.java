package com.github.claudiaeduarda.projectavengers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.claudiaeduarda.projectavengers.models.Avengers;

public interface AvengersTowerRepository extends JpaRepository<Avengers, Long>{

}
