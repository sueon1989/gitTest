package org.iptime.iotmit;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/*")
@Log4j
public class TestController {
	
	//	http://localhost:8082/strcount
	@GetMapping("/strcount")
	public String test1Form() {
		
		return "test1Form";
		// test1Form.jsp 페이지로
	}
	
	@PostMapping("/strcount")
	public String test1Result(String str, Model model) {
		
		log.info("입력받은 글자: "+ str);
		log.info("글자수 계산: "+ str.replaceAll(" ", "").replace("\n","").length());	// 공백 제외하고 count
		
		model.addAttribute("str", str);
		model.addAttribute("strcount", str.replaceAll(" ", "").replace("\r\n","").length());

		return "test1Result";
		// test1Result.jsp 페이지로
//		입력하신 글자는: ${strcount }  <br />
//		글자수는: ${result }입니다.
	}
	
}
