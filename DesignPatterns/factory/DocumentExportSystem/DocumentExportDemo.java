package DesignPatterns.factory.DocumentExportSystem;

public class DocumentExportDemo {
    public static void main(String[] args) {
        String[][] reportData = {
            {"Name", "Department", "Salary"},
            {"Alice", "Engineering", "120000"},
            {"Bob", "Marketing", "95000"},
            {"Charlie", "Design", "105000"}
        };

        ExportCreator pdfExporter = new PdfExportCreator();
        pdfExporter.export(reportData);

        ExportCreator htmlExporter = new HtmlExportCreator();
        htmlExporter.export(reportData);

        ExportCreator csvExporter = new CsvExportCreator();
        csvExporter.export(reportData);
    }
}
