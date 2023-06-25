package banco;

public abstract class Conta {
	
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}

	Double saldo = 0.0;
	
	void depositar(Double valor) {
		this.saldo += valor;
	}
	
	void sacar(Double valor) {
		this.saldo += valor;
	}
	
	abstract void rentabilizar();
	
}