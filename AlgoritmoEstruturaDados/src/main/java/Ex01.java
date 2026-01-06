public class Ex01 {
    // Dado um array de inteiros , calcule a média dos valores
    public static  void main(String[] args){
        int[] nums = {2 , 4 , 5 , 7 , 8};
        int soma = 0;
        for( int i = 0; i < nums.length; i++){
            soma += nums[i];
        }
        double media =  soma / nums.length;
        System.out.println(media);
    }
}
