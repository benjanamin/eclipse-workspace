package asistente;
import java.io.*;
import java.net.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;
public class Noticias {
	public static void main(String[] args) throws TwitterException {
		System.out.println(read());;
	}
	
	public static String read() throws TwitterException {
		String texto="";
		int hora;
		int dia;
		String aux;
		Calendar cal=new GregorianCalendar();
		dia=cal.get(Calendar.DAY_OF_MONTH);
		
		try {
			ConfigurationBuilder cf=new ConfigurationBuilder(); 
			cf.setDebugEnabled(true);
			cf.setOAuthConsumerKey("HWErwx471fKbRaijhuoMqEll7")
				.setOAuthConsumerSecret("Oc03o8QGJvhWaCiCqmpZQ2IUtF851ZeC54M4MJT58IzLATMN5u")
				.setOAuthAccessToken("93493520-C7BCoYFBb1R9JlfgWgzlMUh671togzGNw5aHhxJ4Q")
				.setOAuthAccessTokenSecret("rTkJB41N99c0WViGefiLlOVXdtZS7gWW98UHD0EMJZ4YH");
			TwitterFactory tf= new TwitterFactory(cf.build());
			twitter4j.Twitter twitter =tf.getInstance();
			List<Status> status =twitter.getHomeTimeline();
			
			for(int i=0;i<3;i++) {
				hora=Integer.parseInt(status.get(i).getCreatedAt().toString().substring(11, 13))*100+
						Integer.parseInt(status.get(i).getCreatedAt().toString().substring(11, 13));
				//substring(11, 13) para la hora
				//substring(14, 16) para los minutos
				//if(Integer.parseInt(status.get(i).getCreatedAt().toString().substring(8, 10))<=hora) {
					//System.out.println("hola");
				//}
				aux=status.get(i).getCreatedAt().toString().substring(14, 16);
				texto=texto+"\n"+status.get(i).getCreatedAt();
				System.out.println(hora);
				
					
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return texto;
	}
	
	
	
	
}


