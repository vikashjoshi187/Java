
import java.util.Scanner;

public class prog_93 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a nummber");
    int num = sc.nextInt();
    System.out.println("enter a chrater");
    char ch;
    ch = sc.next().charAt(0);

    switch (ch) {
      case 65:
      case 97:
        // FOR A
        if (num % 2 != 0) {
          num++;

        }
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == 1 || j == 1 || j == num || i == num / 2) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        break;
      //////

      case 66:
      case 98:
        // FOR B

        if (num % 2 != 0) {
          num++;

        }
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == num || i == 1 || j == 1 || j == num || i == num / 2) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      ///////

      case 99:
      case 67:

        // FOR C
        if (num % 2 != 0) {
          num++;

        }
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == num || i == 1 || j == 1) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        break;
      ////////

      case 100:
      case 68:
        // FOR D
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {
            if (i == num || i == 1 || j == 1 || j == num) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
          }
          System.out.println();
        }
        break;
      //////

      case 101:
      case 69:

        // for E

        if (num % 2 != 0) {
          num++;

        }
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == num || i == 1 || j == 1 || i == num / 2) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        break;
      //////

      case 102:
      case 70:
        // for F

        if (num % 2 != 0) {
          num++;

        }
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == 1 || j == 1 || i == num / 2) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        break;
      ///////

      case 103:
      case 71:
        if (num % 2 != 0) {
          num++;

        }
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (j > i / 2 || j == 1 || i == num / 2) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        break;
      ///////

      case 104:
      case 72:
        // for H
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == num / 2 || j == 1 || j == num) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      /////

      case 105:
      case 73:
        // for I
        System.out.println("\n\n");

        if (num % 2 == 0) {
          num++;

        }

        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (j == (num / 2) + 1 || i == 1 || i == num) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      //////

      case 106:
      case 74:
        // for J
        System.out.println("\n\n");

        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (j == num || (i >= num - 2 && j == 1) || i == num) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      //////

      case 107:
      case 75:
        // for K
        System.out.println("\n\n");

        for (int i = 0; i < num / 2; i++) {
          for (int j = 1; j <= num / 2; j++) {

            if (j == 1 || j == (num / 2) - i) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        for (int i = 2; i <= num / 2; i++) {
          for (int j = 1; j <= num / 2; j++) {

            if (j == 1 || j == i) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      //////

      case 108:
      case 76:
        // FOR L

        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == num || j == 1) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      ////

      case 109:
      case 77:
        // FOR M

        for (int i = 1; i <= num / 2; i++) {
          for (int j = 1; j <= num / 2; j++) {

            if (j == 1 || j == i) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          for (int j = num / 2; j >= 1; j--) {

            if (j == 1 || j == i) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      ////

      case 110:
      case 78:
        // for N
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (j == 1 || j == num || j == i) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      //////

      case 111:
      case 79:
        // FOR O

        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == num || i == 1 || j == 1 || j == num) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      ///

      case 112:
      case 80:
        // FOR P

        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == (num / 2) + 1 || i == 1 || j == 1 || (i <= (num / 2) + 1) && j == num) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        break;
      ////////

      case 113:
      case 81:
        // for Q
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == num || i == 1 || j == 1 || j == num) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }
            if (i == num && j == num) {
              for (int k = 1; k <= num / 2; k++) {
                System.out.print("*");
              }

            }
          }
          System.out.println();

        }
        break;
      ////

      case 114:
      case 82:
        // FOR R
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == (num / 2) + 1 || i == 1 || j == 1 || (i <= (num / 2) + 1) && j == num || (i > num / 2) && j == i) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        break;
      //////

      case 115:
      case 83:
        // FOR S
        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (i == num || i == (num / 2) + 1 || i == 1 || i <= num / 2 && j == 1 || i >= (num / 2) + 1 && j == num) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      /////

      case 116:
      case 84:
        // for T
        if (num % 2 == 0) {
          num++;

        }

        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (j == (num / 2) + 1 || i == 1) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        break;
      ////

      case 117:
      case 85:
        // for U
        System.out.println("\n\n");

        if (num % 2 == 0) {
          num++;

        }

        for (int i = 1; i <= num; i++) {
          for (int j = 1; j <= num; j++) {

            if (j == 1 || j == num || i == num) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        break;
      /////

      case 118:
      case 86:

        // for v

        for (int i = 1; i <= num; i++) {

          for (int j = 1; j <= num; j++) {
            if (j == i) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }

          }

          for (int j = num; j >= 1; j--) {
            if (j == i) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        break;
      /////

      case 119:
      case 87:
        // for W

        for (int i = num; i >= 1; i--) {
          for (int j = 1; j <= num / 2; j++) {

            if (j == 1 || j == i) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          for (int j = num / 2; j >= 1; j--) {

            if (j == 1 || j == i) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        break;
      ///////

      case 120:
      case 88:
        // for X
        for (int i = 1; i <= num / 2; i++) {

          for (int j = 1; j <= num / 2; j++) {
            if (j == i) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }

          }

          for (int j = num / 2; j >= 1; j--) {
            if (j == i) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }

        for (int i = num / 2; i >= 1; i--) {
          for (int j = 1; j <= num / 2; j++) {
            if (j == i) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }

          }

          for (int j = num / 2; j >= 1; j--) {
            if (j == i) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      ////////

      case 121:
      case 89:
        // for Y
        System.out.println("\n\n");

        for (int i = 1; i <= num / 2; i++) {

          for (int j = 1; j <= num / 2; j++) {
            if (j == i) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }

          }

          for (int j = num / 2; j >= 1; j--) {
            if (j == i) {
              System.out.print("*");
            } else {
              System.out.print(" ");
            }

          }
          System.out.println();
        }

        for (int j = 1; j <= num; j++) {

          for (int j2 = 1; j2 < num; j2++) {
            if (j2 == num) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }
            System.out.println();

          }

        }
        break;
      //////

      case 122:
      case 90:
        // FOR Z

        for (int i = 1; i <= num; i++) {
          for (int j = num; j >= 1; j--) {

            if (j == i || i == 1 || i == num) {
              System.out.print("*");

            } else {
              System.out.print(" ");
            }

          }
          System.out.println();

        }
        break;
      //////
      default: {
        System.out.println("enter a valid charracter ");
        break;
      }
    }

  }

}
