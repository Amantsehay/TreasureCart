package com.carttreasure.pearl.services;

import com.carttreasure.pearl.models.User;
import com.carttreasure.pearl.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class MyUserDetailsService implements UserDetailsService { //

	@Autowired
	private UserRepository  userRepository;


	@Override
	public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {

		User user = userRepository.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("User not found!"); // this will be thrown if there is no user by the
			// given user name
		}

		return new com.carttreasure.pearl.models.UserPrincipal(user);
	}
}