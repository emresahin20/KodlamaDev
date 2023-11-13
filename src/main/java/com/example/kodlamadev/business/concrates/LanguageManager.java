package com.example.kodlamadev.business.concrates;

import com.example.kodlamadev.business.abstracts.LanguageService;
import com.example.kodlamadev.dataAccess.abstracts.LanguageRepository;
import com.example.kodlamadev.entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void add(Language language) throws Exception {
    List <Language> languages;
    languages = languageRepository.getAll();
        for (Language language1:languages) {
            if (language1.getName().equalsIgnoreCase(language.getName())){
                throw new Exception("Zaten Bu Isim Mevcut.");
            }
            if (language1.getName().isBlank()){
                throw new Exception("Isim Kısmı Boş Bırakılamaz. ");
            }
        }
        languageRepository.add(language);
    }

    @Override
    public void delete(int id) throws Exception {
    if (isIdExist(id)){
        languageRepository.delete(id);
    }
    }

    @Override
    public void update(Language language) throws Exception {
        List <Language> languages;
        languages = languageRepository.getAll();
        for (Language language2:getAll()) {
            if (language2.getName().equalsIgnoreCase(language.getName())){
                throw new Exception("Aynı Isimle Güncelleme Yapılamaz. ");
            }
            if (language2.getName().isBlank()){
                throw new Exception("Boş Güncelleme Yapılmaz. ");
            }
        }
        languageRepository.update(language);
    }

    @Override
    public Language getById(int id) throws Exception {
        return languageRepository.getById(id);
    }
    public boolean isIdExist(int id) throws Exception {
        for (Language language:getAll()) {
            if (language.getId() == id){
                return true;
            }
        }
        throw new Exception("ID Yok. ");
    }
}
