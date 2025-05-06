package com.example.math_game_backend.controller;

import com.example.math_game_backend.model.Score;
import com.example.math_game_backend.repository.ScoreRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/scores")
public class ScoreController {
    private final ScoreRepository scoreRepository;


    public ScoreController(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    @PostMapping
    public ResponseEntity<Score> submitScore(@RequestBody Score score) {
        Score savedScore = scoreRepository.save(score);
        return ResponseEntity.ok(savedScore);
    }

    @GetMapping("/leaderboard")
    public List<Score> getLeaderboard() {
        return scoreRepository.findTop5ByOrderByPointsDesc();
    }
}
