package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TrainingLog;
import com.example.demo.repository.TrainingRepository;

@Service
public class TrainingService {

    @Autowired
    private TrainingRepository repository;

    // 1. 全件取得（一覧表示用）
    public List<TrainingLog> findAll() {
        return repository.findAll();
    }

    // 2. 保存（計算ロジック付き）
    public void save(TrainingLog log) {
        // 推定MAXの計算式: 重量 * (1 + 回数/30)
        if (log.getLoadWeight() != null && log.getReps() != null) {
            double max = log.getLoadWeight() * (1 + log.getReps() / 30.0);
            // 小数点第1位で四捨五入するなら
            log.setEstimatedMax(Math.round(max * 10.0) / 10.0);
        }
        
        repository.save(log);
    }

    // 3. 削除
    public void delete(Long id) {
        repository.deleteById(id);
    }
}