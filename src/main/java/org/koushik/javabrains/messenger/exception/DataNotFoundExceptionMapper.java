package org.koushik.javabrains.messenger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class DataNotFoundExceptionMapper implements ExceptionMapper<DataNotFoundException> {
	//generic type mapping to the DataNOtFoundException class
	@Override
	public Response toResponse(DataNotFoundException ex){
		
		return Response.status(Status.NOT_FOUND).build();
	
	}
}
