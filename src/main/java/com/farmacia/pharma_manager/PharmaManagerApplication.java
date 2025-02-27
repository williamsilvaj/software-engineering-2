package com.farmacia.pharma_manager;

import javax.swing.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PharmaManagerApplication {
  public static void main(String[] args) {
    //SpringApplication.run(PharmaManagerApplication.class, args);

    SwingUtilities.invokeLater(TelaPrincipal::new);
  }
}
