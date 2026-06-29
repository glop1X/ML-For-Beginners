public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int Minutes){
        return expectedMinutesInOven() - Minutes;
    }
     public int preparationTimeInMinutes(int numOfLayers){
         return numOfLayers * 2;
     }
    public int totalTimeInMinutes(int numOfLayers, int Minutes){
        return preparationTimeInMinutes(numOfLayers) + Minutes;
    }
}
