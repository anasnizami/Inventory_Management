package edu.neu.Facade_Read_Write;
import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;


public class WriteData extends Document {

	private String path;
	private Document read;
	private List<String> list = Collections.emptyList();
	File file;
	
	public WriteData(String path) {
		this.path = path;
		read = new ReadData();
		
		//Creating a new file
		try {
			file = new File(path);
			if(file.createNewFile()) {
				System.out.println("File Created : "+path);
			}
		} catch (IOException e) {
			System.err.println("Error in file creation"+e.toString());
			e.printStackTrace();
		}
	}

	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	@Override
	public void save(List<String> programData) {
		//Reading the file to retain the information
		list = read.load();
		
		
		StringBuilder content = new StringBuilder();
		FileOutputStream fileOutputStream;
		
		//Append the information from the file to a string
		for(int i = 0; i<list.size();i++) {
			content.append(list.get(i)).append('\n');
		}
		
		//Append the new information in the last string
		try {
			fileOutputStream = new FileOutputStream(file);
			for(int i = 0; i<programData.size();i++) {
				content.append(programData.get(i).toString()).append('\n');
			}
			fileOutputStream.write(content.toString().getBytes());
			fileOutputStream.close();

		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<String> load() {
		System.out.println("Function not implemented");
		return null;
	}

	@Override
	public void update(List<String> newData) {
		StringBuilder content = new StringBuilder();
		FileOutputStream fileOutputStream;
		
		//Append the new information in the last string
		try {
			fileOutputStream = new FileOutputStream(file);
			for(int i = 0; i<newData.size();i++) {
				content.append(newData.get(i).toString()).append('\n');
			}
			fileOutputStream.write(content.toString().getBytes());
			fileOutputStream.close();

		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}