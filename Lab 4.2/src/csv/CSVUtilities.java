package csv;


import java.io.File;
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
		FileReader fr= new FileReader(csv);
		
	}
	public List<String> getColumnHeaders()
	{
		return null;
		
	}
	public List<String> getData(int column)
	{
		return null;
		
	}
	public List<Integer> getData(int column)
	{
		return null;
	}
	public List<Double> getData(int column)
	{
		return null;
	}
}