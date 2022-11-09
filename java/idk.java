JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Excel sheets", "xlsx", "xls")); //maakt een filter zodat alleen excel sheets ingelezen kunnen worden
        fc.setAcceptAllFileFilterUsed(false); //zorgt ervoor dat je alleen excel bestanden kan kiezen
        int excelSheet = fc.showOpenDialog(this); //roept de file chooser aan vanuit deze jframe?
        if (excelSheet == JFileChooser.APPROVE_OPTION) {
            File bestand = fc.getSelectedFile();
            System.out.println("Selected file: " + bestand.getAbsolutePath()); //zodat ik zeker weet dat hij het ook echt gelezen heeft
        }
        
       /* try
        {
            FileInputStream file = new FileInputStream(bestand);
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext()) 
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) 
                    {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "t");
                            break;
                    }
                }
                System.out.println("");
            }
            file.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } */