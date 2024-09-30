// program to print Marksheet
import java.util.Scanner;

public class mark_sheet6 {
gg    public static void main(String args[]) {
        String sem1subjects[] = { "C       ", "C++     ", "DS      ", "JAVA    ", "OS      ", "C_Prac  ", "C++_Prac" };
        String sem2subjects[] = { "C2       ", "C++2     ", "DS2      ", "JAVA2    ", "OS2      ", "C_Prac2  ", "C++_Prac2" };
        String sem3subjects[] = { "DMS   ", "OST   ", "SE    ", "WBA   ", "DBMS  ", "Prac_1", "Prac_2" };
        String sem4subjects[] = { "WD      ", "DS      ", "Linux   ", "OOPs    ", "Elective", "Prac_1  ", "Prac_2  " };
        String sem5subjects[] = { "SE-2     ", "Java     ", "Python   ", "eCommerce", "Elective ", "Prac_1   ", "Prac_2   " };
        String sem6subjects[] = { "AI", "IS", "AD", "Advance Java", "Elective", "Prac_1", "Prac_2" };

        int sem1marks[] = new int[7];
        int sem2marks[] = new int[7];
        int sem3marks[] = new int[7];
        int sem4marks[] = new int[7];
        int sem5marks[] = new int[7];
        int sem6marks[] = new int[7];

        Scanner sc = new Scanner(System.in);
        boolean sem1atkt[] = new boolean[7];
        boolean sem2atkt[] = new boolean[7];
        boolean sem5atkt[] = new boolean[7];
        boolean sem6atkt[] = new boolean[7];
        boolean sem3atkt[] = new boolean[7];
        boolean sem4atkt[] = new boolean[7];
        int count_sem1atkt = 0, count_sem2atkt = 0, count_sem3atkt = 0, count_sem4atkt = 0, count_sem5atkt = 0, count_sem6atkt = 0;
        do {
            /* First semester starts */
            System.out.println("Enter marks of 1st semester : ");
            for (int i = 0; i < sem1subjects.length; i++) {
                if (i < 5) {
                    System.out.println("Enter " + sem1subjects[i] + " marks : ");
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
                    System.out.println("Enter " + sem1subjects[i] + " marks : ");
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

            // /* Second Semester exam starts */
            System.out.println("\nEnter marks of 2nd semester : ");
            for (int i = 0; i < sem2subjects.length; i++) {
                if (i < 5) {
                    System.out.println("Enter " + sem2subjects[i] + " marks : ");
                    sem2marks[i] = sc.nextInt();
                    if (sem2marks[i] < 0 || sem2marks[i] > 100) {
                        System.out.println("--Invalid marks--Please Re-Enter--");
                        i--;
                        continue;
                    }
                    if (sem2marks[i] < 33) {
                        count_sem2atkt++;
                        sem2atkt[i] = true;
                    }
                } else {
                    System.out.println("Enter " + sem2subjects[i] + " marks : ");
                    sem2marks[i] = sc.nextInt();
                    if (sem2marks[i] < 0 || sem2marks[i] > 25) {
                        System.out.println("--Invalid marks--Please Re-Enter--");
                        i--;
                        continue;
                    }
                    if (sem2marks[i] < 13) {
                        count_sem2atkt++;
                        sem2atkt[i] = true;
                    }
                }
            }
            System.out.println("You have " + count_sem2atkt + " ATKT in 2nd Semester");
            /* Second semester exam ends */
            System.out.println("After 2nd semester You have " + count_sem1atkt + " ATKT in 1st Semester");
            if (count_sem1atkt + count_sem2atkt > 4) {
                System.out.println("\n**Year Back**\n");
                continue;
            } else {
                /* Second Year Starts */
                System.out.println("Promoted to 3rd Semester");
                do {
                    /* First sem atkt starts */
                    System.out.println("\n1st Semester ATKT");
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
                    /* Frist sem atkt ends */
                    /* Second sem atkt starts */
                    System.out.println("\n2nd Semester ATKT");
                    for (int i = 0; i < sem2atkt.length; i++) {
                        if (sem2atkt[i]) {
                            if (i < 5) {
                                System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
                                sem2marks[i] = sc.nextInt();
                                if (sem2marks[i] < 0 || sem2marks[i] > 100) {
                                    System.out.println("--Invalid marks--Please Re-Enter--");
                                    i--;
                                    continue;
                                }
                                if (sem2marks[i] >= 33) {
                                    count_sem2atkt--;
                                    sem2atkt[i] = false;
                                }
                                if (sem2marks[i] < 33)
                                    sem2atkt[i] = true;
                            } else {
                                System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
                                sem2marks[i] = sc.nextInt();
                                if (sem2marks[i] < 0 || sem2marks[i] > 25) {
                                    System.out.println("--Invalid marks--Please Re-Enter--");
                                    i--;
                                    continue;
                                }
                                if (sem2marks[i] >= 13) {
                                    count_sem2atkt--;
                                    sem2atkt[i] = false;
                                }
                                if (sem2marks[i] < 13)
                                    sem2atkt[i] = true;
                            }
                        }
                    }
                    /* Second sem atkt ends */
                    /* Third semester exam starts */
                    System.out.println("\nEnter marks of 3rd semester : ");
                    for (int i = 0; i < sem3subjects.length; i++) {
                        if (i < 5) {
                            System.out.println("Enter " + sem3subjects[i] + " marks : ");
                            sem3marks[i] = sc.nextInt();
                            if (sem3marks[i] < 0 || sem3marks[i] > 100) {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if (sem3marks[i] < 33) {
                                count_sem3atkt++;
                                sem3atkt[i] = true;
                            }
                        } else {
                            System.out.println("Enter " + sem3subjects[i] + " marks : ");
                            sem3marks[i] = sc.nextInt();
                            if (sem3marks[i] < 0 || sem3marks[i] > 25) {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if (sem3marks[i] < 13) {
                                count_sem3atkt++;
                                sem3atkt[i] = true;
                            }
                        }
                    }
                    System.out.println("You have " + count_sem1atkt + " -> ATKT in 1st Semester \t" + count_sem2atkt
                            + " -> ATKT in 2nd Semester \t" + count_sem3atkt + " -> in 3rd Semester");
                    /* Third semester exam ends */
                    /* First sem atkt starts */
                    System.out.println("\n1st Semester ATKT");
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
                    /* Frist sem atkt ends */
                    /* Second sem atkt starts */
                    System.out.println("\n2nd Semester ATKT");
                    for (int i = 0; i < sem2atkt.length; i++) {
                        if (sem2atkt[i]) {
                            if (i < 5) {
                                System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
                                sem2marks[i] = sc.nextInt();
                                if (sem2marks[i] < 0 || sem2marks[i] > 100) {
                                    System.out.println("--Invalid marks--Please Re-Enter--");
                                    i--;
                                    continue;
                                }
                                if (sem2marks[i] >= 33) {
                                    count_sem2atkt--;
                                    sem2atkt[i] = false;
                                }
                                if (sem2marks[i] < 33)
                                    sem2atkt[i] = true;
                            } else {
                                System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
                                sem2marks[i] = sc.nextInt();
                                if (sem2marks[i] < 0 || sem2marks[i] > 25) {
                                    System.out.println("--Invalid marks--Please Re-Enter--");
                                    i--;
                                    continue;
                                }
                                if (sem2marks[i] >= 13) {
                                    count_sem2atkt--;
                                    sem2atkt[i] = false;
                                }
                                if (sem2marks[i] < 13)
                                    sem2atkt[i] = true;
                            }
                        }
                    }
                    /* Second sem atkt ends */
                    /* Third sem atkt starts */
                    System.out.println("\n3nd Semester ATKT");
                    for (int i = 0; i < sem3atkt.length; i++) {
                        if (sem3atkt[i]) {
                            if (i < 5) {
                                System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
                                sem3marks[i] = sc.nextInt();
                                if (sem3marks[i] < 0 || sem3marks[i] > 100) {
                                    System.out.println("--Invalid marks--Please Re-Enter--");
                                    i--;
                                    continue;
                                }
                                if (sem3marks[i] >= 33) {
                                    count_sem3atkt--;
                                    sem3atkt[i] = false;
                                }
                                if (sem3marks[i] < 33)
                                    sem3atkt[i] = true;
                            } else {
                                System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
                                sem3marks[i] = sc.nextInt();
                                if (sem3marks[i] < 0 || sem3marks[i] > 25) {
                                    System.out.println("--Invalid marks--Please Re-Enter--");
                                    i--;
                                    continue;
                                }
                                if (sem3marks[i] >= 13) {
                                    count_sem3atkt--;
                                    sem3atkt[i] = false;
                                }
                                if (sem3marks[i] < 13)
                                    sem3atkt[i] = true;
                            }
                        }
                    }
                    /* Third sem atkt ends */
                    /* Fourth semester exam starts */
                    System.out.println("\nEnter marks of 4th semester : ");
                    for (int i = 0; i < sem4subjects.length; i++) {
                        if (i < 5) {
                            System.out.println("Enter " + sem4subjects[i] + " marks : ");
                            sem4marks[i] = sc.nextInt();
                            if (sem4marks[i] < 0 || sem4marks[i] > 100) {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if (sem4marks[i] < 33) {
                                count_sem4atkt++;
                                sem4atkt[i] = true;
                            }
                        } else {
                            System.out.println("Enter " + sem4subjects[i] + " marks : ");
                            sem4marks[i] = sc.nextInt();
                            if (sem4marks[i] < 0 || sem4marks[i] > 25) {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if (sem4marks[i] < 13) {
                                count_sem4atkt++;
                                sem4atkt[i] = true;
                            }
                        }
                    }
                    System.out.println("You have " + count_sem1atkt + " -> ATKT in 1st Semester \t" + count_sem2atkt
                            + " -> ATKT in 2nd Semester \t" + count_sem3atkt + " -> in 3rd Semester \t" + count_sem4atkt
                            + " -> in 4th Semester");
                    /* Fourth semester exam ends */
                    if (count_sem3atkt + count_sem4atkt > 4) {
                        System.out.println("\n**Year Back**\n");
                        continue;
                    } else {
                        /* Third Year Starts */
                        System.out.println("Promoted to 5th Semester");

                        do {
                            /* First semester atkt starts */
                            System.out.println("First Semester ATKT Exam start");
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
                            /* Second semester atkt starts */
                            System.out.println("Second Semester ATKT Exam start");
                            for (int i = 0; i < sem2atkt.length; i++) {
                                if (sem2atkt[i]) {
                                    if (i < 5) {
                                        System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
                                        sem2marks[i] = sc.nextInt();
                                        if (sem2marks[i] < 0 || sem2marks[i] > 100) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem2marks[i] >= 33) {
                                            count_sem2atkt--;
                                            sem2atkt[i] = false;
                                        }
                                        if (sem2marks[i] < 33)
                                            sem2atkt[i] = true;
                                    } else {
                                        System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
                                        sem2marks[i] = sc.nextInt();
                                        if (sem2marks[i] < 0 || sem2marks[i] > 25) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem2marks[i] >= 13) {
                                            count_sem2atkt--;
                                            sem2atkt[i] = false;
                                        }
                                        if (sem2marks[i] < 13)
                                            sem2atkt[i] = true;
                                    }
                                }
                            }
                            /* Second semester atkt ends */
                            /* Third semester atkt starts */
                            System.out.println("Third Semester ATKT Exam start");
                            for (int i = 0; i < sem3atkt.length; i++) {
                                if (sem3atkt[i]) {
                                    if (i < 5) {
                                        System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
                                        sem3marks[i] = sc.nextInt();
                                        if (sem3marks[i] < 0 || sem3marks[i] > 100) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem3marks[i] >= 33) {
                                            count_sem3atkt--;
                                            sem3atkt[i] = false;
                                        }
                                        if (sem3marks[i] < 33)
                                            sem3atkt[i] = true;
                                    } else {
                                        System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
                                        sem3marks[i] = sc.nextInt();
                                        if (sem3marks[i] < 0 || sem3marks[i] > 25) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem3marks[i] >= 13) {
                                            count_sem3atkt--;
                                            sem3atkt[i] = false;
                                        }
                                        if (sem3marks[i] < 13)
                                            sem3atkt[i] = true;
                                    }
                                }
                            }
                            /* Third semester atkt ends */
                            /* Fourth semester atkt Start */
                            System.out.println("Third Semester ATKT Exam start");
                            for (int i = 0; i < sem4atkt.length; i++) {
                                if (sem4atkt[i]) {
                                    if (i < 5) {
                                        System.out.println("Enter " + sem4subjects[i] + " atkt marks : ");
                                        sem4marks[i] = sc.nextInt();
                                        if (sem4marks[i] < 0 || sem4marks[i] > 100) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem4marks[i] >= 33) {
                                            count_sem4atkt--;
                                            sem4atkt[i] = false;
                                        }
                                        if (sem4marks[i] < 33)
                                            sem4atkt[i] = true;
                                    } else {
                                        System.out.println("Enter " + sem4subjects[i] + " atkt marks : ");
                                        sem4marks[i] = sc.nextInt();
                                        if (sem4marks[i] < 0 || sem4marks[i] > 25) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem4marks[i] >= 13) {
                                            count_sem4atkt--;
                                            sem4atkt[i] = false;
                                        }
                                        if (sem4marks[i] < 13)
                                            sem4atkt[i] = true;
                                    }
                                }
                            }
                            /* Fourth semester atkt ends */
                            /* Fifth semester starts */
                            System.out.println("Fifth Semester Exam start");
                            System.out.println("Enter marks of 5th semester : ");
                            for (int i = 0; i < sem5subjects.length; i++) {
                                if (i < 5) {
                                    System.out.println("Enter " + sem5subjects[i] + " marks : ");
                                    sem5marks[i] = sc.nextInt();
                                    if (sem5marks[i] < 0 || sem5marks[i] > 100) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem5marks[i] < 33) {
                                        count_sem5atkt++;
                                        sem5atkt[i] = true;
                                    }
                                } else {
                                    System.out.println("Enter " + sem5subjects[i] + " marks : ");
                                    sem5marks[i] = sc.nextInt();
                                    if (sem5marks[i] < 0 || sem5marks[i] > 25) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem5marks[i] < 13) {
                                        count_sem5atkt++;
                                        sem5atkt[i] = true;
                                    }
                                }
                            }
                            System.out.println("You have " + count_sem5atkt + " ATKT in 5th Semester");
                            System.out.println("After 5th semester You have " + count_sem1atkt + " ATKT in 1st Semester"+ count_sem2atkt + " ATKT in 2nd Semester"+ count_sem3atkt + " ATKT in 3rd Semester"+ count_sem4atkt + " ATKT in 4th Semester");
                            /* Fifth semester ends */
                            /* First semester atkt starts */
                            System.out.println("First Semester ATKT Exam start");
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
                            /* Second semester atkt starts */
                            System.out.println("Second Semester ATKT Exam start");
                            for (int i = 0; i < sem2atkt.length; i++) {
                                if (sem2atkt[i]) {
                                    if (i < 5) {
                                        System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
                                        sem2marks[i] = sc.nextInt();
                                        if (sem2marks[i] < 0 || sem2marks[i] > 100) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem2marks[i] >= 33) {
                                            count_sem2atkt--;
                                            sem2atkt[i] = false;
                                        }
                                        if (sem2marks[i] < 33)
                                            sem2atkt[i] = true;
                                    } else {
                                        System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
                                        sem2marks[i] = sc.nextInt();
                                        if (sem2marks[i] < 0 || sem2marks[i] > 25) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem2marks[i] >= 13) {
                                            count_sem2atkt--;
                                            sem2atkt[i] = false;
                                        }
                                        if (sem2marks[i] < 13)
                                            sem2atkt[i] = true;
                                    }
                                }
                            }
                            /* Second semester atkt ends */
                            /* Third semester atkt starts */
                            System.out.println("Third Semester ATKT Exam start");
                            for (int i = 0; i < sem3atkt.length; i++) {
                                if (sem3atkt[i]) {
                                    if (i < 5) {
                                        System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
                                        sem3marks[i] = sc.nextInt();
                                        if (sem3marks[i] < 0 || sem3marks[i] > 100) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem3marks[i] >= 33) {
                                            count_sem3atkt--;
                                            sem3atkt[i] = false;
                                        }
                                        if (sem3marks[i] < 33)
                                            sem3atkt[i] = true;
                                    } else {
                                        System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
                                        sem3marks[i] = sc.nextInt();
                                        if (sem3marks[i] < 0 || sem3marks[i] > 25) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem3marks[i] >= 13) {
                                            count_sem3atkt--;
                                            sem3atkt[i] = false;
                                        }
                                        if (sem3marks[i] < 13)
                                            sem3atkt[i] = true;
                                    }
                                }
                            }
                            /* Third semester atkt ends */
                            /* Fourth semester atkt Start */
                            System.out.println("Third Semester ATKT Exam start");
                            for (int i = 0; i < sem4atkt.length; i++) {
                                if (sem4atkt[i]) {
                                    if (i < 5) {
                                        System.out.println("Enter " + sem4subjects[i] + " atkt marks : ");
                                        sem4marks[i] = sc.nextInt();
                                        if (sem4marks[i] < 0 || sem4marks[i] > 100) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem4marks[i] >= 33) {
                                            count_sem4atkt--;
                                            sem4atkt[i] = false;
                                        }
                                        if (sem4marks[i] < 33)
                                            sem4atkt[i] = true;
                                    } else {
                                        System.out.println("Enter " + sem4subjects[i] + " atkt marks : ");
                                        sem4marks[i] = sc.nextInt();
                                        if (sem4marks[i] < 0 || sem4marks[i] > 25) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem4marks[i] >= 13) {
                                            count_sem4atkt--;
                                            sem4atkt[i] = false;
                                        }
                                        if (sem4marks[i] < 13)
                                            sem4atkt[i] = true;
                                    }
                                }
                            }
                            /* Fourth semester atkt ends */
                            /* Fifth semester atkt Start */
                            System.out.println("Third Semester ATKT Exam start");
                            for (int i = 0; i < sem5atkt.length; i++) {
                                if (sem5atkt[i]) {
                                    if (i < 5) {
                                        System.out.println("Enter " + sem5subjects[i] + " atkt marks : ");
                                        sem5marks[i] = sc.nextInt();
                                        if (sem5marks[i] < 0 || sem5marks[i] > 100) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem5marks[i] >= 33) {
                                            count_sem5atkt--;
                                            sem5atkt[i] = false;
                                        }
                                        if (sem5marks[i] < 33)
                                            sem5atkt[i] = true;
                                    } else {
                                        System.out.println("Enter " + sem5subjects[i] + " atkt marks : ");
                                        sem5marks[i] = sc.nextInt();
                                        if (sem5marks[i] < 0 || sem4marks[i] > 25) {
                                            System.out.println("--Invalid marks--Please Re-Enter--");
                                            i--;
                                            continue;
                                        }
                                        if (sem5marks[i] >= 13) {
                                            count_sem5atkt--;
                                            sem5atkt[i] = false;
                                        }
                                        if (sem5marks[i] < 13)
                                            sem5atkt[i] = true;
                                    }
                                }
                            }
                            /* Fifth semester atkt ends */
                            /* Sixth Semester exam starts */
                            System.out.println("Sixth Semester  Exam start");
                            System.out.println("\nEnter marks of 2nd semester : ");
                            for (int i = 0; i < sem6subjects.length; i++) {
                                if (i < 5) {
                                    System.out.println("Enter " + sem6subjects[i] + " marks : ");
                                    sem6marks[i] = sc.nextInt();
                                    if (sem6marks[i] < 0 || sem6marks[i] > 100) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem6marks[i] < 33) {
                                        count_sem6atkt++;
                                        sem6atkt[i] = true;
                                    }
                                } else {
                                    System.out.println("Enter " + sem6subjects[i] + " marks : ");
                                    sem6marks[i] = sc.nextInt();
                                    if (sem6marks[i] < 0 || sem6marks[i] > 25) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem6marks[i] < 13) {
                                        count_sem6atkt++;
                                        sem6atkt[i] = true;
                                    }
                                }
                            }
                            System.out.println("You have " + count_sem6atkt + " ATKT in 6th Semester");
                            /* Sixth semester exam ends */
                            System.out.println("After 6th semester You have " + count_sem1atkt + " ATKT in 1st Semester"+ count_sem2atkt + " ATKT in 2nd Semester"+ count_sem3atkt + " ATKT in 3rd Semester"+ count_sem4atkt + " ATKT in 4th Semester"+ count_sem5atkt + " ATKT in 5th Semester");
                            if (count_sem5atkt + count_sem6atkt > 4) {
                                System.out.println("\n**Year Back**\n");
                                continue;
                            } else {
                                System.out.println("Please clear your all ATKT for Degree");
                            }
                        } while ((count_sem5atkt + count_sem6atkt) > 4);
                        /* Third year end */
                        /* Final ATKT exams Start */
                        /* First semester atkt starts */
                        System.out.println("First Semester ATKT Exam start");
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
                        /* Second semester atkt starts */
                        System.out.println("Second Semester ATKT Exam start");
                        for (int i = 0; i < sem2atkt.length; i++) {
                            if (sem2atkt[i]) {
                                if (i < 5) {
                                    System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
                                    sem2marks[i] = sc.nextInt();
                                    if (sem2marks[i] < 0 || sem2marks[i] > 100) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem2marks[i] >= 33) {
                                        count_sem2atkt--;
                                        sem2atkt[i] = false;
                                    }
                                    if (sem2marks[i] < 33)
                                        sem2atkt[i] = true;
                                } else {
                                    System.out.println("Enter " + sem2subjects[i] + " atkt marks : ");
                                    sem2marks[i] = sc.nextInt();
                                    if (sem2marks[i] < 0 || sem2marks[i] > 25) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem2marks[i] >= 13) {
                                        count_sem2atkt--;
                                        sem2atkt[i] = false;
                                    }
                                    if (sem2marks[i] < 13)
                                        sem2atkt[i] = true;
                                }
                            }
                        }
                        /* Second semester atkt ends */
                        /* Third semester atkt starts */
                        System.out.println("Third Semester ATKT Exam start");
                        for (int i = 0; i < sem3atkt.length; i++) {
                            if (sem3atkt[i]) {
                                if (i < 5) {
                                    System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
                                    sem3marks[i] = sc.nextInt();
                                    if (sem3marks[i] < 0 || sem3marks[i] > 100) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem3marks[i] >= 33) {
                                        count_sem3atkt--;
                                        sem3atkt[i] = false;
                                    }
                                    if (sem3marks[i] < 33)
                                        sem3atkt[i] = true;
                                } else {
                                    System.out.println("Enter " + sem3subjects[i] + " atkt marks : ");
                                    sem3marks[i] = sc.nextInt();
                                    if (sem3marks[i] < 0 || sem3marks[i] > 25) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem3marks[i] >= 13) {
                                        count_sem3atkt--;
                                        sem3atkt[i] = false;
                                    }
                                    if (sem3marks[i] < 13)
                                        sem3atkt[i] = true;
                                }
                            }
                        }
                        /* Third semester atkt ends */
                        /* Fourth semester atkt Start */
                        System.out.println("Third Semester ATKT Exam start");
                        for (int i = 0; i < sem4atkt.length; i++) {
                            if (sem4atkt[i]) {
                                if (i < 5) {
                                    System.out.println("Enter " + sem4subjects[i] + " atkt marks : ");
                                    sem4marks[i] = sc.nextInt();
                                    if (sem4marks[i] < 0 || sem4marks[i] > 100) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem4marks[i] >= 33) {
                                        count_sem4atkt--;
                                        sem4atkt[i] = false;
                                    }
                                    if (sem4marks[i] < 33)
                                        sem4atkt[i] = true;
                                } else {
                                    System.out.println("Enter " + sem4subjects[i] + " atkt marks : ");
                                    sem4marks[i] = sc.nextInt();
                                    if (sem4marks[i] < 0 || sem4marks[i] > 25) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem4marks[i] >= 13) {
                                        count_sem4atkt--;
                                        sem4atkt[i] = false;
                                    }
                                    if (sem4marks[i] < 13)
                                        sem4atkt[i] = true;
                                }
                            }
                        }
                        /* Fourth semester atkt ends */
                        /* Fifth semester atkt Start */
                        System.out.println("Third Semester ATKT Exam start");
                        for (int i = 0; i < sem5atkt.length; i++) {
                            if (sem5atkt[i]) {
                                if (i < 5) {
                                    System.out.println("Enter " + sem5subjects[i] + " atkt marks : ");
                                    sem5marks[i] = sc.nextInt();
                                    if (sem5marks[i] < 0 || sem5marks[i] > 100) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem5marks[i] >= 33) {
                                        count_sem5atkt--;
                                        sem5atkt[i] = false;
                                    }
                                    if (sem5marks[i] < 33)
                                        sem5atkt[i] = true;
                                } else {
                                    System.out.println("Enter " + sem5subjects[i] + " atkt marks : ");
                                    sem5marks[i] = sc.nextInt();
                                    if (sem5marks[i] < 0 || sem5marks[i] > 25) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem5marks[i] >= 13) {
                                        count_sem5atkt--;
                                        sem5atkt[i] = false;
                                    }
                                    if (sem5marks[i] < 13)
                                        sem5atkt[i] = true;
                                }
                            }
                        }
                        /* Fifth semester atkt ends */
                        /* Sixth semester atkt Start */
                        System.out.println("Third Semester ATKT Exam start");
                        for (int i = 0; i < sem6atkt.length; i++) {
                            if (sem6atkt[i]) {
                                if (i < 5) {
                                    System.out.println("Enter " + sem6subjects[i] + " atkt marks : ");
                                    sem6marks[i] = sc.nextInt();
                                    if (sem6marks[i] < 0 || sem6marks[i] > 100) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem6marks[i] >= 33) {
                                        count_sem6atkt--;
                                        sem6atkt[i] = false;
                                    }
                                    if (sem6marks[i] < 33)
                                        sem6atkt[i] = true;
                                } else {
                                    System.out.println("Enter " + sem6subjects[i] + " atkt marks : ");
                                    sem6marks[i] = sc.nextInt();
                                    if (sem6marks[i] < 0 || sem6marks[i] > 25) {
                                        System.out.println("--Invalid marks--Please Re-Enter--");
                                        i--;
                                        continue;
                                    }
                                    if (sem6marks[i] >= 13) {
                                        count_sem6atkt--;
                                        sem5atkt[i] = false;
                                    }
                                    if (sem6marks[i] < 13)
                                        sem6atkt[i] = true;
                                }
                        /* Sixth semester atkt Ends */
                        /* Final ATKT exams Ends */
                            }while ((count_sem5atkt + count_sem6atkt) > 4);
                        }
                    }
                } while ((count_sem3atkt + count_sem4atkt) > 4);
            }
        } while ((count_sem1atkt + count_sem2atkt) > 4);
        
        System.out.println("Do You Want Marksheet If Yes Press (y/Y)");
        char another = sc.next().charAt(0);
        do {
            System.out.println("\033[H\033[2J");
            String subject[] = new String [7];
            int marks[] = new int[7];
            System.out.println("Enter Semester Of Result You Want -> ");
            int sem = sc.nextInt();
            switch (sem){
                case 1 : for (int i = 0; i < subject.length; i++){
                    subject[i] = sem1subjects[i];
                    marks[i] = sem1marks[i];
                }break;
                case 2 : for (int i = 0; i < subject.length; i++){
                    subject[i] = sem2subjects[i];
                    marks[i] = sem2marks[i];
                }break;
                case 3 : for (int i = 0; i < subject.length; i++){
                    subject[i] = sem3subjects[i];
                    marks[i] = sem3marks[i];
                }break;
                case 4 : for (int i = 0; i < subject.length; i++){
                    subject[i] = sem4subjects[i];
                    marks[i] = sem4marks[i];
                }break;
                case 5 : for (int i = 0; i < subject.length; i++){
                    subject[i] = sem5subjects[i];
                    marks[i] = sem5marks[i];
                }break;
                case 6 : for (int i = 0; i < subject.length; i++){
                    subject[i] = sem6subjects[i];
                    marks[i] = sem6marks[i];
                }break;
            }
            // /* Result of 1st Semester Starts */
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
    
                System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"   " + (i + 1) + "              " + subject[i] + "                       " + total + "       " + marks[i] + "       " + grade +"          "+"\u001B[0m");
            }
            float percent = sum / 550f * 10;
            System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                                                                                  "+"\u001B[0m");
            System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"----------------------------------------------------------------------------------"+"\u001B[0m");
            System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                  TOTAL                         550       " + sum + "                     "+"\u001B[0m");
            System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"----------------------------------------------------------------------------------"+"\u001B[0m");
            System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"  Issue Date : 12/03/2023                               CGPA  :  " + (percent)+"        "+"\u001B[0m");
            System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"                                                                                  "+"\u001B[0m");
            System.out.println("\t\t\t\u001B[30m"+"\u001B[47m"+"----------------------------------------------------------------------------------"+"\u001B[0m");
            /* Result of 1st Semester Ends */
            System.out.println("Do You Want Another Marksheet If Yes Press (y/Y)");
            another = sc.next().charAt(0);
        }while(another == 'y' || another == 'Y');
        System.out.println("Do You Want Your Degree If Yes (y/Y) -> ");
        char degree = sc.next().charAt(0);

    }
}