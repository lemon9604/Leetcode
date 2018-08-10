import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

class Test{
	public static void main(String[] args){
		
		int[][] nums = {{1,2},{3},{3},{}};
		String S = "qiejxqfnqceocmy";
		functionname(nums);
		//List<Integer> results = functionname(nums);
		//System.out.println(functionname(nums));
	}

    public static void checkfather(Node current, List<Integer> list, List<List<Integer>> results){
    	if (current.val == 0){
    		results.add(list);
    	}
    	else if (current.father.size() != 0){
    		for (Node cur : current.father){
    			list.add(cur.val);
    			checkfather(cur, list,results);
    		}
    	}
    	list.remove(list.size()-1);
    }
	
	public static void functionname(int[][] graph){
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		Node root = new Node(-1);
		root.child = new ArrayList<Node>();
		root.father = new ArrayList<Node>();

		for (int i = 0; i < graph.length; i++){
			Node newchild = new Node(i);
			newchild.child = new ArrayList<Node>();
			newchild.father = new ArrayList<Node>();
			root.child.add(newchild);
		}
		for (int i = 0; i < graph.length; i ++){
			for (int j : graph[i]){
				root.child.get(j).father.add(root.child.get(i));
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(graph.length - 1);
		System.out.println(root.child.get(3).father);
		for (Node temp : root.child.get(graph.length-1).father){
			list.add(temp.val);
			System.out.println(list);
			checkfather(temp, list, results);
			System.out.println(list);
			//list.remove(list.size()-1);
		}
		

		System.out.println(results.get(1));

	}
}

class Node{
	int val;
	List<Node> father;
	List<Node> child;
	Node (int x) {val = x;}
}



	public static void quickSort(int[] array, int low, int high) {// 传入low=0，high=array.length-1;
        int pivot, p_pos, i, t;// pivot->位索引;p_pos->轴值。
        if (low < high) {
            p_pos = low;
            pivot = array[p_pos];
            for (i = low + 1; i <= high; i++)
                if (array[i] > pivot) {
                    p_pos++;
                    t = array[p_pos];
                    array[p_pos] = array[i];
                    array[i] = t;
                }
            t = array[low];
            array[low] = array[p_pos];
            array[p_pos] = t;
            
            quickSort(array, low, p_pos - 1);// 排序左半部分
            quickSort(array, p_pos + 1, high);// 排序右半部分
        }
    }

    public static char getKey(HashMap<Character, Integer> map, int value){
    	char key = '-';
    	for (char getKey: map.keySet()){
    		if (map.get(getKey).equals(value)){
    			return getKey;
    		}
    	}
    	return key;
    }

    public static int getEnd(HashMap<Character, Integer> startmap, HashMap<Character, Integer> endmap, int min, int max){
    	int rawmax = max;
    	for (char key:startmap.keySet()){
				if (startmap.get(key) < max && startmap.get(key) > min){
					if (max < endmap.get(key)){
						max = endmap.get(key);
				}
			}
		}
		if (rawmax != max){
			max = getEnd(startmap, endmap, rawmax, max);
		}
		return max;
    }

    public static int[] moverow(int[] line){
    	for (int i = 0; i < line.length; i++){
    		line[i] = 1 - line[i];
    	}
    	return line;
    }

    public static int[][] movecolumn(int[][] A, int column){
    	for (int i = 0; i < A.length; i++){
    		A[i][column] = 1 - A[i][column];
    	}
    	return A;
    }

