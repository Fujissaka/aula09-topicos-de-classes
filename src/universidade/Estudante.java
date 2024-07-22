package universidade;

/**
 * Modelo de estudante de graduação da UFABC
 */
public class Estudante {
    private String nome;
    private String ra;
    private double[] notas;

    /**
     * constroi um novo estudante.
     * 
     * @param nome O nome completo do estudante
     * @param ra O no formato UFABC
     * @param notas as notas obtidas (de 0 a 10)
     */
    public Estudante( String nome, String ra, double[] notas) {
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
    }

    private void validaRa(String ra) {
        if (!ra.matches("\\d(11)")) {
            throw new IllegalArgumentException("RA fora do formato");
        }
    }

    public String getNome() {
        return nome;
    }

    



}