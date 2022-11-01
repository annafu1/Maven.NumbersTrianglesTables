package io.zipcoder.microlabs.mastering_loops;
//tackle getRow first
//getSmall and getLarge will use getTriangle
//getRow and getTriangle
public class TriangleUtilities {



    public static String getRow(int numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numberOfStars; i++) {
            sb.append("*");
        }
        return sb.toString();
    }

    public static String getTriangle(int numberOfRows) {
        StringBuilder sb = new StringBuilder();
        int idx = 1;
        while (idx < numberOfRows) {
            String row = getRow(idx);
            sb.append(row).append("\n");
            idx++;
        }
        return sb.toString();
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }

}
