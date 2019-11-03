package Lab3VarA;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame
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

    public MainFrame(Double[] coefficients)
    {
        super("Табулирование многочлена на отрезке по схеме Горнера");
        this.coefficients = coefficients;
        setSize(WIDTH, HEIGHT);
        Toolkit kit = Toolkit.getDefaultToolkit();
        setLocation((kit.getScreenSize().width - WIDTH)/2, (kit.getScreenSize().height - HEIGHT)/2);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("Файл");
        menuBar.add(fileMenu);
        JMenu tableMenu = new JMenu("Таблица");
        menuBar.add(tableMenu);
    }



}
