public class Lasagna {
    int remainingMinutes;
    int minutes;
    int neededTime;
    int totalTime;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        minutes = 40;
        return minutes;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int Minutes){
        remainingMinutes = 40 - Minutes;
        return remainingMinutes;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
     public int preparationTimeInMinutes(int numOfLayers){
         neededTime = numOfLayers * 2;
         return neededTime;
     }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numOfLayers, int Minutes){
        totalTime = (numOfLayers * 2) + Minutes;
        return totalTime;
    }
}
