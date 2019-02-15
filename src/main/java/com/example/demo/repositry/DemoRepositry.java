package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepositry extends JpaRepository<DemoModel,Long> {
	
}
