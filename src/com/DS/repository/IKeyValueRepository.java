package com.DS.repository;


import java.io.IOException;

import com.DS.bean.*;

public interface IKeyValueRepository {
	
	Data getDataForKey(String key);
	boolean keyExists(String key);
	boolean insertData(String key,Data value) throws IOException;
	boolean deleteKey(String key);
	
	
}
