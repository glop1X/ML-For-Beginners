public class Lasagna {
    int expectedMinutes = 40;
    int timeForOneLayer = 2;
    public int expectedMinutesInOven(){
        return expectedMinutes;
    }
    public int remainingMinutesInOven(int Minutes){
        return expectedMinutesInOven() - Minutes;
    }
     public int preparationTimeInMinutes(int numOfLayers){
         return numOfLayers * timeForOneLayer;
     }
    public int totalTimeInMinutes(int numOfLayers, int Minutes){
        return preparationTimeInMinutes(numOfLayers) + Minutes;
    }
}
