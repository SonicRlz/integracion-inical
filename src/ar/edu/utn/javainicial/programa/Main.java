package ar.edu.utn.javainicial.programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import ar.edu.utn.javainicial.modelo.CorreoElectronico;
import ar.edu.utn.javainicial.modelo.EnviadorDeCorreos;

public class Main {

	public static void main(String[] args) {
		
//		CorreoElectronico correo = new CorreoElectronico();
//		
//		correo.setAsunto("Asunto del Mail");
//		correo.setDireccionCorreo("E-mail");
//		
//		
//		EnviadorDeCorreos enviador = new EnviadorDeCorreos();
//		
//		enviador.enviarCorreo(correo);
		
	    ArrayList<CorreoElectronico> correos = new ArrayList<>();
		
	    Path path = Paths.get("main/resources/emails.txt");
	    try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){
	 
	       
	      String currentLine = null;
	      while((currentLine = reader.readLine()) != null){//while there is content on the current line
	    	  CorreoElectronico correo = new CorreoElectronico();
	    	  String[] linea = currentLine.split(",");
	    	  correo.setDireccionCorreo(linea[0]);
	    	  correo.setAsunto(linea[1]);
	    	  correos.add(correo);
	          System.out.println(currentLine); // print the current line
	      }
	    }catch(IOException ex){
	      ex.printStackTrace(); //handle an exception here
	    }
	    EnviadorDeCorreos enviador = new EnviadorDeCorreos();
	    for (CorreoElectronico correo : correos) {
	    	enviador.enviarCorreo(correo);
	    	
	    }
	}
}
