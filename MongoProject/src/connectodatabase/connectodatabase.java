
//package mongo.connection;
package connectodatabase;

import com.mongodb.MongoClient;
import com.mongodb.DB;

public class connectodatabase{
   private static MongoClient mongoClient;

@SuppressWarnings("deprecation")
public static void main( String args[] ){
      try{   
		 mongoClient = new MongoClient( "localhost" , 27017 );
         // Now connect to your databases
         DB db = mongoClient.getDB("test");
		 System.out.println("Connect to " + db.getName() + " database successfully");
		// System.out.println(db.getName());
         //boolean auth = db.authenticate(myUserName, myPassword);
		 //System.out.println("Authentication: "+auth);
      }catch(Exception e){
	     System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	  }
   }
}