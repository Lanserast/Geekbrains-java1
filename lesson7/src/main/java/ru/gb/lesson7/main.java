package ru.gb.lesson7;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        InputStream is;
        OutputStream os;
        String word;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 2");
        task2();

        System.out.println('\n'+"Задание 3");
        System.out.println("Введите искомое слово для задания 3");
        word = scanner.nextLine();
        task3(word);

        System.out.println('\n'+"Задание 4");
        System.out.println("Введите искомое слово для задания 4");
        word = scanner.nextLine();
        task4(word);

        System.out.println('\n'+"Задание 5");
        System.out.println("Введите добавляемое слово для задания 5");
        word = scanner.nextLine();
        scanner.close();
        task5(word);
    }
    public static void task2 (){
        StringBuffer data = new StringBuffer();
        //Считываем файл1
        try {
            Scanner scanner = new Scanner(new FileInputStream("test_input.txt"));
            while (scanner.hasNext()) {
                data = data.append(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//Считываем файл2

        try {
            Scanner scanner = new Scanner(new FileInputStream("test_input2.txt"));
            while (scanner.hasNext()) {
                data = data.append(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //   System.out.println(data);
 // клеим их в файл3
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("test_output1.txt"));
            ps.println(data);
            System.out.println("Данные записаны в test_output1.txt");
            ps.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task3(String word){
        String str = "";
        StringBuffer data = new StringBuffer();
        try {
            Scanner scanner = new Scanner(new FileInputStream("test_output1.txt"));
            while (scanner.hasNext()) {
                data = data.append(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        str = data.toString();
        System.out.println(str);

        if (str.contains(word)) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        }
    }

    public static void task4(String word){
        StringBuffer data = new StringBuffer();
        String str = "";
          //задание 4 - найти в папке task4 заданное слово
          System.out.println("Задание 4");
          File folder = new File("task4");
          File[] listOfFiles = folder.listFiles();

          for (File file : listOfFiles) {
              if (file.isFile()) {
                  //System.out.println(file.getName());
                  try{
                      Scanner scanner1 = new Scanner(new FileInputStream(folder+"/"+file.getName()));
                      while (scanner1.hasNext()){
                          data = data.append(scanner1.nextLine());
                      }
                      scanner1.close();
                  }
                  catch(IOException e){
                      e.printStackTrace();
                  }
              }
          }
          str = data.toString();
          System.out.println(str);

          if (str.contains(word)) {
              System.out.println("Файлы в папке содержат данное слово");
          } else {
              System.out.println("Файлы в папке не содержат данное слово");
          }
      }

    public static void task5(String word){
        StringBuffer data = new StringBuffer();
        String str = "";
        //задание 5 - добавить указанное слово в папку
        System.out.println("Задание 5");
        File folder = new File("task5");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                //System.out.println(file.getName());
                try {
                    PrintStream ps = new PrintStream(new FileOutputStream(folder+"/"+file.getName(), true));
                    ps.print(" " + word);
                    System.out.println("Данные записаны в " + file.getName());
                    ps.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        str = data.toString();
        System.out.println(str);
    }
}
