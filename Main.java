import java.util.ArrayList;
import java.util.Comparator;
public class Main
{
	public static void main(String[] args) {
		// create an ArrayList
		ArrayList<String> studentsName = new ArrayList<>();
	    	
		//Java ArrayList add()
	    	studentsName.add("John");
	    	studentsName.add("Alice");
	    	studentsName.add("Bob");
	    	studentsName.add("Emma");
	    	System.out.println("Students names: " + studentsName);
		
		ArrayList<Integer> rollno = new ArrayList<>();
		rollno.add(1);
	    	rollno.add(2);
	    	rollno.add(3);
	    	System.out.println("Rollno.: " + rollno);
	    
	    	//Inserting Element at the Specified Position
	    	System.out.println("\n----Inserting Element at the Specified Position----");
		studentsName.add(1,"Charlie");
	    	System.out.println("Students names: " + studentsName);
	    
	    	rollno.add(3,4);
	    	System.out.println("Rollno.: " + rollno);
	    
	   	// Java ArrayList addAll()
	   	System.out.println("\n----Java ArrayList addAll()----");
	   
	   	ArrayList<String> studentList = new ArrayList<>();
	   
	   	studentList.addAll(studentsName);
	   	System.out.println("Students List: " + studentList);
	  	studentList.add("James");
	   	//studentList.addAll(rollno);
	   	System.out.println("Updated Students List: " + studentList);
	   
	   	//Java ArrayList clear()
	   	//Both the removeAll() and clear() method are performing the same task. 
	   	//However, the clear() method is used more than removeAll(). 
		//It is because clear() is faster and efficient compared to removeAll().
	  	studentList.clear();
	  	System.out.println("\n----Java ArrayList clear()----");
	   	System.out.println("Remove Students List: " + studentList);
	   
	   	//Java ArrayList clone()
	   	ArrayList<Integer> cloneList = (ArrayList<Integer>)rollno.clone();
	   	System.out.println("\n----Java ArrayList clone()----");
	  	System.out.println("Cloned Roll no.: " + cloneList);
	   
	   	//Java ArrayList contains()
		System.out.println("\n----Java ArrayList contains()----");
	   	System.out.println("Is clonelist contain 2:"+ cloneList.contains(2));
	   	System.out.println("Is clonelist contain 9:"+ cloneList.contains(9));
	   
	   	//Java ArrayList get()
	   	// access element at index 1
	   	System.out.println("\n----Java ArrayList get()----");
	   	System.out.println("Get elenemt by using get(): "+ cloneList.get(1));
	   
	   	//Java ArrayList indexOf()
	  	System.out.println("\n----Java ArrayList indexOf()----");
	   	System.out.println("Get the position of number 4 in cloneList: "+ cloneList.indexOf(4));
	   	System.out.println("Get the position of name Bob in studentsName: "+ studentsName.indexOf("Bob"));
	   
	   	//Java ArrayList removeAll()
	   	System.out.println("\n----Java ArrayList removeAll()----");
	  	System.out.println("Remove all elements in clone list using removeall(): " + cloneList.removeAll(cloneList));
	   	System.out.println("Cloned Roll no.: " + cloneList);
	   	System.out.println("Remove all name from student list: " + studentList.removeAll(studentList));
	   	System.out.println(studentList);
	   
	   	//Java ArrayList remove()
	   	System.out.println("\n----Java ArrayList remove()----");
	   	System.out.println("Roll no.: " + rollno);
	   	System.out.println("Remove specific element from rollno:" + rollno.remove(2));
	   	System.out.println("Roll no.: " + rollno);
	   	// remove the first occurrence of 13
       		// boolean result = randomNumbers.remove(Integer.valueOf(13));
        
       		// Java ArrayList size() 
       		System.out.println("\n----Java ArrayList size()----");
       		System.out.println("size of Roll no.: " + rollno.size());
	   
	   	// Java ArrayList isEmpty() 
       		System.out.println("\n----Java ArrayList size()----");
       		System.out.println("Roll no.: " + rollno);
       		System.out.println("Checking of Roll no. is empty or not? : " + rollno.isEmpty());
       		System.out.println("Checking of cloneList is empty or not? : " + cloneList.isEmpty());
	   
	   	// Java ArrayList subList() 
       		System.out.println("\n----Java ArrayList subList()----");
       		System.out.println("studentsNam: e" + studentsName);
       		System.out.println("Sublist from index 0 to 3: " + studentsName.subList(0,3));
       		System.out.println("Sublist from index 3 to end: " + studentsName.subList(3,studentsName.size()));
       
       		// Java ArrayList set()
       		System.out.println("\n----Java ArrayList set()----");
       		System.out.println("Students List: " + studentsName);
       		System.out.println("update the value with another value: " + studentsName.set(1,"Alen"));
       		System.out.println("updated Students List after set() method: " + studentsName);
       
       		// Java ArrayList sort()
       		// System.out.println("\n----Java ArrayList sort()----");
       		// System.out.println("Students List(ascending order): " + studentsName.sort(naturalOrder()));
       		// System.out.println("Students List(reverse order): " + studentsName.sort(reverseOrder()));
       
       		// Java ArrayList toArray()
		System.out.println("\n----Java ArrayList toArray()----");
       		// Create a new array of String type
        	// size of array is same as the ArrayList
        	System.out.println("ArrayList: " + studentsName);
        
        	String[] arr = new String[studentsName.size()];
        	studentsName.toArray(arr);
        	System.out.print("Array: ");
        	for(String item:arr){
            		System.out.print(item + ", ");
        	}
       
        	// Java ArrayList toString()
        	System.out.println("\n----Java ArrayList toString()----");
        	System.out.println("ArrayList: " + studentsName);
        	String arr1 = studentsName.toString();
        	System.out.print("String: "+ arr1);
        
        	//Java ArrayList lastIndexOf()
        	System.out.println("\n----Java ArrayList lastIndexOf()----");
        	System.out.println("Students List: " + studentsName);
        	System.out.println("last index of: " + studentsName.lastIndexOf("Alen"));
        	System.out.println("last index of: " + studentsName.lastIndexOf("Al"));
        
        	//Java ArrayList retainAll()
        	System.out.println("\n----Java ArrayList retainAll()----");
        	System.out.println("Students List: " + studentList);
        	System.out.println("Common elements: " + studentList.retainAll(studentsName));
        
        	//Java ArrayList containsAll()
        	System.out.println("\n----Java ArrayList containsAll()----");
        	System.out.println("Common elements: " + studentList.containsAll(studentsName));
        
        	//Java ArrayList removeIf()
        	System.out.println("\n----Java ArrayList removeIf()----");
        	System.out.println("Student list: " + studentsName);
        	System.out.println("removeIf(): " + studentsName.removeIf(e -> e.contains("land")));
        	System.out.println("removeIf(): " + studentsName.removeIf(e -> e.contains("Al")));
        	System.out.println("Student list: " + studentsName);
        
        	// Java ArrayList forEach()
        	System.out.println("\n----Java ArrayList forEach()----");
        	System.out.println("List: " + rollno);
        	System.out.print("Updated List: ");
        	rollno.forEach((e)->{
            		e=e*10;
            		System.out.println(e);
        	});
	}
}
