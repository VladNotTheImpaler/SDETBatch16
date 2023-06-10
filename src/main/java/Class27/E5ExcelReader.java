package Class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E5ExcelReader {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(Constants.EXCEL_FILE_PATH);

        // that special call which knows how to read the data from excel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        List<Map<String, String>> excelData = new ArrayList<>();
        Row headerRow = sheet.getRow(0);
        for (int rows = 1; rows < sheet.getPhysicalNumberOfRows(); rows++) {

            Row row = sheet.getRow(rows);
            Map<String, String> rowMap = new LinkedHashMap<>();
            for (int col = 0; col < row.getPhysicalNumberOfCells(); col++) {
                String key = headerRow.getCell(col).toString();
                String value = row.getCell(col).toString();
                rowMap.put(key, value);
            }
            excelData.add(rowMap);
        }
        System.out.println(excelData);
    }
}