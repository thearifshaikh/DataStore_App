package com.DS.controller;

import java.io.IOException;

import com.DS.bean.Data;
import com.DS.repository.DataStoreRepositoryImpl;
import com.DS.repository.IKeyValueRepository;

public class DataControllerImpl implements ICRUDDataController {

	private IKeyValueRepository dataRep 
							= new DataStoreRepositoryImpl();
	
	
	@Override
	public boolean insertData(Data data) throws IOException {
		return dataRep.insertData(data.getKey(), data);
	}

	@Override
	public Data getData(String key) {
		return dataRep.getDataForKey(key);
	}

	@Override
	public boolean deleteKey(String key) {
		// TODO Auto-generated method stub
		return false;
	}

}
