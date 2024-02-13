package com.petromirdzhunev.spring.boot.nlayered.service;

import org.springframework.stereotype.Service;

import com.petromirdzhunev.spring.boot.nlayered.repository.BookDao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {

	private final BookDao bookDao;
}
