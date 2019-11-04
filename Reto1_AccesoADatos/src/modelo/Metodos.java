package modelo;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Metodos {
	
	public String formatFecha(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = (Date) formato.parse(fecha);
            fecha=formato.format(fechaDate);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fecha;
    }
	
	public Date parseFecha(String fecha) {
		SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
		Date fechaDate=null;
		
		try {
			fechaDate=formato.parse(fecha);
		}
			catch(Exception e){
			e.printStackTrace();	
			}
		return fechaDate;
		}

}
