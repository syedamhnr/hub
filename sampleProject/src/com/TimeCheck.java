package com;

import java.util.*;
import java.util.Map.Entry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class TimeCheck {
	
	
	public static void main(String[] args) {
	//creating the calendar object    
//	Calendar c= Calendar.getInstance();
//	 System.out.println(" Current time is : "+c.getTime());
//	 //Returns this Calendar's time value in milliseconds
//
//	 c.add(Calendar.MINUTE,5);
//	 Date l=c.getTime();
//	 System.out.println(" Time in milliseconds is : "+l);
		JsonObject ab=new JsonObject();
		ab.addProperty("krishna", "kittu");
		ab.addProperty("pavan", "pav");
		String test=ab.toString();
		System.out.println(test);
		JsonParser parser=new JsonParser();
		JsonElement element=parser.parse(test);
		JsonObject ab1=element.getAsJsonObject();
		System.out.println(ab1);
		Set<Entry<String, JsonElement>> nh=ab1.entrySet();
		Iterator<Entry<String, JsonElement>> ok=nh.iterator();
		while(ok.hasNext()){
			Entry<String, JsonElement> abc=ok.next();
			String str=abc.getKey();
			String value=abc.getValue().toString().replace("\"", "");
			System.out.println("key= "+str +" value= "+value);
		}
//	     JsonObject ab= el.getAsJsonObject();
//	       Set<Entry<String, JsonElement>> AB=        ab.entrySet();
//	       Iterator<Entry<String, 
//		JsonElement>> AB=        ab.entrySet();
//	       Iterator<Entry<String, JsonElement>> it=AB.iterator();
//	       while(it.hasNext()){
//	               Entry<String, 
//		JsonElement> abc=it.next();
//        JsonElement anb=abc.getValue();
//        
//        System.out.println(anb.toString().replace("\"", ""));
//}
//
////         System.out.println(ob.get("krishna"));
//        System.out.println(ab.get("krishna"));
//}
		
	    }

	
	
	}

