package com.jax;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.ZoneId;
import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream(new File("/home/jaxtony/dataTest/Template_Daily_Horoscope.xlsx"));
            Workbook workbook = new XSSFWorkbook(file);
            System.out.println("Count sheet: "+workbook.getNumberOfSheets());
            Sheet sheet = workbook.getSheetAt(0);
            Map<Integer, List<String>> data = new HashMap<>();
            int i = 0;
            for (Row row : sheet) {
                data.put(i, new ArrayList<String>());
                System.out.println(row.getLastCellNum());;
                for (Cell cell: row){
                    System.out.print(cell);
                    switch (cell.getCellTypeEnum()){
                        case STRING:
                            System.out.println("String");
                            break;
                        case NUMERIC:
                            if (i == 1){
//                                String date = cell.getStringCellValue();
                                Date date = cell.getDateCellValue();
                                System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
                            }
                            System.out.println("Numberic");
                            break;
                        case BOOLEAN:
                            System.out.println("Boolean");
                            break;
                        case FORMULA:
                            System.out.println("Formula");
                            break;
                        default:
                            data.get(new Integer(i)).add(" ");
                    }
                    System.out.print("--");
                }
                System.out.println();
                i++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
