package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.vo.JsonResult;
import com.javaex.vo.PersonVo;

@RestController
@RequestMapping("/api/board")

public class BoardController {
	@Autowired
	private PhonebookService phonebookService;

	// 1명데이터가져오기(수정폼)
	@GetMapping(value = "/b")
	public JsonResult getList() {
		System.out.println("PhonebookController.list()");

		List<PersonVo> personList = phonebookService.exeList();
		return JsonResult.success(personList);
	}
}
