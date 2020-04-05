package io.windowdragon.tacademy.springboot.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;



@DataJpaTest

@RunWith(SpringRunner.class)

public class BookRepositoryTest {
   @Autowired
   BookRepository repository;
   
   
   
   @org.junit.Test
   public void testSave() {
	   Book book = new Book();
	   book.setName("boot-spring-boot");
	   book.setIsbn10("0123456789");
	   book.setIsbn13("0123456789012");
	   
	   assertThat(book.isNew()).isTrue();
	   
	   repository.save(book);
	   
	   assertThat(book.isNew()).isFalse();
   }
   
   @org.junit.Test
   public void testFindByNameLike() {
	   Book book = new Book();
	   book.setName("boot-spring-boot");
	   book.setIsbn10("0123456789");
	   book.setIsbn13("0123456789012");
	   
	   repository.save(book);
	   
	   List<Book>books = repository.findByNameLike("boot");
	   //assertThat(books).isNotEmpty();
	   
	   books = repository.findByNameLike("book");
	  // assertThat(books).isEmpty();
   }
}

