package ar.edu.utn.javainicial.modelo;

public class EnviadorDeCorreos {
	
	public void enviarCorreo(CorreoElectronico correo) {
		
	String mensaje = String.format("Enviando correo: %s con asunto: %s ", correo.getDireccionCorreo(), correo.getAsunto());
	String mensaje2 = "Enviando correo: " + correo.getDireccionCorreo() + ". Con asunto: " + correo.getAsunto();
	
	System.out.println(mensaje);
	
	}
}