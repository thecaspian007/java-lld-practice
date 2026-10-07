package DesignPatterns.factory.DocumentExportSystem;

public class CsvDocument implements Document {

    @Override
    public String getHeader() {
        return ""; // CSV has no header wrapper
    }

    @Override
    public String formatRow(String[] data) {
        return String.join(",", data);
    }

    @Override
    public String getFooter() {
        return ""; // CSV has no footer
    }

    @Override
    public String getFileExtension() {
        return ".csv";
    }

}
