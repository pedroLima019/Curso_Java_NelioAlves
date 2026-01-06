public class Ex02 {
    public static void main(String[] args){
         int[] arr = { 2 , 5 , 6 , 8 , 9};
         int contador = 0 ;

         for (int i = 0 ; i < arr.length ; i++){
              if(arr[i] % 2 == 0 ){
                   contador++;
              }
         }
        System.out.println(contador);
    }
}
