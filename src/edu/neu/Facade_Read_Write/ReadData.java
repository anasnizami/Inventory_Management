package edu.neu.Facade_Read_Write;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ReadData extends Document {
	
	public String path;
	
	public ReadData(String path) {
		super();
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	@Override
	public void save(List<String> programData) {
		System.out.println("Function not implemented here");
		
	}
	
	public List<String> load() {
		List<String> lines = Collections.emptyList();
	    try
	    {
	      lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
	    }
	  
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	    return lines;
		
	}

	@Override
	public void update(List<String> newData) {
		// TODO Auto-generated method stub
		
	}

	
}
