/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaCalculos;
import Vista.VistaMenu;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import sv.Guia;
import sv.Guia_Service;

/**
 *
 * @author Saul
 */
public class ControladorCalculos {
    VistaMenu vistame;
    VistaCalculos vista;
    Guia_Service servicio=new Guia_Service();
    Guia cliente=servicio.getGuiaPort();

    public ControladorCalculos(VistaMenu vistame, VistaCalculos vista) {
        this.vistame = vistame;
        this.vista = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
    public void iniciar(){
        vista.getBtnarea().addActionListener(l->area());
        vista.getBtnang().addActionListener(l->angulo());
        vista.getBtnhip().addActionListener(l->hipo());
        vista.getBtnvolver().addActionListener(l->salir());
        verifival1(vista.getTxtval1());
        verifival2(vista.getTxtval2());
    }

    private void verifival1(JTextField mont){
        mont.addKeyListener(new java.awt.event.KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        char num = e.getKeyChar();
        if(vista.getTxtval1().getText().isEmpty()){
        limpiar();
         }
        if(vista.getTxtval1().getText().length()>9) e.consume();
        if((num<'0' || num>'9')) e.consume(); }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {}
      });
    }
        
    private void verifival2(JTextField mont){
        mont.addKeyListener(new java.awt.event.KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
        char num = e.getKeyChar();
        if(vista.getTxtval2().getText().length()>9) e.consume();
        if((num<'0' || num>'9')) e.consume(); }
        @Override
        public void keyPressed(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {}
      });
    }
    
    private void area(){
        
        if(vista.getTxtval1().getText().isEmpty()||vista.getTxtval2().getText().isEmpty()){
            vista.getLblrespuesta().setText("Debe ingresar los dos valores");
        }else{
        double val1=Double.valueOf(vista.getTxtval1().getText());
        double val2=Double.valueOf(vista.getTxtval2().getText());
        String res=cliente.calculos(val1, "area", val2);
        vista.getLblrespuesta().setText(res);
        Icon icono = new ImageIcon(getClass().getResource("/Imagenes/area.png"));
        vista.getLblimagen().setIcon(icono);
        }
    }
    
    private void hipo(){
        
        if(vista.getTxtval1().getText().isEmpty()||vista.getTxtval2().getText().isEmpty()){
            vista.getLblrespuesta().setText("Debe ingresar los dos valores");
        }else{
        double val1=Double.valueOf(vista.getTxtval1().getText());
        double val2=Double.valueOf(vista.getTxtval2().getText());
        String res=cliente.calculos(val1, "hipotenusa", val2);
        vista.getLblrespuesta().setText(res);
        Icon icono = new ImageIcon(getClass().getResource("/Imagenes/hipotenusa.png"));
        vista.getLblimagen().setIcon(icono);
        }
    }
    
    private void angulo(){
        
        if(vista.getTxtval1().getText().isEmpty()||vista.getTxtval2().getText().isEmpty()){
            vista.getLblrespuesta().setText("Debe ingresar los dos valores");
        }else{
        double val1=Double.valueOf(vista.getTxtval1().getText());
        double val2=Double.valueOf(vista.getTxtval2().getText());
        String res=cliente.calculos(val1, "angulo", val2);
        vista.getLblrespuesta().setText(res);
        Icon icono = new ImageIcon(getClass().getResource("/Imagenes/angulo.png"));
        vista.getLblimagen().setIcon(icono);
        }
    }
    
    private void limpiar(){
      vista.getLblrespuesta().setText("");
      vista.getTxtval1().setText("");
      vista.getTxtval2().setText("");
      vista.getLblimagen().setIcon(null);
    }
    
    private void salir() {
        vista.dispose();
        vistame.setVisible(true);
    }
}
