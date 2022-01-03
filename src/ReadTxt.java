import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Arrays;
import java.util.Scanner;

public class ReadTxt {
   public static void main(String args[]) throws Exception {
      Scanner scr = new Scanner(new BufferedReader(new FileReader("accounts.txt")));
      int row = 4;
      int col = 4;

      String[][] twoDArr = new String[row][col];
      while (scr.hasNextLine()) {
         for (int i = 0; i < twoDArr.length; i++) {
            String[] line = scr.nextLine().trim().split(" ");
            for (int j = 0; j < line.length; j++) {
               twoDArr[i][j] = (line[j]).toString();
            }
         }
      }
      // System.out.println(Arrays.deepToString(twoDArr));
      System.out.println("Output");
      for (int i = 0; i < twoDArr.length; i++) {
         for (int j = 0; j < twoDArr[i].length; j++) {
            System.out.print(twoDArr[i][j] + "\t");
         }
         System.out.println();
      }

   }

}