package com.dk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
	
	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/websocket").setAllowedOrigins("*").
		withSockJS();
	}
	
	@Override
	public void configureMessageBroker(MessageBrokerRegistry messageRegistry) {
		messageRegistry.enableSimpleBroker("/topic");
		messageRegistry.setApplicationDestinationPrefixes("/app");
	}
	
//	protected void configure(HttpSecurity http) throws Exception {
//	http.cors().and().csrf().disable().authorizeRequests()
//	.antMatchers("/ws/info",
//	"/ws/**"
//	)
//	.permitAll();
//	}

}
