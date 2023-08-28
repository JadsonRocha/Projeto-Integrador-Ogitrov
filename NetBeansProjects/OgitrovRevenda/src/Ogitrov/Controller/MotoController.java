/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ogitrov.Controller;

import Ogitrov.Model.Moto;

/**
 *
 * @author 182210124
 */
public class MotoController {

    public boolean cadastraMoto(int idProp, String marca, String modelo, String cor, String ano, String chassi, double fipe, double valorAvaliado, double ipva, String km, String tipo) {
        Moto mot = new Moto(idProp,marca,modelo,cor,ano,chassi,fipe,valorAvaliado,ipva,km,tipo);
        mot.cadastrarMoto(mot); 
        return true;
    }

        
    
}
