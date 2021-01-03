package com.DS.repository;

import java.io.IOException;

import com.DS.bean.Data;

public class DataStoreRepositoryImpl implements IKeyValueRepository {

	private static final String delimiter = "---";
	private IFileRepository fileRep = new DataStoreRepositoryFileImpl();

	@Override
	public Data getDataForKey(String key) {
		return null;
	}

	@Override
	public boolean keyExists(String key) {
		return false;
	}

	@Override
	public boolean insertData(String key, Data value) throws IOException {
		if(fileRep.fileExists() && !keyExists(key)) {
			fileRep.writeToFile(key+delimiter+value.getJsonData());
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteKey(String key) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
