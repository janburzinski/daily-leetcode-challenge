class Result {
    public static String kangaroo(int kangaroo1Start, int meters1PerJump, int kangaroo2Start, int meters2PerJump) {
        boolean canMeet = meters2PerJump < meters1PerJump
                && ((kangaroo2Start - kangaroo1Start) % (meters1PerJump - meters2PerJump) == 0);
        return canMeet ? "YES" : "NO";
    }
}