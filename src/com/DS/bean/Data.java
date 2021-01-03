package com.DS.bean;
import java.io.IOException;
import java.sql.Time;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class Data {
	String key;
	String jsonData;
	Time ttl;
	public Time getTtl() {
		return ttl;
	}
	public void setTtl(Time ttl) {
		this.ttl = ttl;
	}
	ObjectMapper mapper;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getJsonData() {
		return jsonData;
	}
	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
	}
	public Data(String key, String jsonData) {
		super();
		this.key = key;
		this.jsonData = jsonData;
	}
	public Data() {
		super();
		
	}
	@Override
	public String toString() {
		mapper = new ObjectMapper();
		try {
			return "Data [key=" + key + ", jsonData=" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonData)+  "]";
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonData;
	}
}
