import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExcelReading {

    public static void main(String[] args) throws FileNotFoundException {

        String folder= "C:\\Users\\asus\\Downloads\\";

        DataFormatter dataFormatter=new DataFormatter();
        try
        (InputStream inp=new FileInputStream(folder + "Book2.xlsx")){

            Workbook workBook=WorkbookFactory.create(inp);
            for(Sheet s:workBook){

                System.out.println(s.getSheetName());
            }

            Sheet s=workBook.getSheetAt(0);

            for(Row r:s){

                for (Cell c:r){

                    System.out.print(c);
                }
                System.out.println("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
