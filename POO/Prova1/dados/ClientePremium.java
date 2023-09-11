public class ClientePremium extends Cliente {
    
    private float descontoBonus;

    public ClientePremium(){
    }

    public float getDescontoBonus() {
        return this.descontoBonus;
    }

    public void setDescontoBonus(float descontoBonus) {
        this.descontoBonus = descontoBonus;
    }

    public getMensalidade(){
        return getMensalidade() - getMensalidade() * getDescontoBonus();
    }

    public String toString(){
        return "Desconto Bônus: " + getDescontoBonus();
    } 
}
