public class ListaComUltimo extends Lista{
    private No ultimo;
    //construtor padrão!!
    public No getUltimo(){
        return ultimo;
    }
    @Override
    public void insereInicio(int i){
        No novo = new No(i);
        if (estaVazia()){
            ultimo = novo;
        }
        else{
            novo.setProximo(super.getPrimeiro());
        }
        super.setPrimeiro(novo);
    }
    @Override
    public void insereFim(int i){
        No novo = new No(i);
        if (estaVazia()){
            super.setPrimeiro(novo);
        }
        else{
            ultimo.setProximo(novo); //proximo do ultimo vai ser o "novo" elemento   
        } 
        ultimo = novo; //a lista vai reconhecer um novo elemento como o ultimo, e o elemento anterior que era o "ultimo" agora será o penultimo
    }
}