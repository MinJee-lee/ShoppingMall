package com.model2.mvc.service.user;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.User;

import java.util.List;


//==> 회원관리에서 CRUD 추상화/캡슐화한 DAO Interface Definition
public interface UserDao {

	// INSERT
	//servie imol애서 받은 정보 넣어줌
	public void addUser(User user) throws Exception ;

	// SELECT ONE
	public User getUser(String userId) throws Exception ;

	// SELECT LIST
	public List<User> getUserList(Search search) throws Exception ;

	// UPDATE
	public void updateUser(User user) throws Exception ;

	// 게시판 Page 처리를 위한 전체Row(totalCount)  return
	public int getTotalCount(Search search) throws Exception ;
	
}