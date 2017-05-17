package com.specialpoint.crawlercoloringpageskid.repository;

import com.specialpoint.crawlercoloringpageskid.model.Image;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by thinhdd
 * Date 5/17/2017.
 */
public interface ImageRepository extends CrudRepository<Image, Long> {
    @Query("select ig from Image ig")
    List<Image> getAll();
}
