package com.DS.repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.DS.bean.Data;

public class DataStoreRepositoryFileImpl implements IFileRepository {
	Path path = Paths.get("./data-store.txt");
	File dataFile;
	BufferedReader br;
	BufferedWriter bw;
	
	@Override
	public boolean createFile() throws IOException {
		dataFile =new File(path.toString());
		if(!fileExists())
			return this.dataFile.createNewFile();
		return true;
	}

	public File getDataFile() {
		return this.dataFile;
	}

	public void setDataFile(String dataFile) {
		this.dataFile = new File(dataFile);
	}

	@Override
	public boolean createFileByName(String path) throws IOException {
		setPath(Paths.get(path));
		return createFile();
	}

	@Override
	public boolean deleteFile() {
		return new File(path.toString()).delete();
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	public Map<String, Data> getAllDataFromFile() throws IOException {
		Map<String,Data> dataMap = new HashMap();
		String s;
		while ((s = br.readLine()) != null) {
		    String key = s.split("---")[0];
		    Data value = new Data(key,s.split("---")[1]);
		    dataMap.put(key, dataMap.getOrDefault(key, value));
		  } 
		return dataMap;
	}

	@Override
	public boolean fileExists() {
		return new File(getPath().toString()).exists();
	}

	@Override
	public void writeToFile(String entry) throws IOException {
		
		bw = new BufferedWriter(new FileWriter(new File(this.getPath().toString()),true));
		bw.write('\n');
		bw.write(entry);
		bw.close();
		
	}

}
