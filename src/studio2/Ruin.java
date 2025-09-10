public class Ruin {

    public static void main(String[] args) {

        int startAmount = 2;
        double winChance = .5;
        int winLimit = 4;
        int totalSimmulation;
        int play = 0;
        double expectedRuinRate = winChance;
        int Ruin = 0;
           int play2 = 0;


        double x = Math.random()*10;
        System.out.println(x);
    for (int day = 1; day <= 3; day++) {
        while (winLimit>startAmount && startAmount > 0) {
            play++;
            play2++;
            if (x>5) {
                startAmount++;
                System.out.println("You have: $" + startAmount);
            } else if (x<5){
                startAmount--;
                System.out.println("You have: $" + startAmount);
                Ruin++;
            } else {
                System.out.println("Tie! You have: $" + startAmount);
            }
        
    }
    

    if (startAmount == 0) {
            System.out.println("Ruin. You have: $" + startAmount);
            
        } if (winLimit<=startAmount) {
            System.out.println("Success. You have: $" + startAmount);
        }

    System.out.println("You have a win chance of: " + winChance);

    System.out.println("You have played " + play + " times today");
        double ruinRate = (Ruin/ play2);
    System.out.println("Your ruin rate chance is: " + ruinRate);

    totalSimmulation = day;
    System.out.println("These are your results for day " + totalSimmulation);

    //reinitialization
     startAmount = 2;
     winChance = .5;
     winLimit = 4;
     play = 0;


    


    }
    

    }
}


