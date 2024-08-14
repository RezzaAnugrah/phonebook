package com.msig.phonebook;

import java.util.Optional;

public interface PhoneBookService {
    
    ResponseData createPhoneBook(Phonebook phonebook);
    ResponseData readPhoneBook(Phonebook phonebook);
    ResponseData updatePhoneBook(Phonebook phonebook);
    ResponseData deletePhoneBook(Phonebook phonebook);
    Optional<Phonebook> getFindPhoneBookID(Long id);
    ResponseData getAllPhoneBook();

}
