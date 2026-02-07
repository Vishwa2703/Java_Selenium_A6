package org.genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


/**
 * The Class Flib is mainly used to interact with the File and fetch the Test data needed for Automating Application
 * 
 * @author ASUS
 * 
 */

public class Flib {
	/**
	 * This method accepts the key and it fetch the value of the respective key in the given properties file 
	 * @param key[String]
	 * @return [String]
	 */
	
	public static String getPropertyValue(String propPath,String key)
	{
		File file = new File(propPath);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		String value = prop.getProperty(key);
		return value;
		}
	/**
	 * This method accepts the sheetName, rowIndex,
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 */
	public static String getWorkbookCellValue(String excelPath,String sheetName, int rowIndex, int cellIndex)
	{
		File file = new File(excelPath);
		FileInputStream fis = null;
		Workbook wb = null;
		try {
			fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(EncryptedDocumentException e)
		{
			e.printStackTrace();
		}
		String value = wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).toString();
		return value;
	}
	
public static String readCellValueFromExcelinint(String excelPath, String Sheet1, int row, int cell) throws EncryptedDocumentException, IOException
{
	File file = new File(excelPath);
	FileInputStream fis  = new FileInputStream(file);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(Sheet1);
	Row rw = sh.getRow(row);	
	Cell cl = rw.getCell(cell);
	double data = cl.getNumericCellValue();
	
	// Upcasting Because We Get Pincode In double datatype 
	int data1 = (int) data;
	String value = String.valueOf(data1);// Here we convert int in to String 
	return value;
}

public static int generateRandonNo()
{
	Random random = new Random();
	int rn = random.nextInt(1000, 9999);
	return rn;
}

}


