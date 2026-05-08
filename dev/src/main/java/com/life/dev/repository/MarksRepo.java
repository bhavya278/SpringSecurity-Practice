package com.life.dev.repository;

import com.life.dev.entity.MarksEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksRepo extends JpaRepository<MarksEntity,Long> {
}
