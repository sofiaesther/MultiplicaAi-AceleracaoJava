public class App {
    public static void multiplicaAi(int valor){
        System.out.println("Tabela de multiplicação de " + valor + ":");
        for ( int i = 0; i < 10; i++){
            System.out.println(valor * (i+1));
        }
    }

    public static void main(String[] args) throws Exception {
        multiplicaAi(1);
    }
}
