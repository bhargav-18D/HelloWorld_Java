package world;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorldSample  {

	public void HelloUser() throws IOException{
		System.out.println("Enter username --> ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String user = "";
		user = br.readLine();
		System.out.println("Hello " +"What's Your Name"+ user +" !!!");
	}
	
	
	
	public static void main(String[] args) throws IOException {
	
		HelloWorldSample sample = new HelloWorldSample();
		sample.HelloUser();
		

	}

}
