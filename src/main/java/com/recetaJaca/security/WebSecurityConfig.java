package com.recetaJaca.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.recetaJaca.service.UsuarioService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	 
		@Autowired
		UsuarioService service;
		
		// Indicamos que la configuración se hará a través del servicio.
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.userDetailsService(service);
		}

		

		@Bean
		public UserDetailsService userDetailsService() {
			return new UsuarioService();
		}

//		// Método que nos suministrará la codificación
		@Bean
		public PasswordEncoder passwordEncoder() {
			return PlainTextPasswordEncoder.getInstance();

		}

		// Método que autentifica

		@Bean
		public DaoAuthenticationProvider authenticationProvider() {
			DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
			authProvider.setUserDetailsService(userDetailsService());
			authProvider.setPasswordEncoder(passwordEncoder());
			return authProvider;
		}

		// Aquí es donde podemos especificar qué es lo que hace y lo que no
		// según el rol del usuario 
		@Bean
		public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
			http.authorizeHttpRequests((requests) -> {
					requests
					.requestMatchers("/").permitAll()
					.anyRequest().authenticated();
				})
			.formLogin((form) ->form.permitAll());
				return http.build();
			}

}
