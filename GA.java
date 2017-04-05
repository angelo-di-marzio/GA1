import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Enumeration;

import java.util.Hashtable;


public class GA {


    static Hashtable ht = new Hashtable();
    static {
        ht.put("0000", "0");
        ht.put("0001", "1");
        ht.put("0010", "2");
        ht.put("0011", "3");
        ht.put("0100", "4");
        ht.put("0101", "5");
        ht.put("0110", "6");
        ht.put("0111", "7");
        ht.put("1000", "8");
        ht.put("1001", "9");
        ht.put("1010", "+");
        ht.put("1011", "-");
        ht.put("1100", "*");
        ht.put("1101", "/");
    }
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        System.out.println("Enter max length of gene : ");
        int n = reader.nextInt();

        Individual.setDefaultGeneLength(n);

        System.out.println("Enter population size : ");
        int popnum = reader.nextInt();

        System.out.println("Enter Solution");
        int sol = reader.nextInt();

        FitnessCalc.setSolution(sol);

        // Create an initial population
        Population myPop = new Population(popnum, true);

        // Evolve our population until we reach an optimum solution
        int generationCount = 0;
       // myPop.getIndividual(0).getFitness();
        while (myPop.getFittest().getFitness() < FitnessCalc.getMaxFitness() || FitnessCalc.soluceFloat!=FitnessCalc.getSolution() ) {
            generationCount++;

            System.out.println("Generation: " + generationCount);

            myPop = Algorithm.evolvePopulation(myPop);
            System.out.println("= "+FitnessCalc.soluceFloat);
            System.out.println("fitness "+FitnessCalc.fitness);

        }

        System.out.println("Solution found!");

        System.out.println("Generation: " + generationCount);
        System.out.println("Genes:     " + myPop.getFittest() );
        System.out.println("fitness max:     " + FitnessCalc.getMaxFitness() );
        System.out.println("calcul : "+FitnessCalc.result);
        System.out.println("= "+FitnessCalc.soluceFloat);






    }
}