package lab16;
import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



    public class ex2 extends JFrame {
        private JTextArea textArea;

        public ex2() {
            setTitle("Текстовый редактор");
            setSize(500, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            textArea = new JTextArea();
            textArea.setLineWrap(true);
            JScrollPane scrollPane = new JScrollPane(textArea);
            add(scrollPane, BorderLayout.CENTER);

            createMenu();

            setVisible(true);
        }

        private void createMenu() {
            JMenuBar menuBar = new JMenuBar();

            JMenu colorMenu = new JMenu("Цвет");
            JMenuItem blueItem = new JMenuItem("Синий");
            JMenuItem redItem = new JMenuItem("Красный");
            JMenuItem blackItem = new JMenuItem("Черный");

            blueItem.addActionListener(new ColorActionListener(Color.BLUE));
            redItem.addActionListener(new ColorActionListener(Color.RED));
            blackItem.addActionListener(new ColorActionListener(Color.BLACK));

            colorMenu.add(blueItem);
            colorMenu.add(redItem);
            colorMenu.add(blackItem);

            JMenu fontMenu = new JMenu("Шрифт");
            JMenuItem timesNewRomanItem = new JMenuItem("Times New Roman");
            JMenuItem msSansSerifItem = new JMenuItem("MS Sans Serif");
            JMenuItem courierNewItem = new JMenuItem("Courier New");

            timesNewRomanItem.addActionListener(new FontActionListener("Times New Roman"));
            msSansSerifItem.addActionListener(new FontActionListener("MS Sans Serif"));
            courierNewItem.addActionListener(new FontActionListener("Courier New"));

            fontMenu.add(timesNewRomanItem);
            fontMenu.add(msSansSerifItem);
            fontMenu.add(courierNewItem);

            menuBar.add(colorMenu);
            menuBar.add(fontMenu);

            setJMenuBar(menuBar);
        }

        private class ColorActionListener implements ActionListener {
            private Color color;

            public ColorActionListener(Color color) {
                this.color = color;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setForeground(color);
            }
        }

        private class FontActionListener implements ActionListener {
            private String fontName;

            public FontActionListener(String fontName) {
                this.fontName = fontName;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = new Font(fontName, Font.PLAIN, textArea.getFont().getSize());
                textArea.setFont(font);
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> new ex2());
        }
    }

