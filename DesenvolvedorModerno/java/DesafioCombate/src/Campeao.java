public class Campeao {
    private String nome;
    private int vida;
    private int ataque;
    private int armadura;

    public Campeao(String nome, int vida, int ataque, int armadura) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getVida() {
        return vida;
    }

    public String status() {
        String situacao = "Vivo";
        if (this.vida <= 0) {
            situacao = "Morreu";
            String mensagem = String.format("%s: %d de vida (%s)\n", this.nome, this.vida, situacao);
            return mensagem;
        } else
            return this.nome + ": " + this.vida + " de vida";
    }

    public void takeDamage(Campeao campeao) {
        if (this.armadura >= campeao.getAtaque()) {
            this.vida -= 1;
        } else {
            this.vida -= (campeao.getAtaque() - this.armadura);
        }
        if (this.vida <= 0) {
            this.vida = 0;
        }
    }

}

