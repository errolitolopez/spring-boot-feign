
package com.example.springbootfeign.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.example.springbootfeign.exception.InvalidSessionIdException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ClientInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

		String sessionId = request.getHeader("sessionId");
		final String ERROR_MESSAGE = "Request processing failed invalid session id: " + sessionId;

		log.error("{}", ERROR_MESSAGE);

		if (sessionId == null || sessionId.isEmpty()) {

			throw new InvalidSessionIdException(ERROR_MESSAGE);
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
