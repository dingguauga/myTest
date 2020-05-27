package test.arrays.twoarrays;

/**
 * 行 列
 * 可以只指定行，一个对象表示一行，如果列没有就会报越界
 */
public class Test {
    public static void main(String[] args) {

        int arr[][] = {{1,2},{3,4},{5,6}};
        //静态的只能指定为空
//        int arr[][] ={{1},{2,3},{4,5,6}};

//        System.out.println(arr[0][1]);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                System.out.println(arr[i][j]);
            }
        }
    }

    int arr2[][] =new int[3][];

//    int arr3[][] =new int[][4];
}
