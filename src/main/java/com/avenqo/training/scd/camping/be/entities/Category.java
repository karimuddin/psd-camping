package com.avenqo.training.scd.camping.be.entities;

public enum Category {

	A, BC, D, Chalet;

	public String getName() {
		if (this == A) return "Kategorie A";
		if (this == BC) return "Kategorie B/C";
		if (this == D) return "Kategorie D";
		if (this == Chalet) return "Mietchalet";

		return null;
	}
	
	public String getDescription() {
		if (this == A) return "Platz für ein Zelt, ohne Stromversorgung";
		if (this == BC) return "Wohnmobilstellplatz mit Stromversorgung (10 Ampere)";
		if (this == D) return "Wohnmobilstellplatz mit Stromversorgung (16 Ampere), Trinkwasser- und Abwasseranschluß";
		if (this == Chalet) return "Bungalow (40 bis 60 qm)";
		return null;
	}
}
