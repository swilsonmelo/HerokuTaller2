package edu.escuelaing.arep.calculator;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import edu.escuelaing.arep.utilities.LinkedList;

public class Statistics {

/**
     * Method that calculates LinkedList's mean
     * @param lkl LinkedList with the data
     * @return Mean value of the linkedList
     */
    public static Double mean(LinkedList<Double> lkl) {
        Double sum = 0.0;
        Iterator<Double> iterator = lkl.iterator();
        Double data;
        while (iterator.hasNext()) {
            data = iterator.next();
            sum += data;
        }
        //System.out.println(sum);
        //System.out.println(lkl.size());
        Double res = (sum / lkl.size());
        return res;
    }

    /**
     * Method that calculates LinkedList's standard deviation
     * @param lkl LinkedList with the data
     * @return Standard deviation value of the linkedList
     */
    public static Double standardDeviation(LinkedList<Double> lkl){
        Double mean = mean(lkl);
        Double sum = 0.0;
        Iterator<Double> iterator = lkl.iterator();
        Double val;
        while( iterator.hasNext() ) {
             val = iterator.next() - mean;
             sum += val*val;
        }        
        //System.out.println(sum);
        sum /= lkl.size()-1;
        //System.out.println(sum);
        Double res = Math.sqrt(sum);
        return res;
    }

    public static String calculate(String nums){
        //System.out.println("nums "+ nums);
        LinkedList<Double> lkl = new LinkedList<Double>();
        List<String> doubles = Arrays.asList(nums.split(","));        
        NumberFormat formatter = new DecimalFormat("#0.00"); 
        for (String str : doubles) {
            Double newNum = Double.parseDouble(str);
            lkl.add(newNum);
        }

        Double mean = mean(lkl);
        Double std = standardDeviation(lkl);        
        String meanRes = formatter.format(mean); 
        String stdRes = formatter.format(std); 
        System.out.println(meanRes + " " + stdRes );
        String json = "{\"mean\":"+meanRes+",\"std\":"+stdRes+"}";
        System.out.println(json);
        return json;
    }

}