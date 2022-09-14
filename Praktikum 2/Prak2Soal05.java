public class Prak2Soal05 {

    public static void main(String[] args) {
        int x;

        for(x = 0; x<=20; x+=2){

            if(x % 6 == 0)
                continue;

            System.out.print(x + " ");
       }
    }
}
