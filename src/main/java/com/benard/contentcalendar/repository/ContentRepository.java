package com.benard.contentcalendar.repository;

import com.benard.contentcalendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
}
