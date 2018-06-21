package pruebas;
import java.io.*;
import java.net.*;
import java.util.List;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;
public class Noticias {
	
	
	public static void main(String[] args) throws TwitterException {
		ConfigurationBuilder cf=new ConfigurationBuilder(); 
		cf.setDebugEnabled(true);
		cf.setOAuthConsumerKey("7V6RVwaWEd57U3jfDkj6Bvsze")
			.setOAuthConsumerSecret("W6eylVeKm5KujMLtk4jaw5Jz8voBP4BD3iCjk2Mw3guZ5fEbgv")
			.setOAuthAccessToken("93493520-C7BCoYFBb1R9JlfgWgzlMUh671togzGNw5aHhxJ4Q")
			.setOAuthAccessTokenSecret("rTkJB41N99c0WViGefiLlOVXdtZS7gWW98UHD0EMJZ4YH");
		TwitterFactory tf= new TwitterFactory(cf.build());
		twitter4j.Twitter twitter =tf.getInstance();
		List<Status> status =twitter.getHomeTimeline();
		for(Status st: status) {
			System.out.println(st.getUser().getName()+"------"+st.getText());
		}
	}
	
	
	
	
}


