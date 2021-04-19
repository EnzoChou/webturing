package com.webturing.db;

import com.webturing.models.Persona;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//	class to elaborate db basic operations CRUD

public class Db {
	
	public List<Persona> retrieve() {
		List<Persona> listaPersone = new ArrayList<Persona>();
		URL url = getClass().getResource("ListStopWords.txt");
		File file = new File(url.getPath());
		return listaPersone;
	}
}
