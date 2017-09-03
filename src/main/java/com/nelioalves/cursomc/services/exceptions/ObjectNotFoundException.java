package com.nelioalves.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	@SuppressWarnings("rawtypes")
	public ObjectNotFoundException(Class c, Object id) {
		super("Objeto " + c.getName() + " id " + id + " não encontrado");
	}
}
