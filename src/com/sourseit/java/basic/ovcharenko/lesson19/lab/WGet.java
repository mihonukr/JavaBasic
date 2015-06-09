package com.sourseit.java.basic.ovcharenko.lesson19.lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WGet {

	
	
	public static void main(String[] args) throws IOException {
		
		
	
	      String input = null;
	        URL vkUrl = null;
			try {
				vkUrl = new URL("https://dl.dropboxusercontent.com/u/56274892/Java-Basic/index.html");
			} catch (MalformedURLException e) {
			
				e.printStackTrace();
			}
	        String name = "C:\\Les19.html";
	        System.out.println("Page save: " + name);
	        File aFile = new File(name);
	        if (!aFile.exists()) {
	            try {
					aFile.createNewFile();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
	        }
	        FileWriter fw = null;
			try {
				fw = new FileWriter(aFile);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	        HttpURLConnection con = null;
			try {
				con = (HttpURLConnection) vkUrl.openConnection();
			} catch (IOException e) {
				e.printStackTrace();
			}
	        InputStreamReader vk_in = new InputStreamReader(con.getInputStream());
	        BufferedReader br = new BufferedReader(vk_in);
	        try {
				while ((input = br.readLine()) != null) {
				    System.out.println(input);
				    fw.write(input);
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	        br.close();
	        fw.close();
	    }
}
