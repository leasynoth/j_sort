package sorts;

public class gnomeSort {

    private int defaultData[];
    private boolean defaultWay;

    public gnomeSort(){

        this.defaultWay = false;
        this.defaultData = new int[]{3, 34, 76, 3458, 21, 1, 348957, 4345, 456, 9435, 356, 6346};

    }

    public gnomeSort(int data[]){

        this.defaultData = data;
        this.defaultWay = false;

    }

    public gnomeSort(int data[], boolean way){

        this.defaultWay = way;
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

        int alpha = 0;
        int beta = 1;
        int temp;

        if (!defaultWay){

            while (beta < defaultData.length){

                if (defaultData[alpha] > defaultData[beta]) {

                    temp = defaultData[alpha];
                    defaultData[alpha] = defaultData[beta];
                    defaultData[beta] = temp;

                    if (alpha > 0){

                        alpha--;
                        beta--;

                    }

                } else {

                    if (beta < defaultData.length) {

                        alpha++;
                        beta++;

                    }
                }

            }

        } else {

            while (beta < defaultData.length){

                if (defaultData[alpha] < defaultData[beta]) {

                    temp = defaultData[alpha];
                    defaultData[alpha] = defaultData[beta];
                    defaultData[beta] = temp;

                    if (alpha > 0){

                        alpha--;
                        beta--;

                    }

                } else {

                    if (beta < defaultData.length) {

                        alpha++;
                        beta++;

                    }
                }

            }

        }

        long end = System.nanoTime();

        // end profiling for an algorithm of bubble sorting

        // print sorted data
        System.out.println("\nSorted data: \n");
        for (int i=0; i<this.defaultData.length; i++) {
            System.out.print(String.valueOf(this.defaultData[i]) + " ");
        }

        System.out.println("\n\nGnome sorting algorothm execution time: " + String.format("%.3f", Float.valueOf(end-start)/1000000) + " ms.");

    }
}
