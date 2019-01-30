package sorts;

public class bubbleSort {

    private boolean defaultWay;
    private int defaultData[];

    public bubbleSort(){

        this.defaultWay = false;
        this.defaultData = new int[]{3, 34, 76, 3458, 21, 1, 348957, 4345, 456, 9435, 356, 6346};

    }

    public bubbleSort(int data[], boolean way){

        this.defaultData = data;
        this.defaultWay = way;

    }

    public bubbleSort(int data[]){

        this.defaultWay = false;
        this.defaultData = data;

    }

    public void sorted(){

        for (int i=0; i<this.defaultData.length-1; i++) {
            System.out.print(this.defaultData[i]);
            System.out.print(" ");
        }

        // start profiling for an algorithm of bubble sorting

        long start = System.nanoTime();

        int count = 1;

        if (!this.defaultWay) {
            while (count <= this.defaultData.length - 1) {

                for (int i = 0; i < (this.defaultData.length - count); i++) {

                    if (this.defaultData[i] > this.defaultData[i+1]){

                        int temp = this.defaultData[i];
                        this.defaultData[i] = this.defaultData[i+1];
                        this.defaultData[i+1] = temp;
                    }

                }

                count++;
            }

        }else if (this.defaultWay){

            while (count <= this.defaultData.length - 1){

                for(int i = 0; i < (this.defaultData.length - count); i++){

                    if (this.defaultData[i] < this.defaultData[i+1]){

                        int temp = this.defaultData[i];
                        this.defaultData[i] = this.defaultData[i+1];
                        this.defaultData[i+1] = temp;

                    }

                }

                count++;

            }

        }

        long end = System.nanoTime();

        System.out.println("\n\nBubble sorting algorothm execution time: " + String.format("%.3f", Float.valueOf(end-start)/1000000) + " ms.");

        // end profiling for an algorithm of bubble sorting

        System.out.println("\nSorted data: ");
        for (int i=0; i<this.defaultData.length-1; i++) {
            System.out.print(this.defaultData[i]);
            System.out.print(" ");
        }
    }

}

