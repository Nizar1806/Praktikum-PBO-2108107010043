import java.util.Scanner;

    public class Prak2Soal02 {
    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);   
    int nilai;

    System.out.print("Nilai = ");
    nilai = input.nextInt();

        if(nilai>=87){
        System.out.println("Nilai huruf = 4.00 / A");
        }
        else if(nilai>=78 && nilai<87){
        System.out.println("Nilai huruf = 3.50 / AB");
        }
        else if(nilai>=69 && nilai<78){
        System.out.println("Nilai huruf = 3.00 / B");
        }
        else if(nilai>=60 && nilai<69){
        System.out.println("Nilai huruf = 2.50 / BC");
        }
        else if(nilai>=51 && nilai<60){
        System.out.println("Nilai huruf = 2.00 / C");
        }
        else if(nilai>=41 && nilai<51){
        System.out.println("Nilai huruf = 1.00 / D");
        }
        else if(nilai<41 && nilai>=0){
        System.out.println("Nilai huruf = 0.00 / E");
        }
        else{
        System.out.println("Invalid!!");
        }
    }
}
