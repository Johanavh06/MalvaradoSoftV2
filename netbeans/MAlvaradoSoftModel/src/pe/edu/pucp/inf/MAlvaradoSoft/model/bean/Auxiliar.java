/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.MAlvaradoSoft.model.bean;

/**
 *
 * @author alulab14
 */
public class Auxiliar extends User{
    private int tableStatus;    
    
    public Auxiliar() {
            this.tableStatus =1;
    }
    
    public int getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(int tableStatus) {
        this.tableStatus = tableStatus;
    }
    
}
