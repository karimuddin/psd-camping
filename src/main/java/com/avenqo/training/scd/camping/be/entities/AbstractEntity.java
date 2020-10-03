package com.avenqo.training.scd.camping.be.entities;

abstract class AbstractEntity {

	/**
	 * AAssumption: derived classes will not be used inside Hashmaps etc.
	 */
	@Override
	public int hashCode() {
	    assert false : "hashCode not designed";
	    return 42; // any arbitrary constant will do
	}
}
