package com.bizpoll.springex01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController01 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController01.class);
	
	// @RequestMapping이 하는 역할이란?? command를 쓰고 컨트롤러에서 command를 찾아가야하지만, 맵팽에서는 url만 따지면 바로 컨트롤러가 타진다는 의미
	@RequestMapping("/doA")
	public void doA() {
		logger.info("message: doA 호출 됨");
	}
	
	@RequestMapping("/doB")
	public void doB() {
		logger.info("message: doB 호출 됨");
	}
}
