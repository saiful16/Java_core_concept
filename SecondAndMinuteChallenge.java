public class SecondAndMinuteChallenge {
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Time";
        }
        int minutes = seconds / 60;
        int hours = minutes/60;
        int remainigMinutes = minutes % 60;
        int remainigSeconds = seconds % 60;
        return hours+" h " + remainigMinutes + "m "+ remainigSeconds +" s";
    }

    public static String getDurationString(int minutes, int seconds){
        if((minutes <0)) {
            return "Invalid Minutes";
        }
        if (seconds < 0 ) {
            return "Invalid Seconds ";
        }
        seconds = minutes * 60 + seconds;
        return getDurationString(seconds);
        }

        public static void main(String[] args) {
            System.out.println(getDurationString(65, 45));
            System.out.println(getDurationString(3600));
            System.out.println(getDurationString(0, 0));
            System.out.println(getDurationString(0, 59));
            System.out.println(getDurationString(0, 3600));
            System.out.println(getDurationString(-30));
            System.out.println(getDurationString(-40, 30))
            ;
        }
}
