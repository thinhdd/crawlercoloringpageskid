package com.specialpoint.crawlercoloringpageskid.repository;

import com.specialpoint.crawlercoloringpageskid.model.Category;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by thinhdd
 * Date 5/17/2017.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    @Query("select ig.name from Image ig")
    List<String> findAllName();
}
