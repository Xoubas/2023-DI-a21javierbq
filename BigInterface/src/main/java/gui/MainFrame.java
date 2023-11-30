/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import model.*;
import controller.*;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

public class MainFrame extends JFrame {
    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();
        //File menu
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        JMenuItem expt = new JMenuItem("Export");
        expt.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        JMenuItem impt = new JMenuItem("Import");
        impt.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        JMenuItem exit = new JMenuItem("Exit");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int op = JOptionPane.showConfirmDialog(fileMenu, "Are you sure you want to exit?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, new ImageIcon("protesta.png"));
                if (op == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });

        expt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = new JFileChooser().showOpenDialog();

            }
        });


        fileMenu.add(expt);
        fileMenu.add(impt);
        fileMenu.add(exit);

        //WindowMenu
        JMenu windowMenu = new JMenu("Window");
        JCheckBoxMenuItem formSelect = new JCheckBoxMenuItem("Person Form");
        formSelect.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBoxMenuItem checkBox = (JCheckBoxMenuItem) e.getSource();
                fp.setVisible(!checkBox.isSelected());
            }
        });
        windowMenu.add(formSelect);

//
//        fp = new FormPanel();
//        toolbar = new Toolbar();
//
//        ActionListener al = new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JFileChooser fc = new JFileChooser();
//                fc.addChoosableFileFilter(new PersonFilter());
//                JMenuItem selectedItem = (JMenuItem) e.getSource();
//                if (selectedItem == exit) {
//                    int confirmado = JOptionPane.showConfirmDialog(rootPane, "Deseas cerrar la aplicación?",
//                            "Cerrar", JOptionPane.YES_OPTION);
//                    if (JOptionPane.OK_OPTION == confirmado) {
//                        dispose();
//                    }
//                } else if (selectedItem == impData) {
//
//                    if (fc.showOpenDialog(MainFrame.this) == JFileChooser.APPROVE_OPTION) {
//                        try {
//                            controller.loadFromFile(fc.getSelectedFile());
//                            tablePanel.refresh();
//                        } catch (IOException err) {
//                            System.err.println("Error " + err);
//                        }
//                    }
//
//                } else if (selectedItem == expData) {
//                    if (fc.showSaveDialog(MainFrame.this) == JFileChooser.APPROVE_OPTION) {
//                        try {
//                            controller.saveToFile(fc.getSelectedFile());
//                        } catch (IOException err) {
//                            System.err.println("Error " + err);
//                        }
//                    }
//                }
//
//            }
//
//        };
        menuBar.add(fileMenu);
        menuBar.add(windowMenu);

        return menuBar;
    }

    private Toolbar toolbar;
    private FormPanel fp;
    private JCheckBoxMenuItem jcbPersonForm;
    private TablePanel tablePanel;
    private Controller controller;

    public MainFrame() {
        super("FORM JAVA");
        setLayout(new BorderLayout());
        //Creacion tabla
        fp = new FormPanel();
        controller = new Controller();
        List<Person> personas = controller.getPeople();
        tablePanel = new TablePanel();
        tablePanel.setData(personas);

        fp.setFormListener(new FormListener() {
            @Override
            public void dataFormEmitted(FormEvent e) {
                controller.addPerson(e);
                tablePanel.refresh();
            }
        });

        new WindowListener() {
            @Override
            public void windowOpened(WindowEvent windowEvent) {

            }

            @Override
            public void windowClosing(WindowEvent windowEvent) {
                closeConfirmation();
            }

            public void closeConfirmation() {
                int r = JOptionPane.showConfirmDialog(MainFrame.this, "Do you really want to exit?", "EXIT", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
                if (r == JOptionPane.YES_OPTION)
                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                else
                    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            }

            @Override
            public void windowClosed(WindowEvent windowEvent) {

            }

            @Override
            public void windowIconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeiconified(WindowEvent windowEvent) {

            }

            @Override
            public void windowActivated(WindowEvent windowEvent) {

            }

            @Override
            public void windowDeactivated(WindowEvent windowEvent) {

            }
        };

        //Closing confirmation
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(MainFrame.this,
                        "Are you sure you want to close this window?",
                        "Confirmation",
                        JOptionPane.YES_NO_OPTION, -1, new ImageIcon("ssl.png"));

                // Check the user's choice
                if (result == JOptionPane.YES_OPTION) {
                    // If the user chooses "Yes," close the window
                    MainFrame.this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    // If the user chooses "No," do nothing (don't close the window)
                    MainFrame.this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
        setJMenuBar(createMenu());
        //add(toolbar, BorderLayout.PAGE_START);
        add(tablePanel, BorderLayout.CENTER);
        add(fp, BorderLayout.LINE_START);
        setMinimumSize(new Dimension(600, 500));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
    }
}
