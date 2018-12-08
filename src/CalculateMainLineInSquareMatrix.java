import java.util.Scanner;

public class CalculateMainLineInSquareMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Tạo ma trận vuông nxn có độ dài? ");
    int sizeOfSquareMatrix = scanner.nextInt();

    int[][] squareMatrix = new int[sizeOfSquareMatrix][sizeOfSquareMatrix];

    System.out.println("Nhập mảng:");
    for (int i = 0; i < squareMatrix.length; i++) {
      int[] row = squareMatrix[i];
      for (int j = 0; j < row.length; j++) {
        System.out.printf("element[%d][%d] = ", i, j);
        row[j] = scanner.nextInt();
      }
    }

    System.out.println("Mảng vừa nhập là:");
    for (int i = 0; i < squareMatrix.length; i++) {
      int[] row = squareMatrix[i];
      for (int j = 0; j < row.length; j++) {
        System.out.printf("%5d", row[j]);
      }
      System.out.println("\n");
    }

    int sumOfElementOnMainLine = 0;
    for (int i = 0; i < squareMatrix.length; i++) {
      int[] row = squareMatrix[i];
      for (int j = 0; j < row.length; j++) {
        if (i==j)
          sumOfElementOnMainLine += row[j];
      }
    }

    System.out.printf("Tổng đường chéo chính là: %d", sumOfElementOnMainLine);
  }
}
