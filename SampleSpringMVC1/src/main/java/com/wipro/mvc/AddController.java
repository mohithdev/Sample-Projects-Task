package com.wipro.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.service.AdditionService;

@Controller
public class AddController {
 
	 @RequestMapping("/addition")
	 public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
		 
		 int t1 = Integer.parseInt(req.getParameter("t1"));
		 int t2 = Integer.parseInt(req.getParameter("t2"));
		 
		 AdditionService ads = new AdditionService();
		 int sum = ads.add(t1, t2);
		 
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("display.jsp");
		 mv.addObject("result", sum);
		 return  mv;
	 }
}
