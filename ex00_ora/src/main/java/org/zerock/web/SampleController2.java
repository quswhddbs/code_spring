package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(SampleController2.class);

	@RequestMapping("doC")
	public String doC( @ModelAttribute("msg") String msg){
		
		logger.info("doC called..............................");
		
		// http://localhost:8080/web/doC?msg=jyp
		// result.jsp 로 연결, msg 의 값을 넘겨준다.
		return "result";
		
	}
}


