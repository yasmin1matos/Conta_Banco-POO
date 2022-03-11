

public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //método construtor
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

     // getters e setters
    public int getNumConta() {

        return this.numConta;
    }

    public void setNumConta(int nc) {
        this.numConta = nc;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

       //Métodos para abrir uma conta

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "Conta corrente") {
            this.setSaldo(50);
        } else if (t == "Conta poupança") {
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso.");
    }

    public void fecharConta(boolean t) {
        if (getSaldo() < 0) {
            System.out.println("voce está em divida com o banco.");
        } else if (getSaldo() > 0) {
            System.out.println("Impossivel fechar conta. Voce tem saldo no Banco.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }

    }

    public void depositar(float v) {
        if (getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de: " + this.getDono());
        } else {
            System.out.println("não foi possivel depositar");
        }
    }

    public void sacar (float v){
            if (this.getStatus()){
                if (this.getSaldo()>=v){
                    this.setSaldo(this.getSaldo()-v);
                    System.out.println("Saque realizado para: "+this.getDono());
                } else {
                    System.out.println("impossivel realizar o saque para: " + this.getDono() + ". Saldo insuficiente.");
                }
            }
        }

      //Método estado atual da conta
    public void estadoConta() {
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Titular: " + this.getDono());
        System.out.println("Saldo disponivel: " + this.getSaldo());
    }


    }
