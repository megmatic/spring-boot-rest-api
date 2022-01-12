package com.megmatic.springbootrestapi.repository;

import com.megmatic.springbootrestapi.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Integer> {

}
