package cycle;

public class integer {
    public int[] listaNumeri;

    public integer(int[] listaNumeri){
        this.listaNumeri = listaNumeri;
    }

    private int counter = 0;


    public int getElementoSuccessivo() {
        int numero = listaNumeri[counter];
        counter ++;
       
        return numero;
        
    }

    public boolean hasAncoraElementi(){
       return counter < listaNumeri.length;
    }


    

}
