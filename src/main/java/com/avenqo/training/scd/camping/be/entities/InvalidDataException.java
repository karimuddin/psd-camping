package com.avenqo.training.scd.camping.be.entities;

public class InvalidDataException extends Exception{
	InvalidDataException(String msg){
		super(msg);
	}

	public InvalidDataException() {
		super();
	}
}
