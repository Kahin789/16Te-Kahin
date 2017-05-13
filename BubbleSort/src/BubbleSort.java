public class BubbleSort {

static int arraySize = 100000;
static int[] oneArray = new int[arraySize];

static void randomizeArray() {
for (int i = 0; i < arraySize; i++)
oneArray[i] = (int) (Math.random() * arraySize);
}

public static void main(String[] args) {

randomizeArray();

long startTime = System.currentTimeMillis();
bubbleSort(oneArray);
long finishTime = System.currentTimeMillis();

System.out.println("It took " + (finishTime - startTime) + " ms for bubbleSort().");

randomizeArray();
startTime = System.currentTimeMillis();
insertionSort();
finishTime = System.currentTimeMillis();
System.out.println("It took " + (finishTime - startTime) + " ms for insertionSort().");

}

public static void bubbleSort(int[] num) {
int j;

boolean flag = true; // set flag to begin first pass
int temp; // holding variable

while (flag) {
flag = false; // set flag to false awaiting a possible swap
for (j = 0; j < num.length - 1; j++) {
if (num[j] < num[j + 1]) // change to > for ascending sort
{
temp = num[j]; // swap elements
num[j] = num[j + 1];
num[j + 1] = temp;
flag = true; // shows a swap occurred
}
}
}
}

static void insertionSort() {
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}