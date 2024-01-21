public class LabTwo {
    public char question1(double score1, double score2, double score3) {
        // Based on three scores that the user inputs, display the average of the scores
        // and the letter grade that is assigned fort he test score average. The grading
        // scheme is as follows:
        // 90 - 100 A
        // 80 - 89 B
        // 70 - 79 C
        // 60 - 69 D
        // <60 F
        double average = (score1+score2+score3)/3; 
        if (average < 60.0){
            return 'F';
        }
        else if (average >=60.0 && average < 70.0){
            return 'D';
        }
        else if (average >=70.0 && average < 80.0){
            return 'C';
        }
        else if (average >=80.0 && average < 90.0){
            return 'B';
        }
        else {
            return 'A';
        }
    }

    public boolean question2(boolean isMorning, boolean isMom, boolean isAsleep) {
        // Implement the following logic: Your cell phone rings. Return true if you
        // should answer it. Normally you answer, except in the morning you only answer
        // if it is your mom calling. In all cases, if you are asleep, you do not
        // answer.
        if (isAsleep) {
            return false;
        }
        else if (isMorning) {
            if (isMom) {
                return true;
            }
            else {
                return false; 
            }
        }
        else {
            return true; 
        }
        // Hello? Text please!
                      // you do need to change the return line though
    }

    public String question3(int dayNum) {
        // Given a day number (1-7), return the day of the week ("Sunday", "Monday",
        // etc.). If an invalid day number is provided, return "Invalid".

        // Examples:

        // dayOfWeek(1) -> "Sunday"
        // dayOfWeek(4) -> "Wednesday"
        if (dayNum ==1){
            return "Sunday";
        }
        else if (dayNum ==2){
            return "Monday";
        }
        else if (dayNum ==3){
            return "Tuesday";
        }
        else if (dayNum ==4){
            return "Wednesday";
        }
        else if (dayNum ==5){
            return "Thursday";
        }
        else if (dayNum ==6){
            return "Friday";
        }
        else if (dayNum ==7){
            return "Saturday";
        }
        else {
            return "Invalid";
        }
        // you need to change this line
    }

    public int question4(int tea, int candy) {
        // Write a function in Java that implements the following logic: We are having a
        // party with amounts of tea and candy. Return the int outcome of the party
        // encoded as 0 = bad, 1 = good, or 2 = great. A party is good (1) if both tea
        // and candy are at least 5. However, if either tea or candy is at least double
        // the amount of the other one, the party is great (2). However, in all cases,
        // if either tea or candy is less than 5, the party is always bad (0).
        if (tea >= 5 && candy >= 5) {
            if (tea >= 2*candy || candy >= 2*tea) {
                return 2; 
            }
            return 1;
        }
        else{
            return 0;
        }
         // you need to change this line
    }

    public boolean question5(int a, int b, int c, boolean bOk) {
        // Write a function in Java that implements the following logic: Given three
        // ints, a, b, and c, return true if b is greater than a, and c is greater than
        // b. However, with the exception that if bOk is true, b does not need to be
        // greater than a.

        // Note 'bOk' is the name of an formal parameter.
        if (bOk) {
            if (c>b){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (c>b && b>a) {
                return true;
            }
            else {
                return false; 
            }
        }
        // you need to change this line
    }

    public boolean question6(int n, boolean outsideMode) {
        // Write a function in Java that implements the following logic: Given a number
        // n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is
        // true, in which case return true if the number is less or equal to 1, or
        // greater or equal to 10.
        if (outsideMode) {
            if (n<=1 || n>=10) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (n>=1 && n<=10) {
                return true; 
            }
            else {
                return false; 
            }
        }
         // you will need to change this line
    }

    public boolean question7(int date, int month, int year) {
        // A magic date is one when written in the following format, the month times the
        // date equals the year e.g. 6/10/60. Write code that figures out if a user
        // entered date is a magic date. The dates must be between 1 - 31, inclusive and
        // the months between 1 - 12, inclusive. Let the user know whether they entered
        // a magic date. If the input parameters are not valid, return false.

        // Examples:

        // magicDate(6, 10, 60) -> true
        // magicDate(50, 12, 600) -> false
        if (date >=1 && date <=31 && month >=1 && month <= 12) {
            if (date*month == year) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
        // you will need to change this line
    }
}