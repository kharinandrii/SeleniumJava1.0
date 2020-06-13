package dataProviderPack;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class ExellReader {
    public Object[][] readXls() throws IOException{
    FileInputStream fis = new FileInputStream("src/test/java/dataProviderPack/credentials.xlsx");
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheet("list");
    int totalRows = sheet.getLastRowNum() - 1 ;
    int totalColums = sheet.getRow(0).getPhysicalNumberOfCells();
    Object obj[][] = new Object[totalRows][totalColums];
    for (int i = 0; i < totalRows; i++){
        obj[i][0] = sheet.getRow(i + 1).getCell(0).toString();
        obj[i][1] = sheet.getRow(i + 1).getCell(1).toString();
    }
        return obj;
    }

}
