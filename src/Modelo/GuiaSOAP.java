/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;
import Controlador.ControladorLogin;
import Vista.VistaLogin;
/**
 *
 * @author Saul
 */
public class GuiaSOAP {
    public static void main(String[] args) {
    VistaLogin vista = new VistaLogin();
    ControladorLogin control= new ControladorLogin(vista);
    control.iniciar();
    }  
}
