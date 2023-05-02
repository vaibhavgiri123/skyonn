package UtilsLayer;

import java.io.File;
import java.io.FileInputStream;                              // PRACTICE
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.Baseclass;

public class ExcelReader extends Baseclass {
	 public static XSSFWorkbook workbook;
	public ExcelReader(String path) throws IOException
	{
		File f=new File(path);
	
			FileInputStream fis=new FileInputStream(f);
		
		
		workbook =new XSSFWorkbook(fis);
	}
	public String getData(int index,int rows,int column)
	{
		XSSFSheet sheet=workbook.getSheetAt(index);
		
		try
		{
			return sheet.getRow(rows).getCell(column).getStringCellValue();
		}
		catch(Exception e)
		{
			double d=sheet.getRow(rows).getCell(column).getNumericCellValue();
			long abc=(long) d;
			 return Long.toString(abc);
		}
	}
		 public int countrows(int sheetindex)
		{
			 return workbook.getSheetAt(sheetindex).getLastRowNum();
		}
		 public int countcells(int sheetindex)
			{
				 return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
			}
	}
	

