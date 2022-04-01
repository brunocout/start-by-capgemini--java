package aula10;

public class Pessoa {

    //Atributos
    private float peso;
    private float altura;

    //Metodos Get e Set
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


    // Metodo Calcular Imc
    public float calcularImc() {
        float imc = peso / (altura * altura);
        return imc;
    }
}
