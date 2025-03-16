import java.util.ArrayList;

class Solution {

    /**
     * 
     * if operation is an int x => record a new score of x
     * if operation is '+' => new score that is the sum of the prev. two scores
     * if operation is 'D' => new score that is double the prev. score
     * if operation is 'C' => invalid last score / remove it 
     * 
     */

    public int calPoints(String[] operations) {
        ArrayList<Integer> history = new ArrayList<>(); // stores the point additions etc.
        int points = 0;

        for(String operation : operations) {
            if(isInt(operation)) {
                int pts = Integer.parseInt(operation);
                points += pts;
                history.add(pts);
                } else if (operation.equals("+")) {
                int n = history.size();
                int lastScore = history.getLast();
                int secondLastScore = history.get(n-2);
                points += lastScore + secondLastScore;
                history.add(lastScore + secondLastScore);
                System.out.println("new points: " + points);
            } else if (operation.equals("D")) {
                int lastScore = history.getLast();
                points += lastScore * 2;
                history.add(lastScore * 2);
            } else if (operation.equals("C")) {
                int n = history.size();
                int lastScore = history.getLast();
                points -= lastScore;
                history.remove(n-1);

            }
        }
        
        return points;
    }

    public boolean isInt(String op) {
        try {
            Integer.parseInt(op);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}