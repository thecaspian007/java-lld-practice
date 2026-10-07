package DesignPatterns.factory.DocumentExportSystem;

public class CsvExportCreator extends ExportCreator{
    @Override
    public Document createDocument() {
        return new CsvDocument();
    }
}
