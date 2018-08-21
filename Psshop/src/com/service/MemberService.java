package com.service;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;

public class MemberService {

	MemberDAO dao;
	public MemberService() {
		dao = new MemberDAO();
	}
	
	public MemberDTO login(HashMap<String, String> map) {
		SqlSession session = MySqlSessionFactory.getSession();
		MemberDTO dto = null;
		try {
			dto = dao.login(session, map);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return dto;
	}
	
	
	
	public int memberAdd(MemberDTO dto) {
		SqlSession session = MySqlSessionFactory.getSession();
		int count = 0;
		try {
			count = dao.memberAdd(session, dto);
			session.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return count;
	}
	
	
	
	public int idCheck(String userid) {
		SqlSession session = MySqlSessionFactory.getSession();
		int count = 0;
		try {
			count = dao.idCheck(session, userid);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return count;
	}//end idCheck
}
