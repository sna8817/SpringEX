package com.bizpoll.springex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController02 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController02.class);
	
	// 이 url을 따라가라는 의미.
	@RequestMapping("/doC")
	// 리퀘스트. 겟 파라미터로 받는 방식을 간단하게 받는 방법을 보여줌
	
// 또는 public Stirng doC(Model model, String msg) { <- Model model==HttpServletRequest request,HttpServletResponse response
	public String doC(@ModelAttribute("message") String msg) {
		// String msg = request.getParameter("message"); 이 두줄을 위의 한 줄, 즉 매개변수가 바로 담아버립니다.
		// request.setattribute
		
		logger.info("message: doC 호출됨"+msg);
		return "result";
	}

}
