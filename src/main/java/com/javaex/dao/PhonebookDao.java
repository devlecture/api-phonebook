package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhonebookDao {

	@Autowired
	private SqlSession sqlSession;

	// 전체가져오기
	public List<PersonVo> personSelect() {
		System.out.println("PhonebookService.personSelect()");

		List<PersonVo> personList = sqlSession.selectList("phonebook.selectList");
		return personList;
	}

	// 저장
	public int personInsert(PersonVo personVo) {
		System.out.println("PhonebookService.personInsert()");

		int count = sqlSession.update("phonebook.insert", personVo);
		return count;
	}

	// 1명데이터 가져오기
	public PersonVo personSelectByNo(int personId) {
		System.out.println("PhonebookService.personSelectByNo()");

		PersonVo personVo = sqlSession.selectOne("phonebook.selectByNo", personId);
		return personVo;
	}

	// 수정
	public int personUpdate(PersonVo personVo) {
		System.out.println("PhonebookService.personVo()");

		int count = sqlSession.update("phonebook.update", personVo);
		return count;
	}

	// 삭제
	public int personDelete(int personId) {
		System.out.println("PhonebookService.personDelete()");

		int count = sqlSession.delete("phonebook.delete", personId);
		return count;
	}
}
