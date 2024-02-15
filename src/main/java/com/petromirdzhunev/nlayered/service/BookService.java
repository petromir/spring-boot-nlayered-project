package com.petromirdzhunev.nlayered.service;

import org.springframework.stereotype.Service;

import com.petromirdzhunev.nlayered.repository.BookDao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {

	private final BookDao bookDao;
}
