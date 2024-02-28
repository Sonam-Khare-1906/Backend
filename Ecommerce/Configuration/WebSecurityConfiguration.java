package com.Ecommerce.Configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpHeaders;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled=true)
//public class WebSecurityConfiguration extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration{
//
//	@Autowired
//	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
//	
//	@Autowired
//	private JwtRequestFilter jwtRequestFilter;
//	
//    @Bean
//    public AuthenticationManager authenticationManagerBean() throws Exception {
//        return super.authenticationManagerBean() ;
//    }
//	
//	protected void configurer(HttpSecurity httpSecurity) throws Exception {
//	
//		httpSecurity.cors();
//		httpSecurity.csrf().disable()
//		             .authorizeRequests().requestMatchers("").permitAll()
//		             .requestMatchers(HttpHeaders.ALLOW).permitAll()
//		             .anyRequest().authenticated()
//		             .and()
//		             .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint)
//		             .and()
//		             .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//		
//		
//		httpSecurity.addFilterBefore(jwtRequestFilter,UsernamePasswordAuthenticationFilter.class);
//			
//	}
//}
