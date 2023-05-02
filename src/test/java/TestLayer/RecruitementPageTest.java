package TestLayer;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.Baseclass;
import PageLayer.RecruitementPage;
import UtilsLayer.ExcelReader;

@Test(groups = { "Recruitment" }, dependsOnGroups = { "Leave" })
public class RecruitementPageTest extends Baseclass {

	RecruitementPage recr;

	@Test(priority = 1)
	public void validateRecruitmentpage() {
		recr = new RecruitementPage();
		recr.clickOnRecruitment();
	}

	@Test(priority = 2, dataProvider = "testData")
	public void validateCandidates(String fname)
	{
		recr.candidates(fname);

	}

	@DataProvider(name = "testData")
	public Object[][] getData() throws IOException {
		// call Excelreader class from utilsLayer
		
		//ExcelReader excel = new ExcelReader(System.getProperty("user.dir")
			//	+ "‪C:\\Users\\vaibh\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		ExcelReader excel =new ExcelReader("C:\\Users\\vaibh\\OneDrive\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		int rows = excel.countrows(0);     //called method of utils
		int columns = excel.countcells(0);  //called method of utils
		Object[][]data=new Object[rows][columns];
		for(int i=0;i>=rows;i++)
		{
			data[i][0]=excel.getData(0, i, 0);     //called method of utils
		    data[i][1]=excel.getData(0, i, 1);     // 2 rows so two times called
		}
		return data;
	}

}
