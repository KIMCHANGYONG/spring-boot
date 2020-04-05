package io.windowdragon.tacademy.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import io.windowdragon.tacademy.springboot.domain.Book;
import io.windowdragon.tacademy.springboot.domain.BookRepository;

@Service
@Transactional

class BookServiceimpl implements BookService {

	private final BookRepository bookRepository;	
	

	public BookServiceimpl(BookRepository bookRepository) {

		this.bookRepository = bookRepository;
	}

	@Override
	public Optional<Book> findById(Long Id) {
		return bookRepository.findById(Id);
	}

}
