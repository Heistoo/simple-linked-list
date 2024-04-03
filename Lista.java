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
            while (temp.getProximo() != null){ //percorrendo a lista até o ultimo elemento
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
    public int removeFim(){
        int aux;
        if (primeiro.getProximo() == null){
            aux = primeiro.getInfo();
            primeiro = null; // esvaziou a lista
        }
        else{
            //preciso percorrer a lista em busca do último elemento
            No temp = primeiro;
            while(temp.getProximo().getProximo() != null){ // o próximo do próximo
                temp = temp.getProximo();
            }
            aux = temp.getProximo().getInfo();
            temp.setProximo(null);
        }
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
    public boolean removeOcorrencia(int x){
        if (estaVazia()) return false;
        if (primeiro.getInfo() == x){
            primeiro = primeiro.getProximo();
            return true;
        }
        boolean achou = false;
        No anterior = primeiro;
        No atual = primeiro.getProximo();
        while (atual != null && !achou){
            if (atual.getInfo() == x){
                achou = true;
            }
            else{
                anterior = atual;
                atual = atual.getProximo();
            }
        }
        if (!achou) return false;
        anterior.setProximo(atual.getProximo());
        return true;
    }
}