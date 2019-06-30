package pl.lucky.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
public class Article {

    private String title;
    private String content;
    private List<String> tags;

    public Article(String title, String content, String tags) {
        this.title = title;
        this.content = content;
        if (tags != null && tags.length() > 0) {
            this.tags = Arrays.asList(tags.split(","));
        } else {
            this.tags = Collections.emptyList();
        }
    }
}
