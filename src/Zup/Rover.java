package Zup;

public class Rover {

    private String nome;
    private int coordenadaX;
    private int coordenadaY;
    private String sentido; //sentido north/south/west/east
    private String instrucao; //L - Left, R - Right, M - avançar

    public Rover(String nome, int coordenadaX, int coordenadaY, String sentido, String instrucao) {
        this.nome = nome;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.sentido = sentido;
        this.instrucao = instrucao;
    }

    public Rover() {
    }

    public boolean verificaPlanalto(int coordenadaX, int coordenadaY, int tamanhoX, int tamanhoY) {

        return coordenadaX <= tamanhoX && coordenadaY <= tamanhoY && coordenadaX >= 0 && coordenadaY >= 0;

    }

    public boolean verificaInstrucao(String instrucao) {

        for (int i = 0; i < instrucao.length(); i++) {  // verifica se as intruções corresponde ao padrão definido 
            char c = instrucao.charAt(i);
            if (c != 'M' && c != 'L' && c != 'R') {
                return false;
            }
        }

        return true;
    }

    public String GirarEsquerda(String SentidoAtual) {

        String sentidoFinal = null;

        switch (SentidoAtual) {
            case "N":
                sentidoFinal = "W";
                break;
            case "W":
                sentidoFinal = "S";
                break;
            case "S":
                sentidoFinal = "E";
                break;
            default:
                sentidoFinal = "N";
                break;
        }

        return sentidoFinal;

    }

    public String GirarDireita(String SentidoAtual) {

        String sentidoFinal = null;

        switch (SentidoAtual) {
            case "N":
                sentidoFinal = "E";
                break;
            case "E":
                sentidoFinal = "S";
                break;
            case "S":
                sentidoFinal = "W";
                break;
            default:
                sentidoFinal = "N";
                break;
        }

        return sentidoFinal;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String getSentido() {
        return sentido;
    }

    public void setSentido(String sentido) {
        this.sentido = sentido;
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

}
