package com.petromirdzhunev.service;

import org.springframework.stereotype.Service;

import com.petromirdzhunev.repository.BookDao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {

	private final BookDao bookDao;
}