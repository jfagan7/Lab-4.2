package csv;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File data = new File("SATResults2012.csv");
		CSVUtilities test=new CSVUtilities(data);
		
		List<String>headers= test.getColumnHeaders();
		
		
		System.out.print(headers);
	}

}
