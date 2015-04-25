public static ListNode<Integer> removeKthListNode(ListNode<Integer> l, int k){
	ListNode<Integer> left = l;
	ListNode<Integer> right = l;

	for(int i = 0; i < k; i++){
		right = right.next;
	}

	while(right.next != null){
		left = left.next;
		right = right.next;
	}

	ListNode<Integer> result = left.next;
	left.next = left.next.next;
	return result;

}