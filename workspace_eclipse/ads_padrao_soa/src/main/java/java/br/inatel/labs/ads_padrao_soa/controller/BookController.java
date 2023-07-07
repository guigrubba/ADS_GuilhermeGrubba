package java.br.inatel.labs.ads_padrao_soa.controller;

import java.br.inatel.labs.ads_padrao_soa.model.entity.Book;
import java.br.inatel.labs.ads_padrao_soa.model.service.BookService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAllBooks(){
        List<Book> books = service.searchBook();
        return books;
    }

}