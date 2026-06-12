package com.life.dev.repository;

import com.life.dev.entity.SchoolEntity;
import com.life.dev.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepo extends JpaRepository<SchoolEntity,Long>{


}
