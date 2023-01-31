package com.mb.api.business.exception;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse
{
	private Date timeStamp;
	
	private Integer status;
	
	private Object error;
	
	private String message;
}
