/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vista.VistaMenu;
import Vista.VistaOperaciones;
import java.awt.ComponentOrientation;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import sv.Guia_Service;
import sv.Guia;
/**
 *
 * @author Saul
 */
public class ControladorOperaciones {
    VistaOperaciones vista;
    VistaMenu vistame;
    Guia_Service servicio=new Guia_Service();
    Guia cliente=servicio.getGuiaPort();

    public ControladorOperaciones(VistaOperaciones vista,VistaMenu vistame) {
        this.vista=vista;
        this.vistame=vistame;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
      public void iniciar(){
            vista.getBtnmas().addActionListener(l->sumar());
            vista.getBtnres().addActionListener(l->restar());
            vista.getBtnmult().addActionListener(l->multiplicar());
            vista.getBtndiv().addActionListener(l->dividir());
            vista.getBtnborrar().addActionListener(l->limpiar());
            vista.getBtnvolver().addActionListener(l->salir());
            verifival1(vista.getTxtprimero());
            verifival2(vista.getTxtsegundo());
      }
        
        private void verifival1(JTextField mont){
         mont.addKeyListener(new java.awt.event.KeyListener() {
             @Override
             public void keyTyped(KeyEvent e) {
             char num = e.getKeyChar();
             if(vista.getTxtprimero().getText().isEmpty()){
             limpiar();
             }
            if(vista.getTxtprimero().getText().length()>9) e.consume();
            if((num<'0' || num>'9')) e.consume(); }
             @Override
             public void keyPressed(KeyEvent e) {
             
             }
             @Override
             public void keyReleased(KeyEvent e) {}
         });
        }
        
        private void verifival2(JTextField mont){
         mont.addKeyListener(new java.awt.event.KeyListener() {
             @Override
             public void keyTyped(KeyEvent e) {
             char num = e.getKeyChar();
            if(vista.getTxtsegundo().getText().length()>9) e.consume();
            if((num<'0' || num>'9')) e.consume(); }
             @Override
             public void keyPressed(KeyEvent e) {}
             @Override
             public void keyReleased(KeyEvent e) {}
         });
        }
        
        private void sumar(){
         
         if(vista.getTxtprimero().getText().isEmpty()||vista.getTxtsegundo().getText().isEmpty()){
            vista.getTxtrespuesta().setText("Debe ingresar los dos valores");
        }else{
         double valor1=Double.valueOf(vista.getTxtprimero().getText());
         double valor2=Double.valueOf(vista.getTxtsegundo().getText());
         double suma=cliente.operaciones(valor1, "suma", valor2);
         vista.getTxtrespuesta().setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         vista.getTxtrespuesta().append("\n   "+vista.getTxtprimero().getText());
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("   "+vista.getTxtsegundo().getText());
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("_____________________________");
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("   "+Math.round(suma*100)/100d);
         vista.getTxtrespuesta().append("\n\n");
         }
        }
        
        private void restar(){
         
         if(vista.getTxtprimero().getText().isEmpty()||vista.getTxtsegundo().getText().isEmpty()){
            vista.getTxtrespuesta().setText("Debe ingresar los dos valores");
        }else{
         double valor1=Double.valueOf(vista.getTxtprimero().getText());
         double valor2=Double.valueOf(vista.getTxtsegundo().getText());
         double res=cliente.operaciones(valor1, "resta", valor2);
         vista.getTxtrespuesta().setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         vista.getTxtrespuesta().append("\n   "+vista.getTxtprimero().getText());
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("   "+vista.getTxtsegundo().getText());
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("_____________________________");
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("   "+Math.round(res*100)/100);
         vista.getTxtrespuesta().append("\n\n");
         }
        }
        
        private void multiplicar(){
         
         if(vista.getTxtprimero().getText().isEmpty()||vista.getTxtsegundo().getText().isEmpty()){
            vista.getTxtrespuesta().setText("Debe ingresar los dos valores");
        }else{
         double valor1=Double.valueOf(vista.getTxtprimero().getText());
         double valor2=Double.valueOf(vista.getTxtsegundo().getText());
         double prod=cliente.operaciones(valor1, "multiplicacion", valor2);
         vista.getTxtrespuesta().setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         vista.getTxtrespuesta().append("\n   "+vista.getTxtprimero().getText());
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("   "+vista.getTxtsegundo().getText());
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("_____________________________");
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("   "+Math.round(prod*100)/100d);
         vista.getTxtrespuesta().append("\n\n");
         }
        }
        
        private void dividir(){
         
         if(vista.getTxtprimero().getText().isEmpty()||vista.getTxtsegundo().getText().isEmpty()){
            vista.getTxtrespuesta().setText("Debe ingresar los dos valores");
        }else{
         double valor1=Double.valueOf(vista.getTxtprimero().getText());
         double valor2=Double.valueOf(vista.getTxtsegundo().getText());
         double div=cliente.operaciones(valor1, "div", valor2);
         vista.getTxtrespuesta().setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
         vista.getTxtrespuesta().append("\n   "+vista.getTxtprimero().getText());
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("   "+vista.getTxtsegundo().getText());
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("_____________________________");
         vista.getTxtrespuesta().append(System.getProperty("line.separator"));
         vista.getTxtrespuesta().append("   "+Math.round(div*100)/100d);
         vista.getTxtrespuesta().append("\n\n");
         }
        }
        
        private void limpiar(){
        vista.getTxtrespuesta().setText("");
        vista.getTxtprimero().setText("");
        vista.getTxtsegundo().setText("");
        }

    private void salir() {
        vista.dispose();
        vistame.setVisible(true);
    }
}
