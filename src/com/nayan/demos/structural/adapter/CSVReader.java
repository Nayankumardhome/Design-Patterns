package com.nayan.demos.structural.adapter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	
	List<String[]> readcsv(String fileName){
		List<String[]> records = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String line;
			while((line = br.readLine()) != null) {
				String[] values = line.split(",");
				records.add(values);
			}
		}catch(IOException e) {
			System.out.println("ReadCSV problem");
		}
		return records;
	}

}
