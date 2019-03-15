package com.cg;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller  
public class HelloController {  
@RequestMapping("/Movie1")  
public ModelAndView Movie1()
  
    {  
      ModelAndView mav=new ModelAndView("Movie1");
      return mav;
    }     
}  