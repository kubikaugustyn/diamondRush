public interface f {
    public static final int[] var_int_arr_a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final byte[][] var_byte_arr_arr_a;

    static {
        var_int_arr_a = new int[]{150, 400, 1000, 3000};
        b = new int[]{0, 10, 25};
        c = new int[]{-24, -23, 24, -23, 0, 23, 24, 23};
        d = new int[]{-33, -54, 14, -54, -8, -8, 22, 2};
        var_byte_arr_arr_a = new byte[][]{{-1, -1, 0, -1}, {1, -1, 3, -1}, {2, 2, -1, -1}, {-1, 0, -1, 2}};
    }
}