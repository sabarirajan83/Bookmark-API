package com.project.bookmarkapi.controller;

import com.project.bookmarkapi.model.BookmarkapiModel;
import com.project.bookmarkapi.service.BookmarkapiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@CrossOrigin

public class BookmarkapiController {

    private final BookmarkapiService service;

    public BookmarkapiController(BookmarkapiService service) {
        this.service = service;
    }

    @PostMapping
    public BookmarkapiModel addBookmark(@RequestBody BookmarkapiModel bookmark) {
        return service.save(bookmark);
    }

    @GetMapping
    public List<BookmarkapiModel> getAllBookmarks() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public BookmarkapiModel updateBookmark(@PathVariable Long id, @RequestBody BookmarkapiModel updated) {
        BookmarkapiModel existing = service.getById(id);

        existing.setTitle(updated.getTitle());
        existing.setUrl(updated.getUrl());
        existing.setCategory(updated.getCategory());

        return service.save(existing);
    }

    @DeleteMapping("/{id}")
    public void deleteBookmark(@PathVariable Long id) {
        service.delete(id);
    }
}