package com.dianping.pigeon.governor.service;

import com.dianping.pigeon.governor.model.User;

public interface UserService {

	public int create(User user);
	
	public User retrieveByDpaccount(String dpaccount);
}