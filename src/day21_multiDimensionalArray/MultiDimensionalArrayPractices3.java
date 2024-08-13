package day21_multiDimensionalArray;

public class MultiDimensionalArrayPractices3 {

    public static void main(String[] args) {

        int[][][] arr3D1 ={ {{1, 2} ,{3, 4, 5}}, {{6, 7, 8,9} , {10, 11} ,{12, 13, 14}}};
        int[][][] arr3D2 ={ {{1, 2} ,{3, 4, 5}}, {{6, 7, 8,9} , {10, 11} ,{12, 13, 14}}};
        int[][][] arr3D3 ={ {{1, 2} ,{3, 4, 5}}, {{6, 7, 8,9} , {10, 11} ,{12, 13, 14}}};

        int[][][][] arr4D = { arr3D1, arr3D2, arr3D3};

        for (int[][][] each3D : arr4D) {  // arr4D icinde each3D elementlerini yaz
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);

                    }

                }

            }


            }

        }
    }

