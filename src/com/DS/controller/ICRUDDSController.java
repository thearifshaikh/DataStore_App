package com.DS.controller;

import java.io.IOException;

public interface ICRUDDSController {
	
	boolean createStore() throws  IOException;
	boolean createStoreWithFilePath(String path) throws IOException;
	void getDataStore();
	boolean deleteStore();
	

}
