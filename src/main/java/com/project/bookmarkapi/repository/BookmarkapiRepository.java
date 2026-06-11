package com.project.bookmarkapi.repository;

import com.project.bookmarkapi.model.BookmarkapiModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkapiRepository extends JpaRepository<BookmarkapiModel, Long> {
}