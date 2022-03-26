package com.webflux.homework.controller;

import com.webflux.homework.domain.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class WebFluxController {

    @GetMapping(value = "/books")
    public Flux<BookDto> getBooks(){
        BookDto b1 = new BookDto("Titile1", "Author1", 2000);
        BookDto b2 = new BookDto("Titile2", "Author2", 2001);
        BookDto b3 = new BookDto("Titile3", "Author3", 2002);
        BookDto b4 = new BookDto("Titile4", "Author4", 2003);

        return Flux
                .just(b1, b2, b3, b4)
                .log();
    }
}
