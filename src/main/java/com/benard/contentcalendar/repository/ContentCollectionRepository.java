package com.benard.contentcalendar.repository;

import com.benard.contentcalendar.model.Content;
import com.benard.contentcalendar.model.Status;
import com.benard.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {

    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostMapping("")
    public void save(@RequestBody Content content) {
        contentList.add(content);
    }

    @PostConstruct
    private void init(){
        Content c = new Content(1,
                "My First Blog Post",
                "My Fist Blog Post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");
        contentList.add(c);
    }

    public boolean existById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }
}
