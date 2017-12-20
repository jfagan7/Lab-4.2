package csv;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;

public class CSVUtilities {
	ArrayList<String>CSVData;
	int numColumns;
	public CSVUtilities(File csv)
	{
		FileReader fr = null;
		try {
			fr = new FileReader(csv);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br= new BufferedReader(fr);
		List<Store> stores = new ArrayList<Store>();
		String line;
		try {
			line = br.readLine();
			while (line != null) 
			{ 
				// use string.split to load a string array with the values from 
				// each line of 
				// the file, using a comma as the delimiter
				String[] attributes = line.split(",");
				Store store = createStore(attributes); 
				// adding book into ArrayList 
				stores.add(store); 
				// read next line before looping 
				// if end of file reached, line would be null 
				line = br.readLine();
			}
				System.out.print(line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// loop until all lines are read 
		
	}

	public List<String> getColumnHeaders()
	{
		List<String> columnHeaders=new ArrayList<String>();
		for(int i=0; i<numColumns;i++)
		{
			columnHeaders.add(i,CSVData.get(i));
		}
		return columnHeaders;
		
	}
	public List<String> getDataString(int column)
	{
		List<String>data=new ArrayList<String>();
		for(int i=numColumns+column; i<CSVData.size();i+=numColumns)
		{
			data.add(CSVData.get(i));
		}
		return data;
		
	}
	public List<Integer> getDataInt(int column)
	{
		List<Integer>data=new ArrayList<Integer>();
		for(int i=0; i<column;i++)
		{
			String number = CSVData.get(i);
			data.add(Integer.parseInt(number));
		}
		return data;
	}
	public List<Double> getDataDouble(int column)
	{
		List<Double>data=new ArrayList<Double>();
		for(int i=0; i<column;i++)
		{
			String number = CSVData.get(i);
			data.add(Double.parseDouble(number));
		}
		return data;
	}
	private static Store createStore(String[] metadata) 
	{ 
		String name = metadata[0]; 
	String address = metadata[1]; 
	String city = metadata[3];
	String state = metadata[4];
	String primary = metadata[5];
	// create and return book of this metadata 
	return new Store(name, address, city, state, primary);
	}
}