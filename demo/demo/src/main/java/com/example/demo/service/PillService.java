package com.example.demo.service;

import com.example.demo.model.Pill;
import com.example.demo.repository.PillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PillService {
    @Autowired
    private PillRepository pillRepository;

    public Pill savePill(Pill pill) {
        return pillRepository.save(pill);
    }
}
