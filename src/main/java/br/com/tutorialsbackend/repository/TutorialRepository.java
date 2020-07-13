package br.com.tutorialsbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tutorialsbackend.model.Tutorial;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	  List<Tutorial> findByPublished(boolean published);
	  List<Tutorial> findByTitleContaining(String title);
	}