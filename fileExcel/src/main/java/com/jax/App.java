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
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class App {
    static boolean checkNumber(String number) {
        number.trim().replaceAll("\\s", "");
        String numberArr[] = number.split(",");
        for (int i = 0; i < numberArr.length; i++) {
            if (!numberArr[i].matches("[0-9]+")) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        try {
//            FileInputStream file = new FileInputStream(new File("/home/jaxtony/dataTest/Template_Weekly_Horoscope.xlsx"));
//            FileInputStream file = new FileInputStream(new File("/home/jaxtony/dataTest/empty.xlsx"));
//            FileInputStream file = new FileInputStream(new File("/home/jaxtony/dataTest/Template_General_Horoscope.xlsx"));
            FileInputStream file = new FileInputStream(new File("/home/jaxtony/dataTest/Template_Daily_Horoscope.xlsx"));

            Workbook workbook = new XSSFWorkbook(file);
            System.out.println("Count sheet: " + workbook.getNumberOfSheets());
            Sheet sheet = workbook.getSheetAt(0);
            try {
                System.out.println(sheet.getRow(1).getCell(1).getLocalDateTimeCellValue());
            }catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(sheet.getPhysicalNumberOfRows());
            System.out.println(sheet.getLastRowNum());

//            for (int i = 0; i < sheet.getLastRowNum(); i++) {
//                for (int j = 0; j < 13; j++) {
//                    System.out.print(sheet.getRow(i).getCell(j) + "===");
//                }
//                System.out.println();
//            }
//            System.out.println(4.5 < 5);
//            for (int j = 0; j < 13; j++) {
//                System.out.print(sheet.getRow(0).getCell(j) + "===");
//            }
//
//            String number = "   2, ,3, 4,5, 7.8, 9, a  , 10";
//            String arr [] = number.trim().replaceAll("\\s", "").split(",");
//            System.out.println(arr);
//            for (int i = 0; i < arr.length; i++) {
////                System.out.println(!arr[i].matches("[0-9]+"));
//                System.out.println(checkNumber(arr[i]));
//            }
//            String space = "   abac ccc   ascasc ";
//            System.out.println(space.replaceAll("\\s+", " ").replaceAll(" ", "_"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
