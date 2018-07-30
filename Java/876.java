public static ListNode MiddleoftheLinkedList(ListNode head){
		int cnt = 0;
		int index = 0;
		ListNode rt = head;
		while (head != Null){
			if (index < cnt/2){
				rt = rt.next;
				index ++;
			}
			head = head.next;
			cnt ++;
		}
		if (cnt % 2 == 0){
			rt = rt.next;
		}
		return rt;
	}