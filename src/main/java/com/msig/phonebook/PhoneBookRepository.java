package com.msig.phonebook;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface PhoneBookRepository extends JpaRepository<Phonebook, Long> {
    List<Phonebook> findByNameContaining(String name);
}