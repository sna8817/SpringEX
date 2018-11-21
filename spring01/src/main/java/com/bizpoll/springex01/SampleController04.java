package com.bizpoll.springex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController04 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController04.class);
	
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {
		logger.info("doE로 호출되지만 /doF로 리다이렉트 =============>");
		
		// addFlashAttribute(): 임시 데이터를 전달하는 역할
		rttr.addFlashAttribute("msg", "리다이렉트 된 메세지");

		
		
		// 페이지 이동방식
		// 디폴트 forward(아무것도 안쓰면)
		
		// redirect로 보내고 싶으면
		// ===> return "/doF"; <- forwrd방식
		// ===> return "redirect:/doF" <- redirect 방식
		return "redirect:/doF";
		
		
		
	}
	
	@RequestMapping("/doF")
	public String doF(String mssg) {
		logger.info("doF   호출됨 ===========>");
		
		return "redirectAttributeResult";
	}
}
