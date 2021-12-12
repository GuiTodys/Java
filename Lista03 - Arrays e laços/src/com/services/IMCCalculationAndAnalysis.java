package com.services;

public class IMCCalculationAndAnalysis {
    public static float[] calculateIMC(float[] height, float[] weight){
        float[] IMCs = new float[height.length];

        for (int i=0;i<height.length;i++){
            IMCs[i] = weight[i]/(height[i]*height[i]);
        }

        return IMCs;
    }

    public static void evaluateIMCValues(String[] names,float[] IMCs){

        for(int i=0;i<IMCs.length;i++){
            if(IMCs[i]>25||IMCs[i]<18.5){
                System.out.printf("%s is out of the IMC's optimal range (18.5<IMC<25). IMC value is: %.2f\n",names[i],IMCs[i]);
            }
        }
    }
}
