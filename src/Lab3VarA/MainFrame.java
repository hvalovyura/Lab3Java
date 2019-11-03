package Lab3VarA;

import javax.swing.*;

public class MainFrame
{
    static private final int WIDTH = 700;
    static private final int HEIGHT = 700;

    private Double[] coefficients;

    private JFileChooser fileChooser = null;

    private JMenuItem saveToTextMenuItem;
    private JMenuItem saveToGraphicMenuItem;
    private JMenuItem searchValueMenuItem;

    private JTextField textFieldFrom;
    private JTextField textFieldTo;
    private JTextField textFieldStep;
    private Box hboxResult;

    private GornerTableCellRenderer renderer = new GornerTableCellRenderer();

    private GornerTableModel data;



}
