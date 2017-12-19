/****************************************************************************
 * A program to calculate the semester's weighted average(SWA) as well as****
 *the cumulative weighted average(CWA) of the previous SWA that were entered*
 * Inputs taken for this program are scores(marks) and credit hours only*****
 ****************************************************************************/

import java.util.Scanner;


public class courseAverage 
{

    
    public static void main(String[] args) 
    {
        //Declaration of global variables
        int counter, s, n;          
        float sumCredit =   0, sumScore =   0;
       
        Scanner input = new Scanner(System.in);     
        
            //taking the number of semesters user wants to calculate
            System.out.print("Enter number of semester: "); 
              s = input.nextInt();  
            
            
            //looping the number of semester to be calculated
            for(int i=1 ; i<=s ; i++)
            {   
                //accepting the number of subjects a user offered for a particular semester 
                System.out.print("Enter number of subjects for semester "+i+": "); 
                n = input.nextInt(); 
                
                //Declaration of lacal variables
                float score[] =  new float[n],
                      credit[] = new float[n],
                      pdt[] = new float[n];
                float tempCredit = 0, tempScore = 0;
            
                //looping the number of subjects per semester
                for(counter=0;counter<n;counter++)
                {
                
                    do //taking both score and credit from user and checking if they meet
                       //requirement
                    {
                        System.out.println("--- Please enter a score<= 100 and credit <= 4 ---");
                        System.out.println("Score\tCredit");
                        score[counter]= input.nextFloat();
                        credit[counter]= input.nextInt();
                
                    }while(score[counter]>100 || credit[counter]>4 );
                    
                
                    //storing scores and its corresponding for each subject credit in separate arrays
                    //storing the sum of the cumulative credit and sum of the product of score and credit
                    pdt[counter]= score[counter]*credit[counter];
                    tempCredit += credit[counter];  sumCredit += tempCredit;
                    tempScore += pdt[counter];    sumScore += tempScore;
                }
                
                // displaying the header for the tabulated results of the average indicating
                // the particular semester under operation
                System.out.println("*********\tSEMESTER "+i+"\t*********");
                System.out.println("SCORES\t\t"
                               +"CREDIT\t\t"
                               +"CUMLATIVE");
                
                //looping to display the contents of arrays to which values were 
                //both stored and calculated in a table form
                for(counter=0;n>counter;counter++)
                {
                    System.out.println(score[counter]
                                    +"\t|\t"+credit[counter]
                                    +"\t|\t"+pdt[counter]+"\t  |");
                }
            
                //displays the total of the various columns with the SWA
                System.out.println("------------------------------------------- ");
                System.out.println("Total\t|\t"+tempCredit+"\t|\t"+tempScore+"\t  |");
                System.out.println("------------------------------------------- ");
                float swa = tempScore/tempCredit;
                System.out.println("Your average(SWA) is "+swa);
                System.out.print("Class: ");averageTable(swa);
                System.out.println(" ");    
            }
            
                //dispalays the CWA 
                float Avg = averageCalc(sumScore,sumCredit);
                System.out.println("Your average(CWA) is "+Avg);
                System.out.print("Class: ");averageTable(Avg);
            
        
    }
    
    //a function/method that compares the averages to a standard grade table
    //and display the class level of the user
    public static void averageTable(float score)
        {
            float x=score;
            if(x>=70 && x<=100)
                System.out.println("FIRST");
            else if(x>=60 && x<70)
                System.out.println("SECOND UPPER");
            else if(x>=50 && x<60)
                System.out.println("SECOND LOWER");
            else if(x>=40 && x<50)
                System.out.println("PASS");
            else
                System.out.println("POOR");
        }
    
    
    //a function that calculate the average of the users
    public static float averageCalc(float m,float n)
    {
        float average = m/n;
        return average;
    }
}



/*
  Addae Mensah Anthony 
  7767412
  Computer Engineering 3
  2:10 Tuesday, 10th February,2015
*/
