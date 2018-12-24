package com.monster.zhaqsq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.zhaqsq.bean.UserAdress;
import com.monster.zhaqsq.dao.UserAdressMapper;


@Service
public class UserAdressService {

	@Autowired	
	UserAdressMapper userAdressMapper;
	
	/*
	 * 查询用户地址
	 */
	public UserAdress getAd(String userName) {
		return userAdressMapper.selectWithUsername(userName);
	}
	
	/*
	 * 删除用户地址
	 */
	public void deleteAd(String userName) {
		userAdressMapper.deleteWithUsername(userName);
	}
	
	/*
	 * 修改用户地址
	 */
	public void updateAd(String adress, String userName) {
		userAdressMapper.updateOnlyAdress(adress, userName);
	}
	
	/*
	 * 插入用户地址
	 */
	public void saveAd(UserAdress userAdress) {
		userAdressMapper.insert(userAdress);
	}
	
}
