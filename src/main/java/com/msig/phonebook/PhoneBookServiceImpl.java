package com.msig.phonebook;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class PhoneBookServiceImpl implements PhoneBookService {

    PhoneBookRepository phoneBookRepository;

    public PhoneBookServiceImpl(PhoneBookRepository phoneBookRepository) {
        this.phoneBookRepository = phoneBookRepository;
    }

    @Override
    public ResponseData createPhoneBook(Phonebook phonebook) {
        phoneBookRepository.save(phonebook);
        return new ResponseData("00","Success", phonebook);
    }
    
    @Override
    public ResponseData deletePhoneBook(Phonebook phonebook) {
        phoneBookRepository.delete(phonebook);
        return new ResponseData("00","Success", phonebook);
    }
    
    @Override
    public ResponseData readPhoneBook(Phonebook phonebook) {
        List<Phonebook> phonebooks = phoneBookRepository.findByNameContaining(phonebook.getName());
        return new ResponseData("00","Success", phonebooks);
    }
    
    @Override
    public ResponseData updatePhoneBook(Phonebook phonebook) {
        phoneBookRepository.saveAndFlush(phonebook);
        return new ResponseData("00","Success", phonebook);
    }

    @Override
    public ResponseData getAllPhoneBook() {
        return new ResponseData("00","Success", phoneBookRepository.findAll());
    }

    @Override
    public Optional<Phonebook> getFindPhoneBookID(Long id) {
        return phoneBookRepository.findById(id);
    }   
}