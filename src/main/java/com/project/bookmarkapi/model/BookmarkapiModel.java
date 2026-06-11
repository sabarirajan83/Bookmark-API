package com.project.bookmarkapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bookmarks")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class BookmarkapiModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String url;
    private String category;
}