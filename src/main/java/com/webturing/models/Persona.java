package com.webturing.models;

public class Persona {
	
	private static String nome;
	private static String cognome;
	private static String indirizzo;
	private static String telefono;
	private static int eta;
	
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Persona.nome = nome;
	}
	public static String getCognome() {
		return cognome;
	}
	public static void setCognome(String cognome) {
		Persona.cognome = cognome;
	}
	public static String getIndirizzo() {
		return indirizzo;
	}
	public static void setIndirizzo(String indirizzo) {
		Persona.indirizzo = indirizzo;
	}
	public static String getTelefono() {
		return telefono;
	}
	public static void setTelefono(String telefono) {
		Persona.telefono = telefono;
	}
	public static int getEta() {
		return eta;
	}
	public static void setEta(int eta) {
		Persona.eta = eta;
	}
	
}
