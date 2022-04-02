package aula11;

public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private float comissãoPorItem;

    public Vendedor() {
        super();
    }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissãoPorItem() {
        return comissãoPorItem;
    }

    public void setComissãoPorItem(float comissãoPorItem) {
        this.comissãoPorItem = comissãoPorItem;
    }

    public float calcularSalario() {
        return super.getSalario() + (this.comissãoPorItem * this.totalItensVendidos);
    }

}
