package Class27;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special call which knows how to read the data from excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        for (int rows = 0; rows <sheet.getPhysicalNumberOfRows() ; rows++) {
            Row row=sheet.getRow(rows);

            for (int col = 0; col < row.getPhysicalNumberOfCells() ; col++) {
                System.out.print( row.getCell(col)+" ");
            }
            System.out.println();
        }

        // Break till 1:54

       /* System.out.print( row.getCell(0)+" ");
        System.out.print( row.getCell(1)+" ");
        System.out.print( row.getCell(2)+" ");
        System.out.print( row.getCell(3)+" ");
        System.out.print( row.getCell(4));*/




    }
}