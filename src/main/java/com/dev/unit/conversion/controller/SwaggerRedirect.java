package com.dev.unit.conversion.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
@Profile("!production")
public class SwaggerRedirect {
	
	public void redirect(HttpServletResponse response) throws IOException {
		response.sendRedirect("./swagger-ui/index.html");
	}

}
