import java.util.Arrays;

public class Homework5_2 {
  /*
  Шахматная доска
  Создать программу для раскраски шахматной доски с помощтю цикла.
  Создать двумерный массив String'ов 8х8. С помощью циклов задать
  элементам  циклам значения B(Black) или W (White).
   */
    public static void main(String[] args) {
        String[][] BlackWhite =new String[8][8];
        for (int i=0; i< BlackWhite.length; i++)
        {
            if (i % 2 ==0) {
            for (int q=0; q< BlackWhite.length; q++) {
             if(q % 2 ==0){
                 BlackWhite[i][q]="B";}
                else {
                    BlackWhite[i][q]="W";}

             }
             }
            else { for (int q=0; q< BlackWhite.length; q++) {
                if(q % 2 ==0){
                    BlackWhite[i][q]="W";}
                else {
                    BlackWhite[i][q]="B";}
            }
        }
        }
        for (int i=0; i< BlackWhite.length; i++){
            System.out.println(Arrays.deepToString(BlackWhite[i]));
        }









    }
}
