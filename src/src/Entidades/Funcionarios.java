package Entidades;

public class Funcionarios {
	private String nome;
	private Integer id;
	private Double salario;


	public Funcionarios(String nome, Integer id, Double salario) {
		super();
		this.nome = nome;
		this.id = id;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void ajusteSalario(float percentual) {
		salario = salario + (salario * percentual/100);
		}

	@Override
	public String toString() {
		return "[ID: " + id + ", Nomne: " + nome + "Salario: " + "R$"+ salario + "]"; 
	}
	
	}


