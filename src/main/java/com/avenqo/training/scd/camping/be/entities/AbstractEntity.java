package com.avenqo.training.scd.camping.be.entities;

public class AbstractEntity {

	/**
	 * AAssumption: derived classes will not be used inside Hashmaps etc.
	 */
	public int hashCode() {
	    assert false : "hashCode not designed";
	    return 42; // any arbitrary constant will do
	}
}
