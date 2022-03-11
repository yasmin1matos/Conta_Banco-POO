import java.security.cert.CertificateParsingException;

public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(123);
        p1.setDono("Yasmin Matos Silveira");
        p1.abrirConta("Conta poupança");
        p1.depositar(200);
        p1.sacar(100);

       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(321);
       p2.setDono("João Victor Souza");
       p2.abrirConta("Conta corrente");
        p2.depositar(200);
        p1.sacar(100);






        p1.estadoConta();
        p2.estadoConta();


    }
}
