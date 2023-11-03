package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class grafica extends JFrame implements ActionListener{
    JLabel label;
    JFormattedTextField nume;
    JSpinner nota1, nota2, nota3;
    JTextArea TextArea;
    JButton buton, buton1;
    private String studenttext;

    public grafica() {
        studenttext = "";
        this.setSize(560, 500);
        this.setLayout(null);
        JLabel mm = new JLabel("Nume");
        mm.setBounds(5, 10, 50, 30);
        this.add(mm);

        nume = new JFormattedTextField("");
        nume.setBounds(100, 10, 100, 30);
        this.add(nume);

        mm = new JLabel("Nota1:");
        mm.setBounds(5, 110, 100, 20);
        this.add(mm);
        nota1 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        nota1.setBounds(100, 110, 50, 20);
        this.add(nota1);

        mm = new JLabel("Nota2:");
        mm.setBounds(5, 140, 100, 20);
        this.add(mm);
        nota2 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        nota2.setBounds(100, 140, 50, 20);
        this.add(nota2);

        mm = new JLabel("Nota3:");
        mm.setBounds(5, 170, 100, 20);
        this.add(mm);
        nota3 = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        nota3.setBounds(100, 170, 50, 20);
        this.add(nota3);


         buton = new JButton("Preluare date");
        buton.setBounds(50, 300, 140, 40);
        buton.addActionListener(this);
        this.add(buton);

         buton1 = new JButton("Scriere date");
        buton1.setBounds(50, 400, 140, 40);
        buton1.addActionListener(this);
        this.add(buton1);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        buton.addActionListener(e->
        {
            try
            {
                FileWriter file = new FileWriter("studenti.txt", true);
                file.write(studenttext);
                file.close();
            } catch (IOException l) {
                l.printStackTrace();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if(nume.getText().compareTo("") == 0)
            TextArea.setText("Scrie un nume.");
        else {
            Student student = new Student(nume.getText(), Float.parseFloat(nota1.getValue().toString()), Float.parseFloat(nota2.getValue().toString()), Float.parseFloat(nota3.getValue().toString()));
            studenttext += student.toString()+"\n";
        }
    }
}
