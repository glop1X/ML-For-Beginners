public class Lasagna {

    int remainingMinutes;
    int minutes;
    int neededTime;
    int totalTime;
    public int expectedMinutesInOven(){
        minutes = 40;
        return minutes;
    }
    public int remainingMinutesInOven(int Minutes){
        remainingMinutes = 40 - Minutes;
        return remainingMinutes;
    }
     public int preparationTimeInMinutes(int numOfLayers){
         neededTime = numOfLayers * 2;
         return neededTime;
     }
    public int totalTimeInMinutes(int numOfLayers, int Minutes){
        totalTime = (numOfLayers * 2) + Minutes;
        return totalTime;
    }
}
