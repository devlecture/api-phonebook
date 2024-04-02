package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.javaex.dao.PhonebookDao;
import com.javaex.vo.JsonResult;
import com.javaex.vo.PersonVo;

@Service
public class PhonebookService {

	@Autowired
	private PhonebookDao phonebookDao;

	// 리스트
	public List<PersonVo> exeList() {
		System.out.println("PhonebookService.exeList()");

		List<PersonVo> personList = phonebookDao.personSelect();
		return personList;
	}

	// 저장
	public int exeWrite(PersonVo personVo) {
		System.out.println("PhonebookService.exeWrite()");

		int count = phonebookDao.personInsert(personVo);
		return count;
	}

	
	// 1명데이터 가져오기
	public PersonVo exeModifyForm(int personId) {
		System.out.println("PhonebookService.exeModifyForm()");

		PersonVo personVo = phonebookDao.personSelectByNo(personId);
		return personVo;
	}

	// 수정
	public int exeModify(PersonVo personVo) {
		System.out.println("PhonebookService.exeModify()");

		int count = phonebookDao.personUpdate(personVo);
		return count;
	}

	// 삭제 delete
	public int exeRemove(int personId) {
		System.out.println("PhonebookController.exeRemove()");

		int count = phonebookDao.personDelete(personId);
		return count;
	}
}
