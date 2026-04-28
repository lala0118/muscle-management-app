package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TrainingLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;              // ID（背番号）

    private LocalDate date;       // 日付
    private String exerciseName;  // 種目名
    private Double bodyHeight;    // 身長
    private Double bodyWeight;    // 体重
    private Double loadWeight;    // 重量
    private Integer reps;         // 回数
    private Integer sets;         // セット数
    private Double estimatedMax;  // 推定MAX
    private Double durationHours; // 実施時間(1.5時間...
    
 // --- コンストラクタ ---
    // Spring BootがDBからデータを取り出す時に必要
    public TrainingLog() {}

    // --- Getter / Setter --
    // 他のクラス（ControllerやService）から値を読み書きするために必要
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getExerciseName() { return exerciseName; }
    public void setExerciseName(String exerciseName) { this.exerciseName = exerciseName; }

    public Double getBodyHeight() { return bodyHeight; }
    public void setBodyHeight(Double bodyHeight) { this.bodyHeight = bodyHeight; }

    public Double getBodyWeight() { return bodyWeight; }
    public void setBodyWeight(Double bodyWeight) { this.bodyWeight = bodyWeight; }

    public Double getLoadWeight() { return loadWeight; }
    public void setLoadWeight(Double loadWeight) { this.loadWeight = loadWeight; }

    public Integer getReps() { return reps; }
    public void setReps(Integer reps) { this.reps = reps; }

    public Integer getSets() { return sets; }
    public void setSets(Integer sets) { this.sets = sets; }

    public Double getEstimatedMax() { return estimatedMax; }
    public void setEstimatedMax(Double estimatedMax) { this.estimatedMax = estimatedMax; }

    public Double getDurationHours() { return durationHours; }
    public void setDurationHours(Double durationHours) { this.durationHours = durationHours; }
}

