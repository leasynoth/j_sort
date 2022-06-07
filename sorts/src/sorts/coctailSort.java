package sorts;

public class coctailSort {

    private int defaultData[];
    private boolean way;

    public coctailSort(){
        this.way = false;
        this.defaultData = new int[]{3, 34, 76, 3458, 21, 1, 348957, 4345, 456, 9435, 356, 6346};
    }

    public coctailSort(int data[]){
        this.way = false;
        this.defaultData = data;
    }

    public void sorted(){

        // print initial data
        System.out.println("Initial data: \n");

        for(int i=0; i<this.defaultData.length; i++){

            System.out.print(String.valueOf(this.defaultData[i]) + " ");

        }

        // start profiling for an algorithm of bubble sorting

        long start = System.nanoTime();

        int count = 0;

        int iMin = count;
        int iMax = this.defaultData.length - 1;

        if (!this.way) {

            while (iMin <= iMax) {

                if (count % 2 == 0) {

                    for (int i = iMin; i < iMax; i++) {

                        if (this.defaultData[i] > this.defaultData[i + 1]) {

                            int temp = this.defaultData[i];
                            this.defaultData[i] = this.defaultData[i + 1];
                            this.defaultData[i + 1] = temp;

                        }
                    }

                    iMax--;

                } else if (count % 2 != 0) {

                    for (int i = iMax; i > iMin; i--) {

                        if (this.defaultData[i] < this.defaultData[i - 1]) {

                            int temp = this.defaultData[i];
                            this.defaultData[i] = this.defaultData[i - 1];
                            this.defaultData[i - 1] = temp;

                        }

                    }

                    iMin++;

                }

                count++;

            }

        } else if (this.way) {

            while (iMin <= iMax){

                if (count % 2 == 0){

                    for(int i=iMin; i<iMax; i++){

                        if (this.defaultData[i] < this.defaultData[i+1]){

                            int temp = this.defaultData[i];
                            this.defaultData[i] = this.defaultData[i+1];
                            this.defaultData[i+1] = temp;

                        }

                    }

                    iMax--;

                } else if (count % 2 != 0){

                    for(int i=iMax; i>iMin; i--){

                        if (this.defaultData[i] > this.defaultData[i-1]){

                            int temp = this.defaultData[i];
                            this.defaultData[i] = this.defaultData[i-1];
                            this.defaultData[i-1] = temp;

                        }

                    }

                    iMin++;

                }

                count ++;

            }

        }

        long end = System.nanoTime();

        // print sorted data
        System.out.println("\nSorted data: \n");

        for(int i=0; i<this.defaultData.length; i++){

            System.out.print(String.valueOf(this.defaultData[i]) + " ");

        }

        System.out.println("\n\nCoctail sorting algorothm execution time: " + String.format("%.3f", Float.valueOf(end-start)/1000000) + " ms.");

    }
}
