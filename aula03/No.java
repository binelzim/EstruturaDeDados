class No<t>{
    private t dado;
    private No<t> aux;

    public No(t dado){
        this.dado = dado;
        this.aux = null;
    }

    public void setDado(t dado){
        this.dado = dado;
    }

    public t getDado(){
        return this.dado;
    }

    public void setAux(No<t> aux){
        this.aux = aux;
    }

    public No<t> getAux(){
        return this.aux;
    }

    public String imprimeDados(){
        return "{Dado: " + getDado() + "}";
    }

}