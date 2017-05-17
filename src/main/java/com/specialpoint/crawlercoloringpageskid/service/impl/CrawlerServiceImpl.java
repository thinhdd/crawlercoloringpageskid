package com.specialpoint.crawlercoloringpageskid.service.impl;

import com.specialpoint.crawlercoloringpageskid.repository.CategoryRepository;
import com.specialpoint.crawlercoloringpageskid.repository.ImageRepository;
import com.specialpoint.crawlercoloringpageskid.service.CrawlerService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by thinhdd
 * Date 5/17/2017.
 */
@Service
public class CrawlerServiceImpl implements CrawlerService {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ImageRepository imageRepository;

    @Override
    public void getAllData(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select("ul.li.cat-item a");
        List<String> categoryNames = categoryRepository.findAllName();
        String previousCategory = null;
        String currentCategory;
        for (Element element : links) {
            String categoryName = element.childNode(0).toString();
            if(!categoryNames.contains(categoryName)){
                categoryNames.add(categoryName);
                if(previousCategory!=null){
                    currentCategory = previousCategory;
                }else
                {
                    currentCategory = categoryName;
                }

            }
            previousCategory = categoryName;
        }
    }
}
