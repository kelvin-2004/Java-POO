//classe Produto
class Produto {
    public static void main(String[]args){
        Produto produto1 = new Produto((short)1, "Notebook", 3500.00);
        produto1.exibirInformacoes();
        produto1.atualizarPreco(3000.00);
        produto1.exibirInformacoes();
        
        Produto produto2 = new Produto((short)2, "Smartphone", 2500.00);
        produto2.exibirInformacoes();
    }
    //atributos
    private short id;
    private String nome;
    private double preco;

    // Construtor
    public Produto(short id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Construtor vazio (padrão)
    public Produto() {
    }

    //Classe principal
    public  static void Main(String[]args){
    }
    //métodos getters e setters
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public short getId() {
        return id;
    }

    //métodos
    public void atualizarPreco(double novoPreco){
        this.preco = novoPreco;
    }
    public void exibirInformacoes() {
        System.out.println("ID:"+ this.id);
        System.out.println("Nome:"+this.nome);
        System.out.println("Preço:R$"+getPreco());
    }
}
