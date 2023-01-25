package aula07;

public class Lutador {
  // atributos
  private String nome;
  private String nacionalidade;
  private int idade;
  private float altura;
  private float peso;
  private String categoria;
  private int vitorias;
  private int derrotas;
  private int empates;

  // metodo construtor
  public Lutador(String no, String na, int id, float al, float pe, int vi, int de,
      int em) {
    this.nome = no;
    this.nacionalidade = na;
    this.idade = id;
    this.altura = al;
    this.setPeso(pe);
    this.vitorias = vi;
    this.derrotas = de;
    this.empates = em;
  }

  // metodos especiais

  public String getNome() {
    return this.nome;
  }

  public String getNacionalidade() {
    return this.nacionalidade;
  }

  public int getIdade() {
    return this.idade;
  }

  public float getAltura() {
    return this.altura;
  }

  public float getPeso() {
    return this.peso;
  }

  public String getCategoria() {
    return this.categoria;
  }

  public int getVitorias() {
    return this.vitorias;
  }

  public int getDerrotas() {
    return this.derrotas;
  }

  public int getEmpates() {
    return this.empates;
  }

  public void setNome(String no) {
    this.nome = no;
  }

  public void setNacionalidade(String na) {
    this.nacionalidade = na;
  }

  public void setIdade(int id) {
    this.idade = id;
  }

  public void setAltura(float al) {
    this.altura = al;
  }

  public void setPeso(float pe) {
    this.peso = pe;
    setCategoria(categoria);
  }

  private void setCategoria(String ca) {
    this.categoria = ca;
    if (this.peso < 52.2) {
      this.categoria = "Inválido";
    } else if (this.peso <= 70.3) {
      this.categoria = "Leve";
    } else if (this.peso <= 83.9) {
      this.categoria = "Médio";
    } else if (this.peso <= 120.2) {
      this.categoria = "Pesado";
    } else {
      this.categoria = "Inválido";
    }
  }

  public void setVitorias(int vi) {
    this.vitorias = vi;
  }

  public void setDerrotas(int de) {
    this.derrotas = de;
  }

  public void setEmpates(int em) {
    this.empates = em;
  }

  public void apresentar() {
    System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
    System.out.println("Diretamente de " + this.getNacionalidade());
    System.out.println("com " + this.getIdade() + " anos e " + this.getAltura());
    System.out.println("Pesando " + this.getPeso() + "Kg");
    System.out.println(this.getVitorias() + "vitórias");
    System.out.println(this.getDerrotas() + "derrotas e");
    System.out.println(this.getEmpates() + "empates!");
  }

  public void Status() {
    System.out.println(getNome());
    System.out.println("é um peso " + getCategoria());
    System.out.println(getVitorias() + " vitórias");
    System.out.println(getDerrotas() + " derrotas");
    System.out.println(getEmpates() + " empates");
  }

  public void ganharLuta() {
    this.setVitorias(this.getVitorias() + 1);
  }

  public void perderLuta() {
    this.setDerrotas(this.getDerrotas() + 1);
  }

  public void empatarLuta() {
    this.setEmpates(this.getEmpates() + 1);
  }
}
