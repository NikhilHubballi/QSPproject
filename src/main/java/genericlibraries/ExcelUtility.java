package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	private Workbook wb;
	 
	public void excelInitialization(String excelPath)
	{
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(excelPath);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			wb=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public String fetchDataFromExcel(String sheetname,int rowNum , int cellNum) {
		return wb.getSheet(sheetname).getRow(rowNum).getCell(cellNum ).getStringCellValue();
		
	}
	public List<String> fetchDataFromExcel(String sheetname)
	{
		List<String> dataList=new ArrayList<>();
		Sheet  sheet=wb.getSheet(sheetname);
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			String data=sheet.getRow(i).getCell(1).getStringCellValue();
			dataList.add(data);
			
		}
		return dataList;
		
	}
	public void closeexcel() {
		try {
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
