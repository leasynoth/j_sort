package sorts;

public class Main {

    public static void main(String[] args){

        tests();


    }

    private static void tests(){

        // start profiling random data generating
        long start = System.nanoTime();
        // random data generating
        int randomData[] = new int[10000];
        for(int i=0; i<10000; i++) {
            int preData = (int) (Math.random() * 10000);
            randomData[i] = preData;
        }
        long end = System.nanoTime();
        System.out.println("Time random data (10000 numbers) generating: " + String.format("%.3f", Float.valueOf(end - start)/1000000) + " ms.\n");
        // end profiling random data generating

        // bubbleSort

        bubbleSort bs = new bubbleSort(randomData);
        bs.sorted();

        // coctailSort



    }

}
