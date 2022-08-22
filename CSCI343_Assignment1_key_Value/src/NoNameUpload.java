/**
 * 
 */

/**
 * @author Lake Smith
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;

import voldemort.client.ClientConfig;
import voldemort.client.SocketStoreClientFactory;
import voldemort.client.StoreClient;
import voldemort.client.StoreClientFactory;
import voldemort.versioning.VectorClockInconsistencyResolver;
import voldemort.versioning.Versioned;

public class NoNameUpload {

	/**
	 * 
	 */
	public NoNameUpload() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int value for future instances with possibly multiple inputs
		int keyCounter = 0;

		String bootstrapUrl = "tcp://dbclass.cs.unca.edu:6674";
        StoreClientFactory factory = new SocketStoreClientFactory(new ClientConfig().setBootstrapUrls(bootstrapUrl));
        
        
        StoreClient<String, String> client = factory.getStoreClient("example");
		
        //Ask's user for new string to store
        System.out.println("Please input a line of text");
        String input = sc.nextLine();
        
        //stores new string
        client.put("lsmith17/" + keyCounter + "",input);
        
        //print all previously stored strings
        System.out.println("");
        
        //Exits
        factory.close();

	}

}
