import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Sort {
    public static int[] bubbleSort(int[] list) {
        for (int i = (list.length - 1); i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (list[j - 1] > list[j]) {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
                
            }
        }
        
        return list;
    }
    
    
    public static void main(String args[]) throws Exception
    {
        String list="";
        int i=0,n=0;
        
        Sort s= new Sort();
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Enter the list of numbers,one number per line");
        System.out.println("write 'Stop' when the list is completed");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        while(!(list=bf.readLine()).equalsIgnoreCase("stop")){
            int intelement=Integer.parseInt(list);
            arrlist.add(intelement);
            
        }
        
        int elementlist[]  = new int[arrlist.size()];
        Iterator<Integer> iter = arrlist.iterator();
        for (int j=0;iter.hasNext();j++) {
            elementlist[j] = iter.next();
        }
        
        elementlist=bubbleSort(elementlist);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        int finishTime = 0;
		int startTime = 0;
		System.out.println("It took " + (finishTime - startTime) + " ms for bubbleSort().");
        System.out.println("Values after Bubble Sort:");
        for (int j=0;j<elementlist.length;j++) {
            System.out.println(elementlist[j]+" ");
           
        }
    }
}