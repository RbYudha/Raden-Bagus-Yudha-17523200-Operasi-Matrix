package matrixfinal;

import java.util.Scanner;

public class MatrixFinal 
{   
    public static void MasukanData1(Scanner scan, int[][] matrix1, int matrixRow, int matrixCol)
    {
         System.out.println("Masukan data matriks pertama : ");
              
              for (int i = 0; i < matrixRow; i++)
              {
                  for (int j = 0; j < matrixCol; j++)
                  {
                      matrix1[i][j] = scan.nextInt();
                  }
              }
    }
    
    public static void MasukanData2(Scanner scan, int[][] matrix2, int matrixRow, int matrixCol)
    {
         System.out.println("Masukan data matriks kedua : ");
              
              for (int i = 0; i < matrixRow; i++)
              {
                  for (int j = 0; j < matrixCol; j++)
                  {
                      matrix2[i][j] = scan.nextInt();
                  }
              }
      }
      
    public static void printMatrix1(int[][] matrix1, int matrixRow, int matrixCol)
    {
        System.out.println("Nilai matrix pertama : ");
            
            for (int i = 0; i < matrixRow; i++)
            {
                for (int j = 0; j < matrixCol; j++)
                {
                    System.out.print(matrix1[i][j]+" ");
                }
                 
                System.out.println();
            }
    }
    
    public static void printMatrix2(int[][] matrix2, int matrixRow, int matrixCol)
    {
        System.out.println("Nilai matrix kedua : ");
            
            for (int i = 0; i < matrixRow; i++)
            {
                for (int j = 0; j < matrixCol; j++)
                {
                    System.out.print(matrix2[i][j]+" ");
                }
                 
                System.out.println();
            }
    }
    
    public static void main(String[] args) 
    {
            Scanner scan = new Scanner(System.in);
            
            int matrix3[][] = new int[2][2];
            
            System.out.print("Masukan jumblah baris dalam matriks pertama : ");
            int matrixRow1 = scan.nextInt();
            System.out.print("Masukan jumblah colom dalam matriks pertama : ");
            int matrixCol1 = scan.nextInt();
            int[][] matrix1 = new int[matrixRow1][matrixCol1];
            MasukanData1(scan, matrix1, matrixRow1, matrixCol1);
            printMatrix1(matrix1, matrixRow1, matrixCol1);
            
            System.out.print("Masukan jumblah baris dalam matriks kedua : ");
            int matrixRow2 = scan.nextInt();
            System.out.print("Masukan jumblah colom dalam matriks kedua : ");
            int matrixCol2 = scan.nextInt();
            int[][] matrix2 = new int[matrixRow2][matrixCol2];
            MasukanData2(scan, matrix2, matrixRow2, matrixCol2);
            printMatrix2(matrix2, matrixRow2, matrixCol2);
            
            System.out.println();
            System.out.println("Operasi-operasi Matriks :");
            System.out.println();
            
            System.out.println("1. Operasi penjumblahan : ");
        
            for (int i = 0; i < matrix1.length; i++)
            {
                for (int j = 0; j < matrix1[0].length; j++)
                {
                int elem = matrix1[i][j] + matrix2[i][j]; 
                System.out.print( elem + " ");
                }       
                    System.out.println();
            }
            
            System.out.println("2. Operasi pengurangan : ");
        
            for (int i = 0; i < matrix1.length; i++)
            {
                for (int j = 0; j < matrix1[0].length; j++)
                {
                int elem = matrix1[i][j] - matrix2[i][j]; 
                System.out.print( elem + " ");
                }       
                    System.out.println();
            }
            
            System.out.println("3. Operasi perkalian : ");
        
            for (int i = 0; i < matrix1.length; i++)
            {
                for (int j = 0; j < matrix1[0].length; j++)
                {
                    int total = 0; 
                
                    for (int k = 0; k < matrix1.length; k++)
                    {
                        total = total +  (matrix1[i][k] * matrix2[k][j]);
                    }       
                
                    matrix3[i][j] = total;
                }       
            }
            
            for (int i = 0; i < matrix3.length; i++)
            {
                for (int j = 0; j < matrix3[0].length; j++)
                {
                    System.out.print( matrix3[i][j] + " ");
                }       
                
                System.out.println();
            }
            
        System.out.println("4. Operasi perkalian skalar pada matriks pertama ");
        System.out.print("Masukan nilai skalar : ");
        int skalar = scan.nextInt();
        System.out.println("Hasil perkalian : ");
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {    
                System.out.print(matrix1[i][j] * skalar + " ");
            }
                System.out.println();
        }
        
        System.out.println("Operasi transpose pada matrix pertama : ");
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(matrix1[j][i] + " ");
            }
                System.out.println();        
        }
        
        System.out.println();
        System.out.println("Terimakasih");
    }
}