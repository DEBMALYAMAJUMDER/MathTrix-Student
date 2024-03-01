package com.mathtrix.repository;

import com.mathtrix.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {
    @Query(nativeQuery = true, value = "SELECT * FROM STUDENT_INFO where NAME=:name")
    Collection<Students> findByName(@Param("name") String name) ;
}
