package com.kt.edu.firstproject.repository;

import com.kt.edu.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    //Article의 대표값 Id의 타입을 적어줘야함 -> long

    @Override
    ArrayList<Article> findAll();
}
