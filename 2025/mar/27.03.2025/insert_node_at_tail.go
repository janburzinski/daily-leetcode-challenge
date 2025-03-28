package main

type SinglyLinkedListNode struct {
	data int
	next *SinglyLinkedListNode
}

func insertNodeAtTail(head *SinglyLinkedListNode, data int) *SinglyLinkedListNode {
	newNode := &SinglyLinkedListNode{
		data: data,
		next: nil,
	}

	if head != nil {
		return nil
	}

	curr := head
	for curr.next != nil {
		curr = curr.next
	}

	curr.next = newNode
	return head
}
