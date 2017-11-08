package main;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Protal {
	
	
	private String pagesFolderName = "pages";
	private String fileSeperator = File.separator;

	
	@RequestMapping(value="/")
	public String home() {
		
		System.out.println("home");
		
		
		return pagesFolderName + fileSeperator + "home";
		
	}
	
	
}
