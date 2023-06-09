/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales_Representative;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Sarah Mahbub
 */
public class DevelopmentPlanController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generatePdfbuttonOnClick(ActionEvent event) throws IOException {
       /* try{
           
            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.bmp", "*.png"));
            File f = fc.showSaveDialog(null);
            if(f!=null){              
                PdfWriter pw = new PdfWriter(new FileOutputStream(f));
                //PdfWriter pw = new PdfWriter(new FileOutputStream("testPDF.pdf"));
                PdfDocument pdf =  new PdfDocument(pw);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);
                //----------------------------------------------------
                //adding paragrapg to the pdf
                String newline = "\n";
                Paragraph lineSpace = new Paragraph(newline);
                lineSpace.setHeight(8);
                
                String paraText1 
                        = "This is line 1 of the paragraph, and the line continue....\n"
                        + "This is line 2 of the paragraph, and the line continue....\n"
                        + "This is line 3 of the paragraph, and the line continue....\n"
                        + "This is line 4 of the paragraph, and the line continue....\n";
                Paragraph para1 = new Paragraph(paraText1);
                
                Text titleText = new Text("This is the TITLE of the pdf");
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();    //OR titleText.setBold();

                PdfFont font2 = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
                PdfFont fontBold = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
                Text title = new Text("Thinking in Java (4th Ed)").setFont(fontBold);
                Text author = new Text("Bruce Eckel").setFont(font2);
                author.setFontColor(Color.RED);
                Paragraph bookInfo = new Paragraph().add(title).add(" -- by ").add(author);
                
                doc.add(pageTitle);
                doc.add(lineSpace);
                doc.add(para1);
                doc.add(lineSpace);
                doc.add(bookInfo);
                doc.add(lineSpace);
                
                //----------------------------------------------------
                
                //adding a list
                List progLangList = new List();
                progLangList.add("C");
                progLangList.add("C++");
                progLangList.add("Java");
                progLangList.add("Python");
                progLangList.add("C#");          
                doc.add(progLangList);
                doc.add(lineSpace);
                
                //----------------------------------------------------
                //adding an image
                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                a.setContentText("Do you want to add an Image?");
                Optional<ButtonType> result = a.showAndWait();
                if(result.get() == ButtonType.OK){ 
                    File imageFile = fc.showOpenDialog(null);
                    String imagePath = imageFile.getAbsolutePath();
                    ImageData data = ImageDataFactory.create(imagePath);
                    Image image = new Image(data);  
                    image.setAutoScale(true);
                    
                    doc.add(image);
                    doc.add(lineSpace);
                    a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("The image is added successfully.");
                    a.showAndWait();
                }
                //----------------------------------------------------
                
                //adding table in pdf
                float colWidthArr[] = {70f, 200f, 100f};
                Table pdfTable = new Table(colWidthArr); 
                
                //adding header row
                Cell cell_00 = new Cell(); 
                cell_00.add("Product ID");
                cell_00.setBackgroundColor(Color.YELLOW);
                pdfTable.addCell(cell_00);
                pdfTable.addCell(new Cell().setBackgroundColor(Color.YELLOW).add("Product Name"));
                pdfTable.addCell(new Cell().setBackgroundColor(Color.YELLOW).add("Price"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("111"));
                pdfTable.addCell(new Cell().add("Lux Soap"));
                pdfTable.addCell(new Cell().add("34.0"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("222"));
                pdfTable.addCell(new Cell().add("Aarong Yougart"));
                pdfTable.addCell(new Cell().add("75.0"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("333"));
                pdfTable.addCell(new Cell().add("Brown Bread"));
                pdfTable.addCell(new Cell().add("85.0"));

                doc.add(pdfTable);
                
                doc.close();
                
                a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("The PDF is saved successfully.");
                a.showAndWait();    
            }*/
    }

    @FXML
    private void backToDashboardOnclick(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
         anchorPane.getChildren().setAll(pane);
    }
    
}
