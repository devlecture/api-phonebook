package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.vo.PersonVo2;

@RestController
@RequestMapping("/api/myclass")
public class TestController {

	@Autowired
	//private PhonebookService phonebookService;

	// 1명데이터가져오기(수정폼)
	@GetMapping(value = "")
	public PersonVo2 modifyForm() {
		System.out.println("PhonebookController.modifyForm()");

		PersonVo2 personVo = new PersonVo2(1,"홍길동", "010-2222-2222", "02-2222-2222", "남");
		return personVo;
	}

	// 1명데이터가져오기(수정폼)
	@GetMapping(value = "/a")
	public PersonVo2 modifyForm2() {
		System.out.println("PhonebookController.modifyForm()");

		PersonVo2 personVo = new PersonVo2(1,"홍길동", "010-2222-2222", "02-2222-2222", "남");
		return personVo;
	}

}
