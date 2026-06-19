/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class CircularQueue{
    int[] arr;
    int f;
        int r;
        int size;
    CircularQueue(int size){
        arr= new int[size];
        
    }
    void add(int val){
        if(size==arr.length){
            System.out.print("Array is Full!");
            return ;
        }
        arr[r++]=val;
        if(r==arr.length) r=0;
        size++;
    }
     int remove(){
         if(size==0){
            System.out.print("Array is Empty!");
            return -1;
        }
        int frontVal=arr[f];
       f++;
       
       if(f==arr.length) f=0;
       size--;
       return frontVal;
       
    }
    int peek(){
        if(size==0){
            System.out.print("Array is Empty!");
            return -1;
        }
        return arr[f];
    }
    void display(){
        if(size==0) return;
        if(f>=r){
            for(int i=f;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
public class CircularQueue_
{
	public static void main(String[] args) {
		CircularQueue q = new CircularQueue(5);
		q.add(10); q.add(20) ; q.add(30); q.add(40);
		q.display();
		System.out.print(q.remove());
		System.out.println();
	//	System.out.print(q.peek());
	q.display();
		
	}
}