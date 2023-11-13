package com.example.kodlamadev.webApi.controllers;

import com.example.kodlamadev.business.abstracts.LanguageService;
import com.example.kodlamadev.entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
   private LanguageService languageService;

   @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<Language> getAll(){
        return languageService.getAll();
    }
    @PostMapping("/add")
    public void add(Language language) throws Exception{
        languageService.add(language);
    }
    @DeleteMapping("/delete")
    public void delete(int id) throws Exception{
        languageService.delete(id);
    }
    @PutMapping("/update")
    public void update(Language language) throws Exception{
        languageService.update(language);
    }
    @GetMapping("/getById")
    public Language getById (int id) throws Exception{
        return languageService.getById(id);
    }
}
