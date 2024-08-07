import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class ExcelComparator {

    public static void main(String[] args) {
        String masterFilePath = "./master";
        String branchFilePath = "./branch";

        ExcelReader reader = new ExcelReader();

        try {
            List<List<String>> masterData = reader.readExcel(masterFilePath);
            List<List<String>> branchData = reader.readExcel(branchFilePath);

            // Compare masterData and branchData to find differences
            List<List<String>> missingInBranch = findMissingInBranch(masterData, branchData);
            List<List<String>> newInBranch = findNewInBranch(masterData, branchData);
            List<List<String>> modifiedRows = findModifiedRows(masterData, branchData);

            // Output differences to console
            System.out.println("Missing in Branch:");
            printData(missingInBranch);

            System.out.println("\nNew in Branch:");
            printData(newInBranch);

            System.out.println("\nModified Rows:");
            printData(modifiedRows);

            // Write differences to a new Excel file
            writeToExcel("differences.xlsx", missingInBranch, newInBranch, modifiedRows);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<List<String>> findMissingInBranch(List<List<String>> masterData, List<List<String>> branchData) {
        List<List<String>> missingInBranch = new ArrayList<>(masterData);
        missingInBranch.removeAll(branchData);
        return missingInBranch;
    }

    private static List<List<String>> findNewInBranch(List<List<String>> masterData, List<List<String>> branchData) {
        List<List<String>> newInBranch = new ArrayList<>(branchData);
        newInBranch.removeAll(masterData);
        return newInBranch;
    }

    private static List<List<String>> findModifiedRows(List<List<String>> masterData, List<List<String>> branchData) {
        List<List<String>> modifiedRows = new ArrayList<>();
        for (List<String> masterRow : masterData) {
            if (!branchData.contains(masterRow)) {
                modifiedRows.add(masterRow);
            }
        }
        return modifiedRows;
    }

    private static void printData(List<List<String>> data) {
        for (List<String> row : data) {
            System.out.println(row);
        }
    }

    private static void writeToExcel(String filename, List<List<String>> missingInBranch, List<List<String>> newInBranch, List<List<String>> modifiedRows) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Differences");

        int rowCount = 0;
        rowCount = writeDataToSheet(sheet, rowCount, "Missing in Branch", missingInBranch);
        rowCount++;
        rowCount = writeDataToSheet(sheet, rowCount, "New in Branch", newInBranch);
        rowCount++;
        rowCount = writeDataToSheet(sheet, rowCount, "Modified Rows", modifiedRows);

        // Write workbook to file
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            workbook.write(fos);
        }

        workbook.close();
    }

    private static int writeDataToSheet(Sheet sheet, int rowCount, String title, List<List<String>> data) {
        Row titleRow = sheet.createRow(rowCount++);
        titleRow.createCell(0).setCellValue(title);

        for (List<String> rowData : data) {
            Row row = sheet.createRow(rowCount++);
            int cellCount = 0;
            for (String cellData : rowData) {
                row.createCell(cellCount++).setCellValue(cellData);
            }
        }

        return rowCount;
    }
}
