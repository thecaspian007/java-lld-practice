package DesignPatterns.factory.DocumentExportSystem;

public abstract class ExportCreator {
    public abstract Document createDocument();

    public void export(String[][] data) {
        Document doc = createDocument();
        System.out.println("Exporting to " + doc.getFileExtension() + " format...");

        String header = doc.getHeader();
        if (!header.isEmpty()) {
            System.out.println(header);
        }

        for (String[] row : data) {
            System.out.println(doc.formatRow(row));
        }

        String footer = doc.getFooter();
        if (!footer.isEmpty()) {
            System.out.println(footer);
        }

        System.out.println("Export complete.\n");
    }
}
