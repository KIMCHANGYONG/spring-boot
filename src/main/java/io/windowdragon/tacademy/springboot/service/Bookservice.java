package io.windowdragon.tacademy.springboot.service;

import java.util.Optional;

import io.windowdragon.tacademy.springboot.domain.Book;

public interface Bookservice {

	Optional<Book> findById(Long Id);
	
}