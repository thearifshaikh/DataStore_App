package com.DS.repository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import com.DS.bean.Data;

public class KeyFileRepositoryImpl implements IFileRepository {

	private IFileRepository keyRep = new DataStoreRepositoryFileImpl();
	Path path = Paths.get("./key-store.txt");
	File keyFile;
	BufferedReader br;
	BufferedWriter bw;
	
	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		
		this.path = path;
	}

	@Override
	public boolean createFile() throws IOException {
		keyFile =new File(path.toString());
		if(!fileExists())
			return this.keyFile.createNewFile();
		return true;
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

	
	public Map<String, Data> getAllDataFromFile() throws IOException {
		// TODO Auto-generated method stub
		return null;
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
	public boolean deleteKey(String key) {
		return true;
		
	}

}
