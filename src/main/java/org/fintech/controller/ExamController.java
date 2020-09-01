package org.fintech.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 

public class ExamController {
	
	
	@RequestMapping(value = "/exam/test1", produces = "text/html; charset=utf-8") 
	@ResponseBody 
	public String print1 (HttpServletRequest req) throws Exception { 
		String result1 = "exam test1 page"; return result1; 	
	}
	
	@RequestMapping(value = "/exam/test2", produces = "text/html; charset=utf-8") 
	@ResponseBody 
	public String print2 (HttpServletRequest req) throws Exception { 
		String result2 = "exam test2 page"; return result2; 
		
	} 

	@RequestMapping(value = "/exam/test3", produces = "text/html; charset=utf-8") 
	@ResponseBody 
	public String print3 (HttpServletRequest req) throws Exception { 
		String result3 = "exam test3 page"; return result3; 
		
	} 

	
}
	
	
