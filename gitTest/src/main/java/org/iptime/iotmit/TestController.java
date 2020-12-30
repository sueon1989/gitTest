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
		// test1Form.jsp ��������
	}
	
	@PostMapping("/strcount")
	public String test1Result(String str, Model model) {
		
		log.info("�Է¹��� ����: "+ str);
		log.info("���ڼ� ���: "+ str.replaceAll(" ", "").replace("\n","").length());	// ���� �����ϰ� count
		
		model.addAttribute("str", str);
		model.addAttribute("strcount", str.replaceAll(" ", "").replace("\r\n","").length());

		return "test1Result";
		// test1Result.jsp ��������
//		�Է��Ͻ� ���ڴ�: ${strcount }  <br />
//		���ڼ���: ${result }�Դϴ�.
	}
	
}
