package com.msig.phonebook;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/V1.0/phonebook")
public class PhoneBookController {

    PhoneBookService phoneBookService;

    public PhoneBookController(PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
    }

    @GetMapping (value = {"/"})
    public ResponseEntity<?> getAllContact(){
        ResponseData responseData =  phoneBookService.getAllPhoneBook();
        return ResponseEntity.status(HttpStatus.OK.value()).body(responseData);    
    }

    @PostMapping (value = {"/add"})
    public ResponseEntity<?> addContact(@RequestBody Phonebook phonebook){
        try{
            ResponseData responseData =  phoneBookService.createPhoneBook(phonebook);
            return ResponseEntity.status(HttpStatus.OK.value()).body(responseData);
        } catch(Exception e){
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping (value = {"/read"})
    public ResponseEntity<?> readContact(@RequestBody Phonebook phonebook){
        try{
            ResponseData responseData =  phoneBookService.readPhoneBook(phonebook);
            return ResponseEntity.status(HttpStatus.OK.value()).body(responseData);
        } catch(Exception e){
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(e.getMessage());
        }    }

    @PutMapping (value = {"/update"})
    public ResponseEntity<?> updateContact(@RequestBody Phonebook phonebook){
        try{
            ResponseData responseData =  phoneBookService.updatePhoneBook(phonebook);

            return ResponseEntity.status(HttpStatus.OK.value()).body(responseData);
        } catch(Exception e){
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @DeleteMapping (value = {"/delete"})
    public ResponseEntity<?> deleteContact(@RequestBody Phonebook phonebook){
        try{
            ResponseData responseData =  phoneBookService.deletePhoneBook(phonebook);
            return ResponseEntity.status(HttpStatus.OK.value()).body(responseData);
        } catch(Exception e){
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(e.getMessage());
        }    
    }
}