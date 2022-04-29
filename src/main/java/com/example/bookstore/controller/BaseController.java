package com.example.bookstore.controller;

import com.example.bookstore.dto.BookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BaseController {

    public ResponseEntity<List<BookDTO>> getBooks() {
       BookDTO book = BookDTO.builder().title("book-1").build();
       List<BookDTO> list = new ArrayList<>();
       list.add(book);
       return ResponseEntity.ok(list);

    }
}
