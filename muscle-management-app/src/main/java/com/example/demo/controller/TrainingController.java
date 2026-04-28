package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.TrainingLog;
import com.example.demo.service.TrainingService;

@Controller
public class TrainingController {

    @Autowired
    private TrainingService service;

    // 1. 一覧画面を表示する
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("logs", service.findAll());
        return "index"; // index.htmlを表示
    }

    // 2. 登録画面を表示する
    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("trainingLog", new TrainingLog());
        return "add"; // add.htmlを表示
    }

    // 3. 保存処理を実行する
    @PostMapping("/save")
    public String save(@ModelAttribute TrainingLog trainingLog) {
        service.save(trainingLog);
        return "redirect:/"; // 保存したら一覧画面に戻る
    }
    //4. 削除
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/"; // 削除したら一覧にリダイレクト
    }
}