package utilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataReader {

  public static List<HashMap<String, String>> data(String filepath) {
    List<HashMap<String, String>> allData = new ArrayList<>();

    try (FileInputStream fs = new FileInputStream(filepath)) { // Use try-with-resources
      XSSFWorkbook workbook = new XSSFWorkbook(fs);
      XSSFSheet sheet = workbook.getSheetAt(0); // Assuming first sheet
      Row HeaderRow = sheet.getRow(0);

      for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
        Row currentRow = sheet.getRow(i);
        HashMap<String, String> currentHash = new HashMap<>();

        for (int j = 0; j < HeaderRow.getPhysicalNumberOfCells(); j++) {
            Cell currentCell = currentRow.getCell(j);
            String cellValue = ""; // Initialize to empty string

            if (currentCell != null) {
                switch (currentCell.getCellType()) {
                    case STRING:
                        cellValue = currentCell.getStringCellValue();
                        break;
                    case NUMERIC:
                        cellValue = Double.toString(currentCell.getNumericCellValue());
                        break;
                    case BLANK:
                        cellValue = ""; // Already set to empty string
                        break;
                    // Handle other cell types (e.g., boolean, formula) if needed
                    default:
                        // ... (optional handling of other cell types)
                        break;
                }
            } else {
                // Treat null cells as blank
                cellValue = "";
            }

            currentHash.put(HeaderRow.getCell(j).getStringCellValue(), cellValue);
        }

        allData.add(currentHash);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return allData;
  }
}