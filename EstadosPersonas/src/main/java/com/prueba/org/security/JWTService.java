package com.prueba.org.security;

import com.prueba.org.services.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;*/

import antlr.collections.List;

@Service
public class JWTService {
	
	public static final String BEARER = "Bearer ";
	
	private static final String USER ="user";
	private static final String ROLES = "roles";
	private static final String ISSUER = "miw-spring5";
	private static final int EXPIRES_IN_MILLISECOND = 3_600_000;
	
	@Autowired PersonaService service;
	
	public String createToken(String user, List roles) {
		return "";//JWT.create()				.wit;
	}
	
	/*public String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<PersonaDTO> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(Persona::getPassword)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
	}*/

}
