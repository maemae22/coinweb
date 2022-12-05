package com.example.coinweb.service;

import com.example.coinweb.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ContactService {

    @Autowired
    ContactRepository repository;

    public int insertContact(HashMap<String, String> params) {
        return repository.insertContact(params);
    }
}
