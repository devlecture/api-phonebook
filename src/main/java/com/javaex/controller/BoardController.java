package com.javaex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.vo.PVo;

@RestController
@RequestMapping("/api/board")

public class BoardController {
	
	// 1명데이터가져오기(수정폼)
	@GetMapping(value = "/b")
	public PVo getList() {
		System.out.println("PhonebookController.modifyForm()");

		PVo personVo = new PVo(1,"홍길동", "010-2222-2222", "02-2222-2222", "aaa");
		return personVo;
	}
}
