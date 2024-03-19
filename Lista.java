public class Lista{
    private No primeiro;
    //construtor padrao (Aquele que zera todos os atributos)
    //Precisamos de uma forma de organizar listas de valores na memória, buscando uma estrutura que permite encaixar várias
    //pequenas partes de informação em um único lugar. A estrutura de dados que atende a essa necessidade é a lista encadeada.
    //como armazenar memória no sistema de maneira eficiente? Este é o problema que a lista resolve.
    public boolean estaVazia(){
        return primeiro == null;
    }
    public No getPrimeiro(){
        return primeiro;
    }
    public void setPrimeiro (No primeiro){
        this.primeiro = primeiro;
        
    }
    public void insereInicio (int i) {
        No novo = new No(i);
        if (!estaVazia()){   
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    public void insereFim(int i) {
        No novo = new No(i);
        if (estaVazia()){
            primeiro = novo;
        }
        else{
            No temp = primeiro;
            while (temp.getProximo() != null){
                temp = temp.getProximo();
            }
            temp.setProximo(novo);
        }
    }
    public int removeInicio(){
        // Guardar elemento da primeira posição
        int aux = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        // Só depois devolverá aquela informação
        return aux;
    }    
    @Override 
        public String toString(){
            String s = "lista: ";
            if (estaVazia()){
                s += "vazia";
            }
            else{
                No temp = primeiro;
                while (temp != null){ //percorre a lista até o final dela
                    s += temp;
                    temp = temp.getProximo();
                }
                s += "\\";
            }
            return s + "\n";
        } 
    
}