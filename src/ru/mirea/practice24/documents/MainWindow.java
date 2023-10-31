package ru.mirea.practice24.documents;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Objects;

public class MainWindow extends JFrame {
    private final JPanel mainPanel = new JPanel(new CardLayout());
    private final JLabel noDocument = new JLabel();
    private final JTextArea textDocument = new JTextArea();
    private final JLabel imageDocument = new JLabel();
    private final JMenu openTextDoc = new JMenu("Open text");
    private final JMenu openImageDoc = new JMenu("Open image");
    private final CreateTextDocument createTextDocument = new CreateTextDocument();
    private final CreateImageDocument createImageDocument = new CreateImageDocument();
    private int indexOfTextFile = 0;
    private int indexOfImageFile = 0;
    final static String noDocName = "NO_DOC";
    final static String textDocName = "TEXT_DOC";
    final static String imageDocName = "IMAGE_DOC";

    private IDocument openedDocument;

    public MainWindow() {
        super("Document editor");
        setSize(1280, 720);
        setIconImage(new ImageIcon(Objects.requireNonNull(MainWindow.class.getResource("images/icon.png"))).getImage());

        JMenuBar menuPanel = new JMenuBar();

        menuPanel.add(createFileMenu());

        imageDocument.setIconTextGap(0);
        imageDocument.setHorizontalAlignment(SwingConstants.CENTER);

        setJMenuBar(menuPanel);
        mainPanel.add(noDocument, noDocName);
        mainPanel.add(textDocument, textDocName);
        mainPanel.add(imageDocument, imageDocName);

        getContentPane().add(mainPanel);
    }

    private JMenu createFileMenu()
    {
        JMenu fileMenu = new JMenu("File");
        JMenu newDoc = new JMenu("New");
        JMenu openDoc = new JMenu("Open");
        JMenuItem saveDoc = new JMenuItem("Save");
        JMenuItem exitProgram = new JMenuItem("Exit");

        JMenuItem newTextDoc = new JMenuItem("New text");
        JMenuItem newImageDoc = new JMenuItem("New image");

        newTextDoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indexOfTextFile = createTextDocument.getDocumentsCount();
                TextDocument newTextDoc = createTextDocument.createNew("New Text " + indexOfTextFile);

                textDocument.setText(newTextDoc.getTextValue());
                openedDocument = newTextDoc;

                CardLayout layout = (CardLayout) mainPanel.getLayout();
                layout.show(mainPanel, textDocName);
            }
        });

        newImageDoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indexOfImageFile = createImageDocument.getDocumentsCount();
                ImageDocument newImageDoc = createImageDocument.createNew("New Image " + indexOfImageFile);

                imageDocument.setIcon(newImageDoc.getImageValue());
                openedDocument = newImageDoc;

                CardLayout layout = (CardLayout) mainPanel.getLayout();
                layout.show(mainPanel, imageDocName);
            }
        });

        saveDoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(openedDocument.getTextValue() != null) {
                    createTextDocument.setText(textDocument.getText());
                    createTextDocument.saveData();
                }
                else {
                    createImageDocument.setImage((ImageIcon) imageDocument.getIcon());
                    createImageDocument.saveData();
                }

                updateMenu();
            }
        });

        exitProgram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        newDoc.add(newTextDoc);
        newDoc.add(newImageDoc);

        openDoc.add(openTextDoc);
        openDoc.add(openImageDoc);

        fileMenu.add(newDoc);
        fileMenu.add(openDoc);
        fileMenu.add(saveDoc);
        fileMenu.add(exitProgram);

        return fileMenu;
    }

    public void updateMenu(){
        openTextDoc.removeAll();
        openImageDoc.removeAll();

        JMenuItem openExistText = new JMenuItem("Open text");
        JMenuItem openExistImage = new JMenuItem("Open image");

        openExistText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser textChooser = new JFileChooser();
                FileNameExtensionFilter textFilter = new FileNameExtensionFilter("*.txt", "txt");

                textChooser.setFileFilter(textFilter);

                int returnValue = textChooser.showOpenDialog(null);

                if(returnValue == JFileChooser.APPROVE_OPTION){
                    File selectedFile = textChooser.getSelectedFile();
                    indexOfTextFile = createTextDocument.getDocumentsCount();
                    TextDocument newTextDoc = createTextDocument.createNew(selectedFile.getName());

                    try {
                        newTextDoc.setText(readTextFile(selectedFile.getAbsolutePath()));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }

                    textDocument.setText(newTextDoc.getTextValue());
                    openedDocument = newTextDoc;

                    CardLayout layout = (CardLayout) mainPanel.getLayout();
                    layout.show(mainPanel, textDocName);
                }
            }
        });

        openExistImage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser imageChooser = new JFileChooser();
                FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("*.jpg; *.png", "jpg", "png");

                imageChooser.setFileFilter(imageFilter);

                int returnValue = imageChooser.showOpenDialog(null);

                if(returnValue == JFileChooser.APPROVE_OPTION){
                    File selectedFile = imageChooser.getSelectedFile();
                    indexOfImageFile = createImageDocument.getDocumentsCount();
                    ImageDocument newImageDoc = createImageDocument.createNew(selectedFile.getName());

                    try {
                        newImageDoc.setImage(new ImageIcon(ImageIO.read(selectedFile)));
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    imageDocument.setIcon(newImageDoc.getImageValue());
                    openedDocument = newImageDoc;

                    CardLayout layout = (CardLayout) mainPanel.getLayout();
                    layout.show(mainPanel, imageDocName);
                }
            }
        });

        openTextDoc.add(openExistText);
        openImageDoc.add(openExistImage);

        var texts = createTextDocument.getDocuments();
        var images = createImageDocument.getDocuments();

        for(int i = 0; i < createTextDocument.getDocumentsCount(); i++){
            JMenuItem tempItem = new JMenuItem(texts.get(i).getName());

            int finalI = i;
            tempItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textDocument.setText(texts.get(finalI).getTextValue());
                    openedDocument = createTextDocument.createOpen(finalI);

                    CardLayout layout = (CardLayout) mainPanel.getLayout();
                    layout.show(mainPanel, textDocName);
                }
            });

            openTextDoc.add(tempItem);
        }

        for(int i = 0; i < createImageDocument.getDocumentsCount(); i++){
            JMenuItem tempItem = new JMenuItem(images.get(i).getName());

            int finalI = i;
            tempItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageDocument.setIcon(images.get(finalI).getImageValue());
                    openedDocument = createImageDocument.createOpen(finalI);

                    CardLayout layout = (CardLayout) mainPanel.getLayout();
                    layout.show(mainPanel, imageDocName);
                }
            });

            openImageDoc.add(tempItem);
        }
    }
    public void pushTextDocument(String name, String text){
        TextDocument newTextDoc = new TextDocument(name);
        newTextDoc.setText(text);

        createTextDocument.pushDocument(newTextDoc);
    }

    public void pushImageDocument(String name, ImageIcon image){
        ImageDocument newImageDoc = new ImageDocument(name);
        newImageDoc.setImage(image);

        createImageDocument.pushDocument(newImageDoc);
    }

    public String readTextFile(String path) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(path));

        String line = br.readLine();
        while(line != null){
            content.append(line).append('\n');
            line = br.readLine();
        }

        return content.toString();
    }
}
