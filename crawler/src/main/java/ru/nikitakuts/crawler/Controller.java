package ru.nikitakuts.crawler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("crawler")
public class Controller {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/hello")
    public String getBook() {
        logger.info("getBook successfully entered");
        return "я молодец";
    }

    @GetMapping("/url")
    public String test(@RequestParam String address) {
        logger.info("test address {}", address);
        return address;
    }
}
