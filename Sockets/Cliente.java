package Sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	
	public static void main(String[] args) {
		
		try {
			
			//SE CREA LA PETICIÓN Y SE MANDA
			Socket cliente = new Socket("localhost", 4503);
			ObjectOutputStream mensaje = new ObjectOutputStream(cliente.getOutputStream());
			mensaje.writeObject("Hola servidor");
			
			//SE RECIBE EL MENSAJE DEL SERVIDOR
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String mensaje2 = (String)entrada.readObject();
			System.out.println("Mensaje del servidor: " + mensaje2);
			
			//SE CIERRA LA CONEXION
			cliente.close();
			System.out.println("Conexión cerrada");
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
