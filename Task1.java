public class Task{
    public static void main(String[] arg){
        int n=6;
        for(int i = 1; i <= n; i++){
            if (i == 1 || i == 2) {
                System.out.print("\n\n     "+  i +"    ");
            }else{
                System.out.print("\n\n"+  i +"    ");
            }
            int d = i;
            for(int j = 6; j > i; j--){
                System.out.print((d += j)+ "    ");
            }
        }
    }
}


