package com.avenqo.training.scd.camping.be.operations;

public class OperationFailedException extends Exception{
	OperationFailedException(String msg){
		super(msg);
	}

	public OperationFailedException() {
		super();
	}
}
