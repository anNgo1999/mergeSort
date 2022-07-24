import java.util.ArrayList;

public class mergeSort {

	private ArrayList<Integer> arrayNum = new ArrayList<>();
	public mergeSort(int arraySize)
	{
		for(int i = 0; i < arraySize; i++)
		{
			int number =(int)( Math.random() * 1000 );
			arrayNum.add(number);
		}
	}

	public void printArray()
	{
		for (int i = 0; i < arrayNum.size(); i++)
			System.out.println(i+": "+arrayNum.get(i));
	}

	public void sort(int startIndex, int endIndex)
	{
		if(startIndex < endIndex) {
		int mid =startIndex + (endIndex-startIndex) / 2;
		sort(startIndex, mid);
		sort(mid+1, endIndex);
		merge(startIndex, mid, endIndex);}
	}
	
	private void merge(int lowIndex, int midIndex, int endIndex)
	{
		int n1 = midIndex - lowIndex + 1;
		int n2 = endIndex - midIndex;
		
		int[] list1 = new int[n1];
		int[] list2 = new int[n2];
		
		for(int i =0; i < n1; i++)
			list1[i] = arrayNum.get(lowIndex+i);
		for(int n=0; n < n2; n++)
			list2[n] = arrayNum.get(midIndex + 1 + n);
		
		int i = 0;
		int n = 0;
		
		int k = lowIndex;
		while(i < n1 && n < n2) 
		{
			if(list1[i] <= list2[n]) 
			{
				arrayNum.set(k, list1[i]);
				i++;
			}
			else 
			{
				arrayNum.set(k, list2[n]);
				n++;
			}
			k++;
		}
		
		while(i < n1) 
		{
			arrayNum.set(k, list1[i]);
			i++;
			k++;
		}
		while(n < n2) 
		{
			arrayNum.set(k, list2[n]);
			n++;
			k++;
		}
	}
}
