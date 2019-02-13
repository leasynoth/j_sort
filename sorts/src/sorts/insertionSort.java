package sorts;

public class insertionSort {

    private boolean defaultWay;
    private int defaultData[];

    public insertionSort(){

        this.defaultWay = false;
        this.defaultData = new int[]{3, 34, 76, 3458, 21, 1, 348957, 4345, 456, 9435, 356, 6346};

    }

    public insertionSort(int data[]){

        this.defaultWay = false;
        this.defaultData = data;

    }

    public insertionSort(int data[], boolean way){

        this.defaultWay = way;
        this.defaultData = data;

    }

    public int sorted()[]{

        // print initial data
        System.out.println("Initial data: \n");

        for(int i=0; i<this.defaultData.length; i++){

            System.out.print(String.valueOf(this.defaultData[i]) + " ");

        }

        // start profiling for an algorithm of bubble sorting

        long start = System.nanoTime();

        int count = 1;
        int ind = 1;
        int preSortArr[] = new int[1];

        if (!this.defaultWay){

            while (count < this.defaultData.length){

                int sortArr[] = new int[ind];

                if (preSortArr.length == 1){
                    preSortArr[0] = this.defaultData[0];
                }

                System.arraycopy(preSortArr, 0, sortArr, 0, preSortArr.length);

                for(int i=0; i<sortArr.length; i++){

                    if (sortArr[i] < this.defaultData[count]){

                        if (i == sortArr.length-1){

                            preSortArr = new int[sortArr.length+1];
                            System.arraycopy(sortArr,0, preSortArr, 0, sortArr.length);
                            preSortArr[sortArr.length] = this.defaultData[count];

                            count++;
                            ind++;
                            break;

                        }

                        continue;

                    } else {

                        preSortArr = new int[sortArr.length+1];
                        System.arraycopy(sortArr, 0, preSortArr, 0, i);
                        preSortArr[i] = this.defaultData[count];
                        System.arraycopy(sortArr, i, preSortArr, i+1, sortArr.length-i);

                        count++;
                        ind++;
                        break;

                    }

                }

            }


        } else {

            while (count < this.defaultData.length){

                int sortArr[] = new int[ind];

                if (preSortArr.length == 1){
                    preSortArr[0] = this.defaultData[0];
                }

                System.arraycopy(preSortArr, 0, sortArr, 0, preSortArr.length);

                for(int i=0; i<sortArr.length; i++){

                    if (sortArr[i] > this.defaultData[count]){

                        if (i == sortArr.length-1){

                            preSortArr = new int[sortArr.length+1];
                            System.arraycopy(sortArr,0, preSortArr, 0, sortArr.length);
                            preSortArr[sortArr.length] = this.defaultData[count];

                            count++;
                            ind++;
                            break;

                        }

                        continue;

                    } else {

                        preSortArr = new int[sortArr.length+1];
                        System.arraycopy(sortArr, 0, preSortArr, 0, i);
                        preSortArr[i] = this.defaultData[count];
                        System.arraycopy(sortArr, i, preSortArr, i+1, sortArr.length-i);

                        count++;
                        ind++;
                        break;

                    }

                }

            }

        }

        long end = System.nanoTime();

        // end profiling for an algorithm of bubble sorting

        // print sorted data
        System.out.println("\nSorted data: \n");
        for (int i=0; i<preSortArr.length; i++) {
            System.out.print(String.valueOf(preSortArr[i]) + " ");
        }

        System.out.println("\n\nInsertion sorting algorothm execution time: " + String.format("%.3f", Float.valueOf(end-start)/1000000) + " ms.");

        return preSortArr;
    }
}
