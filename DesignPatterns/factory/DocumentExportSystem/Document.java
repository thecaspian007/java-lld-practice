package DesignPatterns.factory.DocumentExportSystem;

public interface Document {
    String getHeader();
    String formatRow(String [] data);
    String getFooter();
    String getFileExtension();
}
