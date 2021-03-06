package main;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class PageLoader {
	
	
	private String pageTemplatesDir = "pages";
	private String fileSeperator = File.separator;
	
	
	public String getPage(String pageName, HttpServletRequest request, Model model) {
		
		if (pageName.equals("movies")) {
			return getMoviesPage();
		}
		
		return getHomePage();
		
	}
	
	
	private String getHomePage() {
		
		return pageTemplatesDir + fileSeperator + "home";
		
	}
	
	
	private String getMoviesPage() {
		
		return pageTemplatesDir + fileSeperator + "movies";
		
	}
	

}
