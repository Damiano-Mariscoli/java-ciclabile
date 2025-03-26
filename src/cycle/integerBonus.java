package cycle;

import java.util.Arrays;

public class integerBonus {
    public int numero;
    private int[] array = {1,2,3};
    int[] newArray; 
    
    
    public integerBonus(){
        
    }

    public void addElemento(int numero) {
        this.numero = numero;

       if(newArray == null){
        newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = numero;
       }else{
        newArray = Arrays.copyOf(newArray, newArray.length + 1);
        newArray[newArray.length - 1] = numero;
       }
    }
    public void getArray() {
        if(newArray == null){
            for(int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
        }else{
            for(int i = 0; i < newArray.length; i++){
                System.out.println(newArray[i]);
        }
        
        
      
    }

}
}
