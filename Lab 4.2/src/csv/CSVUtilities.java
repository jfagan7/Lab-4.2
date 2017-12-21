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
import java.io.BufferedReader;

public class CSVUtilities {
	ArrayList<String>CSVData;
	int numColumns;
	public CSVUtilities(File csv)
	{
		CSVData =new ArrayList<String>();
		FileReader fr = null;
		try {
			fr = new FileReader(csv);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br= new BufferedReader(fr);
		List<School> schools = new ArrayList<School>();
		String line;
		try {
			line = br.readLine();
			while (line != null) 
			{ 
				// use string.split to load a string array with the values from 
				// each line of 
				// the file, using a comma as the delimiter
				String[] attributes = line.split(",");
				for(int i=0;i<attributes.length;i++)
				{
					CSVData.add(attributes[i]);
				}
				School school = createSchool(attributes); 
				// adding book into ArrayList 
				schools.add(school); 
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
			columnHeaders.add(CSVData.get(i));
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
		for(int i=0; i<CSVData.size();i+=numColumns)
		{
			String number = CSVData.get(i);
			data.add(Integer.parseInt(number));
		}
		return data;
	}
	public List<Double> getDataDouble(int column)
	{
		List<Double>data=new ArrayList<Double>();
		for(int i=0; i<CSVData.size();i+=numColumns)
		{
			String number = CSVData.get(i);
			data.add(Double.parseDouble(number));
		}
		return data;
	}
	private static School createSchool(String[] metadata) 
	{ 
		String schoolID = metadata[0]; 
		String name = metadata[1]; 
		String numOfTestTakers = metadata[2];
		String avgCRScore = metadata[3];
		String avgMathScore = metadata[4];
		String avgWritingScore= metadata[5];
	// create and return book of this metadata 
		return new School(schoolID,name, numOfTestTakers, avgCRScore, avgMathScore, avgWritingScore);
	}
}