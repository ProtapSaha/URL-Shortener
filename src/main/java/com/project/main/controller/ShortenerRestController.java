package com.project.main.controller;

import java.io.IOException;
import java.net.CacheResponse;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.main.model.Url;
import com.project.main.service.UrlService;

@RestController
@RequestMapping("url/shortner")
//@CrossOrigin(origins = "http://localhost:4200")
public class ShortenerRestController {

    @Autowired
    private  UrlService urlService;

    @GetMapping("/{id}")
    public String getOriginlUrl(@PathVariable String id) {
        return urlService.getOriginlUrl(id);
    }

    @PostMapping
    public Url generateShortUrl(@RequestBody String url) {
        return urlService.generateShortUrl(url);
    }

//    @GetMapping("/{id}")
//    public void getOriginlUrl(HttpServletResponse response, @PathVariable String id) throws IOException {
//        response.sendRedirect(urlService.getOriginlUrl(id));
//    }
}