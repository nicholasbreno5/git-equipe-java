package br.edu.projeto.modelo;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void mover() {
        System.out.println("O veículo está se movendo de forma genérica.");
    }

    public void exibirInformacoes() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Veiculo [Marca=" + marca + ", Modelo=" + modelo + "]";
    }
}