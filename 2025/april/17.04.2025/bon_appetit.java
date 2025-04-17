import java.util.List;

class Result {
    // k = essen welches anna nicht gegessen hatte
    // b = annas beigetragener teil der rechnung
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalAmount = 0;

        for(int i = 0; i < bill.size(); i++) {
            if(i == k) continue; // skip item das anna nicht gegessen hatte
            totalAmount += bill.get(i);
        }

        int splitInHalf = totalAmount / 2;

        if(splitInHalf == b) {
            System.out.println("Bon Appetit");
        } else {
            int overcharge = b - splitInHalf;
            System.out.println(overcharge);
        }
    }
}