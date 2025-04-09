class Result {
    public static void countApplesAndOranges(int houseStart, int houseEnd, int appleTree, int orangeTree,
            List<Integer> apples, List<Integer> oranges) {
                int orangesLanded = 0;
                int applesLanded = 0;

            for(int apple : apples) {
                int a = apple + appleTree;
                if(a >= houseStart && a <= houseEnd) applesLanded++;
        
            }

            for(int orange : oranges) {
                int o = orange + orangeTree;
                if(o >= houseStart && o <= houseEnd) orangesLanded++;
            }

            System.out.println(applesLanded);
            System.out.println(orangesLanded);
    }
}