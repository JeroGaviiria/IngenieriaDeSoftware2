/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Builder;



/**
 *
 * @author jeron
 */
public class Builder {
    protected String tipoTomate;
    protected String tipoCarne;
    protected String tipoQueso;
    protected String tipoPan;

    
    public Builder setTipoTomate(String tipoTomate) {
        this.tipoTomate = tipoTomate;
        return this;
    }
    
    public Builder setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }

    
    public Builder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public Builder setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
        return this;
    
    }
    public Hamburguesa build(){
        return new Hamburguesa(this);
    }
    
    
}