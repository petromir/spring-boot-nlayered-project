package com.petromirdzhunev.spring.boot.nlayered.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petromirdzhunev.spring.boot.nlayered.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/books")
@RequiredArgsConstructor
public class BookController {

	private final BookService bookService;
}
