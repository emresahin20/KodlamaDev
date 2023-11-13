package com.example.kodlamadev.business.abstracts;

import com.example.kodlamadev.entities.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();

    void add(Language language) throws Exception;
    void delete(int id) throws Exception;
    void update(Language language) throws Exception;
    Language getById(int id) throws Exception;
}
