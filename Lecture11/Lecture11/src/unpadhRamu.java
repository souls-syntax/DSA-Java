public class unpadhRamu {
    public static void main(String[] args) {

    }

    public static int min_sum(int[] rickshaw, int[] cabs, int c1, int c2, int c3) {
        int cost_rickshaw = 0;
        for (int i = 0; i < rickshaw.length; i++) {
            cost_rickshaw += Math.min(rickshaw[i] * c1, c2);
        }
        cost_rickshaw = Math.min(cost_rickshaw, c3);
        int cost_cab = 0;
        for (int i = 0; i < cabs.length; i++) {
            cost_cab += Math.min(cabs[i]*c1,c2);
        }
        cost_cab = Math.min(cost_cab,c3);
        return Math.min(cost_cab,cost_rickshaw);
    }
}
