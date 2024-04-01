public class Animal {
    private String nome;
    private String animal;
    private float comprimento;

    private int qpatas;

    private String cor;

    private String ambiente;

    private float velocidade;

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getQpatas() {
        return qpatas;
    }

    public void setQpatas(int qpatas) {
        this.qpatas = qpatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Animal(String nome, float comprimento, int qpatas, String cor, String ambiente, float velocidade) {
        this.nome = nome;
        this.animal = animal;
        this.comprimento = comprimento;
        this.qpatas = qpatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }
    public void dados() {
        System.out.println("dados do Animal:");
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Número de Patas: " + qpatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade Média: " + velocidade);
    }
    }


