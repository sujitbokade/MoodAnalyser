public class MoodAnalyser {
    String analyseMood (String string){
        if(string.toLowerCase().contains("sad"))
            return "SAD";
        else if (string.toLowerCase().contains("happy"))
            return "HAPPY";
        return string;
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String happyMood = moodAnalyser.analyseMood("I am in Happy Mood");
        System.out.println("My Mood is: "+happyMood);
        String sadMood = moodAnalyser.analyseMood("I am in Sad Mood");
        System.out.println("My Mood is: "+sadMood);
    }
}
