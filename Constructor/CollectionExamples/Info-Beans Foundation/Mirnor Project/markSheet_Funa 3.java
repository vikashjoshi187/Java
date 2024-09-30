// program to print markSheet For BCA degree in 6 SEM
import java.util.Scanner;
class markSheet_Funa {
	Scanner sc = new Scanner(System.in);
	/* atkt exams */
	static int reExam(String subjects[], boolean atkt[], int marks[], int count_atkt) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < atkt.length; i++) {
			if (atkt[i]) {
				if (i < 5) {
					System.out.println("Enter " + subjects[i] + " atkt marks : ");
					marks[i] = sc.nextInt();
					if (marks[i] < 0 || marks[i] > 100) {
						System.out.println("--Invalid marks--Please Re-Enter--");
						i--;
						continue;
					}
					if (marks[i] >= 33) {
						count_atkt--;
						atkt[i] = false;
					}
					if (marks[i] < 33)
						atkt[i] = true;
				} else {
					System.out.println("Enter " + subjects[i] + " atkt marks : ");
					marks[i] = sc.nextInt();
					if (marks[i] < 0 || marks[i] > 25) {
						System.out.println("--Invalid marks--Please Re-Enter--");
						i--;
						continue;
					}
					if (marks[i] >= 13) {
						count_atkt--;
						atkt[i] = false;
					}
					if (marks[i] < 13)
						atkt[i] = true;
				}
			}
		}
		return count_atkt;
	}
	/* Semester Exams */
	static int mainExam(String subjects[], boolean atkt[], int marks[], int count_atkt) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < subjects.length; i++) {
			if (i < 5) {// 1
				System.out.println("Enter " + subjects[i] + " marks : ");
				marks[i] = sc.nextInt();//101
				if (marks[i] < 0 || marks[i] > 100) {
					System.out.println("--Invalid marks--Please Re-Enter--");
					i--;// 0
					continue;
				}
				if (marks[i] < 33) {
					count_atkt++;
					atkt[i] = true;
				}
			} else {
				System.out.println("Enter " + subjects[i] + " marks : ");
				marks[i] = sc.nextInt();
				if (marks[i] < 0 || marks[i] > 25) {
					System.out.println("--Invalid marks--Please Re-Enter--");
					i--;
					continue;
				}
				if (marks[i] < 13) {
					count_atkt++;
					atkt[i] = true;
				}
			}
		}
		return count_atkt;
	}
	static void markSheet(String[] subjects, int[] marks, boolean[] atkt, int sem) {
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		float sgpa = sum / 550f * 10;
		float cgpa = (sum * 10) / (sem * 550);
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "                                                                                            " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |----------------------------------------------------------------------------------|  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |                                                                                  |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |                      MAKHANLAL CHATURVWEDI UNIVERSITY (BHOPAL)                   |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |                                                                                  |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |----------------------------------------------------------------------------------|  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |                                                                                  |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |                                     GRADE SHEET                                  |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |                                                                                  |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |                         BCA MAIN EXAMINATION, MARCH-APRIL 2023                   |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |                                                                                  |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |  Institute Name : SARDAR PATEL INTITUTE OF TEHNOLOGY COLLEGE                     |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |                                                                                  |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |  ROLL No        : 8245436                             ENROLLMENT.No  :DS21126121 |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |  Name           : VIKAS JOSHI                         STATUS : REGULAR           |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |  Father's Name  : MANOJ JOSHI                         EXAM   : DECEMBER-2023     |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |  Degree         : BCA                                                            |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |                                                                                  |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |----------------------------------------------------------------------------------|  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |  SUBJECT        SUBJECT NAME                   TOTAL   OBTAINED    GRADE         |  " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "  |----------------------------------------------------------------------------------|  " + "\u001B[0m");
		String total, grade;
		for (int i = 0; i < 7; i++) {
			if (i <= 4)
				total = "100";
			else
				total = "25 ";
			if (atkt[i] == true)
				grade = "ATKT";
			else
				grade = "PASS";
			System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |   " + (i + 1) + "              " + subjects[i] + "                       " + total + "       " + marks[i] + "       " + grade +
							   "          |    " + "\u001B[0m");
		}
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |                                                                                  |    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |----------------------------------------------------------------------------------|    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |                  TOTAL                         550       " + sum + "                     |    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |----------------------------------------------------------------------------------|    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |  Issue Date : 12/03/2023           SGPA  :  " + String.format("%.2f", sgpa) + "          CGPA  :  " + String.format("%.2f",cgpa) + "          |    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |                                                                                  |    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |                                                                                  |    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |                                                                                  |    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |                                                                                  |    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |      Prepared By                  Ckecked By                    Registrar        |    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |  Mr. Kamal Singh            Prof. Aashish Gupta              Ms.Albert Einstein  |    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "    |----------------------------------------------------------------------------------|    " + "\u001B[0m");
		System.out.println("\t\t\t\u001B[30m" + "\u001B[46m" + "                                                                                            " + "\u001B[0m");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		markSheet_Funa obj = new markSheet_Funa();

		String sem1subjects[] = { "IT      ", "DE      ", "BM      ", "EC      ", "C Lang  ", "Prac_1  ", "Prac_2  " };
		String sem2subjects[] = { "OS      ", "OB      ", "Adv C   ", "AM      ", "C lab   ", "Prac_1  ", "Prac_2  " };
		String sem3subjects[] = { "DMS     ", "OST     ", "SE      ", "WBA     ", "DBMS    ", "Prac_1  ", "Prac_2  " };
		String sem4subjects[] = { "WD      ", "DS      ", "Linux   ", "OOPs    ", "Elective", "Prac_1  ", "Prac_2  " };
		String sem5subjects[] = { "SE-2    ", "Java    ", "Python  ", "E-Comm  ", "Elective", "Prac_1  ", "Prac_2  " };
		String sem6subjects[] = { "AI      ", "IS      ", "AD      ", "Adv Java", "Elective", "Prac_1  ", "Prac_2  " };

		int sem1marks[] = new int[7];
		int sem2marks[] = new int[7];
		int sem3marks[] = new int[7];
		int sem4marks[] = new int[7];
		int sem5marks[] = new int[7];
		int sem6marks[] = new int[7];

		int count_sem1atkt = 0, count_sem2atkt = 0, count_sem3atkt = 0, count_sem4atkt = 0, count_sem5atkt = 0, count_sem6atkt = 0;
		do {
			boolean sem1atkt[] = new boolean[7];
			boolean sem2atkt[] = new boolean[7];
			count_sem1atkt = 0;
			count_sem2atkt = 0;
			/* First semester starts */
			System.out.println("\nFirst Semester Exam start");
			System.out.println("\nEnter marks of 1st semester : ");
			count_sem1atkt = mainExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
			System.out.println("\nAfter 1st Semester You have -> \n" + count_sem1atkt + " ATKT in 1st Semester");
			/* First semester ends */
			/* First semester atkt starts */
			if (count_sem1atkt > 0) {
				System.out.println("\nEnter marks of 1st ATKT semester : ");
				count_sem1atkt = reExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
			}
			/* First semester atkt ends */
			/* Second Semester exam starts */
			System.out.println("\nSecond Semester Exam start");
			System.out.println("\nEnter marks of 2nd semester : ");
			count_sem2atkt = mainExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt);
			System.out.println("After 2nd semester You have -> \n" + count_sem1atkt + " -> ATKT in 1st Semester\n" + count_sem2atkt + " -> ATKT in 2nd Semester");
			/* Second semester exam ends */
			if (count_sem1atkt + count_sem2atkt > 4) {
				System.out.println("\n***Year Back***\n");
				continue;
			} else {
				/* First sem atkt starts */
				if (count_sem1atkt > 0) {
					System.out.println("\nEnter marks of 1st ATKT semester : ");
					count_sem1atkt = reExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
				}
				/* First sem atkt ends */
				/* Second sem atkt starts */
				if (count_sem2atkt > 0) {
					System.out.println("\nEnter marks of 2nd ATKT semester : ");
					count_sem2atkt = reExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt);
				}
				/* Second sem atkt ends */
				/* Second Year Starts */
				System.out.println("\nPromoted to 3rd Semester");
				do {
					boolean sem3atkt[] = new boolean[7];
					boolean sem4atkt[] = new boolean[7];
					count_sem3atkt = 0;
					count_sem4atkt = 0;
					for (int i = 0; i < 7; i++) {
						sem3atkt[i] = false;
						sem4atkt[i] = false;
					}
					count_sem3atkt = 0;
					count_sem4atkt = 0;
					/* Third semester exam starts */
					System.out.println("\nThird Semester Exam start");
					System.out.println("\nEnter marks of 3rd semester : ");
					count_sem3atkt = mainExam(sem3subjects, sem3atkt, sem3marks, count_sem3atkt);
					System.out.println("\nAfter 3rd Semester You have -> \n" + count_sem1atkt + " -> ATKT in 1st Semester\n" + count_sem2atkt + " -> ATKT in 2nd Semester\n" + count_sem3atkt + " -> in 3rd Semester");
					/* Third semester exam ends */
					/* First sem atkt starts */
					if (count_sem1atkt > 0) {
						System.out.println("\nEnter marks of 1st ATKT semester : ");
						count_sem1atkt = reExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
					}
					/* Frist sem atkt ends */
					/* Second sem atkt starts */
					if (count_sem2atkt > 0) {
						System.out.println("\nEnter marks of 2nd ATKT semester : ");
						count_sem2atkt = reExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt);
					}
					/* Second sem atkt ends */
					/* Third sem atkt starts */
					if (count_sem3atkt > 0) {
						System.out.println("\nEnter marks of 3rd ATKT semester : ");
						count_sem3atkt = reExam(sem3subjects, sem3atkt, sem3marks, count_sem3atkt);
					}
					/* Third sem atkt ends */
					/* Fourth semester exam starts */
					System.out.println("\nFourth Semester Exam start");
					System.out.println("\nEnter marks of 4th semester : ");
					count_sem4atkt = mainExam(sem4subjects, sem4atkt, sem4marks, count_sem4atkt);
					System.out.println("\nAfter 4th Semester You have -> \n" + count_sem1atkt + " -> ATKT in 1st Semester\n" + count_sem2atkt + " -> ATKT in 2nd Semester\n" + count_sem3atkt + " -> in 3rd Semester\n" +
					count_sem4atkt + " -> in 4th Semester");
					/* Fourth semester exam ends */
					if (count_sem3atkt + count_sem4atkt > 4) {
						System.out.println("\n***Year Back***\n");
						continue;
					} else {
						/* First semester atkt starts */
						if (count_sem1atkt > 0) {
							System.out.println("\nEnter marks of 1st ATKT semester : ");
							count_sem1atkt = reExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
						}
						/* First semester atkt ends */
						/* Second semester atkt starts */
						if (count_sem2atkt > 0) {
							System.out.println("\nEnter marks of 2nd ATKT semester : ");
							count_sem2atkt = reExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt);
						}
						/* Second semester atkt ends */
						/* Third semester atkt starts */
						if (count_sem3atkt > 0) {
							System.out.println("\nEnter marks of 3rd ATKT semester : ");
							count_sem3atkt = reExam(sem3subjects, sem3atkt, sem3marks, count_sem3atkt);
						}
						/* Third semester atkt ends */
						/* Fourth semester atkt Start */
						if (count_sem4atkt > 0) {
							System.out.println("\nEnter marks of 4th ATKT semester : ");
							count_sem4atkt = reExam(sem4subjects, sem4atkt, sem4marks, count_sem4atkt);
						}
						/* Fourth semester atkt ends */
						/* Third Year Starts */
						System.out.println("\nPromoted to 5th Semester");
						do {
							boolean sem5atkt[] = new boolean[7];
                            boolean sem6atkt[] = new boolean[7];
							count_sem5atkt = 0;
							count_sem6atkt = 0;
							/* Fifth semester starts */
							System.out.println("\nFifth Semester Exam start");
							System.out.println("Enter marks of 5th semester : ");
							count_sem5atkt = mainExam(sem5subjects, sem5atkt, sem5marks, count_sem5atkt);
							System.out.println("After 5th semester You have -> \n" + count_sem1atkt + " ATKT in 1st Semester\n" + count_sem2atkt + " ATKT in 2nd Semester\n" + count_sem3atkt + " ATKT in 3rd Semester\n" +
							count_sem4atkt + " ATKT in 4th Semester\n" + count_sem5atkt + " ATKT in 5th Semester");
							/* Fifth semester ends */
							/* First semester atkt starts */
							if (count_sem1atkt > 0) {
								System.out.println("\nEnter marks of 1st ATKT semester : ");
								count_sem1atkt = reExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
							}
							/* First semester atkt ends */
							/* Second semester atkt starts */
							if (count_sem2atkt > 0) {
								System.out.println("\nEnter marks of 2nd ATKT semester : ");
								count_sem2atkt = reExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt);
							}
							/* Second semester atkt ends */
							/* Third semester atkt starts */
							if (count_sem3atkt > 0) {
								System.out.println("\nEnter marks of 3rd ATKT semester : ");
								count_sem3atkt = reExam(sem3subjects, sem3atkt, sem3marks, count_sem3atkt);
							}
							/* Third semester atkt ends */
							/* Fourth semester atkt Start */
							if (count_sem4atkt > 0) {
								System.out.println("\nEnter marks of 4th ATKT semester : ");
								count_sem4atkt = reExam(sem4subjects, sem4atkt, sem4marks, count_sem4atkt);
							}
							/* Fourth semester atkt ends */
							/* Fifth semester atkt Start */
							if (count_sem5atkt > 0) {
								System.out.println("\nEnter marks of 5th ATKT semester : ");
								count_sem5atkt = reExam(sem5subjects, sem5atkt, sem5marks, count_sem5atkt);
							}
							/* Fifth semester atkt ends */
							/* Sixth Semester exam starts */
							System.out.println("\nSixth Semester Exam start");
							System.out.println("\nEnter marks of 6th semester : ");
							count_sem6atkt = mainExam(sem6subjects, sem6atkt, sem6marks, count_sem6atkt);
							System.out.println("After 6th semester You have ->\n " + count_sem1atkt + " ATKT in 1st Semester\n" + count_sem2atkt + " ATKT in 2nd Semester\n" + count_sem3atkt + " ATKT in 3rd Semester\n" +
							count_sem4atkt + " ATKT in 4th Semester\n" + count_sem5atkt + " ATKT in 5th Semester\n" + count_sem6atkt + " ATKT in 6th Semester");
							/* Sixth semester exam ends */
							if (count_sem5atkt + count_sem6atkt > 4) {
								System.out.println("\n***Year Back***\n");
								continue;
							} else {
								System.out.println("\nPlease clear your all ATKT for Degree");
								/* Third year end */
								/* Final ATKT exams Start */
								/* First semester atkt starts */
								if (count_sem1atkt > 0) {
									System.out.println("\nEnter marks of 1st ATKT semester : ");
									count_sem1atkt = reExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
								}
								/* First semester atkt ends */
								/* Second semester atkt starts */
								if (count_sem2atkt > 0) {
									System.out.println("\nEnter marks of 2nd ATKT semester : ");
									count_sem2atkt = reExam(sem2subjects, sem2atkt, sem2marks, count_sem2atkt);
								}
								/* Second semester atkt ends */
								/* Third semester atkt starts */
								if (count_sem3atkt > 0) {
									System.out.println("\nEnter marks of 3rd ATKT semester : ");
									count_sem3atkt = reExam(sem3subjects, sem3atkt, sem3marks, count_sem3atkt);
								}
								/* Third semester atkt ends */
								/* Fourth semester atkt Start */
								if (count_sem4atkt > 0) {
									System.out.println("\nEnter marks of 4th ATKT semester : ");
									count_sem4atkt = reExam(sem4subjects, sem4atkt, sem4marks, count_sem4atkt);
								}
								/* Fourth semester atkt ends */
								/* Fifth semester atkt Start */
								if (count_sem5atkt > 0) {
									System.out.println("\nEnter marks of 5th ATKT semester : ");
									count_sem5atkt = reExam(sem5subjects, sem5atkt, sem5marks, count_sem5atkt);
								}
								/* Fifth semester atkt ends */
								/* Sixth semester atkt Start */
								if (count_sem6atkt > 0) {
									System.out.println("\nEnter marks of 6th ATKT semester : ");
									count_sem6atkt = reExam(sem6subjects, sem6atkt, sem6marks, count_sem6atkt);
								}
								/* Sixth semester atkt Ends */
								/* Final ATKT exams Ends */
								System.out.println("\nDo You Want markSheet If Yes Press (y/Y)");
								char another = sc.next().charAt(0);
								do {
									System.out.println("\033[H\033[2J");
									int sem = 0;
									do {
										System.out.println("\nEnter Semester Of Result You Want ");
										sem = sc.nextInt();
										if (sem <= 0 || sem > 6) {
											System.out.println("\u001B[31m" + "--Invalid Semester Entered--\n Please Re-Enter Semester " + "\u001B[0m");
										}
									} while (sem <= 0 || sem > 6);
									// /* Result of 1st Semester Starts */
									if (sem == 1)
									markSheet(sem1subjects, sem1marks, sem1atkt, sem);
									else if (sem == 2)
									markSheet(sem2subjects, sem2marks, sem2atkt, sem);
									else if (sem == 3)
									markSheet(sem3subjects, sem3marks, sem3atkt, sem);
									else if (sem == 4)
									markSheet(sem4subjects, sem4marks, sem4atkt, sem);
									else if (sem == 5)
									markSheet(sem5subjects, sem5marks, sem5atkt, sem);
									else
									markSheet(sem6subjects, sem6marks, sem6atkt, sem);
									/* Result of 1st Semester Ends */
									System.out.println("Do You Want Another markSheet If Yes Press (y/Y)");
									another = sc.next().charAt(0);
								} while (another == 'y' || another == 'Y');
								if ((count_sem1atkt + count_sem2atkt + count_sem3atkt + count_sem4atkt + count_sem5atkt + count_sem6atkt) == 0) {
									System.out.println("Do You Want Your Degree If Yes (y/Y) -> ");
									char degree = sc.next().charAt(0);
									if (degree == 'y' || degree == 'Y') {
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"                                                                                          "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"                                                                                          "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |----------------------------------------------------------------------------------|   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                      MAKHANLAL CHATURVWEDI UNIVERSITY (BHOPAL)                   |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                   MADHYA PRADESH                                 |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |----------------------------------------------------------------------------------|   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                        an recomendation of Academic Council                      |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                has conferrred unpon                              |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");                
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                   THE ONE YEAR                                   |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                              UNDER GRADUATE DIPLOMA                              |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                  Mr.VIKAS JOSHI                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                   the degree of                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                      B C A                                       |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |            (Under Graduate Diploma in Bachlor of Computer Application)           |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |         having passed the examination of 2024 under distance learning mode       |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                in First division with all its rights and privileges              |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                in witness whereof the University is hereunto affixed             |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                        Given on this 28th day of December 2024                   |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |----------------------------------------------------------------------------------|   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |       Dr. Suresh Dhyani      Prof. (Dr.) Balvinder Shukla       Atul Chauhan     |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |            Registrar               Vice Chancellor               Chancellor      |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |----------------------------------------------------------------------------------|   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
										System.out.println("\t\t\t\u001B[34m"+"\u001B[42m"+"   |                                                                                  |   "+"\u001B[0m");
									} else
										System.out.println("Thank You For Coming In Our College & Being Student Of Our College.");
								} else
									System.out.println("You Are Not Eligible For Your Degree.");
							}
						} while ((count_sem5atkt + count_sem6atkt) > 4);
					}
				} while ((count_sem3atkt + count_sem4atkt) > 4);
			}
		} while ((count_sem1atkt + count_sem2atkt) > 4);
		sc.close();
	}
}