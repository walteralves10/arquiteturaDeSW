package walter;

/*
    Arquitetura baseada em Componentes - componentes separados por classes, como por exemplo cada classe tem um conjunto de informações que forma um componente especifico, tendo comuicação entre eles.
    Arquitetura Orienteado a objetos _ esta utilizando em todo o codigo, como um padrao de utilização de codificação
    Persistencia de dados _ Utilizando banco de dados mysql como repositorio e conexao com o fonte.
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
