import java.util.Random;
public class TesteLista{
    public static void main(String [] args){
        Random random = new Random();
        ListaDupla lDupla = new ListaDupla();
        do{
            if(random.nextBoolean()){ // insert
                if(random.nextBoolean()){ //insert inicio
                    lDupla.insereInicio(random.nextInt());
                    System.out.println("Insere início: ");
                }
                else{ //insert fim
                    lDupla.insereFim(random.nextInt());
                    System.out.println("Insere fim: ");
                }
            }
            else if (!lDupla.estaVazia()){ //remove
                if(random.nextBoolean()){ //remove fim
                    System.out.println(lDupla.removeFim() + " Foi removido do fim.");
                }
                else{ //remove inicio
                    System.out.println(lDupla.removeInicio() + " Foi removido do ínicio");
                }
            }
            System.out.println(lDupla);
        }while(!lDupla.estaVazia());
        
    }
}