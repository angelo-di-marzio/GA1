import java.util.ArrayList;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class FitnessCalc {

    static int solution;
    static String result;
    static Float soluceFloat;
    static float fitness;


    public static int getSolution() {
        return solution;
    }


    static void setSolution(int newSolution) {

        FitnessCalc.solution=newSolution;

    }


    // Calculate inidividuals fittness by comparing it to our candidate solution
    static float getFitness(Individual individual) {
        fitness = 0;
        result = "";

        String[] indivCopy = individual.toString().split("(?<=\\G....)");
        ArrayList indivCopyTrad = new ArrayList();
        ArrayList indivCopyTradOP = new ArrayList();

        int cpt=0;
        // si ca correspond a la hashmap on crée un tableau avec la valeur correspondante
        for (int i = 0; i < indivCopy.length; i++) {

            if (indivCopy[i].equals("1010") || indivCopy[i].equals("1011") || indivCopy[i].equals("1100") || indivCopy[i].equals("1101")) {
                indivCopyTrad.add(GA.ht.get(indivCopy[i]).toString());

            }
            if (indivCopy[i] != null && indivCopy[i].equals("0000") || indivCopy[i].equals("0001") || indivCopy[i].equals("0010") || indivCopy[i].equals("0011") || indivCopy[i].equals("0100") || indivCopy[i].equals("0101") || indivCopy[i].equals("0110") || indivCopy[i].equals("0111") || indivCopy[i].equals("1000") || indivCopy[i].equals("1001")) {
                indivCopyTrad.add(GA.ht.get(indivCopy[i]).toString());  // a vérifier


            }

        }



//        for(int i = 0; i < indivCopyTrad.size(); i++)
//        {
//            System.out.println("donnée à l'indice " + i + " = " + indivCopyTrad.get(i));
//        }
        // on calcule a partir du tableau traduis

        // 1er élément
        if (indivCopyTrad.get(0) != "/" && indivCopyTrad.get(0)!= "*" && indivCopyTrad.get(0)!= "+" && indivCopyTrad.get(0)!= "-" ) {
            result = result + indivCopyTrad.get(0);
        }


        // le reste
        for (int i = 1; i < indivCopyTrad.size(); i++) {
            if (indivCopyTrad.get(i) != null || indivCopyTrad.get(i) != indivCopyTrad.get(i-1)) {
                switch (indivCopyTrad.get(i).toString()){

                    case "0" :if(indivCopyTrad.get(i-1) == "*" || indivCopyTrad.get(i-1) =="+" || indivCopyTrad.get(i-1) == "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "1" : if(indivCopyTrad.get(i-1) == "/" || indivCopyTrad.get(i-1) == "*" || indivCopyTrad.get(i-1) =="+" || indivCopyTrad.get(i-1) == "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "2" : if(indivCopyTrad.get(i-1) == "/" || indivCopyTrad.get(i-1) == "*" || indivCopyTrad.get(i-1) =="+" || indivCopyTrad.get(i-1) == "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "3" : if(indivCopyTrad.get(i-1) == "/" || indivCopyTrad.get(i-1) == "*" || indivCopyTrad.get(i-1) =="+" || indivCopyTrad.get(i-1) == "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "4" : if(indivCopyTrad.get(i-1) == "/" || indivCopyTrad.get(i-1) == "*" || indivCopyTrad.get(i-1) =="+" || indivCopyTrad.get(i-1) == "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "5"  :if(indivCopyTrad.get(i-1) == "/" || indivCopyTrad.get(i-1) == "*" || indivCopyTrad.get(i-1) =="+" || indivCopyTrad.get(i-1) == "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "6" : if(indivCopyTrad.get(i-1) == "/" || indivCopyTrad.get(i-1) == "*" || indivCopyTrad.get(i-1) =="+" || indivCopyTrad.get(i-1) == "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "7" :if(indivCopyTrad.get(i-1) == "/" || indivCopyTrad.get(i-1) == "*" || indivCopyTrad.get(i-1) =="+" || indivCopyTrad.get(i-1) == "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "8" : if(indivCopyTrad.get(i-1) == "/" || indivCopyTrad.get(i-1) == "*" || indivCopyTrad.get(i-1) =="+" || indivCopyTrad.get(i-1) == "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "9" : if(indivCopyTrad.get(i-1) == "/" || indivCopyTrad.get(i-1) == "*" || indivCopyTrad.get(i-1) =="+" || indivCopyTrad.get(i-1) == "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "/": if(indivCopyTrad.get(i-1) != "/" && indivCopyTrad.get(i-1) != "*" && indivCopyTrad.get(i-1) !="+" && indivCopyTrad.get(i-1) != "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "*":if(indivCopyTrad.get(i-1) != "/" && indivCopyTrad.get(i-1) != "*" && indivCopyTrad.get(i-1) !="+" && indivCopyTrad.get(i-1) != "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "+": if(indivCopyTrad.get(i-1) != "/" && indivCopyTrad.get(i-1) != "*" && indivCopyTrad.get(i-1) !="+" && indivCopyTrad.get(i-1) != "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;
                    case "-": if(indivCopyTrad.get(i-1) != "/" && indivCopyTrad.get(i-1) != "*" && indivCopyTrad.get(i-1) !="+" && indivCopyTrad.get(i-1) != "-" ) {
                        result = result + indivCopyTrad.get(i).toString();
                    }
                        break;

                }

            }

        }
        //System.out.println(result);
        while (Character.toString(result.charAt(result.length()-1)).equals("/") || Character.toString(result.charAt(result.length()-1)).equals("*") || Character.toString(result.charAt(result.length()-1)).equals("+") || Character.toString(result.charAt(result.length()-1)).equals("-")) {
            result=result.substring(0,result.length()-1);
        }



            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");


            //System.out.println("result:" + result);
            Object soluce = null;
            try {
                soluce = engine.eval(result);
            } catch (ScriptException e) {

                return 0.0f;
            }

            try {
                soluceFloat = Float.valueOf(soluce.toString());
            } catch (NumberFormatException e) {

                return 0.0f;
            }
            //System.out.println(soluceFloat);

            if (soluceFloat > FitnessCalc.getSolution()) {
                soluceFloat = soluceFloat * -1;

            }
            fitness = soluceFloat / FitnessCalc.getSolution();

           // System.out.println("fitness :" + fitness);
        // System.out.println("bla");
            return fitness;

    }

    // Get optimum fitness
    static float getMaxFitness() {
        float maxFitness = 1.0f;
        return maxFitness;
    }
}