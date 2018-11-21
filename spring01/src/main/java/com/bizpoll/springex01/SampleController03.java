package com.bizpoll.springex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController03 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController03.class);
	
	@RequestMapping("/doD")
	                  // Model: 매개변수 설정 -> view단으로 값을 받기 위해서
	public String doD(Model model, ProductDTO pDto) { // 이렇게 생성 가능->쿼리스트링으로 받을 수 있음!
		logger.info("message: doD 호출됨");
		
//		ProductDTO pDto = new ProductDTO();
//		pDto.setP_name("티라미슈");
//		pDto.setP_price(4000);
		
		model.addAttribute("ProductDTO", pDto);

		// ProductDTO = 객체타입
		// pDto = 객체로부터 생성된 인스턴스
		// 다음과 같이 보내면 이름표를 객체타입의 첫글자를 소문자로 변환 후 자동으로 등록
		model.addAttribute(pDto);
		// ==> model.addAttribute("productDTO",pDto);
		
		return "productDetail";
	}
}
