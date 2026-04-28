package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.TrainingLog;

@Repository
public interface TrainingRepository extends JpaRepository<TrainingLog, Long> {
    // これだけで、保存(save)・全件取得(findAll)・削除(deleteById)が使える
}
