package com.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.dto.MemberDTO;

public class MemberDAO {

	public MemberDTO login(SqlSession session,
			 HashMap<String, String> map) {
		MemberDTO dto = session.selectOne("com.dto.login",map);
		return dto;
	}
	
	public int memberAdd(SqlSession session, MemberDTO dto) {
		int n = session.insert("com.dto.memberAdd", dto);
		return n;
	}
	
	public int idCheck(SqlSession session, String userid) {
		int count = session.selectOne("com.dto.idCheck", userid);
		return count;
	}
	
}
