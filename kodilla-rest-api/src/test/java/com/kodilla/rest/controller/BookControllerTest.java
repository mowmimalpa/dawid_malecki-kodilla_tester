package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {

    @Test
    public void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        //when
        List<BookDto> result = bookController.getBooks();
        //then
        assertThat(result).hasSize(2);

    }

    @Test
    public void testAddBook() {

        //give
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        //when
        BookDto book = bookController.addBook(new BookDto("Title 3", "Author 3"));
        booksList.add(book);
        System.out.println(booksList.size());
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
        //then
        assertThat(booksList).hasSize(1);

    }
}