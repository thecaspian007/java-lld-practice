package DesignPatterns.factory.DocumentExportSystem;

public class PdfExportCreator extends ExportCreator {

    @Override 
    public Document createDocument(){
        return new PdfDocument();
    }

}
