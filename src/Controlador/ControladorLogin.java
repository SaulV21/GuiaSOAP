/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaLogin;
import Vista.VistaMenu;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import sv.Guia;
import sv.Guia_Service;

/**
 *
 * @author Saul
 */
public class ControladorLogin {
    VistaLogin vista;
    VistaMenu vistame;
    Guia_Service servicio=new Guia_Service();
    Guia cliente=servicio.getGuiaPort();

    public ControladorLogin(VistaLogin vista) {
        this.vista = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
    public void iniciar(){
     vista.getBtnSalir().addActionListener(l->salir());
     vista.getBtnIniciar().addActionListener(l->comprobar());
     eventoenter(vista.getTxtContraseña());
     eventotxtUser(vista.getTxtUsuario());
    }
    
    private void comprobar(){
        
        String user=vista.getTxtUsuario().getText();
        String pass=new String (vista.getTxtContraseña().getPassword());
        if(user.isEmpty()||pass.isEmpty()){
        JOptionPane.showMessageDialog(null, "Usuario o contraseña esta vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
        if(cliente.login(user, pass)){
            vistame=new VistaMenu();
            ControllerMenu men=new ControllerMenu(vistame);
            men.iniciar();
            vista.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado", "Acceso denegado", JOptionPane.ERROR_MESSAGE);
            vista.getTxtUsuario().requestFocus();
            vista.getTxtUsuario().setText("");
            vista.getTxtContraseña().setText("");
        }
       }
    }
    
    private void salir() {
        vista.dispose();
    }
    
     private void eventoenter(JPasswordField txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_ENTER){
               comprobar();
            }
            if(e.getKeyCode()== KeyEvent.VK_UP){
               vista.getTxtUsuario().requestFocus();
            }
        }

    });
    }
private void eventotxtUser(JTextField txt){
    txt.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode()== KeyEvent.VK_ENTER || e.getKeyCode()== KeyEvent.VK_DOWN){
               vista.getTxtContraseña().requestFocus();
            }
        }

    });
    }
}
