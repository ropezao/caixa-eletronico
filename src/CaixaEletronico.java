public class CaixaEletronico {
    /**
     * @param args
     */
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 20.0;


        if (valorSolicitado <= saldo ) {
        saldo = saldo - valorSolicitado; 
        System.out.println("Seu saldo é: "+ saldo + " reais");
    }
        else  
        System.out.println("Seu saldo é de : " + saldo + " reais, Insuficiente para retirada" ); 

    }
}
