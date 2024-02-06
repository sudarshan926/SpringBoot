package com.fusion.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fusion.DAO.ProductDAO;
import com.fusion.dto.Product;

@Service
public class ProductService {

	@Autowired
	ProductDAO productDAO;
	

	public ProductService() {
		System.out.println("Inside ProductService");
	}
	public List<Product> ProductService1(List<Product> p) {
		System.out.println("Inside ProductDetailsService1");
		List<Product> p1 = productDAO.saveAll(p);
		return p1;
	}
	
	 public void writeDataToExcel() {
	        List<Product> products = productDAO.findAll();

	        // Create a new workbook
	        workbook workbook = new XSSFWorkbook();

	        // Create a sheet
	        Sheet sheet = workbook.createSheet("Product Data");

	        // Create header row
	        Row headerRow = sheet.createRow(0);
	        headerRow.createCell(0).setCellValue("Product ID");
	        headerRow.createCell(1).setCellValue("Product Name");
	        headerRow.createCell(2).setCellValue("Product Description");

	        // Populate data rows
	        int rowNum = 1;
	        for (Product product : products) {
	            Row row = sheet.createRow(rowNum++);
	            row.createCell(0).setCellValue(product.getId());
	            row.createCell(1).setCellValue(product.getName());
	            row.createCell(2).setCellValue(product.getProductDetails().getDescription());
	        }

	        // Write the workbook to a file
	        try (FileOutputStream outputStream = new FileOutputStream("ProductData.xlsx")) {
	            workbook.write(outputStream);
	            System.out.println("Data written to Excel file successfully.");
	        } catch (IOException e) {
	            e.printStackTrace();
	            // Handle the exception appropriately in your application
	        } finally {
	            try {
	                workbook.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	                // Handle the exception appropriately in your application
	            }
	        }
	
}
