package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.PhonebookService;
import com.javaex.vo.JsonResult;
import com.javaex.vo.PersonVo;

@RestController
@RequestMapping("/api/persons")
public class PhonebookController2 {

	@Autowired
	private PhonebookService phonebookService;

	// 전체리스트
	@GetMapping(value = "")
	public JsonResult list() {
		System.out.println("PhonebookController.list()");

		List<PersonVo> personList = phonebookService.exeList();
		return JsonResult.success(personList);
	}

	// 등록 post
	@PostMapping(value = "")
	public JsonResult write(@RequestBody PersonVo personVo) {
		System.out.println("PhonebookController.write()");

		int count = phonebookService.exeWrite(personVo);
		return JsonResult.success(count);
	}

	// 1명데이터가져오기(수정폼)
	@GetMapping(value = "/{personId}")
	public JsonResult modifyForm(@PathVariable(value = "personId") int personId) {
		System.out.println("PhonebookController.modifyForm()");

		PersonVo personVo = phonebookService.exeModifyForm(personId);
		return JsonResult.success(personVo);
	}

	// 1명데이터(수정)
	@PutMapping(value = "/{personId}")
	public JsonResult modify(@PathVariable(value = "personId") int personId, @RequestBody PersonVo personVo) {
		System.out.println("PhonebookController.modify()");

		personVo.setPersonId(personId);
		
		System.out.println(personVo);
		int count = phonebookService.exeModify(personVo);
		return JsonResult.success(count);
	}

	// 삭제 delete
	@DeleteMapping(value = "/{personId}")
	public JsonResult remove(@PathVariable(value = "personId") int personId) {
		System.out.println("PhonebookController.remove()");

		int count = phonebookService.exeRemove(personId);
		return JsonResult.success(count);
	}

}
