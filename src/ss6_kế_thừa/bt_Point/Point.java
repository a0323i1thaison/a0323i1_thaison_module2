package ss6_kế_thừa.bt_Point;

public class Point {

    public static class Point2D {
        private float x;
        private float y;
        public Point2D(){

        }
        public Point2D(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public float[] getXY() {
            float[] arr = new float[2];
            arr[0] = x;
            arr[1] = y;
            return arr;
        }

        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point2D{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static class Point3D extends Point2D {
        private float z;
        public Point3D(){

        }
        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public float[] getXYZ() {
            float[] arr = new float[3];
            arr[0] = getX();
            arr[1] = getY();
            arr[2] = z;
            return arr;
        }

        public void setXYZ(float x, float y, float z) {
            setX(x);
            setY(y);
            this.z = z;
        }

        @Override
        public String toString() {
            return "Point3D{" +
                    "x=" + getX() +
                    ", y=" + getY() +
                    ", z=" + z +
                    '}';
        }
    }
}