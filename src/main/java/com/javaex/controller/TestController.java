package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.vo.JsonResult;
import com.javaex.vo.PersonVo;
import com.javaex.vo.PVo;


@RestController
@RequestMapping("/api/myclass")
public class TestController {

	//@Autowired
	//private PhonebookService phonebookService;

	// 1명데이터가져오기(수정폼)
	@GetMapping(value = "")
	public PVo modifyForm() {
		System.out.println("PhonebookController.modifyForm()");

		PVo personVo = new PVo(1,"홍길동", "010-2222-2222", "02-2222-2222", "남");
		return personVo;
	}

	// 1명데이터가져오기(수정폼)
	@GetMapping(value = "/a")
	public PVo modifyForm2() {
		System.out.println("PhonebookController.modifyForm()");

		PVo personVo = new PVo(1,"홍길동", "010-2222-2222", "02-2222-2222", "aaa");
		return personVo;
	}
	
	// 전체리스트
	/*
	 * @GetMapping(value = "/p") public JsonResult list() {
	 * System.out.println("PhonebookController.list()");
	 * 
	 * List<PersonVo> personList = phonebookService.exeList(); return
	 * JsonResult.success(personList); }
	 */

}
