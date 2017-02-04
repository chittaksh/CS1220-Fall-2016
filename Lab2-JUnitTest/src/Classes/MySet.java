package Classes;

import Interface.MyMath;

public class MySet implements MyMath<MySet>{
	
	private int[] values;
			
	public MySet(int[] Values){
		this.values = Values; 
		this.removeDuplicates();
		//System.out.println(values.toString());
	}

	public int[] getValues() {
		return values;
	}

	public void setValues(int[] values) {
		this.values = values;
	}

	@Override
	public MySet add(MySet o) {
		int[] new_array = new int[this.values.length+o.getValues().length];
		int length = this.values.length;
		
		for(int i=0; i <this.values.length;i++){
			new_array[i] = this.values[i];
		}
		
		for(int i=0; i<o.getValues().length;i++){
			new_array[i+length] = o.getValues()[i];
		}
		
		MySet result = new MySet(new_array);
		
		result.removeDuplicates();
		return result;
	}

	@Override
	public MySet subtract(MySet o) {
		boolean[] count_array = new boolean[o.getValues().length];
		int counter =0;
		
		for(int i=0; i<o.getValues().length; i++){
			for(int j=0;j<this.values.length;j++){
				if(this.values[j] == o.values[i] && count_array[i]==false){
					count_array[i]=true;
					counter++;
				}
			}
		}
		
		int[] new_array = new int[o.getValues().length - counter];
		int current=0;
		
		for(int i=0; i< o.getValues().length; i++){
			if(count_array[i] == false){
				new_array[current] = o.getValues()[i];
				current++;
			}
		}
		
		MySet result = new MySet(new_array);
		
		return result;
	}

	@Override
	public MySet divide(MySet o) {
		boolean[] count_array = new boolean[o.getValues().length];
		int counter =0;
		
		for(int i=0; i<o.getValues().length; i++){
			for(int j=0;j<this.values.length;j++){
				if(this.values[j] == o.values[i] && count_array[i]==false){
					count_array[i]=true;
					counter++;
				}
			}
		}
		
		int[] new_array = new int[counter];
		int current=0;
		
		for(int i=0; i< o.getValues().length; i++){
			if(count_array[i] == true){
				new_array[current] = o.getValues()[i];
				current++;
			}
		}
		
		MySet result = new MySet(new_array);
		result.removeDuplicates();
		return result;
	}

	@Override
	public MySet multiply(MySet o) {
		boolean[] count_array = new boolean[this.values.length+o.getValues().length];
		int counter =0;
		
		for(int i=0; i<this.values.length; i++){
			for(int j=0;j<o.getValues().length ;j++){
				if(this.values[i] == o.values[j] && count_array[i]==false){
					count_array[i]=true;
					count_array[this.values.length+j]= true;
					counter = counter+2;
				}
			}
		}
		
		int[] new_array = new int[(this.values.length + o.getValues().length) - counter];
		int current=0;
		
		for( int i=0; i< this.values.length; i++){
			if(count_array[i] == false){
				new_array[current] =  this.values[i];
				current++;
			}
		}
		
		int length = this.values.length;
		
		for(int i=length; i< o.getValues().length+length; i++){
			if(count_array[i] == false){
				new_array[current] = o.getValues()[i-length];
				current++;
			}
		}
		
		
		
		MySet result = new MySet(new_array);
		
		return result;
	}
	
	//Removes the duplicates from this array.
	private void removeDuplicates(){
		
		boolean[] count_array = new boolean[this.values.length];
		int count = 0;
		
		for(int i=0; i< this.values.length; i++){
			for(int j=i+1; j< this.values.length; j++){
				if(this.values[i]== this.values[j] && count_array[j]==false){
					count_array[j] = true;
					count++;
				}
			}
		}
		
		int[] new_array = new int[this.values.length-count];
		int counter= 0; 
		
		for(int i =0; i< this.values.length; i++){
			if(count_array[i]==false){
				new_array[counter] = this.values[i];
				counter++;
			}
		}
		
		this.values = new_array;
		
	}

}
