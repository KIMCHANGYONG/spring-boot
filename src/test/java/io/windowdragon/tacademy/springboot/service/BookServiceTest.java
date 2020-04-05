package io.windowdragon.tacademy.springboot.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import java.lang.RuntimeException;
import java.lang.IllegalStateException;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)

public class BookServiceTest {
	@Autowired
	BookServiceimpl bookService;
	@Test(expected=RuntimeException.class)
	public void testFindById() {
		Long id = 1L;
		bookService.findById(id).orElseThrow(()->new RuntimeException("Not Found"));
		
	}
}
