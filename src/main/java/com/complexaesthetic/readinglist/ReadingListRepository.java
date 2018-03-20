package com.complexaesthetic.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * filename:
 * project: readinglist
 * author: https://github.com/vvmk
 * date: 3/19/18
 */

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
