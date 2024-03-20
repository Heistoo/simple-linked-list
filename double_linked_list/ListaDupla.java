public class ListaDupla{
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    public boolean estaVazia() {
        return primeiro == null;
    }
    public void insereInicio (int i) {
        NoDuplo novo = new NoDuplo(i);
        if (estaVazia()){
            //se estiver vazia primeiro e ultimo pacotes são o novo
            primeiro = novo;
            ultimo = novo;
        }
        else{
            //não está vazia:
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo); 
        }
        primeiro = novo;
    }
    public void insereFim(int i){
        NoDuplo novo = new NoDuplo(i);
        if (estaVazia()){
            primeiro = novo;
            ultimo = novo;
        }
        else{
            novo.setAnterior(primeiro);
            primeiro.setProximo(novo);
        }
        ultimo = novo;
    }
}