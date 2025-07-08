import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        double[] sgpas = new double[8];
        double total = 0.0;

        System.out.println("Enter Student Name:");
        String name = input.nextLine();

        // sgpa inputs
        for ( int i = 0; i < 8; i++)
        {
            System.out.println("Enter SGPA for Semester" + (i + 1) + " (0.0 to 10.0) : ");
            sgpas[i] = input.nextDouble();

            //validate input
            while (sgpas[i] < 0.0 || sgpas[i]>10.0){
                System.out.println("Invalid SGPA, Enter again for semester" + (i + 1) + ":");
                sgpas[i] = input.nextDouble();
        }
            total += sgpas[i];
        }
        // cgpa calculations
        double cgpa = total/8;
        String classification;

        //Determining teh classification
        if (cgpa >= 9.0){
            classification = "Distinction";
        } else if (cgpa >= 8.0) {
            classification = "First Class";
        }else if (cgpa >= 6.0 ){
            classification = "Second Class";
        }else if (cgpa >= 5.0){
            classification = "Pass Class";
        }else{
            classification =  "Fail";
        }

        //result
        System.out.println("\n----- Engineering CGPA Report -----");
        System.out.println("Student: "+ name);
        System.out.printf("CGPA: %.2f\n", cgpa);
        System.out.println("Classification: " + classification);

        input.close();
    }
}
