package com.project.main.logic;

import org.apache.commons.validator.routines.UrlValidator;

public class GenerateShortUrl {
	
	public static String getShortUrl(String url) {

		String randomChar = getRandomChars();
//  	String shortUrl = ("http://localhost:8080/"+randomChar);
		return randomChar;
  }
  public static String getRandomChars() {
		String randomStr = "";
		String possibleChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		for (int i = 0; i < 5; i++)
			randomStr += possibleChars.charAt((int) Math.floor(Math.random() * possibleChars.length()));
		return randomStr;
	}

  public static boolean isUrlValid(String url) {
      UrlValidator urlValidator = new UrlValidator(
             new String[]{"http","https"}
      );
      boolean result = urlValidator.isValid(url);
      return result;
  }

}
