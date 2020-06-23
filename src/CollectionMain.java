

public class CollectionMain {

	public static void main(String[] args) {
		
		// Testing ArrayIntList:
		ArrayIntList testList = new ArrayIntList();
		System.out.println(testList.toString());
		
		System.out.println(testList.size());
		System.out.println(testList.isEmpty());
		
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		System.out.println(testList.size());
		System.out.println(testList.toString());
		
		
		System.out.println(testList.indexOf(1));
		System.out.println(testList.indexOf(5));
		
		System.out.println(testList.get(1));
		System.out.println(testList.get(3));
		
		
		testList.addAt(0, 2);
		testList.addAt(0, 0);
		System.out.println(testList.toString());
		
		
		testList.remove(1);
		System.out.println(testList.toString());
	
	}

}
