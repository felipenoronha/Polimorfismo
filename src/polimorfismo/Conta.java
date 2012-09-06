<<<<<<< HEAD
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author PRINCIPAL
 */
public class Conta {
    
    
    protected Double saldo;    
    
    /**
     * Aumenta o saldo com a quantia depositada
     * @param quantia 
     */
    public void deposita(double quantia){
        this.saldo += quantia;
        
    }
    
    /**
     * Diminui o saldo com a quantia sacada
     * @param quantia 
     */
    public void saca(double quantia){
        this.saldo -= quantia;
        
    }
    
    /**
     * Diminui o saldo com a ataxa fornecida
     * @param taxa 
     */
    public void atualiza(double taxa){
        this.saldo -= taxa;
    }
    
}
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author PRINCIPAL
 */
public class Conta {
    
    protected Double saldo;  

    /**
     * Aumenta o saldo com a quantia depositada
     * @param quantia 
     */
    public void deposita(double quantia){
        this.saldo += quantia;        
    }
    
    /**
     * Diminui o saldo com a quantia sacada
     * @param quantia 
     */
    public void saca(double quantia){
        this.saldo -= quantia;        
    }
    
    /**
     * Diminui o saldo com a ataxa fornecida
     * @param taxa 
     */
    public void atualiza(double taxa){
        this.saldo -= taxa;
    }
    
}
>>>>>>> 9e9ad21f54ecba72b72a1a2c30b8f9ab2bcf7cf7
