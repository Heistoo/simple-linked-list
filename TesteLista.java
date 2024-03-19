public class TesteLista{
    public static void main(String[] args){
        Lista l = new Lista();
        System.out.println(l);
        
        // Null pointer
        // l.removeInicio();

        for (int i=1; i<=6; i++){
            l.insereInicio(i*10);
            System.out.println(l);
        }
        for (int i=1; i<=6; i++){
            l.insereFim(i*10+5);
            System.out.println(l);
        }
        if (l.estaVazia()){
            System.out.println("Lista vázia, não há o que remover");
        }
        else{
            System.out.println(l.removeInicio()+ " saiu do inicio");
        }

    }
}