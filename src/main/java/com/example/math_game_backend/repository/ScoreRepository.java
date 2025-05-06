package com.example.math_game_backend.repository;

import com.example.math_game_backend.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Long> {
    List<Score> findTop5ByOrderByPointsDesc();
}
