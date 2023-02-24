package ru.nikitakuts.crawler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinkExtractor {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public List<String> getLinks(String pageHtml) {

        List<String> list = new ArrayList<>();
        list.add("World");
        list.add("Hello");

        return list;
    }

}
