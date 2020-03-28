package io.windowdragon.tacademy.springboot.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import io.windowdragon.tacademy.springboot.domain.Book;


@SpringBootTest(webEnvironment=WebEnvironment.NONE)


public class BookServiceTest {

	@Autowired
	Bookservice bookService;
	
	@Test
	public void testFindById() {
		
		Long Id = 1L;
		bookService.findById(Id)
		    .orElseThrow(()-> new RuntimeException("Not Found"));
	}
	}

