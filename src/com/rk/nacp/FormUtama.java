package com.rk.nacp;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    NoCopasTextArea textArea;

    public FormUtama() {
        super("Disable Copy-Paste");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        textArea = new NoCopasTextArea();
        getContentPane().add(textArea, BorderLayout.CENTER);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
