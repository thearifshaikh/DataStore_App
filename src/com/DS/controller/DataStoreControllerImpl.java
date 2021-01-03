package com.DS.controller;

import java.io.IOException;


import com.DS.repository.DataStoreRepositoryFileImpl;
import com.DS.repository.IFileRepository;

public class DataStoreControllerImpl implements ICRUDDSController {
	
	private IFileRepository repository 
					= new DataStoreRepositoryFileImpl();
	
	@Override
	public boolean createStore() throws IOException{
		return repository.createFile();
	}

	@Override
	public boolean createStoreWithFilePath(String path) throws IOException {
		return repository.createFileByName(path);
	}

	@Override
	public boolean deleteStore() {
		return repository.deleteFile();
		
	}

	@Override
	public void getDataStore() {
		
		
	}
	
	

}
