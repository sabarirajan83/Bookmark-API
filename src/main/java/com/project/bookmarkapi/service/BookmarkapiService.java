package com.project.bookmarkapi.service;

import com.project.bookmarkapi.model.BookmarkapiModel;
import com.project.bookmarkapi.repository.BookmarkapiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookmarkapiService {

    private final BookmarkapiRepository repository;

    public BookmarkapiService(BookmarkapiRepository repository) {
        this.repository = repository;
    }

    public BookmarkapiModel save(BookmarkapiModel bookmark) {
        return repository.save(bookmark);
    }

    public List<BookmarkapiModel> getAll() {
        return repository.findAll();
    }

    public BookmarkapiModel getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}