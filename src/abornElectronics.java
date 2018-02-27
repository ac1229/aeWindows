

import javax.swing.*;

import java.util.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class abornElectronics extends JFrame implements ActionListener {
	JPanel p0, p1, p2, p3, p4, p5, p6,p7, runPanel, rp1, rp2, rp3, rp4, rp5, rp6, reworkP, 
	passLP, passTP;
	JLabel serial ,seq, procedureRev, nameDate, pass, reTest, r1, r2, r3, r4, r5, r6, c1, c2,
	c3, c4, c5, c6, reworkL;
	JTextField serialText, seqText, procedureText, nameText, passText, reTestText, rt1, rt2, 
	rt3, rt4, rt5, rt6, ct1,ct2,ct3,ct4,ct5,ct6, reworkT;
	JButton enter;
	
	abornElectronics(){
		JFrame frame = new JFrame();
		
		JPanel labels = new JPanel();
		JPanel texts = new JPanel();
		labels.setLayout(new GridLayout(7,1));
		texts.setLayout(new GridLayout(7,1));
		
		
		passLP = new JPanel();
		passTP = new JPanel();
		p0 = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();
		runPanel = new JPanel();
		rp1 = new JPanel();
		rp2 = new JPanel();
		rp3 = new JPanel();
		rp4 = new JPanel();
		rp5 = new JPanel();
		rp6 = new JPanel();
		reworkP = new JPanel();
		JPanel runPanel1 = new JPanel();
		JPanel runPanel2 = new JPanel();
		runPanel1.setLayout(new GridLayout(3,1));
		runPanel2.setLayout(new GridLayout(3,1));
		runPanel1.add(rp1);
		runPanel1.add(rp2);
		runPanel1.add(rp3);
		runPanel2.add(rp4);
		runPanel2.add(rp5);
		runPanel2.add(rp6);
		rp1.setLayout(new GridLayout(2,2));
		rp2.setLayout(new GridLayout(2,2));
		rp3.setLayout(new GridLayout(2,2));
		rp4.setLayout(new GridLayout(2,2));
		rp5.setLayout(new GridLayout(2,2));
		rp6.setLayout(new GridLayout(2,2));
		//runPanel.setLayout(new GridLayout(3,2));
		
		p0.setLayout(new BoxLayout(p0, BoxLayout.Y_AXIS));

		serial = new JLabel("Serial", SwingConstants.RIGHT);
		seq = new JLabel("SEQ",SwingConstants.RIGHT);
		procedureRev = new JLabel("Procedure Rev",SwingConstants.RIGHT);
		nameDate = new JLabel("Name",SwingConstants.RIGHT);
		pass = new JLabel("Test (P/F)",SwingConstants.RIGHT);
		serialText = new JTextField(20);
		passText = new JTextField(20);
		seqText = new JTextField(20);
		procedureText = new JTextField(20);
		nameText = new JTextField(20);
		reTestText = new JTextField(20);
		enter = new JButton("Enter");
		reTest = new JLabel("Re-Test (P/F)",SwingConstants.RIGHT);
		r1 = new JLabel("Run #1 Sta: ",SwingConstants.RIGHT);
		r2 = new JLabel("Run #2 Sta: ",SwingConstants.RIGHT);
		r3 = new JLabel("Run #3 Sta: ",SwingConstants.RIGHT);
		r4 = new JLabel("Run #4 Sta: ",SwingConstants.RIGHT);
		r5 = new JLabel("Run #5 Sta: ",SwingConstants.RIGHT);
		r6 = new JLabel("Run #6 Sta: ",SwingConstants.RIGHT);
		rt1 = new JTextField(10);
		rt2 = new JTextField(10);
		rt3 = new JTextField(10);
		rt4 = new JTextField(10);
		rt5 = new JTextField(10);
		rt6 = new JTextField(10);
		c1 = new JLabel("Cath:",SwingConstants.RIGHT);
		c2 = new JLabel("Cath:",SwingConstants.RIGHT);
		c3 = new JLabel("Cath:",SwingConstants.RIGHT);
		c4 = new JLabel("Cath:",SwingConstants.RIGHT);
		c5 = new JLabel("Cath:",SwingConstants.RIGHT);
		c6 = new JLabel("Cath:",SwingConstants.RIGHT);
		ct1 = new JTextField(10);
		ct2 = new JTextField(10);
		ct3 = new JTextField(10);
		ct4 = new JTextField(10);
		ct5 = new JTextField(10);
		ct6 = new JTextField(10);
		reworkL = new JLabel("Rework Performed (If necessary) ",SwingConstants.RIGHT);
		reworkT = new JTextField(20);
		
		reworkP.add(reworkL);
		reworkP.add(reworkT);
		runPanel.add(runPanel1);
		runPanel.add(runPanel2);
		rp1.add(r1);
		rp1.add(rt1);
		rp1.add(c1);
		rp1.add(ct1);
		rp2.add(r2);
		rp2.add(rt2);
		rp2.add(c2);
		rp2.add(ct2);
		rp3.add(r3);
		rp3.add(rt3);
		rp3.add(c3);
		rp3.add(ct3);
		rp4.add(r4);
		rp4.add(rt4);
		rp4.add(c4);
		rp4.add(ct4);
		rp5.add(r5);
		rp5.add(rt5);
		rp5.add(c5);
		rp5.add(ct5);
		rp6.add(r6);
		rp6.add(rt6);
		rp6.add(c6);
		rp6.add(ct6);
		
		frame.add(p0);
		
		
		p0.add(p4);
		p0.add(p2);
		p0.add(p1);
		p0.add(p3);
		p0.add(p6);
		p0.add(p7);
		p0.add(reworkP);
		p0.add(runPanel);
		p0.add(p5);

		p1.setLayout(new GridLayout(1,2));
		p2.setLayout(new GridLayout(1,2));
		p3.setLayout(new GridLayout(1,2));
		p4.setLayout(new GridLayout(1,2));
		p6.setLayout(new GridLayout(1,2));
		p7.setLayout(new GridLayout(1,2));
		reworkP.setLayout(new GridLayout(1,2));
		
		p1.add(serial);
		p1.add(serialText);
		p2.add(seq);
		p2.add(seqText);
		p3.add(procedureRev);
		p3.add(procedureText);
		p4.add(nameDate);
		p4.add(nameText);
		p6.add(pass);
		p6.add(passText);
		p7.add(reTest);
		p7.add(reTestText);
	
		p5.add(enter);

		enter.addActionListener(this);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void editFile(String a, String b, String c, String d, String e, String g, 
			String h,String i,String j,String k,String l,String m, 
			String n,String o,String p,String q,String r,String s) throws IOException{

		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yy");
		Date date = new Date();

		  File f = new File(a);
		  
		  int foo = 0;
      	int roof = Integer.parseInt(b);
      	if (roof == 1)
      		foo = 4;
      	else if(roof == 2)
      		foo = 6;
      	else if(roof == 3)
      		foo = 8;
      	else if(roof == 4)
      		foo = 10;
      	else if(roof == 5)
      		foo = 12;
      	else if(roof == 6)
      		foo = 14;
      	else if(roof == 7)
      		foo = 16;
      	else if(roof == 8)
      		foo = 19;
      	else if(roof == 8.1)
      		foo = 22;
      	else if(roof == 8.2)
      		foo = 24;
      	else if(roof == 8.3)
      		foo = 26;
      	else if(roof == 9)
      		foo = 28;
      	else if(roof == 10)
      		foo = 29;
      	else if(roof == 11)
      		foo = 30;
      	else if(roof == 12)
      		foo = 33;
      	else if(roof == 13)
      		foo = 35;
      		
		  if(f.exists()){
		
		//Read the spreadsheet that needs to be updated
        FileInputStream input_document = new FileInputStream(new File(a));
        
        //Access the workbook
        XSSFWorkbook my_xls_workbook = new XSSFWorkbook(input_document); 
        //Access the worksheet, so that we can update / modify it.
        XSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0);
        // declare a Cell object
        //COPY
        
        Cell cell = null; 
        // Access the cell first to update the value

	    	 cell = my_worksheet.getRow(foo).getCell(3);
        // Get current value and then add 5 to it 
         if (cell == null)
         {
             cell = my_worksheet.getRow(foo).createCell(3);
         }
         if (cell.getStringCellValue() == "") 
        	 	cell.setCellValue(c);
//-------------------------------
         Cell nameCell = null;
    	 	nameCell = my_worksheet.getRow(foo).getCell(5);

         if (nameCell == null)
         {
             nameCell = my_worksheet.getRow(foo).createCell(5);
         }
         if (nameCell.getStringCellValue() == "")
        	 	nameCell.setCellValue(d + " " + dateFormat.format(date));
         //---------
         Cell serialCell = null;
    	 	serialCell = my_worksheet.getRow(0).getCell(0);

         if (serialCell == null)
         {
             serialCell = my_worksheet.getRow(0).createCell(0);
         }

         if (serialText.getText().equals("")) {
        	 
         }
         else {
        	 	String temp = serialText.getText();
        	 	String tempCaps = temp.toUpperCase();
        		serialCell.setCellValue("Serial Number: " + tempCaps);  
         }
         //---------
         Cell passed = null;
    	 	 passed = my_worksheet.getRow(foo + 1).getCell(5);

         if (passed == null)
         {
             passed = my_worksheet.getRow(foo + 1).createCell(5);
         }
         if (passed.getStringCellValue() == "")
         {
            	 nameCell.setCellValue(d + " " + dateFormat.format(date));
            	 passed.setCellValue(e);
        	 }
         //----
         Cell reCell = null;
         reCell = my_worksheet.getRow(foo + 1).getCell(6);

         if (reCell == null)
         {
             reCell = my_worksheet.getRow(foo + 1).createCell(6);
         }

         Cell reCellName = null;
         reCellName = my_worksheet.getRow(foo).getCell(6);

         if (reCellName == null)
         {
             reCellName = my_worksheet.getRow(foo).createCell(6);
         }
         

         if (reTestText.getText().equals("")) {
        	 
         }
         else {
        	  reCell.setCellValue(g);
         reCellName.setCellValue(d + " " + dateFormat.format(date));  
         }
         //----------------         //----

         //----------------
         Cell run1 = null;
         run1 = my_worksheet.getRow(22).getCell(1);

         if (run1 == null)
         {
             run1 = my_worksheet.getRow(22).createCell(1);
         }
         if (rt1.getText().equals("")) {
        	 
         }
         else
        		 run1.setCellValue("Run #1 Sta: " + h);  //----------------
         Cell run2 = null;
         run2 = my_worksheet.getRow(24).getCell(1);

         if (run2 == null)
         {
             run2 = my_worksheet.getRow(24).createCell(1);
         }
         if (rt2.getText().equals("")) {
        	 
         }
         else
        		 run2.setCellValue("Run #2 Sta: " + i);  
         //----------------
         Cell run3 = null;
         run3 = my_worksheet.getRow(26).getCell(1);

         if (run3 == null)
         {
             run3 = my_worksheet.getRow(26).createCell(1);
         }
         if (rt3.getText().equals("")) {
        	 
         }
         else
        		 run3.setCellValue("Run #3 Sta: " + j);
         //----------------
         Cell run4 = null;
         run4 = my_worksheet.getRow(22).getCell(2);

         if (run4 == null)
         {
             run4 = my_worksheet.getRow(22).createCell(2);
         }
         if (rt4.getText().equals("")) {
        	 
         }
         else
        		 run4.setCellValue("Run #4 Sta: " + k);
         //----------------
         Cell run5 = null;
         run5 = my_worksheet.getRow(24).getCell(2);

         if (run5 == null)
         {
             run5 = my_worksheet.getRow(24).createCell(2);
         }
         if (rt5.getText().equals("")) {
        	 
         }
         else
        		 run5.setCellValue("Run #5 Sta: " + l);
         //----------------
         Cell run6 = null;
         run6 = my_worksheet.getRow(26).getCell(2);

         if (run6 == null)
         {
             run6 = my_worksheet.getRow(26).createCell(2);
         }
         if (rt6.getText().equals("")) {
        	 
         }
         else
        		 run6.setCellValue("Run #6 Sta: " + m);
         

         //----------------
         Cell cath1 = null;
         cath1 = my_worksheet.getRow(23).getCell(1);

         if (cath1 == null)
         {
             cath1 = my_worksheet.getRow(23).createCell(1);
         }
         if (ct1.getText().equals("")) {
        	 
         }
         else
        		 cath1.setCellValue("Cath: " + n);
         //----------------
         Cell cath2 = null;
         cath2 = my_worksheet.getRow(25).getCell(1);

         if (cath2 == null)
         {
             cath2 = my_worksheet.getRow(25).createCell(1);
         }
         if (ct2.getText().equals("")) {
        	 
         }
         else
        		 cath2.setCellValue("Cath: " + o);
         //----------------
         Cell cath3 = null;
         cath3 = my_worksheet.getRow(27).getCell(1);

         if (cath3 == null)
         {
             cath3 = my_worksheet.getRow(27).createCell(1);
         }
         if (ct3.getText().equals("")) {
        	 
         }
         else
        		 cath3.setCellValue("Cath: " + p);
         //----------------
         Cell cath4 = null;
         cath4 = my_worksheet.getRow(23).getCell(2);

         if (cath4 == null)
         {
             cath4 = my_worksheet.getRow(23).createCell(2);
         }
         if (ct4.getText().equals("")) {
        	 
         }
         else
        		 cath4.setCellValue("Cath: " + q);
         //----------------
         Cell cath5 = null;
         cath5 = my_worksheet.getRow(25).getCell(2);

         if (cath5 == null)
         {
             cath5 = my_worksheet.getRow(25).createCell(2);
         }
         if (ct5.getText().equals("")) {
        	 
         }
         else
        		 cath5.setCellValue("Cath: " + r);
         //----------------
         Cell cath6 = null;
         cath6 = my_worksheet.getRow(27).getCell(2);

         if (cath6 == null)
         {
             cath6 = my_worksheet.getRow(27).createCell(2);
         }
         if (ct6.getText().equals("")) {
        	 
         }
         else
        		 cath6.setCellValue("Cath: " + s);
         //------------------
         Cell rework = null;
         rework = my_worksheet.getRow(foo ).getCell(7);

         if (rework == null)
         {
             rework = my_worksheet.getRow(foo).createCell(7);
         }
         Cell reworkName = null;
         reworkName = my_worksheet.getRow(foo ).getCell(9);

         if (reworkName == null)
         {
             reworkName = my_worksheet.getRow(foo).createCell(9);
         }
         if (reworkT.getText().equals("")) {
        	 
         }
         else {
        		 rework.setCellValue(reworkT.getText());
        		 reworkName.setCellValue(d + " " + dateFormat.format(date));
         }
         
        //Close the InputStream
        input_document.close();
        //Open FileOutputStream to write updates
        FileOutputStream output_file =new FileOutputStream(new File(a));
        //write changes
        my_xls_workbook.write(output_file);
        //close the stream
        output_file.close();   
        
        //COPY
        
	}
		  
		  else {

				//Read the spreadsheet that needs to be updated
		        FileInputStream input_document = new FileInputStream(new File(
		        		"C:\\Users\\aborn1062\\OneDrive\\template.xlsx"));
		        
		        //Access the workbook
		        XSSFWorkbook my_xls_workbook = new XSSFWorkbook(input_document); 
		        //Access the worksheet, so that we can update / modify it.
		        XSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0);

		        //COPY
		        
		        Cell cell = null; 
		        // Access the cell first to update the value

			    	 cell = my_worksheet.getRow(foo).getCell(3);
		        // Get current value and then add 5 to it 
		         if (cell == null)
		         {
		             cell = my_worksheet.getRow(foo).createCell(3);
		         }
		         if (cell.getStringCellValue() == "") 
		        	 	cell.setCellValue(c);
		//-------------------------------
		         Cell nameCell = null;
		    	 	nameCell = my_worksheet.getRow(foo).getCell(5);

		         if (nameCell == null)
		         {
		             nameCell = my_worksheet.getRow(foo).createCell(5);
		         }
		         if (nameCell.getStringCellValue() == "")
		        	 	nameCell.setCellValue(d + " " + dateFormat.format(date));
		         //---------
		         Cell serialCell = null;
		    	 	serialCell = my_worksheet.getRow(0).getCell(0);

		         if (serialCell == null)
		         {
		             serialCell = my_worksheet.getRow(0).createCell(0);
		         }

		         if (serialText.getText().equals("")) {
		        	 
		         }
		         else {
		        	 	String temp = serialText.getText();
		        	 	String tempCaps = temp.toUpperCase();
		        		serialCell.setCellValue("Serial Number: " + tempCaps);  
		         }
		         //---------
		         Cell passed = null;
		    	 	 passed = my_worksheet.getRow(foo + 1).getCell(5);

		         if (passed == null)
		         {
		             passed = my_worksheet.getRow(foo + 1).createCell(5);
		         }
		         if (passed.getStringCellValue() == "")
		         {
		            	 nameCell.setCellValue(d + " " + dateFormat.format(date));
		            	 passed.setCellValue(e);
		        	 }
		         //----
		         Cell reCell = null;
		         reCell = my_worksheet.getRow(foo + 1).getCell(6);

		         if (reCell == null)
		         {
		             reCell = my_worksheet.getRow(foo + 1).createCell(6);
		         }

		         Cell reCellName = null;
		         reCellName = my_worksheet.getRow(foo).getCell(6);

		         if (reCellName == null)
		         {
		             reCellName = my_worksheet.getRow(foo).createCell(6);
		         }
		         

		         if (reTestText.getText().equals("")) {
		        	 
		         }
		         else {
		        	  reCell.setCellValue(g);
		         reCellName.setCellValue(d + " " + dateFormat.format(date));  
		         }
		         //----------------         //----

		         //----------------
		         Cell run1 = null;
		         run1 = my_worksheet.getRow(22).getCell(1);

		         if (run1 == null)
		         {
		             run1 = my_worksheet.getRow(22).createCell(1);
		         }
		         if (rt1.getText().equals("")) {
		        	 
		         }
		         else
		        		 run1.setCellValue("Run #1 Sta: " + h);  //----------------
		         Cell run2 = null;
		         run2 = my_worksheet.getRow(24).getCell(1);

		         if (run2 == null)
		         {
		             run2 = my_worksheet.getRow(24).createCell(1);
		         }
		         if (rt2.getText().equals("")) {
		        	 
		         }
		         else
		        		 run2.setCellValue("Run #2 Sta: " + i);  
		         //----------------
		         Cell run3 = null;
		         run3 = my_worksheet.getRow(26).getCell(1);

		         if (run3 == null)
		         {
		             run3 = my_worksheet.getRow(26).createCell(1);
		         }
		         if (rt3.getText().equals("")) {
		        	 
		         }
		         else
		        		 run3.setCellValue("Run #3 Sta: " + j);
		         //----------------
		         Cell run4 = null;
		         run4 = my_worksheet.getRow(22).getCell(2);

		         if (run4 == null)
		         {
		             run4 = my_worksheet.getRow(22).createCell(2);
		         }
		         if (rt4.getText().equals("")) {
		        	 
		         }
		         else
		        		 run4.setCellValue("Run #4 Sta: " + k);
		         //----------------
		         Cell run5 = null;
		         run5 = my_worksheet.getRow(24).getCell(2);

		         if (run5 == null)
		         {
		             run5 = my_worksheet.getRow(24).createCell(2);
		         }
		         if (rt5.getText().equals("")) {
		        	 
		         }
		         else
		        		 run5.setCellValue("Run #5 Sta: " + l);
		         //----------------
		         Cell run6 = null;
		         run6 = my_worksheet.getRow(26).getCell(2);

		         if (run6 == null)
		         {
		             run6 = my_worksheet.getRow(26).createCell(2);
		         }
		         if (rt6.getText().equals("")) {
		        	 
		         }
		         else
		        		 run6.setCellValue("Run #6 Sta: " + m);
		         

		         //----------------
		         Cell cath1 = null;
		         cath1 = my_worksheet.getRow(23).getCell(1);

		         if (cath1 == null)
		         {
		             cath1 = my_worksheet.getRow(23).createCell(1);
		         }
		         if (ct1.getText().equals("")) {
		        	 
		         }
		         else
		        		 cath1.setCellValue("Cath: " + n);
		         //----------------
		         Cell cath2 = null;
		         cath2 = my_worksheet.getRow(25).getCell(1);

		         if (cath2 == null)
		         {
		             cath2 = my_worksheet.getRow(25).createCell(1);
		         }
		         if (ct2.getText().equals("")) {
		        	 
		         }
		         else
		        		 cath2.setCellValue("Cath: " + o);
		         //----------------
		         Cell cath3 = null;
		         cath3 = my_worksheet.getRow(27).getCell(1);

		         if (cath3 == null)
		         {
		             cath3 = my_worksheet.getRow(27).createCell(1);
		         }
		         if (ct3.getText().equals("")) {
		        	 
		         }
		         else
		        		 cath3.setCellValue("Cath: " + p);
		         //----------------
		         Cell cath4 = null;
		         cath4 = my_worksheet.getRow(23).getCell(2);

		         if (cath4 == null)
		         {
		             cath4 = my_worksheet.getRow(23).createCell(2);
		         }
		         if (ct4.getText().equals("")) {
		        	 
		         }
		         else
		        		 cath4.setCellValue("Cath: " + q);
		         //----------------
		         Cell cath5 = null;
		         cath5 = my_worksheet.getRow(25).getCell(2);

		         if (cath5 == null)
		         {
		             cath5 = my_worksheet.getRow(25).createCell(2);
		         }
		         if (ct5.getText().equals("")) {
		        	 
		         }
		         else
		        		 cath5.setCellValue("Cath: " + r);
		         //----------------
		         Cell cath6 = null;
		         cath6 = my_worksheet.getRow(27).getCell(2);

		         if (cath6 == null)
		         {
		             cath6 = my_worksheet.getRow(27).createCell(2);
		         }
		         if (ct6.getText().equals("")) {
		        	 
		         }
		         else
		        		 cath6.setCellValue("Cath: " + s);
		         //------------------
		         Cell rework = null;
		         rework = my_worksheet.getRow(foo ).getCell(7);

		         if (rework == null)
		         {
		             rework = my_worksheet.getRow(foo).createCell(7);
		         }
		         Cell reworkName = null;
		         reworkName = my_worksheet.getRow(foo ).getCell(9);

		         if (reworkName == null)
		         {
		             reworkName = my_worksheet.getRow(foo).createCell(9);
		         }
		         if (reworkT.getText().equals("")) {
		        	 
		         }
		         else {
		        		 rework.setCellValue(reworkT.getText());
		        		 reworkName.setCellValue(d + " " + dateFormat.format(date));
		         }
		         
		        //Close the InputStream
		        input_document.close();
		        //Open FileOutputStream to write updates
		        FileOutputStream output_file =new FileOutputStream(new File(a));
		        //write changes
		        my_xls_workbook.write(output_file);
		        //close the stream
		        output_file.close();   
		        
		        //COPY
		        
		        JOptionPane.showMessageDialog(null, "you've created a sheet");

		         }}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == enter) {

			String a = passText.getText();
			String g = reTestText.getText();
			String b = a.toUpperCase();
			String c = g.toUpperCase();
			String x = serialText.getText();
			String y = seqText.getText();
			String procedureLower = procedureText.getText();
			String z = procedureLower.toUpperCase();
			String nameTextLower = nameText.getText();
			String w = nameTextLower.toUpperCase();
			String d = rt1.getText();
			String h = rt2.getText();
			String i= rt3.getText();
			String j = rt4.getText();
			String k = rt5.getText();
			String l = rt6.getText();
			String m = ct1.getText();
			String n = ct2.getText();
			String o = ct3.getText();
			String p = ct4.getText();
			String q = ct5.getText();
			String r = ct6.getText();
			
			try {
				editFile("C:\\Users\\aborn1062\\OneDrive\\" + x + ".xlsx", y, z, w, b, c, d,h,i,j,k,l,
						m,n,o,p,q,r);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			serialText.setText("");
			passText.setText("");
			//seqText.setText("");
			procedureText.setText("");
			//nameText.setText("");
			reTestText.setText("");
			rt1.setText("");
			rt2.setText("");
			rt3.setText("");
			rt4.setText("");
			rt5.setText("");
			rt6.setText("");
			ct1.setText("");
			ct2.setText("");
			ct3.setText("");
			ct4.setText("");
			ct5.setText("");
			ct6.setText("");
		}
	}
	
	public static void main(String[] args){
		new abornElectronics();
	}
}