package dataProviderPack;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class ExellReader {
    public Object[][] readXls() throws IOException{
    FileInputStream fis = new FileInputStream("src/test/java/dataProviderPack/credentials.ods");
    XSSFWorkbook workbook = new XSSFWorkbook(fis);



        return Object;
    }
}
