
// program to print Marksheet
import java.util.Scanner;

public class mark_sheet {
    public static void main(String args[]) {
        String sem1subjects[] = { "\t\tC         ", "\t\tC++       ", "\t\tDS        ", "\t\tJAVA      ", "\t\tOS        ", "\t\tC_Prac    ", "\t\tC++_Prac  " };
        String sem2subjects[] = { "\t\tC2        ", "\t\tC++2      ", "\t\tDS2       ", "\t\tJAVA2     ", "\t\tOS2       ", "\t\tC_Prac2   ", "\t\tC++_Prac2 " };
        String sem3subjects[] = { "\t\tC3        ", "\t\tC++3      ", "\t\tDS3       ", "\t\tJAVA3     ", "\t\tOS3       ", "\t\tC_Prac3   ", "\t\tC++_Prac3 " };
        String sem4subjects[] = { "\t\tC4        ", "\t\tC++4      ", "\t\tDS4       ", "\t\tJAVA4     ", "\t\tOS4       ", "\t\tC_Prac4   ", "\t\tC++_Prac4 " };
        String sem5subjects[] = { "\t\tC5        ", "\t\tC++5      ", "\t\tDS5       ", "\t\tJAVA5     ", "\t\tOS5       ", "\t\tC_Prac5   ", "\t\tC++_Prac5 " };
        String sem6subjects[] = { "\t\tC6        ", "\t\tC++6      ", "\t\tDS6       ", "\t\tJAVA6     ", "\t\tOS6       ", "\t\tC_Prac6   ", "\t\tC++_Prac6 " };

        int sem1marks[] = new int[7];
        int sem2marks[] = new int[7];
        int sem3marks[] = new int[7];
        int sem4marks[] = new int[7];
        int sem5marks[] = new int[7];
        int sem6marks[] = new int[7];
        boolean sem1atkt[] = new boolean[7];

        int count_sem1atkt, count_sem2atkt, count_sem3atkt, count_sem4atkt, count_sem5atkt, count_sem6atkt;
        Scanner sc = new Scanner(System.in);
        do {
            boolean sem2atkt[] = new boolean[7];
            boolean sem3atkt[] = new boolean[7];
            boolean sem4atkt[] = new boolean[7];
            boolean sem5atkt[] = new boolean[7];
            boolean sem6atkt[] = new boolean[7];

            count_sem1atkt = 0;
            count_sem2atkt = 0;
            count_sem3atkt = 0;
            count_sem4atkt = 0;
            count_sem5atkt = 0;
            count_sem6atkt = 0;
            /* First semester starts */
            System.out.println("\t\t\t\t\t\t\tEnter marks of 1st semester : ");
            for (int i = 0; i < sem1subjects.length; i++) {
                if (i < 5) {
                    System.out.println("\t\t\t\t\t\t\tEnter " + sem1subjects[i] + " marks : ");
                    sem1marks[i] = sc.nextInt();
                    if (sem1marks[i] < 0 || sem1marks[i] > 100) {
                        System.out.println("--Invalid marks--Please Re-Enter--");
                        i--;
                        continue;
                    }
                    if (sem1marks[i] < 33) {
                        count_sem1atkt++;
                        sem1atkt[i] = true;
                    }
                } else {
                    System.out.println("\t\t\t\t\t\t\tEnter " + sem1subjects[i] + " marks : ");
                    sem1marks[i] = sc.nextInt();
                    if (sem1marks[i] < 0 || sem1marks[i] > 25) {
                        System.out.println("--Invalid marks--Please Re-Enter--");
                        i--;
                        continue;
                    }
                    if (sem1marks[i] < 13) {
                        count_sem1atkt++;
                        sem1atkt[i] = true;
                    }
                }
            }
            System.out.println("You have " + count_sem1atkt + " ATKT in 1st Semester");
            /* First semester ends */
            /* First semester atkt starts */
            for (int i = 0; i < sem1atkt.length; i++) {
                if (sem1atkt[i]) {
                    if (i < 5) {
                        System.out.println("Enter " + sem1subjects[i] + " atkt marks : ");
                        sem1marks[i] = sc.nextInt();
                        if (sem1marks[i] < 0 || sem1marks[i] > 100) {
                            System.out.println("--Invalid marks--Please Re-Enter--");
                            i--;
                            continue;
                        }
                        if (sem1marks[i] >= 33) {
                            count_sem1atkt--;
                            sem1atkt[i] = false;
                        }
                        if (sem1marks[i] < 33)
                            sem1atkt[i] = true;
                    } else {
                        System.out.println("Enter " + sem1subjects[i] + " atkt marks : ");
                        sem1marks[i] = sc.nextInt();
                        if (sem1marks[i] < 0 || sem1marks[i] > 25) {
                            System.out.println("--Invalid marks--Please Re-Enter--");
                            i--;
                            continue;
                        }
                        if (sem1marks[i] >= 13) {
                            count_sem1atkt--;
                            sem1atkt[i] = false;
                        }
                        if (sem1marks[i] < 13)
                            sem1atkt[i] = true;
                    }
                }
            }
            /* First semester atkt ends */

        //    /* Second Semester exam starts */
        //     System.out.println("\nEnter marks of 2nd semester : ");
        //     for (int i = 0; i < sem2subjects.length; i++) {
        //         if (i < 5) {
        //             System.out.println("Enter " + sem2subjects[i] + " marks : ");
        //             sem2marks[i] = sc.nextInt();
        //             if (sem2marks[i] < 0 || sem2marks[i] > 100) {
        //                 System.out.println("--Invalid marks--Please Re-Enter--");
        //                 i--;
        //                 continue;
        //             }
        //             if (sem2marks[i] < 33) {
        //                 count_sem2atkt++;
        //                 sem2atkt[i] = true;
        //             }
        //         } else {
        //             System.out.println("Enter " + sem2subjects[i] + " marks : ");
        //             sem2marks[i] = sc.nextInt();
        //             if (sem2marks[i] < 0 || sem2marks[i] > 25) {
        //                 System.out.println("--Invalid marks--Please Re-Enter--");
        //                 i--;
        //                 continue;
        //             }
        //             if (sem2marks[i] < 13) {
        //                 count_sem2atkt++;
        //                 sem2atkt[i] = true;
        //             }
        //         }
        //     }
        //     System.out.println("You have " + count_sem2atkt + " ATKT in 2nd Semester");
        //     /* Second semester exam ends */
        //     System.out.println("After 2nd semester You have " + count_sem1atkt + " ATKT in 1st Semester");
        //     if (count_sem1atkt + count_sem2atkt > 4) {
        //         System.out.println("\n**Year Back**\n");

        //         continue;
        //     } else {

        //         /* Third semester starts */
        //         /* First semester atkt starts */
        //         for (int i = 0; i < sem1atkt.length; i++) {
        //             if (sem1atkt[i]) {
        //                 if (i < 5) {
        //                     System.out.println("Enter " + sem1subjects[i] + " atkt marks : ");
        //                     sem1marks[i] = sc.nextInt();
        //                     if (sem1marks[i] < 0 || sem1marks[i] > 100) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem1marks[i] >= 33) {
        //                         count_sem1atkt--;
        //                         sem1atkt[i] = false;
        //                     }
        //                     if (sem1marks[i] < 33)
        //                         sem1atkt[i] = true;
        //                 } else {
        //                     System.out.println("Enter " + sem1subjects[i] + " atkt marks : ");
        //                     sem1marks[i] = sc.nextInt();
        //                     if (sem1marks[i] < 0 || sem1marks[i] > 25) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem1marks[i] >= 13) {
        //                         count_sem1atkt--;
        //                         sem1atkt[i] = false;
        //                     }
        //                     if (sem1marks[i] < 13)
        //                         sem1atkt[i] = true;
        //                 }
        //             }
        //         }
        //         /* First semester atkt ends */
        //         /* second semester atkt starts */
        //         for (int i = 0; i < sem2atkt.length; i++) {
        //             if (sem2atkt[i]) {
        //                 if (i < 5) {
        //                     System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
        //                     sem2marks[i] = sc.nextInt();
        //                     if (sem2marks[i] < 0 || sem2marks[i] > 100) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem2marks[i] >= 33) {
        //                         count_sem2atkt--;
        //                         sem2atkt[i] = false;
        //                     }
        //                     if (sem2marks[i] < 33)
        //                         sem2atkt[i] = true;
        //                 } else {
        //                     System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
        //                     sem2marks[i] = sc.nextInt();
        //                     if (sem2marks[i] < 0 || sem2marks[i] > 25) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem2marks[i] >= 13) {
        //                         count_sem2atkt--;
        //                         sem2atkt[i] = false;
        //                     }
        //                     if (sem2marks[i] < 13)
        //                         sem2atkt[i] = true;
        //                 }
        //             }
        //         }
        //         /* second semester atkt ends */

        //         /* third semester starts */
        //         System.out.println("Promoted to 3rd Semester");
        //         System.out.println("Enter marks of 3rd semester : ");
        //         for (int i = 0; i < sem3subjects.length; i++) {
        //             if (i < 5) {
        //                 System.out.println("Enter " + sem3subjects[i] + " marks : ");
        //                 sem3marks[i] = sc.nextInt();
        //                 if (sem3marks[i] < 0 || sem3marks[i] > 100) {
        //                     System.out.println("--Invalid marks--Please Re-Enter--");
        //                     i--;
        //                     continue;
        //                 }
        //                 if (sem3marks[i] < 33) {
        //                     count_sem3atkt++;
        //                     sem3atkt[i] = true;
        //                 }
        //             } else {
        //                 System.out.println("Enter " + sem3subjects[i] + " marks : ");
        //                 sem3marks[i] = sc.nextInt();
        //                 if (sem3marks[i] < 0 || sem3marks[i] > 25) {
        //                     System.out.println("--Invalid marks--Please Re-Enter--");
        //                     i--;
        //                     continue;
        //                 }
        //                 if (sem3marks[i] < 13) {
        //                     count_sem3atkt++;
        //                     sem3atkt[i] = true;
        //                 }
        //             }
        //         }
        //         System.out.println("You have " + count_sem3atkt + " ATKT in 3rd Semester");
        //         System.out.println("Promoted to 4rd Semester");
        //         /* Third semester ends */

               
               
               
               
        //         /* Fourth samester starts */

        //         /* First semester atkt starts */
        //         for (int i = 0; i < sem1atkt.length; i++) {
        //             if (sem1atkt[i]) {
        //                 if (i < 5) {
        //                     System.out.println("Enter " + sem1subjects[i] + " atkt marks : ");
        //                     sem1marks[i] = sc.nextInt();
        //                     if (sem1marks[i] < 0 || sem1marks[i] > 100) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem1marks[i] >= 33) {
        //                         count_sem1atkt--;
        //                         sem1atkt[i] = false;
        //                     }
        //                     if (sem1marks[i] < 33)
        //                         sem1atkt[i] = true;
        //                 } else {
        //                     System.out.println("Enter " + sem1subjects[i] + " atkt marks : ");
        //                     sem1marks[i] = sc.nextInt();
        //                     if (sem1marks[i] < 0 || sem1marks[i] > 25) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem1marks[i] >= 13) {
        //                         count_sem1atkt--;
        //                         sem1atkt[i] = false;
        //                     }
        //                     if (sem1marks[i] < 13)
        //                         sem1atkt[i] = true;
        //                 }
        //             }
        //         }
        //         /* First semester atkt ends */
        //         /* second semester atkt starts */
        //         for (int i = 0; i < sem2atkt.length; i++) {
        //             if (sem2atkt[i]) {
        //                 if (i < 5) {
        //                     System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
        //                     sem2marks[i] = sc.nextInt();
        //                     if (sem2marks[i] < 0 || sem2marks[i] > 100) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem2marks[i] >= 33) {
        //                         count_sem2atkt--;
        //                         sem2atkt[i] = false;
        //                     }
        //                     if (sem2marks[i] < 33)
        //                         sem2atkt[i] = true;
        //                 } else {
        //                     System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
        //                     sem2marks[i] = sc.nextInt();
        //                     if (sem2marks[i] < 0 || sem2marks[i] > 25) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem2marks[i] >= 13) {
        //                         count_sem2atkt--;
        //                         sem2atkt[i] = false;
        //                     }
        //                     if (sem2marks[i] < 13)
        //                         sem2atkt[i] = true;
        //                 }
        //             }
        //         }
        //         /* second semester atkt ends */
        //         /* Third semester atkt starts */
        //         for (int i = 0; i < sem3atkt.length; i++) {
        //             if (sem3atkt[i]) {
        //                 if (i < 5) {
        //                     System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
        //                     sem3marks[i] = sc.nextInt();
        //                     if (sem3marks[i] < 0 || sem3marks[i] > 100) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem3marks[i] >= 33) {
        //                         count_sem3atkt--;
        //                         sem3atkt[i] = false;
        //                     }
        //                     if (sem3marks[i] < 33)
        //                         sem3atkt[i] = true;
        //                 } else {
        //                     System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
        //                     sem3marks[i] = sc.nextInt();
        //                     if (sem3marks[i] < 0 || sem3marks[i] > 25) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem3marks[i] >= 13) {
        //                         count_sem3atkt--;
        //                         sem3atkt[i] = false;
        //                     }
        //                     if (sem3marks[i] < 13)
        //                         sem3atkt[i] = true;
        //                 }
        //             }
        //         }
        //         /* Third semester atkt ends */
        //         /* forth semester starts */
        //         System.out.println("Promoted to 4th Semester");
        //         System.out.println("Enter marks of 4rth semester : ");
        //         for (int i = 0; i < sem4subjects.length; i++) {
        //             if (i < 5) {
        //                 System.out.println("Enter " + sem4subjects[i] + " marks : ");
        //                 sem4marks[i] = sc.nextInt();
        //                 if (sem4marks[i] < 0 || sem4marks[i] > 100) {
        //                     System.out.println("--Invalid marks--Please Re-Enter--");
        //                     i--;
        //                     continue;
        //                 }
        //                 if (sem4marks[i] < 33) {
        //                     count_sem4atkt++;
        //                     sem4atkt[i] = true;
        //                 }
        //             } else {
        //                 System.out.println("Enter " + sem4subjects[i] + " marks : ");
        //                 sem4marks[i] = sc.nextInt();
        //                 if (sem4marks[i] < 0 || sem4marks[i] > 25) {
        //                     System.out.println("--Invalid marks--Please Re-Enter--");
        //                     i--;
        //                     continue;
        //                 }
        //                 if (sem4marks[i] < 13) {
        //                     count_sem4atkt++;
        //                     sem4atkt[i] = true;
        //                 }
        //             }
        //         }
        //         System.out.println("You have " + count_sem4atkt + " ATKT in 4th Semester");
        //         System.out.println("Promoted to 5rd Semester");
        //         /* Fourth samester ends */




                
                
                
                
        //         /*fifth sam starts */

        //         /* First semester atkt starts */
        //         for (int i = 0; i < sem1atkt.length; i++) {
        //             if (sem1atkt[i]) {
        //                 if (i < 5) {
        //                     System.out.println("Enter " + sem1subjects[i] + " atkt marks : ");
        //                     sem1marks[i] = sc.nextInt();
        //                     if (sem1marks[i] < 0 || sem1marks[i] > 100) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem1marks[i] >= 33) {
        //                         count_sem1atkt--;
        //                         sem1atkt[i] = false;
        //                     }
        //                     if (sem1marks[i] < 33)
        //                         sem1atkt[i] = true;
        //                 } else {
        //                     System.out.println("Enter " + sem1subjects[i] + " atkt marks : ");
        //                     sem1marks[i] = sc.nextInt();
        //                     if (sem1marks[i] < 0 || sem1marks[i] > 25) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem1marks[i] >= 13) {
        //                         count_sem1atkt--;
        //                         sem1atkt[i] = false;
        //                     }
        //                     if (sem1marks[i] < 13)
        //                         sem1atkt[i] = true;
        //                 }
        //             }
        //         }
        //         /* First semester atkt ends */
        //         /* second semester atkt starts */
        //         for (int i = 0; i < sem2atkt.length; i++) {
        //             if (sem2atkt[i]) {
        //                 if (i < 5) {
        //                     System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
        //                     sem2marks[i] = sc.nextInt();
        //                     if (sem2marks[i] < 0 || sem2marks[i] > 100) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem2marks[i] >= 33) {
        //                         count_sem2atkt--;
        //                         sem2atkt[i] = false;
        //                     }
        //                     if (sem2marks[i] < 33)
        //                         sem2atkt[i] = true;
        //                 } else {
        //                     System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
        //                     sem2marks[i] = sc.nextInt();
        //                     if (sem2marks[i] < 0 || sem2marks[i] > 25) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem2marks[i] >= 13) {
        //                         count_sem2atkt--;
        //                         sem2atkt[i] = false;
        //                     }
        //                     if (sem2marks[i] < 13)
        //                         sem2atkt[i] = true;
        //                 }
        //             }
        //         }
        //         /* second semester atkt ends */

        //         /* Third semester atkt starts */
        //         for (int i = 0; i < sem3atkt.length; i++) {
        //             if (sem3atkt[i]) {
        //                 if (i < 5) {
        //                     System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
        //                     sem3marks[i] = sc.nextInt();
        //                     if (sem3marks[i] < 0 || sem3marks[i] > 100) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem3marks[i] >= 33) {
        //                         count_sem3atkt--;
        //                         sem3atkt[i] = false;
        //                     }
        //                     if (sem3marks[i] < 33)
        //                         sem3atkt[i] = true;
        //                 } else {
        //                     System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
        //                     sem3marks[i] = sc.nextInt();
        //                     if (sem3marks[i] < 0 || sem3marks[i] > 25) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem3marks[i] >= 13) {
        //                         count_sem3atkt--;
        //                         sem3atkt[i] = false;
        //                     }
        //                     if (sem3marks[i] < 13)
        //                         sem3atkt[i] = true;
        //                 }
        //             }
        //         }
        //         /* Third semester atkt ends */


        //         /* fourth semester atkt starts */
        //         for (int i = 0; i < sem3atkt.length; i++) {
        //             if (sem3atkt[i]) {
        //                 if (i < 5) {
        //                     System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
        //                     sem3marks[i] = sc.nextInt();
        //                     if (sem3marks[i] < 0 || sem3marks[i] > 100) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem3marks[i] >= 33) {
        //                         count_sem3atkt--;
        //                         sem3atkt[i] = false;
        //                     }
        //                     if (sem3marks[i] < 33)
        //                         sem3atkt[i] = true;
        //                 } else {
        //                     System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
        //                     sem3marks[i] = sc.nextInt();
        //                     if (sem3marks[i] < 0 || sem3marks[i] > 25) {
        //                         System.out.println("--Invalid marks--Please Re-Enter--");
        //                         i--;
        //                         continue;
        //                     }
        //                     if (sem3marks[i] >= 13) {
        //                         count_sem3atkt--;
        //                         sem3atkt[i] = false;
        //                     }
        //                     if (sem3marks[i] < 13)
        //                         sem3atkt[i] = true;
        //                 }
        //             }
        //         }
        //         /* fourth semester atkt ends */


                
                
                
                
                
                
                
        //         /* Fifth semester starts */
        //         System.out.println("Enter marks of 5th semester : ");
        //         for (int i = 0; i < sem5subjects.length; i++) {
        //             if (i < 5) {
        //                 System.out.println("Enter " + sem5subjects[i] + " marks : ");
        //                 sem5marks[i] = sc.nextInt();
        //                 if (sem5marks[i] < 0 || sem5marks[i] > 100) {
        //                     System.out.println("--Invalid marks--Please Re-Enter--");
        //                     i--;
        //                     continue;
        //                 }
        //                 if (sem5marks[i] < 33) {
        //                     count_sem5atkt++;
        //                     sem5atkt[i] = true;
        //                 }
        //             } else {
        //                 System.out.println("Enter " + sem5subjects[i] + " marks : ");
        //                 sem5marks[i] = sc.nextInt();
        //                 if (sem5marks[i] < 0 || sem5marks[i] > 25) {
        //                     System.out.println("--Invalid marks--Please Re-Enter--");
        //                     i--;
        //                     continue;
        //                 }
        //                 if (sem5marks[i] < 13) {
        //                     count_sem5atkt++;
        //                     sem5atkt[i] = true;
        //                 }
        //             }
        //         }
        //         System.out.println("You have " + count_sem4atkt + " ATKT in 4th Semester");
        //         System.out.println("Promoted to 5rd Semester");
        //         /* Fifth  samester ends */
                
                








            
            
            
            
            
            
            
            
            
           // }

        } while (count_sem1atkt + count_sem2atkt > 4);

        ////////////////////////////////////////////////MARKSHETT PRINTING/////////////////////////////////////////////////////

        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"----------------------------------------------------------------------------------"+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                      DEVI AHILYA VISHWAVIDHYALAYA (DAVV),BHOPAL                  "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"----------------------------------------------------------------------------------"+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                                     GRADE SHEET                                  "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                   BCA 1ST SEMESTER MAIN EXAMINATION, MARCH-APRIL 2023            "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                                                                                  "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"  Institute Name : GOVT. HOLKAR (MODEL, AUTONOMOUS) SCIENCE COLLEGE               "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                                                                                  "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"  ROLL No        : 21311037                            ENROLLMENT.No  : DS21126121"+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"  Name           : MOHIT BASEDIYA                      STATUS : REGULAR           "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"  Father's Name  : PREETAM BASEDIYA                    EXAM   : MARCH-2023        "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"  Subject        : BCA                                                            "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"  Semester       : FIRST                                                          "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                                                                                  "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"----------------------------------------------------------------------------------"+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"  SUBJECT        SUBJECT NAME                   TOTAL   OBTAINED    GRADE         "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"----------------------------------------------------------------------------------"+"\u001B[0m");
        String total, grade;
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            if (i <= 4)
                total = "100";
            else
                total = "25 ";
            if (sem1atkt[i] == true)
                grade = "ATKT";
            else
                grade = "PASS";
            sum = sum + sem1marks[i];

            System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"   " + (i + 1) + "              " + sem1subjects[i] + "                       " + total + "       " + sem1marks[i] + "       " + grade+"          "+"\u001B[0m");
        }
        float percent = sum / 550f * 10;
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                                                                                  "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"----------------------------------------------------------------------------------"+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                  TOTAL                         550       " + sum + "                     "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"----------------------------------------------------------------------------------"+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"  Issue Date : 12/03/2023                               CGPA  :  " + (percent)+"        "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                                                                                  "+"\u001B[0m");
        System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"----------------------------------------------------------------------------------"+"\u001B[0m");
/////////////////////////////////////////////////////////////////MARKSSHEET PRINT ENDSSS////////////////////////////////////////////////////////
    }
}