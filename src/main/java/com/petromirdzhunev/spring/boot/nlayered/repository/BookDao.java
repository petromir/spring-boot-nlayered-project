package com.petromirdzhunev.spring.boot.nlayered.repository;


import org.jooq.impl.DSL;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BookDao {
	private final DSL dsl;
}
