package sorts;

public class coctailSort {

    private int defaultData[];

    public coctailSort(){
        this.defaultData = new int[]{3, 34, 76, 3458, 21, 1, 348957, 4345, 456, 9435, 356, 6346};
    }

    public coctailSort(int data[]){
        this.defaultData = data;
    }

    private void sorted(){


        int count = 0;

        int iMin = count;
        int iMax = this.defaultData.length - 1;

        while(iMin <= iMax){

            if (count % 2 == 0) {

                for (int i = iMin; i < iMax; i++) {

                    if (this.defaultData[i] > this.defaultData[i+1]){

                        int temp = this.defaultData[i];
                        this.defaultData[i] = this.defaultData[i+1];
                        this.defaultData[i+1] = temp;

                    }
                }

            } else if (count % 2 != 0){

                for(int i = iMax; i > iMin; i--){

                    if (this.defaultData[i] < this.defaultData[i+1]) {

                        int temp = this.defaultData[i];
                        defaultData[i] = defaultData[i+1];
                        defaultData[i+1] = temp;

                    }

                }

            }

            count++;

        }

        System.out.println("");
        System.out.println("Sorted data");

    }
}
