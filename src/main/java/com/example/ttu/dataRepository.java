package com.example.ttu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dataRepository extends JpaRepository<ttu, String> {
}
