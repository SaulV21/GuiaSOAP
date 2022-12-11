/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VistaCalculos;
import Vista.VistaMenu;
import Vista.VistaOperaciones;

/**
 *
 * @author Saul
 */
public class ControllerMenu {
    VistaMenu vistamenu;
    VistaOperaciones vistao;
    VistaCalculos vistac;
     public ControllerMenu(VistaMenu vista) {
        this.vistamenu = vista;
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }

   
     public void iniciar(){
     vistamenu.getBtnsalir().addActionListener(l->salir());
     vistamenu.getBtnop().addActionListener(l->operaciones());
     vistamenu.getBtncal().addActionListener(l->calculos());
     }
     
     private void calculos(){
     vistac=new VistaCalculos();
     ControladorCalculos cal=new ControladorCalculos(vistamenu, vistac);
     cal.iniciar();
     this.vistamenu.setVisible(false);
     }
     
     private void operaciones(){
     vistao=new VistaOperaciones();
     ControladorOperaciones oper=new ControladorOperaciones(vistao, vistamenu);
     oper.iniciar();
     this.vistamenu.setVisible(false);
     }
     
     private void salir() {
       vistamenu.dispose();
    }
}
