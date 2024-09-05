// Classe ListaDuplamenteEncadeada que representa a lista duplamente encadeada
public class ListaDupla<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;

    public ListaDupla() {
        this("Lista Duplamente Encadeada");
    }

    public ListaDupla(String nomeLista) {
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if (primeiroNo == null) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
    }

    public void addFinal(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if (ultimoNo == null) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public void removeInicio() {
        if (primeiroNo == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Dado: " + primeiroNo.getDado() + " removido da lista.");
            primeiroNo = primeiroNo.getProximoNo();
            if (primeiroNo != null) {
                primeiroNo.setAnteriorNo(null);
            } else {
                ultimoNo = null;
            }
        }
    }

    public void removeFinal() {
        if (ultimoNo == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Dado: " + ultimoNo.getDado() + " removido da lista.");
            ultimoNo = ultimoNo.getAnteriorNo();
            if (ultimoNo != null) {
                ultimoNo.setProximoNo(null);
            } else {
                primeiroNo = null;
            }
        }
    }

    public void imprimeLista() {
        if (primeiroNo == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.printf("Dados da lista de %s:\n", nomeLista);
            NoDuplo<T> aux = primeiroNo;
            while (aux != null) {
                System.out.printf(" %s ", aux.toString());
                aux = aux.getProximoNo();
            }
            System.out.println();
        }
    }
}