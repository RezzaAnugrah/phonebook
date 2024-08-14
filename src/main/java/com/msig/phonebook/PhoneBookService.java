package com.msig.phonebook;

public interface PhoneBookService {
    
    ResponseData createPhoneBook(Phonebook phonebook);
    ResponseData readPhoneBook(Phonebook phonebook);
    ResponseData updatePhoneBook(Phonebook phonebook);
    ResponseData deletePhoneBook(Phonebook phonebook);
}
