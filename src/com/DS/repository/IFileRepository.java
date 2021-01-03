package com.DS.repository;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

import com.DS.bean.Data;

public interface IFileRepository {
	boolean createFile() throws IOException;
	boolean createFileByName(String path) throws IOException;
	boolean deleteFile();
	boolean fileExists();
	void writeToFile(String entry) throws IOException;
	
}
