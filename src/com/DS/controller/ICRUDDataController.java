package com.DS.controller;

import java.io.IOException;

import com.DS.bean.Data;

public interface ICRUDDataController {
	boolean insertData(Data data) throws IOException;
	Data getData(String key);
	boolean deleteKey(String key);
}
