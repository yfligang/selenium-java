public class TestDemo {
    //将一维数组a中的n个数逆序存放到原数组中

    public static int[] array1 = {1,3,5,1,2,3,4};
    public static int[] array2 = {2,3,1,2,3,4};

    public void method(int[] array){
        int n = array.length;
        for (int i = 0; i < n/2; i++) {
            int t = array[i];
            array[i] = array[n-1-i];
            array[n-1-i] = t;

        }
        System.out.println(array);
        for (int num:array
             ) {
            System.out.println(num);
        }
    }

    public static void main(String[] args){
        TestDemo td = new TestDemo();
        td.method(array1);
        System.out.println("============================");
        td.method(array2);
    }
}
