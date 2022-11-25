package com.mycompany.spring_rest_application.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CustomErrorResponse {
	private int statusCode;
	private String message;
	private long logTime;
}
