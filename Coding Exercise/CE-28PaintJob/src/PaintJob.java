public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extrabuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extrabuckets < 0) {
            return -1;
        } else {
            double area = width * height;
            double rem = area / areaPerBucket;
            int buckets = (int) Math.ceil(rem) - extrabuckets;
            return buckets;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double area = width * height;
            double rem = area / areaPerBucket;
            int buckets = (int) Math.ceil(rem);
            return buckets;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double rem = area / areaPerBucket;
            int buckets = (int) Math.ceil(rem);
            return buckets;
        }
    }
}
