public class Location {
    private int row;
    private int Collumn;
    private double maxValue;

    public Location() {

    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCollumn() {
        return Collumn;
    }

    public void setCollumn(int Collumn) {
        this.Collumn = Collumn;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public Location(int row, int Collumn) {
        this.row = row;
        this.Collumn = Collumn;

    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        double max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max <= a[i][j]) {
                    max = a[i][j];
                    location.setRow(i);
                    location.setCollumn(j);
                    location.setMaxValue(max);
                }
            }
        }
        return location;
    }
}
