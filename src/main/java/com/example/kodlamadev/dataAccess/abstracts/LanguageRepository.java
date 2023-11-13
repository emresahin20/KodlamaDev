package com.example.kodlamadev.dataAccess.abstracts;

import com.example.kodlamadev.entities.Language;

import java.util.List;

public interface LanguageRepository {

    List <Language> getAll();

    void add(Language language);
    void delete(int id) throws Exception;
    void update(Language language);
    Language getById(int id) throws Exception;


}
