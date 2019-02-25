package estilosarquiteturiais;

/*
    Arquitetura baseada em Componentes;
    Orienteado a objetos
    Arquitetura de eventos
*/



public class DadosPessoaBEAN {
    
    private int id;
    private String nome;
    private int idade;
    private String sexo; 
    
    public DadosPessoaBEAN(){}

    public DadosPessoaBEAN(String nome, int idade, String sexo) {
        
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
}
