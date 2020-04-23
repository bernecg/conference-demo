package com.bernardcg.conferencedemo.repositories;

import com.bernardcg.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
