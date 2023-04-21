package colecciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Read {

	
	private static String FICHERO = "C:\\Users\\ferna\\Documents\\datos.txt";
	
	
	
	
	/**
	 * Lee los datos del fichero y los traslada a un ArrayList
	 * @return el Arraylist con los datos leidos y trasnformados en Posicion
	 */
	public void getDatos() {
		

        try {
        	// enlaza con un fichero
            BufferedReader ficheroEntrada = new BufferedReader(new FileReader(FICHERO));
 
            // leo una linea del fichero          
            String linea=ficheroEntrada.readLine();
            
            // mientras que las lineas existan
            while(linea!=null){
            	
            	System.out.println(linea);

            	// volvemos a leer una linea
            	linea=ficheroEntrada.readLine();
            }           
            ficheroEntrada.close();
        }
        catch (IOException e) {
            System.out.println("Problemas: " +e.getMessage() );
        } 
        catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		
	}
	
}