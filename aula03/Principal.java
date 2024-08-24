public class Principal{
    public static void main(String[] args){
        Lista<String> lista = new Lista<String>("alunos");

        lista.addInicio("Bielzin");
        lista.imprimeDados();
        lista.addInicio("Akiz");
        lista.imprimeDados();
        lista.addFinal("Tatu");
        lista.imprimeDados();
        lista.removeInicio();
        lista.imprimeDados();
        lista.removeFinal();
        lista.imprimeDados();
    }
}