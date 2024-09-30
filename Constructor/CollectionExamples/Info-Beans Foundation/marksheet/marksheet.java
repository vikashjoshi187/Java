// program to print Marksheet
import java.util.Scanner;
class Marksheet
{
    public static void main(String args[])
    {
        String sem1subjects[] = {"C","C++","DS","JAVA","OS","C_Prac","C++_Prac"};
        String sem2subjects[] = {"C2","C++2","DS2","JAVA2","OS2","C_Prac2","C++_Prac2"};
        String sem3subjects[] = {"DMS","OST","SE","WBA","DBMS","Prac_1","Prac_2"};
        String sem4subjects[] = {"WD","DS","Linux","OOPs","Elective","Prac_1","Prac_2"};
        String sem5subjects[] = {"SE-2","Java","Python","eCommerce","Elective","Prac_1","Prac_2"};
        String sem6subjects[] = {"AI","IS","AD","Advance Java","Elective","Prac_1","Prac_2"};

        int sem1marks[]=new int[7];
        int sem2marks[]=new int[7];
        int sem3marks[]=new int[7];
        int sem4marks[]=new int[7];
        int sem5marks[]=new int[7];
        int sem6marks[]=new int[7];

        int count_sem1atkt,count_sem2atkt,count_sem3atkt,count_sem4atkt;
        Scanner sc = new Scanner(System.in);
        boolean sem1atkt[] = new boolean[7];
        do
        {
            boolean sem2atkt[] = new boolean[7];
            count_sem1atkt=0;
            count_sem2atkt=0;
        /* First semester starts */    
            System.out.println("Enter marks of 1st semester : ");
            for(int i=0;i<sem1subjects.length;i++)
            {
                if(i<5)
                {
                    System.out.println("Enter "+sem1subjects[i]+" marks : ");
                    sem1marks[i] = sc.nextInt();
                    if(sem1marks[i]<0 || sem1marks[i]>100)
                    {
                        System.out.println("--Invalid marks--Please Re-Enter--");
                        i--;
                        continue;
                    }
                    if(sem1marks[i]<33)
                    {
                        count_sem1atkt++;
                        sem1atkt[i]=true;
                    }
                }
                else
                {
                    System.out.println("Enter "+sem1subjects[i]+" marks : ");
                    sem1marks[i] = sc.nextInt();
                    if(sem1marks[i]<0 || sem1marks[i]>25)
                    {
                        System.out.println("--Invalid marks--Please Re-Enter--");
                        i--;
                        continue;
                    }
                    if(sem1marks[i]<13)
                    {
                        count_sem1atkt++;
                        sem1atkt[i]=true;
                    }
                }
            }
            System.out.println("You have "+count_sem1atkt+" ATKT in 1st Semester");
        /* First semester ends */    
        /* First semester atkt starts */
            for(int i=0;i<sem1atkt.length;i++)
            {
                if(sem1atkt[i])
                {
                    if(i<5)
                    {
                        System.out.println("Enter "+sem1subjects[i]+" atkt marks : ");
                        sem1marks[i] = sc.nextInt();
                        if(sem1marks[i]<0 || sem1marks[i]>100)
                        {
                            System.out.println("--Invalid marks--Please Re-Enter--");
                            i--;
                            continue;
                        }
                        if(sem1marks[i]>=33)
                        {
                            count_sem1atkt--;
                            sem1atkt[i]=false;
                        }
                        if(sem1marks[i]<33)
                            sem1atkt[i]=true;
                    }
                    else
                    {
                        System.out.println("Enter "+sem1subjects[i]+" atkt marks : ");
                        sem1marks[i] = sc.nextInt();
                        if(sem1marks[i]<0 || sem1marks[i]>25)
                        {
                            System.out.println("--Invalid marks--Please Re-Enter--");
                            i--;
                            continue;
                        }
                        if(sem1marks[i]>=13)
                        {
                            count_sem1atkt--;
                            sem1atkt[i]=false;
                        }
                        if(sem1marks[i]<13)
                            sem1atkt[i]=true;
                    }
                }    
            }
        /* First semester atkt ends*/

        // /* Second Semester exam starts */
        //     System.out.println("\nEnter marks of 2nd semester : ");
        //     for(int i=0;i<sem2subjects.length;i++)
        //     {
        //         if(i<5)
        //         {
        //             System.out.println("Enter "+sem2subjects[i]+" marks : ");
        //             sem2marks[i] = sc.nextInt();
        //             if(sem2marks[i]<0 || sem2marks[i]>100)
        //             {
        //                 System.out.println("--Invalid marks--Please Re-Enter--");
        //                 i--;
        //                 continue;
        //             }
        //             if(sem2marks[i]<33)
        //             {
        //                 count_sem2atkt++;
        //                 sem2atkt[i]=true;
        //             }
        //         }
        //         else
        //         {
        //             System.out.println("Enter "+sem2subjects[i]+" marks : ");
        //             sem2marks[i] = sc.nextInt();
        //             if(sem2marks[i]<0 || sem2marks[i]>25)
        //             {
        //                 System.out.println("--Invalid marks--Please Re-Enter--");
        //                 i--;
        //                 continue;
        //             }
        //             if(sem2marks[i]<13)
        //             {
        //                 count_sem2atkt++;
        //                 sem2atkt[i]=true;
        //             }
        //         }
        //     }
        //     System.out.println("You have "+count_sem2atkt+" ATKT in 2nd Semester");
        // /* Second semester exam ends */
        // System.out.println("After 2nd semester You have "+count_sem1atkt+" ATKT in 1st Semester");
        if(count_sem1atkt+count_sem2atkt >4)
        {
            System.out.println("\n**Year Back**\n");
            continue;
        }
        else{
            /* Second Year Starts */
            System.out.println("Promoted to 3rd Semester");
            do {
                boolean sem3atkt[] = new boolean[7];
                boolean sem4atkt[] = new boolean[7];
                count_sem3atkt=0;
                count_sem4atkt=0;
                /* First sem atkt starts */
                System.out.println("\n1st Semester ATKT");
                for(int i=0;i<sem1atkt.length;i++)
                {
                    if(sem1atkt[i])
                    {
                        if(i<5)
                        {
                            System.out.println("Enter "+sem1subjects[i]+" atkt marks : ");
                            sem1marks[i] = sc.nextInt();
                            if(sem1marks[i]<0 || sem1marks[i]>100)
                            {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if(sem1marks[i]>=33)
                            {
                                count_sem1atkt--;
                                sem1atkt[i]=false;
                            }
                            if(sem1marks[i]<33)
                                sem1atkt[i]=true;
                        }
                        else
                        {
                            System.out.println("Enter "+sem1subjects[i]+" atkt marks : ");
                            sem1marks[i] = sc.nextInt();
                            if(sem1marks[i]<0 || sem1marks[i]>25)
                            {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if(sem1marks[i]>=13)
                            {
                                count_sem1atkt--;
                                sem1atkt[i]=false;
                            }
                            if(sem1marks[i]<13)
                                sem1atkt[i]=true;
                        }
                    }    
                }
                /* Frist sem atkt ends */
                /* Second sem atkt starts */
                System.out.println("\n2nd Semester ATKT");
                for(int i=0;i<sem2atkt.length;i++)
                {
                    if(sem2atkt[i])
                    {
                        if(i<5)
                        {
                            System.out.println("Enter "+sem2subjects[i]+" atkt marks : ");
                            sem2marks[i] = sc.nextInt();
                            if(sem2marks[i]<0 || sem2marks[i]>100)
                            {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if(sem2marks[i]>=33)
                            {
                                count_sem2atkt--;
                                sem2atkt[i]=false;
                            }
                            if(sem2marks[i]<33)
                                sem2atkt[i]=true;
                        }
                        else
                        {
                            System.out.println("Enter "+sem2subjects[i]+" atkt marks : ");
                            sem2marks[i] = sc.nextInt();
                            if(sem2marks[i]<0 || sem2marks[i]>25)
                            {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if(sem2marks[i]>=13)
                            {
                                count_sem2atkt--;
                                sem2atkt[i]=false;
                            }
                            if(sem2marks[i]<13)
                                sem2atkt[i]=true;
                        }
                    }    
                }
                /* Second sem atkt ends */
                /* Third semester exam starts */
                System.out.println("\nEnter marks of 3rd semester : ");
                for(int i=0;i<sem3subjects.length;i++)
                {
                    if(i<5)
                    {
                        System.out.println("Enter "+sem3subjects[i]+" marks : ");
                        sem3marks[i] = sc.nextInt();
                        if(sem3marks[i]<0 || sem3marks[i]>100)
                        {
                            System.out.println("--Invalid marks--Please Re-Enter--");
                            i--;
                            continue;
                        }
                        if(sem3marks[i]<33)
                        {
                            count_sem3atkt++;
                            sem3atkt[i]=true;
                        }
                    }
                    else
                    {
                        System.out.println("Enter "+sem3subjects[i]+" marks : ");
                        sem3marks[i] = sc.nextInt();
                        if(sem3marks[i]<0 || sem3marks[i]>25)
                        {
                            System.out.println("--Invalid marks--Please Re-Enter--");
                            i--;
                            continue;
                        }
                        if(sem3marks[i]<13)
                        {
                            count_sem3atkt++;
                            sem3atkt[i]=true;
                        }
                    }
                }
                System.out.println("You have "+count_sem1atkt+" -> ATKT in 1st Semester \t"+count_sem2atkt+" -> ATKT in 2nd Semester \t"+count_sem3atkt+" -> in 3rd Semester");
                /* Third semester exam ends */
                /* First sem atkt starts */
                System.out.println("\n1st Semester ATKT");
                for(int i=0;i<sem1atkt.length;i++)
                {
                    if(sem1atkt[i])
                    {
                        if(i<5)
                        {
                            System.out.println("Enter "+sem1subjects[i]+" atkt marks : ");
                            sem1marks[i] = sc.nextInt();
                            if(sem1marks[i]<0 || sem1marks[i]>100)
                            {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if(sem1marks[i]>=33)
                            {
                                count_sem1atkt--;
                                sem1atkt[i]=false;
                            }
                            if(sem1marks[i]<33)
                                sem1atkt[i]=true;
                        }
                        else
                        {
                            System.out.println("Enter "+sem1subjects[i]+" atkt marks : ");
                            sem1marks[i] = sc.nextInt();
                            if(sem1marks[i]<0 || sem1marks[i]>25)
                            {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if(sem1marks[i]>=13)
                            {
                                count_sem1atkt--;
                                sem1atkt[i]=false;
                            }
                            if(sem1marks[i]<13)
                                sem1atkt[i]=true;
                        }
                    }    
                }
                /* Frist sem atkt ends */
                /* Second sem atkt starts */
                System.out.println("\n2nd Semester ATKT");
                for(int i=0;i<sem2atkt.length;i++)
                {
                    if(sem2atkt[i])
                    {
                        if(i<5)
                        {
                            System.out.println("Enter "+sem2subjects[i]+" atkt marks : ");
                            sem2marks[i] = sc.nextInt();
                            if(sem2marks[i]<0 || sem2marks[i]>100)
                            {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if(sem2marks[i]>=33)
                            {
                                count_sem2atkt--;
                                sem2atkt[i]=false;
                            }
                            if(sem2marks[i]<33)
                                sem2atkt[i]=true;
                        }
                        else
                        {
                            System.out.println("Enter "+sem2subjects[i]+" atkt marks : ");
                            sem2marks[i] = sc.nextInt();
                            if(sem2marks[i]<0 || sem2marks[i]>25)
                            {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if(sem2marks[i]>=13)
                            {
                                count_sem2atkt--;
                                sem2atkt[i]=false;
                            }
                            if(sem2marks[i]<13)
                                sem2atkt[i]=true;
                        }
                    }    
                }
                /* Second sem atkt ends */
                /* Third sem atkt starts */
                System.out.println("\n3nd Semester ATKT");
                for(int i=0;i<sem3atkt.length;i++)
                {
                    if(sem3atkt[i])
                    {
                        if(i<5)
                        {
                            System.out.println("Enter "+sem3subjects[i]+" atkt marks : ");
                            sem3marks[i] = sc.nextInt();
                            if(sem3marks[i]<0 || sem3marks[i]>100)
                            {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if(sem3marks[i]>=33)
                            {
                                count_sem3atkt--;
                                sem3atkt[i]=false;
                            }
                            if(sem3marks[i]<33)
                                sem3atkt[i]=true;
                        }
                        else
                        {
                            System.out.println("Enter "+sem3subjects[i]+" atkt marks : ");
                            sem3marks[i] = sc.nextInt();
                            if(sem3marks[i]<0 || sem3marks[i]>25)
                            {
                                System.out.println("--Invalid marks--Please Re-Enter--");
                                i--;
                                continue;
                            }
                            if(sem3marks[i]>=13)
                            {
                                count_sem3atkt--;
                                sem3atkt[i]=false;
                            }
                            if(sem3marks[i]<13)
                                sem3atkt[i]=true;
                        }
                    }    
                }
                /* Third sem atkt ends */
                /* Fourth semester exam starts */
                System.out.println("\nEnter marks of 4th semester : ");
                for(int i=0;i<sem4subjects.length;i++)
                {
                    if(i<5)
                    {
                        System.out.println("Enter "+sem4subjects[i]+" marks : ");
                        sem4marks[i] = sc.nextInt();
                        if(sem4marks[i]<0 || sem4marks[i]>100)
                        {
                            System.out.println("--Invalid marks--Please Re-Enter--");
                            i--;
                            continue;
                        }
                        if(sem4marks[i]<33)
                        {
                            count_sem4atkt++;
                            sem4atkt[i]=true;
                        }
                    }
                    else
                    {
                        System.out.println("Enter "+sem4subjects[i]+" marks : ");
                        sem4marks[i] = sc.nextInt();
                        if(sem4marks[i]<0 || sem4marks[i]>25)
                        {
                            System.out.println("--Invalid marks--Please Re-Enter--");
                            i--;
                            continue;
                        }
                        if(sem4marks[i]<13)
                        {
                            count_sem4atkt++;
                            sem4atkt[i]=true;
                        }
                    }
                }
                System.out.println("You have "+count_sem1atkt+" -> ATKT in 1st Semester \t"+count_sem2atkt+" -> ATKT in 2nd Semester \t"+count_sem3atkt+" -> in 3rd Semester \t"+count_sem4atkt+" -> in 4th Semester");
                /* Fourth semester exam ends */

            }while ((count_sem3atkt+count_sem4atkt)>4);
        }

        }while((count_sem1atkt+count_sem2atkt)>4);


        System.out.println("\n\n----------------------------------------------------------------------------------");
    System.out.println("               MAKHANLAL UNIVERSITY,BHOPAL                    ");   
    System.out.println("----------------------------------------------------------------------------------\n");
    System.out.println("                                      RESULT                                      \n");   

    System.out.println("  ROLL No        : 47564352                                   SR.No  : 824      \n");
    System.out.println("  Name           : Vikas Joshi");
    System.out.println("  Father's Name  : Manoj Joshi                        STATUS : REGULAR    ");
    System.out.println("  Institute Name : Sardar Patel Institue of Technology ,Mandleshwar");
    System.out.println("  Subject        : BCA                                        EXAM   : JUNE-2024  ");
    System.out.println("  Semester       : FIRST \n");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.println("  SUBJECT              SUBJECT NAME                        MARKS                  ");
    System.out.println("   CODE                                                 TOTAL   OBTAINED    GRADE  ");
    System.out.println("----------------------------------------------------------------------------------\n");
    String total,grade;
    int sum=0;
    for(int i=0;i<7;i++){
        if(i<=4)
         total="100";
         else
         total="25 ";
         if(sem1atkt[i]==true)
         grade="ATKT";
         else
         grade="PASS";
        sum=sum+sem1marks[i];

    System.out.println("   "+(i+1)+"           "+sem1subjects[i]+"                                 "+total+"       "+sem1marks[i]+"       "+grade);
    }
    float percent=sum/550f*10;

    System.out.println("\n----------------------------------------------------------------------------------");
    System.out.println("                         TOTAL                          550       "+sum+"           ");
    System.out.println("----------------------------------------------------------------------------------");
    System.out.printf("  Issue Date : 12/03/2023                               CGPA  :  %.2f",percent);
    System.out.println("\n----------------------------------------------------------------------------------\n\n\n");
    System.out.println("Prepared By       Checked By        Signature of Principle      Mr.Kamlesh C.joshi  ");
    System.out.println("                                    and seal of Institution  Collector of examination  ");
    System.out.println("                                                             Collector of examination  ");

    System.out.println("\n----------------------------------------------------------------------------------");
    /* Result of 1 Semester starts */

    }
}