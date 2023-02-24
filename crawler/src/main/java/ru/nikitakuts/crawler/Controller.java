package ru.nikitakuts.crawler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("crawler")
public class Controller {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private RestTemplate template;
    @Autowired
    private LinkExtractor extractor;

    @GetMapping("/hello")
    public String getBook() {
        logger.info("getBook successfully entered");
        return "я молодец";
    }

    @GetMapping("/url")
    public List<String> test(@RequestParam String address) {
        logger.info("test address {}", address);
        var response = template.getForEntity(address, String.class);
        return extractor.getLinks(response.getBody());
    }
}
