package com.prueba.org.security;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.prueba.org.entities.Persona;
import com.prueba.org.repository.RepositoryPersona;

@Service
@Transactional
public class UserDetailServiceImpl implements UserDetailsService{
	
	@Autowired RepositoryPersona repository;
	
	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		Persona p = repository.findByUserName(username); 
		if(p != null) {
			return this.userBuilder(username, new BCryptPasswordEncoder().encode(p.getPassword()), "ADMIN");
		}else {
			throw new UsernameNotFoundException("Usuario NO encontrado");
		}
	}
	
	public User userBuilder(String username, String password, String ...roles) {
		boolean enabled = true;
		boolean accountNonExpired =true;
		boolean credentialsNonExpired =true;
		boolean accountNonLocked = true;
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		return new User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

}
