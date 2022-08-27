package com.project.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;


@Entity
@AllArgsConstructor
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String shorturl;
    private String originalurl;
	public String getShorturl() {
		return shorturl;
	}
	public void setShorturl(String shorturl) {
		this.shorturl = shorturl;
	}
	public String getOriginalurl() {
		return originalurl;
	}
	public void setOriginalurl(String originalurl) {
		this.originalurl = originalurl;
	}
	
}
