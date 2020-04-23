package com.bernardcg.conferencedemo.repositories;

import com.bernardcg.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
