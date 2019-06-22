package com.skcc.application.sp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.skcc.service.book.BookService;
import com.skcc.service.concert.ConcertService;
import com.skcc.service.payment.PaymentService;
import com.skcc.service.user.UserService;

@Controller
public class MainController {

//	@Autowired
//	private BookService bs;
//	
//	@Autowired
//	private ConcertService cs;
//	
//	@Autowired
//	private PaymentService ps;
//	
	@Autowired
	private UserService us;
	
	  @GetMapping("/")
	  public String index() {
	    return "index";
	  }
	  
	  @GetMapping("/contact")
	  public String contact() {
	    return "contact";
	  }
}
