public class TablaMultiplicar{
    public static void main(String arg[]){
        int numero = Integer.parseInt(arg[0]);
        for(int i = 1 ; i<=10 ; i++){
            System.out.println(""+numero+" * "+i+" = "+(i*numero));
        }
    }
}