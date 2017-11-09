package main;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Protal {

	
	@RequestMapping(value="/")
	public String home(HttpServletRequest request, Model model) {
		
		return new PageLoader().getPage("home", request, model);
		
	}
	
	
}
