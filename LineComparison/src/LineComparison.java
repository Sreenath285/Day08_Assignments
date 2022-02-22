public class LineComparison {

    private final String lineName;
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public LineComparison(String lineName, int x1, int y1, int x2, int y2) {
        this.lineName = lineName;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int lineLength () {
        int result_1 = (int) Math.pow((x2-x1), 2);
        int result_2 = (int) Math.pow((y2-y1), 2);
        int length = (int) Math.sqrt(result_1 + result_2);
        System.out.println("Length of " + lineName + " : " + length);
        return length;
    }
}
