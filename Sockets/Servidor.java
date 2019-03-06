package Sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		
		try {
			ServerSocket servidor = new ServerSocket(4503);
			Socket cliente = servidor.accept();
			
			//ESCUCHA PETICIONES
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			System.out.println("Objeto llego");
			System.out.println("Mandando otro mensaje al cliente");
			
			//RECOGE EL MENSAJE QUE LLEVA LA PETICION
			String mensaje = (String) entrada.readObject();
			System.out.println("Mensaje " + mensaje);
			
			
			//MANDA UN MENSAJE AL CLIENTE
			ObjectOutputStream respuesta = new ObjectOutputStream(cliente.getOutputStream());
			respuesta.writeObject("Hola cliente");
			System.out.println("Mensaje enviado");
			
			//SE CIERRA LA CONEXION
			cliente.close();
			servidor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
