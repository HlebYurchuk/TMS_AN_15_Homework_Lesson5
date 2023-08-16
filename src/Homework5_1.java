import java.util.Arrays;
import java.util.Scanner;

/*
Задание 0
Создать трёхмерный массив из целых чисел.
С помощью циклов "пройти" по всему массиву и увеличить каждый
элемент на заднное число. Пусть каждое число на которое будет увеличиваться каждый элемент,
Задается с консоли.
 */

public class Homework5_1 {
    public static void main(String[] args) {
//Создаем трехмерный массив
        int[][][] myArray = new int[3][3][3];
        for (int i=0; i < myArray.length; i++){
            for (int j=0; j<myArray[i].length; j++){
                for (int k=0; k<myArray[i][j].length; k++){
                     myArray[i][j][k] = (int) (Math.random() * 10);


                }
            }
        }
        //Выводим массив на консоль и при помощи класса сканер просим ввести число
        System.out.println(Arrays.deepToString(myArray));
        Scanner sc = new Scanner(System.in);
        System.out.println("Put your number:");
        int YourNumber = sc.nextInt();

        //В массив добавляем переменную, которую вводили в консоли
       for (int i=0; i < myArray.length; i++){
           for (int j=0; j<myArray[i].length; j++){
               for (int k=0; k<myArray[i][j].length; k++){
                   myArray[i][j][k]=myArray[i][j][k]+YourNumber;


               }
           }
       }
       //Выводим на экран
 System.out.println(Arrays.deepToString(myArray));
    }
}
