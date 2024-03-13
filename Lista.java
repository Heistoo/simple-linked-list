public class Lista{
    private No primeiro;
    //construtor padrao (Aquele que zera todos os atributos)
    public boolean estaVazia(){
        return primeiro == null;
    }
    public No getPrimeiro(){
        return primeiro;
    }
    public void insereInicio (int i) {
        No novo = new No(i);
        if (!estaVazia()){   
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    @Override 
        public String toString(){
            String s = "lista: ";
            if (estaVazia()){
                s += "vazia";
            }
            else{
                No temp = primeiro;
                while (temp != null){
                    s += temp;
                    temp = temp.getProximo();
                }
                s += "\\";
            }
            return s + "\n";
        }
    
}