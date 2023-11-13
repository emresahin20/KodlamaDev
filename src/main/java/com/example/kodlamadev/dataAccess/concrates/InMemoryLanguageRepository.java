package com.example.kodlamadev.dataAccess.concrates;

import com.example.kodlamadev.dataAccess.abstracts.LanguageRepository;
import com.example.kodlamadev.entities.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language>languages;

    public InMemoryLanguageRepository(){
        languages = new ArrayList<>();
        languages.add(new Language(1,"Java"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"Python"));
    }
    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void add(Language language) {
    languages.add(language);
    }

    @Override
    public void delete(int id) throws Exception {
        languages.remove(getById(id));
    }

    @Override
    public void update(Language language) {
        languages.set((language.getId()-1),language);
    }

    @Override
    public Language getById(int id) throws Exception {
        for (Language language:languages) {
            if (language.getId()==id){
                return language;
            }
        }
        throw new Exception("Id Bulunamadı.");
    }
}
